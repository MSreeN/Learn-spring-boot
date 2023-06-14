package com.springboot.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.learnspringboot.Course;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(new Course(1, "LearnSpringBoot"), new Course(2, "Learn Devops"));
    }
}