package com.wuhan.dao;

import com.wuhan.domain.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {

    List<Test> findAll();
}
