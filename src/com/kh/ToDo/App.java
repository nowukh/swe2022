package com.kh.ToDo;

import java.util.ArrayList;

public class App {
    public static ArrayList<TodoList> todoList = new ArrayList<>();
    public static void addList(String name){
        todoList.add(new TodoList(name));
    }
    public static void main(String[] arg){
        addList("목록1");
        TodoList test = todoList.get(0);
        test.addTask("할일1");
        test.getList();
        System.out.println(todoList.size());
        test.deleteTodoList();
        System.out.println(todoList.size());
    }
}
