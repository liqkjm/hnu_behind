package com.liqkjm.hnu_behind.controller;

import com.liqkjm.hnu_behind.entity.TestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liqkjm
 * @Date: 2018-07-29 12:05
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/getOne")
    public TestEntity getOne(){
        TestEntity testEntity1 = new TestEntity();
        testEntity1.setId(1);
        testEntity1.setName("Amy");
        testEntity1.setMsg("She is a bad girl");
        return testEntity1;
    }
    /**
     * 测试返回json数据
     * @return {
     *  id:"",
     *  name:"",
     *  msg:""
     * }
     */
    @GetMapping(value = "/getList")
    public List<TestEntity> getList(){
        TestEntity testEntity1 = new TestEntity();
        testEntity1.setId(1);
        testEntity1.setName("Amy");
        testEntity1.setMsg("She is a bad girl");

        TestEntity testEntity2 = new TestEntity();
        testEntity2.setId(2);
        testEntity2.setName("Tom");
        testEntity2.setMsg("Tom is a bad boy");

        TestEntity testEntity3 = new TestEntity();
        testEntity3.setId(3);
        testEntity3.setName("Tony");
        testEntity3.setMsg("Tony is a shy boy");

        TestEntity testEntity4 = new TestEntity();
        testEntity4.setId(4);
        testEntity4.setName("Lee");
        testEntity4.setMsg("Lee is a cool girl");

        List<TestEntity> list = new ArrayList<>();
        list.add(testEntity1);
        list.add(testEntity2);
        list.add(testEntity3);
        list.add(testEntity4);
        return list;
    }


}
