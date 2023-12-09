package com.example.system.management.task.repository;

import com.example.system.management.task.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
