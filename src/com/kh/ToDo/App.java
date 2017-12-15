package com.kh.ToDo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App implements Serializable{
    public  ArrayList<TodoList> todoList = new ArrayList<>();
    public  void addList(String name){
        todoList.add(new TodoList(name));
    }
     void showTodoList(ArrayList<TodoList> todos) {
        for (TodoList todo : todos) {
            System.out.println("-" + todo.name + " " + todo.taskList.size());
        }
    }
     TodoList getTodoList(ArrayList<TodoList> todos, String listName){
        for (TodoList todo : todos) {
            if(todo.name.equals(listName)){
                for(TodoList.TodoTask task : todo.taskList){
                    String done = "[-]";
                    if(task.isDone){
                        done = "[o]";
                    }else{
                        done = "[-]";
                    }
                    task.setDueTo(LocalDate.now());
                    System.out.println(done + " " + task.name + " " + task.dueTo + " " + task.alram );
                }
                return todo;
            }
        }return null;
    }
     void setDone(TodoList li, String name){
        for(TodoList.TodoTask task : li.taskList){
            if(task.name.equals(name)){
                if(task.isDone){
                    task.isDone = false;
                }else{
                    task.isDone = true;
                }
            }
        }
    }

    void save() throws IOException{
     try{
        Path p = Paths.get("c:/test", "obj.txt");
        if (!Files.exists(p)) Files.createFile(p);
        ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(p));
        out.reset();
        out.writeObject(this);
        } catch (Exception e) {
         e.printStackTrace();
     }
    }

    App load() throws IOException{
        try {
            Path p = Paths.get("c:/test", "obj.txt");
            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(p));
            return (App) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    }


