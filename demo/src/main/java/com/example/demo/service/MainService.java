package com.example.demo.service;

import com.example.demo.dto.BillerDataDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainService {
    public String getData();

    public List<BillerDataDto> getAllDataBiller();

    public BillerDataDto getByDomain(String domain);

}
