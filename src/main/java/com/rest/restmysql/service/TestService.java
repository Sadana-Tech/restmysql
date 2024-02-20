package com.rest.restmysql.service;

import com.rest.restmysql.model.Test;

import java.util.List;

public interface TestService {

    public List<Test> getAll();
    public Test save(Test test);



}
