package com.example.company.model.newsDTO;

import lombok.Data;

import java.sql.Date;

@Data
public class NewsDTO {
    private int companyid;
    private String position;
    private int salary;
    private String place;
    private String description;
    private String expiredate;
    private int status;
}
