package com.kh.ToDoApp;

import com.kh.ToDoApp.taskAttr.*;
import com.kh.ToDoApp.todoAttribute.TodoColor;
import com.kh.ToDoApp.todoAttribute.TodoIcon;
import com.kh.ToDoApp.todoAttribute.TodoTheme;

import java.util.ArrayList;
import java.util.Date;

public class TodoList {
    public String name;
    public ArrayList<TodoTask> taskList = new ArrayList<TodoTask>();
    public TodoTheme theme = new TodoTheme();
    public TodoColor color = new TodoColor();
    public TodoIcon icon;
    public Date createdAt = new Date();

    public TodoList(String name, String iconName){
        this.name = name;
        this.icon = new TodoIcon(iconName);
    }

    public ArrayList<TodoTask> getTaskList() {
        return taskList;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public class TodoTask {
        public String name;
        public Date createdAt = new Date();
        public String note;
        public TaskAlram alram;
        public TaskRepeat repeat;
        public TaskOrder order;
        public TaskDueTo dueto;
        public boolean isDone = false;

        public TodoTask(String name){
            this.name = name;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public void setAlram(TaskAlram alram) {
            this.alram = alram;
        }

        public void setRepeat(TaskRepeat repeat) {
            this.repeat = repeat;
        }

        public void setDueto(TaskDueTo dueto) {
            this.dueto = dueto;
        }

        public void finished(){
            this.isDone = true;
        }
    }

    public void createTask(String name){
        this.taskList.add(new TodoTask(name));
    }
}
