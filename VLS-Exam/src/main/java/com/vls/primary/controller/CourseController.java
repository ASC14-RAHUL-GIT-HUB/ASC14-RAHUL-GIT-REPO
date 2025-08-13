package com.vls.primary.controller;

import com.vls.primary.entity.CourseEntity;
import com.vls.primary.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseEntity> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping
    public CourseEntity addCourse(@RequestBody CourseEntity course) {
        return courseService.addCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

    @GetMapping("/search/author/{author}")
    public List<CourseEntity> searchByAuthor(@PathVariable String author) {
        return courseService.searchByAuthor(author);
    }

    @GetMapping("/search/name/{courseName}")
    public List<CourseEntity> searchByCourseName(@PathVariable String courseName) {
        return courseService.searchByCourseName(courseName);
    }
}
