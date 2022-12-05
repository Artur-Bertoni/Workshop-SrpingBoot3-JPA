package com.course.SpringWebProject.repositories;

import com.course.SpringWebProject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
