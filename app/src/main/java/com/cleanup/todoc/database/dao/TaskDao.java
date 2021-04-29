package com.cleanup.todoc.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.cleanup.todoc.model.Task;

import java.util.List;

@Dao
public interface TaskDao {


    /**
     * Return task from list
     * @return
     */
   // @Query("SELECT * FROM task")
   // LiveData<List<Task>> getTasks();

    /**
     * Allow to create a new task
     * @param task
     */
   //  @Insert
   //  void insertTask(Task task);

    /**
     * Allow to delete a task
     * @param task
     */
   // @Delete
   // void deleteTask(Task task);


}
