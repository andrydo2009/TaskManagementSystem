package com.example.system.management.task.model;

public enum StatusTask {
    WAITING("в ожидании"),
    PROGRESS("в процессе"),
    DONE("выполнено");

    private final String status;
    StatusTask(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}
