package com.liqkjm.hnu_behind.controller;

import com.liqkjm.hnu_behind.entity.TestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liqkjm
 * @Date: 2018-07-29 12:05
 */
@RestController
public class TestController {

    /**
     * 测试返回json数据
     * @return {
     *  id:"",
     *  name:"",
     *  msg:""
     * }
     */
    @GetMapping(value = "/test")
    public TestEntity test(){
        TestEntity testEntity = new TestEntity();
        testEntity.setId(1);
        testEntity.setName("Amy");
        testEntity.setMsg("She is a bad girl");
        return testEntity;
    }


}
