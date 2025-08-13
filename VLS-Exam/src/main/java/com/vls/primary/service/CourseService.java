package com.vls.primary.service;

import com.vls.primary.entity.CourseEntity;
import java.util.List;

public interface CourseService {
    List<CourseEntity> getAllCourses();
    CourseEntity addCourse(CourseEntity course);
    void deleteCourse(Long id);
    List<CourseEntity> searchByAuthor(String author);
    List<CourseEntity> searchByCourseName(String courseName);
}
