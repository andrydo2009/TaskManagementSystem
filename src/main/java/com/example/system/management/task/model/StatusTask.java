package com.example.system.management.task.model;

import lombok.Getter;

@Getter
public enum StatusTask {
    WAITING("в ожидании"),
    PROGRESS("в процессе"),
    DONE("выполнено");

    private final String status;
    StatusTask(String status) {
        this.status = status;
    }
}
