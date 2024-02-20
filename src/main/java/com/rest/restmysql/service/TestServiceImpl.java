package com.rest.restmysql.service;

import com.rest.restmysql.Respository.TestRespository;
import com.rest.restmysql.model.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestRespository testRespository;
    private Static final ModelMapper mapper = new ModelMapper();
    @Override
    public List<Test> getAll() {
        return mapper.map(testRespository.findAll(),);
    }

    @Override
    public Test save(Test test) {
        return testRespository.save(new com.rest.restmysql.dto.Test());
    }
}
