package com.kh.ToDo;
import java.util.*;

import static com.kh.ToDo.App.todoList;

public class TodoList {
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

    void addTask(String name){
        taskList.add(new TodoTask(name));
    }

    void deleteTodoList(){
        todoList.remove(this);
    }

    void setSortBy(Comparator c){
        Collections.sort(taskList, c);
    }

    class TodoTask {

        String name;
        Date createdAt = new Date();
        Date dueTo;
        boolean todaysTask = false;
        boolean isDone = false;
        boolean alram = false;
        TodoTask(String name) {
            this.name = name;
        }

        void setName(String name){
            this.name = name;
        }

        void setDueTo(Date d){
            this.dueTo = d;
        }
        class myTask extends TimerTask{
            @Override
            public void run() {
                if(alram){
                    int result = dueTo.compareTo(new Date());
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