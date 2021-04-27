package com.cleanup.todoc.service;

import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.model.Task;

import java.util.List;

public class Repository implements ApiService {

    @Override
    public List<Project> getProject() {
        return null;
    }

    @Override
    public List<Task> getTask() {
        return null;
    }

    @Override
    public void deleteTask(Task task) {

    }

    @Override
    public void createTask(Task task) {

    }
}
