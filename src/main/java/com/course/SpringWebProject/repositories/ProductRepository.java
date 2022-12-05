package com.course.SpringWebProject.repositories;

import com.course.SpringWebProject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
