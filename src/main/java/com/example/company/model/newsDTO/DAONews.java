package com.example.company.model.newsDTO;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "news")
public class DAONews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int newsid;
    @Column
    private int companyid;
    @Column
    private String position;
    @Column
    private int salary;
    @Column
    private String place;
    @Column
    private String description;

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Column
    private Date expiredate;
    @Column
    private int status;

}
