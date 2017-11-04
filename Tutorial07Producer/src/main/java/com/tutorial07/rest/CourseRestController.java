package com.tutorial07.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial07.model.CourseModel;
import com.tutorial07.service.CourseService;

@RestController
@RequestMapping("/rest")
public class CourseRestController
{
    @Autowired
    CourseService courseService;
  
    @RequestMapping("/course/view/{idCourse}")
    public CourseModel viewCourse (Model model,
            @PathVariable(value = "idCourse") String idCourse) {
        return courseService.selectCourse (idCourse);
    }
    
    @RequestMapping("/course/viewall")
    public List<CourseModel> viewAllCourses() {
        return courseService.selectAllCourses();
    }
} 
