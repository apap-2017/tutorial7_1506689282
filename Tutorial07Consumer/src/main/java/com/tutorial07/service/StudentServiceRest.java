package com.tutorial07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.tutorial07.dao.StudentDAO;
import com.tutorial07.model.CourseModel;
import com.tutorial07.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class StudentServiceRest implements StudentService
{
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public StudentModel selectStudent (String npm)
    {
        log.info ("REST - Select student with npm {}", npm);
        return studentDAO.selectStudent (npm);
    }

    @Override
    public List<StudentModel> selectAllStudents ()
    {
        log.info ("REST - Select all students");
        return studentDAO.selectAllStudents();
    }

    @Override
    public void addStudent (StudentModel student){}

    @Override
    public void deleteStudent (String npm){}
 
	@Override
	public void updateStudent(StudentModel student) {}  
	
	@Override
	public List<CourseModel> selectCourses (String npm) {
        log.info ("REST - Select courses by student");
        return null;
	}
	
} 