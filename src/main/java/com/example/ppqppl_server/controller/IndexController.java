package com.example.ppqppl_server.controller;

import com.example.ppqppl_server.entity.Student;
import com.example.ppqppl_server.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

//    @RequestMapping("/main")   // 默认数据
//    public String index(Model model){
//        model.addAttribute("stu_id","000");
//        model.addAttribute("name","测试姓名");
//        model.addAttribute("sex","男");
//        model.addAttribute("age",0);
//        model.addAttribute("phoneNumber","1234567890");
//        model.addAttribute("trainDate","2000/01/01");
//        return "index";
//    }

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/index")
    public String student(ModelMap map){
        List<Student> students = studentRepository.findAll();
        map.addAttribute("students",students);
        map.addAttribute("stu1/form",new Student());
        return "main";
    }

    @PostMapping(value = "/find_by_id")
    @ResponseBody
    public Student findByID(@RequestParam("stu1") Student stu1){

        Student stu = studentRepository.findById(stu1.stu_id).orElse(null);
        return stu;
    }

}
