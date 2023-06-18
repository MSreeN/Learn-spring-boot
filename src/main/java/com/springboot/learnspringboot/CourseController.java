package com.springboot.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(new Course(1, "LearnSpringBoot"), new Course(2, "Learn Devops"),
        new Course(3, "Learn Docker"), new Course(4, "Learn Ansible"),
                new Course(5, "Learn Kubernetes"), new Course(6, "Learn Jenkins"));
    }
}
