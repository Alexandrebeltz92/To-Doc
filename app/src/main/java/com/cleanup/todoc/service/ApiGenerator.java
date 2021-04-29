package com.cleanup.todoc.service;

import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.model.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApiGenerator {

    // --- Task Generator ---

    public static List<Task> TaskList = Arrays.asList(
    );

    static List<Task> getTaskList() {
        return new ArrayList<>(TaskList);
    }

    // --- Project Generator ---

    public static List<Project> ProjectList = Arrays.asList(Project.getAllProjects());

    static List<Project> getProjectList() {
        return new ArrayList<>(ProjectList);
    }

}
