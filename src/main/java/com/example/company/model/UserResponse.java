package com.example.company.model;


import com.example.company.model.studentDTO.DAOStudent;

public class UserResponse {
    public UserResponse(){}
    public String token;
    public Iterable<DAOStudent> students;
}
