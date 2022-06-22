package com.woniu.controller;

import com.woniu.dao.DeptDao;
import com.woniu.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private DeptDao deptDao;

    @RequestMapping("/test")
    public String test() {
        System.out.println("UserController.test");
        return null;
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Dept> list() {
        List<Dept> depts = deptDao.selectByExample(null);
        System.out.println("UserController.list");
        return depts;
    }

}
