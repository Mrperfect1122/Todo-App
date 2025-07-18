package com.rohit.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.todoapp.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
