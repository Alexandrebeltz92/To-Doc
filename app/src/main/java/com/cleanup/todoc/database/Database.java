package com.cleanup.todoc.database;



import android.content.ContentValues;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.OnConflictStrategy;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.cleanup.todoc.database.dao.ProjectDao;
import com.cleanup.todoc.database.dao.TaskDao;
import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.model.Task;

@androidx.room.Database(entities = {Project.class, Task.class}, version =1, exportSchema = false)
public abstract class Database extends RoomDatabase {

    // --- SINGLETON ---
    private static volatile Database Instance;

    // --- DAO ---
  //  public abstract ProjectDao mProjectDao;
  //  public abstract TaskDao mTaskDao;

    // --- INSTANCE ---
    public static Database getInstance(Context context) {
        if (Instance == null) {
            synchronized (Database.class) {
                if (Instance == null) {
                    Instance = Room.databaseBuilder(context.getApplicationContext(),
                            Database.class,"ToDocDatabase.db")
                            .addCallback(prepopulateDatabase())
                            .build();
                }
            }
        }
        return Instance;
    }

    // ---
    private static Callback prepopulateDatabase() {
        return new Callback() {
            @Override
            public void onCreate(@NonNull SupportSQLiteDatabase db) {
                super.onCreate(db);

                ContentValues contentValues = new ContentValues();
                contentValues.put("id", 1);
                contentValues.put("name", "Projet Tartampion");
                contentValues.put("color", 0xFFEADAD1);
                db.insert("Project", OnConflictStrategy.IGNORE, contentValues);
                contentValues.clear();

                contentValues.put("id", 2);
                contentValues.put("name", "Projet Lucidia");
                contentValues.put("color", 0xFFB4CDBA);
                db.insert("Project", OnConflictStrategy.IGNORE, contentValues);
                contentValues.clear();

                contentValues.put("id", 3);
                contentValues.put("name", "Projet Circus");
                contentValues.put("color", 0xFFB4CDBA);
                db.insert("Project", OnConflictStrategy.IGNORE, contentValues);
                contentValues.clear();
            }
        };
    }


}
