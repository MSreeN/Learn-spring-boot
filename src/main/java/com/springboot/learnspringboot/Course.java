package com.springboot.learnspringboot;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private int courseId;
    private String courseName;

    Course(){}

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String toString(){
        return "CourseId: "+ this.courseId + "CourseName: "+ this.courseName;
    }
}
