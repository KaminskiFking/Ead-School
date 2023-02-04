package com.ead.course.repositories;

import com.ead.course.models.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModuleRepository extends JpaRepository<CourseModel, UUID> {
}
