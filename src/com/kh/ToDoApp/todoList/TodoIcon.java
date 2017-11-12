package com.kh.ToDoApp.todoList;

import com.kh.ToDoApp.inter.Change;

import java.util.function.Supplier;

public class TodoIcon implements Change, Supplier{
    String icon;
    public TodoIcon(String name){
        this.icon = name;
    }

    @Override
    public void change(String s) {
        this.icon = s;
    }

    @Override
    public String get() {
        return this.icon;
    }
}
