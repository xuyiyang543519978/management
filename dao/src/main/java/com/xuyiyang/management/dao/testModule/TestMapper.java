package com.xuyiyang.management.dao.testModule;

import com.xuyiyang.domain.Test;

import org.springframework.stereotype.Repository;

/**
 * Created by tobi on 16-7-20.
 */
@Repository
public interface TestMapper {
    Test selectOne(int id);
}
