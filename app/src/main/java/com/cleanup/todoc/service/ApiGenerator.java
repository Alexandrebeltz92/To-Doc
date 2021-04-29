package com.cleanup.todoc.service;

import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.model.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApiGenerator {

    // --- Task Generator ---

    public static List<Task> taskList = Arrays.asList(
    );

    static List<Task> getTaskList() {
        return new ArrayList<>(taskList);
    }

    // --- Project Generator ---

    public static List<Project> projectList = Arrays.asList(Project.getAllProjects());

    static List<Project> getProjectList() {
        return new ArrayList<>(projectList);
    }

}
