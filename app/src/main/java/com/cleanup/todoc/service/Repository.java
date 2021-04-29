package com.cleanup.todoc.service;

import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.model.Task;

import java.util.List;

public class Repository implements ApiService {

    private List<Task> mTaskList = ApiGenerator.getTaskList();
    private List<Project> mProjectList = ApiGenerator.getProjectList();

    @Override
    public List<Project> getAllProjects() {
        return mProjectList ;
    }

    @Override
    public List<Task> getTaskList() {
    return mTaskList;
    }

    @Override
    public void deleteTask(Task task) {
    mTaskList.remove(task);
    }

    @Override
    public void createTask(Task task) {
    mTaskList.add(task);
    }
}
