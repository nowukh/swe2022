package com.kh.ToDoApp.todoList;

import com.kh.ToDoApp.inter.Change;

import java.util.function.Supplier;

public class TodoColor implements Change, Supplier {
    String color = "blue";

    @Override
    public void change(String s) {
        this.color = s;
    }

    @Override
    public String get() {
        return color;
    }
}
