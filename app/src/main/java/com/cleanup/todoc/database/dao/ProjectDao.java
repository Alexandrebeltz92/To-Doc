package com.cleanup.todoc.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.cleanup.todoc.model.Project;

import java.util.List;

@Dao
public interface ProjectDao {

    /**
     * Return project from list
     * @return
     */
   // @Query("SELECT * FROM projects")
   // LiveData<List<Project>> getProjects();

}