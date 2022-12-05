package com.course.SpringWebProject.repositories;

import com.course.SpringWebProject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
