package com.woniu.controller;

import com.woniu.dao.DeptDao;
import com.woniu.pojo.Dept;
import com.woniu.pojo.DeptExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    private DeptDao deptDao;

    @RequestMapping("/listAjax")
    public String showDept(Model model) {
        List<Dept> list = deptDao.selectByExample(null);
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping("/delete")
    public String delete(Integer deptno) {
        deptDao.deleteByPrimaryKey(deptno);
        return "redirect:listAjax";
    }

    @RequestMapping("toAdd")
    public String add() {
        return "add";
    }

    @RequestMapping("addAjax")
    public String addAjax(Dept dept) {
        deptDao.insertSelective(dept);
        return "redirect:listAjax";
    }

    @RequestMapping("update")
    public String update(Integer deptno, Model model) {
        Dept dept = deptDao.selectByPrimaryKey(deptno);
        model.addAttribute("dept", dept);
        return "edit";
    }

    @RequestMapping("editAjax")
    public String editAjax(Dept dept) {
        deptDao.updateByPrimaryKeySelective(dept);
        return "redirect:listAjax";
    }

}
