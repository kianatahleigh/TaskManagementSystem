package org.example.taskmanagementsystem.repository;

import org.example.taskmanagementsystem.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
