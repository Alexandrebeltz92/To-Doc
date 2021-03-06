package com.cleanup.todoc.ui;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.model.Task;
import com.cleanup.todoc.repositories.ProjectDataRepository;
import com.cleanup.todoc.repositories.TaskDataRepository;

import java.util.List;
import java.util.concurrent.Executor;

public class TaskViewModel extends ViewModel {

    private final TaskDataRepository taskDataSource;
    private final ProjectDataRepository projectDataSource;
    private final Executor executor;

    // --- DATA ---

    public TaskViewModel(TaskDataRepository taskDataRepository, ProjectDataRepository projectDataRepository, Executor executor) {
        this.taskDataSource = taskDataRepository;
        this.projectDataSource = projectDataRepository;
        this.executor = executor;
        executor.execute(new Runnable() {
            @Override
            public void run() {
                final Project[] allProjects = Project.getAllProjects();
                for (Project project : allProjects) {
                    projectDataRepository.createProject(project);

                }

            }
        });
    }

    public LiveData<List<Task>> tasks() {
        return taskDataSource.getTasks();
    }

    public void createTask(Task task) {
        executor.execute(() -> taskDataSource.createTask(task));
    }

    public void updateTask(Task task) {
        executor.execute(() -> taskDataSource.updateTask(task));
    }

    public void deleteTask(Task task) {
        executor.execute(() -> taskDataSource.deleteTask(task));
    }
}
