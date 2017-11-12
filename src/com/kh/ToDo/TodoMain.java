package com.kh.ToDo;

import java.util.ArrayList;

import com.kh.ToDo.todoList.TodoList;
import com.kh.ToDo.todoList.TodoList.TodoTask;

public class TodoMain {
    public static ArrayList<TodoList> todoList = new ArrayList<>();
    public static void createList(String name, String iconName){
        todoList.add(new TodoList(name, iconName));
    }
    public static void main(String[] arg){
        // 그룹 생성
        createList("group1", "defalt");
        TodoList g1 = todoList.get(0);
        // 할일 생성
        g1.createTask("task1");
        g1.createTask("task2");
        System.out.println(g1.name + " " + g1.createdAt + " " + g1.color.get() + " " +
                           g1.icon.get() + " " + g1.theme.get() );

        // 그룹내 할일 출력
        ArrayList<TodoTask> group1TaskList = g1.getTaskList();
        for(TodoTask task: group1TaskList){
            System.out.println(task.name + " " + task.createdAt + " note:" + task.note + " alram:" +
                    task.alram + " order:" + task.order + " dueTo:" + task.dueto);
        }
    }
}
