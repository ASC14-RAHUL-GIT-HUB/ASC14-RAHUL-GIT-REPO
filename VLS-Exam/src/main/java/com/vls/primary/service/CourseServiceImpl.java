package com.vls.primary.service;

import com.vls.primary.entity.CourseEntity;
import com.vls.primary.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

//    @Autowired
    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity addCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<CourseEntity> searchByAuthor(String author) {
        return courseRepository.findByAuthorNameContainingIgnoreCase(author);
    }

    @Override
    public List<CourseEntity> searchByCourseName(String courseName) {
        return courseRepository.findByCourseNameContainingIgnoreCase(courseName);
    }
}
