package com.example.system.management.task.model;

import java.util.List;

public class Task {

    long id;
    String nameTask;
    String descriptionTask;
    StatusTask statusTask;
    PriorityTask priorityTask;
    User authorTask;
    User performerTask;
    List<Comment> commentList;

}
