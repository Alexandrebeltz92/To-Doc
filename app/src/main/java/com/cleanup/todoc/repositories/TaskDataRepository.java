package com.cleanup.todoc.repositories;

import android.arch.lifecycle.LiveData;

import com.cleanup.todoc.database.dao.TaskDao;
import com.cleanup.todoc.model.Task;

import java.util.List;

public class TaskDataRepository {

    private final TaskDao taskDao;

    public TaskDataRepository(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    // --- GET ---
    public LiveData<List<Task>> getTasksWithAProject(long projectId) {
        return this.taskDao.getTasksFromAProject(projectId);
    }

    public LiveData<List<Task>> getTasks() {
        return this.taskDao.getTasks();
    }

    // --- CREATE ---
    public void createTask(Task task) {
        taskDao.insertTask(task);
    }


    // --- UPDATE ---
    public void updateTask(Task task) {
        taskDao.updateTask(task);
    }

    // --- DELETE ---
    public void deleteTask(Task task) {
        taskDao.deleteTask(task);
    }


}
