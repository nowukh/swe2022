package com.kh.ToDo.todoList;

import com.kh.ToDo.inter.Change;

import java.util.function.Supplier;

public class TodoOrder implements Supplier, Change{
    String  order = "date";
    @Override
    public String get() {
        return order;
    }

    @Override
    public void change(String s) {
        this.order = s;
    }
}
