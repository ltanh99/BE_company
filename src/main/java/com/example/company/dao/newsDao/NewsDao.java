package com.example.company.dao.newsDao;

import com.example.company.model.newsDTO.DAONews;
import com.example.company.model.newsDTO.NewsDTO;
import com.example.company.model.studentDTO.DAOStudent;
import com.example.company.model.studentDTO.SearchRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsDao extends CrudRepository<DAONews, Integer> {
    @Query(nativeQuery = true, value = "SELECT *"
            + "FROM news n where n.companyid = :#{#param.companyid} and n.expiredate >= CURRENT_DATE and n.status = 1 ")
    public Iterable<DAONews> FindByCategory(
            @Param("param") NewsDTO param
    );
}
