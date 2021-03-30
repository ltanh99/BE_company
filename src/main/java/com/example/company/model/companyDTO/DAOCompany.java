package com.example.company.model.companyDTO;

import com.example.company.model.newsDTO.DAONews;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class DAOCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int companyid;
//    @OneToOne(fetch=FetchType.LAZY, mappedBy="company")
//    private DAONews news;

//    public DAONews getNews() {
//        return news;
//    }
//
//    public void setNews(DAONews news) {
//        this.news = news;
//    }

    @Column
    private String companyname;
    @Column
    private String introduction;
    @Column
    private String establishdate;

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getEstablishdate() {
        return establishdate;
    }

    public void setEstablishdate(String establishdate) {
        this.establishdate = establishdate;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    @Column
    private String avatarurl;

}
