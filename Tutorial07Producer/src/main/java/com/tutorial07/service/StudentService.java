package com.tutorial07.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tutorial07.model.CourseModel;
import com.tutorial07.model.StudentModel;

public interface StudentService
{
    StudentModel selectStudent (String npm);


    List<StudentModel> selectAllStudents ();


    void addStudent (StudentModel student);


    void deleteStudent (String npm);
    
    
    void updateStudent (StudentModel student);
    
    
    List<CourseModel> selectCourses (@Param("npm") String npm);
}
