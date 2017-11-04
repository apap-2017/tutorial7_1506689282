package com.tutorial07.dao;

import java.util.List;

import com.tutorial07.model.CourseModel;

public interface CourseDAO
{
    CourseModel selectCourse (String idCourse);
    List<CourseModel> selectAllCourses (); 
    
} 
