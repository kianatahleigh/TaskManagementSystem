package org.example.taskmanagementsystem.service;

import org.example.taskmanagementsystem.model.Employee;
import org.example.taskmanagementsystem.model.Task;
import org.example.taskmanagementsystem.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void saveTasks(List<Task> tasks) {
        taskRepository.saveAll(tasks);

    }

    public List<Task> getTasksByEmployee(Employee employee) {
        return taskRepository.findByEmployee(employee);
    }

    public void updateTaskStatus(Long taskId, String status) {
        Task task = getTaskById(taskId);
        task.setStatus(status);
        taskRepository.save(task);
    }
}