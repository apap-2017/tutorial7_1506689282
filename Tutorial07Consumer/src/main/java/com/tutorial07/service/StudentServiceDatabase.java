package com.tutorial07.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial07.dao.StudentMapper;
import com.tutorial07.model.CourseModel;
import com.tutorial07.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceDatabase implements StudentService
{
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public StudentModel selectStudent (String npm)
    {
        log.info ("DB - Select student with npm {}", npm);
        return studentMapper.selectStudent (npm);
    }


    @Override
    public List<StudentModel> selectAllStudents ()
    {
        log.info ("DB - Select all students");
        return studentMapper.selectAllStudents ();
    }


    @Override
    public void addStudent (StudentModel student)
    {
        studentMapper.addStudent (student);
    }


    @Override
    public void deleteStudent (String npm)
    {
    	log.info ("DB - Student " + npm + " deleted");
    	studentMapper.deleteStudent(npm);
    }
    
    @Override
    public void updateStudent (StudentModel student)
    {
    	log.info ("DB - Student " + student.getNpm() + " updated name to " + student.getName() + 
    			" and gpa to " + student.getGpa());
    	studentMapper.updateStudent(student);
    }
    
    @Override
    public List<CourseModel> selectCourses (@Param("npm") String npm) {
    	log.info ("DB - Select courses of student with npm {}", npm);
    	return studentMapper.selectCourses(npm);
    }
    
}
