package com.estore.service;

import com.estore.dto.BillerDataDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Services {
    public String getData();

    public List<BillerDataDto> getAllDataBiller();

    public BillerDataDto getByDomain(String domain);

}
