package com.springboot.learnspringboot;

public class Course {
    private int courseId;
    private String courseName;

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
