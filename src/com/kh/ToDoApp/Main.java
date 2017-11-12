package com.kh.ToDoApp;

import java.util.ArrayList;

import com.kh.ToDoApp.todoList.TodoList;
import com.kh.ToDoApp.todoList.TodoList.TodoTask;

public class Main {
    public static void main(String[] arg){
        // 그룹 생성
        TodoList group1 = new TodoList("목록1", "아이콘1");

        // 할일 생성
        group1.createTask("task1");
        group1.createTask("task2");
        System.out.println(group1.name + " " + group1.createdAt + " " + group1.color.get() + " " +
                           group1.icon.get() + " " + group1.theme.get() );

        // 그룹내 할일 출력
        ArrayList<TodoTask> group1TaskList = group1.getTaskList();
        for(TodoTask task: group1TaskList){
            System.out.println(task.name + " " + task.createdAt + " note:" + task.note + " alram:" +
                    task.alram + " order:" + task.order + " dueTo:" + task.dueto);
        }
    }
}
