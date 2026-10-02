package com.example.taskmanagerapi.controller;

import com.example.taskmanagerapi.model.Task;
import com.example.taskmanagerapi.model.User;
import com.example.taskmanagerapi.service.TaskService;
import com.example.taskmanagerapi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;
    public TaskController (TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping
    public Task addTask(@Valid @RequestBody Task task){
        return taskService.addTask(task);
    }

    @GetMapping
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable Integer id){
        return taskService.getTaskByID(id);
    }

    @PutMapping("/{id}")
    public Optional<Task> modifyTaskByID(@PathVariable Integer id, @Valid @RequestBody Task task){
        return taskService.modifyTaskByID(id, task);
    }

    @DeleteMapping("/{id}")
    public void deleteTaskByID(@PathVariable Integer id){
        taskService.deleteTaskByID(id);
    }

}
