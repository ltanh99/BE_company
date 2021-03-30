package com.example.company.service.studentService;


import com.example.company.dao.studentDao.StudentDao;
import com.example.company.model.studentDTO.DAOStudent;
import com.example.company.model.studentDTO.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public Iterable<DAOStudent> GetAllStudent() {

        return studentDao.findAll();
    }

    public Iterable<DAOStudent> SearchStudent(SearchRequest param) {
        return studentDao.FindByCategory(param);
    }
}
