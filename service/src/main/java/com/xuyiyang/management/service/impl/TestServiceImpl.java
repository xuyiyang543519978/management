package com.xuyiyang.management.service.impl;

import com.xuyiyang.domain.Test;
import com.xuyiyang.management.dao.testModule.TestMapper;
import com.xuyiyang.management.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xuyiyang on 16-7-20.
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public Test doService(int id) {
        return testMapper.selectOne(id);
    }
}
