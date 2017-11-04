package com.tutorial07.dao;

import java.util.List;

import com.tutorial07.model.StudentModel;

public interface StudentDAO
{
    StudentModel selectStudent (String npm);
    List<StudentModel> selectAllStudents (); 
} 
