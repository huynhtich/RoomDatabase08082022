package com.example.roomdatabase08082022.data.repository;

import android.content.Context;
import com.example.roomdatabase08082022.data.local.TodoDao;
import com.example.roomdatabase08082022.data.local.TodoDatabase;
import com.example.roomdatabase08082022.data.local.entity.TodoEntity;
import java.util.List;
import io.reactivex.rxjava3.core.Observable;

public class TodoRepository {
    private TodoDao todoDao;

    public TodoRepository(Context context) {
        todoDao = TodoDatabase.getInstance(context).getTodoDao();
    }

    public Observable<List<TodoEntity>> getTodos() {
        return todoDao.getTodoEntity();
    }
}
