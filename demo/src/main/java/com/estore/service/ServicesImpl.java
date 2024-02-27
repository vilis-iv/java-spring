package com.estore.service;

import com.estore.model.BillerData;
import com.estore.repository.MainRepository;
import com.estore.dto.BillerDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesImpl implements Services {
    @Autowired
    public MainRepository mainRepository;
    @Override
    public String getData() {
        return "1 + 1 = 4";
    }

    @Override
    public List<BillerDataDto> getAllDataBiller() {
        List<BillerDataDto> billerDataDto = new ArrayList<>();
        List<BillerData> billerData = mainRepository.findAll();


        for (BillerData data: billerData) {
            BillerDataDto billData = new BillerDataDto();

            billData.setBillerAccNo(data.getBillerAccNo());
            billerDataDto.add(billData);
        }

        return billerDataDto;
    }

    @Override
    public BillerDataDto getByDomain(String domain) {
        BillerDataDto billerDataDto = new BillerDataDto();
        BillerData billerData = mainRepository.findByBillerDomain(domain);

        billerDataDto.setBillerDomain(billerData.getBillerDomain());
        billerDataDto.setBillerAccNo(billerData.getBillerAccNo());
        return billerDataDto;
    }

}
