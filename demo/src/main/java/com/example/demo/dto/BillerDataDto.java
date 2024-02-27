package com.example.demo.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class BillerDataDto {
    private String billerCode;
    private String billerDomain;
    private int billerAccNo;
    private int versionnum;
}
