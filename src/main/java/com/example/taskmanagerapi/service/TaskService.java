package com.example.taskmanagerapi.service;

import com.example.taskmanagerapi.model.Task;
import com.example.taskmanagerapi.repository.TaskRepository;
import com.example.taskmanagerapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final UserRepository userRepository;
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository, UserRepository userRepository){
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    public Task addTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskByID(Integer id){
        return taskRepository.findById(id);
    }

    public void deleteTaskByID(Integer id){
        taskRepository.deleteById(id);
    }

    public Optional<Task> modifyTaskByID(Integer id, Task task){
        Optional<Task> found = taskRepository.findById(id);

        if(found.isPresent()){
            Task existing = found.get();
            existing.setText(task.getText());
            existing.setDeadline(task.getDeadline());
            existing.setImportance(task.getImportance());
            existing.setStatus(task.getStatus());
            return Optional.of(taskRepository.save(existing));
        }
        return Optional.empty();
    }
}