package com.course.SpringWebProject.repositories;

import com.course.SpringWebProject.entities.OrderItem;
import com.course.SpringWebProject.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
