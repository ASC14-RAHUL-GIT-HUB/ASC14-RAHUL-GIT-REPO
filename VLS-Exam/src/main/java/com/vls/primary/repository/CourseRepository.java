package com.vls.primary.repository;

import com.vls.primary.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
    List<CourseEntity> findByAuthorNameContainingIgnoreCase(String authorName);
    List<CourseEntity> findByCourseNameContainingIgnoreCase(String courseName);
}
