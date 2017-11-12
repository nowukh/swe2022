package com.kh.ToDoApp.todoAttribute;

import com.kh.ToDoApp.Change;

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
