package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "BILLER_DATA", schema = "CHN")
public class BillerData {

    @Id
    @GeneratedValue
    @Column(name = "BILLER_CODE")
    private String billerCode;

    @Column(name = "BILLER_DOMAIN")
    private String billerDomain;

    @Column(name = "BILLER_ACC_NO")
    private int billerAccNo;

    @Column(name = "VERSIONNUM")
    private int versionnum;

}
