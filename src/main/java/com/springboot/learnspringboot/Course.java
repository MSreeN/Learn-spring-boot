package com.springboot.learnspringboot;

public class Course {
    private int courseId;
    private String courseName;

    public Course(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
