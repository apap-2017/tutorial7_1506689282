package com.tutorial07.dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.tutorial07.model.CourseModel;
import com.tutorial07.model.StudentModel;

@Mapper
public interface CourseMapper
{ 
    @Select("SELECT course.id_course, course.name, course.credits "
    		+ "FROM course")
    @Results(value = {
    	       @Result(property="idCourse", column="id_course"),
    	       @Result(property="name", column="name"),
    	       @Result(property="credits", column="credits"),
    	       @Result(property="students", column="id_course", 
    	               javaType = List.class,
    	               many=@Many(select="selectStudents"))
    	    })
    List<CourseModel> selectAllCourses ();
	
    @Select("SELECT course.id_course, course.name, course.credits "
    		+ "FROM course WHERE course.id_course = #{idCourse}")
    @Results(value = {
    	       @Result(property="idCourse", column="id_course"),
    	       @Result(property="name", column="name"),
    	       @Result(property="credits", column="credits"),
    	       @Result(property="students", column="id_course", 
    	               javaType = List.class,
    	               many=@Many(select="selectStudents"))
    	    })
    CourseModel selectCourse (@Param("idCourse") String idCourse);
    
    @Select("select student.npm, student.name, student.gpa " +
            "from studentcourse join student " +
            "on studentcourse.npm = student.npm " +
            "where studentcourse.id_course = #{idCourse}")
    List<StudentModel> selectStudents (@Param("idCourse") String idCourse); 
    

    
    
}
