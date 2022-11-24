package com.course.SpringWebProject.repositories;

import com.course.SpringWebProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
