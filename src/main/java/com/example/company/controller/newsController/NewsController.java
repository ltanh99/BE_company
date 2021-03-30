package com.example.company.controller.newsController;

import com.example.company.model.newsDTO.DAONews;
import com.example.company.model.newsDTO.NewsDTO;
import com.example.company.model.studentDTO.DAOStudent;
import com.example.company.model.studentDTO.SearchRequest;
import com.example.company.service.newsService.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping(value="/news", method = RequestMethod.POST)
    public ResponseEntity<Iterable<DAONews>> getAllStudent(@RequestBody NewsDTO bodyRequest) throws Exception{

        System.out.println(bodyRequest);
        return ResponseEntity.ok(newsService.getNewsByParam(bodyRequest));
    }
}
