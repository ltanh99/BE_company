package com.example.company.service.newsService;

import com.example.company.dao.newsDao.NewsDao;
import com.example.company.model.newsDTO.DAONews;
import com.example.company.model.newsDTO.NewsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

@Service
public class NewsService {
    @Autowired
    private NewsDao newsDao;

    public Iterable<DAONews> getNewsByParam(NewsDTO newsDTO) {
//        ArrayList<DAONews> listDaoNews = new ArrayList<DAONews>();
//        for (NewsDTO dto : newsDTO) {
//            Iterable<DAONews> tmp = newsDao.FindByCategory(dto);
//            for (DAONews item : tmp) {
//                listDaoNews.add(item);
//            }
//        }
        return newsDao.FindByCategory(newsDTO);
    }
}
