package com.tutorial07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.tutorial07.dao.CourseDAO;
import com.tutorial07.model.CourseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class CourseServiceRest implements CourseService
{
    @Autowired
    private CourseDAO courseDAO;

	@Override
	public List<CourseModel> selectAllCourses () {
        log.info ("REST - select students by course");
        return courseDAO.selectAllCourses();
	}
	
    @Override
    public CourseModel selectCourse (String idCourse)
    {
        log.info ("REST - Select course with idCourse {}", idCourse);
        return courseDAO.selectCourse(idCourse);
    }
	
} 