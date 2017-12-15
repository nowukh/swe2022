package com.kh.ToDo;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class TodoList implements Serializable {
    ArrayList<TodoTask> taskList = new ArrayList<>();
    String name;
    Comparator sortBy;
    boolean showDoneTasks = false;
    TodoTheme todoTheme;


    public TodoList(String name) {
        this.name = name;
    }
    void setName(String name){ this.name = name; }

    void setTodoTheme(TodoTheme.Color c, TodoTheme.Background b){
        this.todoTheme.setColor(c);
        this.todoTheme.setBackground(b);
    }

    void getList(){
        if(showDoneTasks){
            for(TodoTask t:taskList){
                System.out.println(t.toString());
            }
        }else{
            for(TodoTask t:taskList){
                if(!t.isDone)System.out.println(t.toString());
            }
        }
    }

    void addTask(String name, LocalDate dueTo, LocalDate alram){
        taskList.add(new TodoTask(name,dueTo,alram));
    }

//    void deleteTodoList(){
//        todoList.remove(this);
//    }

    void setSortBy(Comparator c){
        Collections.sort(taskList, c);
    }

    class TodoTask implements Serializable {
        String name;
        LocalDate createdAt = LocalDate.now();
        LocalDate dueTo;
        boolean todaysTask = false;
        boolean isDone = false;
        LocalDate alram=null;
        TodoTask(String name) {
            this.name = name;
        }
        TodoTask(String name, LocalDate dueTo, LocalDate alram) {
            this.name = name;
            this.dueTo = dueTo;
            this.alram = alram;
        }

        void setName(String name){
            this.name = name;
        }

        void setDueTo(LocalDate d){
            this.dueTo = d;
        }
        class myTask extends TimerTask{
            @Override
            public void run() {
                if(alram==null){
                    int result = dueTo.compareTo(LocalDate.now());
                    if(result >= 0){
                        System.out.println("알람");
                    }
                }
            }
        }
        void isAlram(){
            Timer timer = new Timer();
            timer.schedule(new myTask(), 0, 5*60*1000);
        }
        public String toString() {
            return "name: " + this.name + ", createdAt: " + createdAt.toString()+"\n";
        }
    }
}