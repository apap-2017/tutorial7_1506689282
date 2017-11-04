package com.tutorial07.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial07.dao.CourseMapper;
import com.tutorial07.model.CourseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseServiceDatabase implements CourseService
{
    @Autowired
    private CourseMapper courseMapper;
    
    @Override
    public List<CourseModel> selectAllCourses () {
    	log.info("DB - Select all courses");
    	return courseMapper.selectAllCourses();
    }
    
    @Override
    public CourseModel selectCourse (@Param("idCourse") String idCourse) {
    	log.info ("DB - Select course with idCourse {}", idCourse);
    	return courseMapper.selectCourse(idCourse);
    }
    
}
