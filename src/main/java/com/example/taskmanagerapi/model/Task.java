package com.example.taskmanagerapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@Entity
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue
    private int id;
    private LocalDate deadline;
    @NotBlank
    private String text;
    @Min(1)
    @Max(5)
    private int importance;
    @Enumerated(EnumType.STRING)
    @NotBlank
    private Status status;


    public int getId() {
        return id;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public int getImportance() {
        return importance;
    }

    public String getText() {
        return text;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
