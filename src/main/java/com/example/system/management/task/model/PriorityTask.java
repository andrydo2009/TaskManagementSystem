package com.example.system.management.task.model;

import lombok.Getter;

@Getter
public enum PriorityTask {
    HARD_PRIORITY("высокий"),
    MEDIUM_PRIORITY("средний"),
    LOW_PRIORITY("низкий");

    private final String priority;

    PriorityTask(String priority) {
        this.priority=priority;
    }
}
