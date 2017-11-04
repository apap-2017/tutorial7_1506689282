package com.tutorial07.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tutorial07.model.CourseModel;

public interface CourseService
{
	List<CourseModel> selectAllCourses (); 
	
	CourseModel selectCourse (@Param("idCourse") String idCourse); 
    
}
