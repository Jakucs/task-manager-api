package com.example.taskmanagerapi.dto;

import com.example.taskmanagerapi.model.Status;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class TaskRequest {
    
    @NotBlank
    private String text;
    private LocalDate deadline;
    @Min(1)
    @Max(5)
    private int importance;
    @NotNull
    private Status status;
    @NotNull
    private Integer userId;

    public String getText() {
        return text;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public int getImportance() {
        return importance;
    }

    public Status getStatus() {
        return status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void setText(String text) {
        this.text = text;
    }



}
