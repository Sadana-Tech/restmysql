package com.rest.restmysql.Respository;

import com.rest.restmysql.dto.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRespository extends JpaRepository<Test,Integer> {
}
