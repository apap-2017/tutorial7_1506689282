package com.tutorial07.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tutorial07.model.CourseModel;

@Service
public class CourseDAOImpl implements CourseDAO
{ 
@Autowired
private RestTemplate restTemplate;
 
    @Override
    public CourseModel selectCourse (String idCourse)
    {
        CourseModel course = restTemplate.getForObject("http://localhost:8080/rest/course/view/" + idCourse, CourseModel.class);
        return course; 
    }
 
	@Override
	@SuppressWarnings("unchecked")
	public List<CourseModel> selectAllCourses () 
	{
		
		List<CourseModel> courseList = 
				Collections.checkedList(restTemplate.getForObject("http://localhost:8080/rest/course/viewall", 
				List.class), CourseModel.class);
		return courseList;
	} 
}	
