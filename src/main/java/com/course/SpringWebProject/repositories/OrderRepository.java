package com.course.SpringWebProject.repositories;

import com.course.SpringWebProject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
