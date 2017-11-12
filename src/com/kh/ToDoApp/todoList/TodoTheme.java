package com.kh.ToDoApp.todoList;

import com.kh.ToDoApp.inter.Change;

import java.util.function.Supplier;

public class TodoTheme implements Change, Supplier {
    private String theme = "mountain";

    @Override
    public void change(String s) {
        this.theme = s;
    }

    @Override
    public String get() {
        return this.theme;
    }
}

