package com.xuyiyang.management.controller;


import com.xuyiyang.domain.Test;
import com.xuyiyang.management.service.TestService;
import com.xuyiyang.utils.response.StatusResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by xuyiyang on 16-7-18.
 */

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "first", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public StatusResponse first(Long id){
        log.info("hehe{}",11);
        Test test = testService.doService(1);
        return StatusResponse.of(0,test);
    }

}