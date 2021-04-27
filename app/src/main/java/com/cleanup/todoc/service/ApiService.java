package com.cleanup.todoc.service;

import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.model.Task;

import java.util.List;

/**
 * API client
 */
public interface ApiService {

    /**
     * Get all my Project
     *
     * @return {@link List}
     */
    List<Project> getProject();

    /**
     * Get all my Task
     *
     * @return {@link List}
     */
    List<Task> getTask();

    /**
     * Deletes a Task
     *
     * @param task
     */
    void deleteTask(Task task);

    /**
     * Create a task
     *
     * @param task
     */
    void createTask(Task task);

}
