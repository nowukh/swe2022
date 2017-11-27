package com.kh.ToDo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<TodoList> todoList = new ArrayList<>();
    public static void addList(String name){
        todoList.add(new TodoList(name));
    }
    static void showTodoList(ArrayList<TodoList> todos) {
        for (TodoList todo : todos) {
            System.out.println("-" + todo.name + " " + todo.taskList.size());
        }
    }
    static TodoList getTodoList(ArrayList<TodoList> todos, String listName){
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
    static void setDone(TodoList li, String name){
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

    public static void main(String[] arg){
        addList("오늘 할일");
        addList("Todo");
        addList("과제1");
        for(TodoList li : todoList){
            li.addTask(li.name + "의 할일1", null,null);
            li.addTask(li.name + "의 할일2", null,null);
            li.addTask(li.name + "의 할일3", null,null);
        }

        Scanner in = new Scanner(System.in).useDelimiter("\\n");
        TodoList li = null;
        exit:
        while (true) {
            showTodoList(todoList);
            in.reset();
            System.out.print("Enter: ");

            inputCommand:
            while (in.hasNext()) {
                String command = in.nextLine();
                String[] commandList = command.split(":");

                switch (commandList[0]) {
                    case "exit":
                        break exit;
                    case "addList":
                        addList(commandList[1]);
                        break inputCommand;
                    case "list":
                        System.out.println(commandList[1]);
                        li = getTodoList(todoList, commandList[1]);
                        System.out.println(li);
                        break inputCommand;
                    case "addTodo":
                        String[] taskOption = commandList[1].split(",");
                            if(taskOption.length == 1){
                                li.addTask(taskOption[0],null,null);
                            }else{

                                String[] dateString = taskOption[1].split("\\.");
                                li.addTask(taskOption[0],LocalDate.of(Integer.parseInt(dateString[0]), Integer.parseInt(dateString[1]), Integer.parseInt(dateString[2])),
                                        null);
                            }
                        getTodoList(todoList, li.name);
                        break inputCommand;
                    case "complete":
                        setDone(li, commandList[1]);
                        getTodoList(todoList, li.name);
                        break inputCommand;
                    case "incomplete":
                        setDone(li, commandList[1]);
                        getTodoList(todoList, li.name);
                        break inputCommand;
                }
            }
        }
    }
}
