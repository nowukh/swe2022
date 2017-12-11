package com.kh.ToDo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) throws IOException {
        App app = new App();
        app.addList("오늘 할일");
        app.addList("Todo");
        app.addList("과제1");
        for(TodoList li : app.todoList){
            li.addTask(li.name + "의 할일1", null,null);
            li.addTask(li.name + "의 할일2", null,null);
            li.addTask(li.name + "의 할일3", null,null);
        }

        Scanner in = new Scanner(System.in).useDelimiter("\\n");
        TodoList li = null;
        exit:
        while (true) {
            app.showTodoList(app.todoList);
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
                        app.addList(commandList[1]);
                        break inputCommand;
                    case "list":
                        System.out.println(commandList[1]);
                        li = app.getTodoList(app.todoList, commandList[1]);
                        System.out.println(li);
                        break inputCommand;
                    case "addTodo":
                        String[] taskOption = commandList[1].split(",");
                        if(taskOption.length == 1){
                            li.addTask(taskOption[0],null,null);
                        }else{

                            String[] dateString = taskOption[1].split("\\.");
                            li.addTask(taskOption[0], LocalDate.of(Integer.parseInt(dateString[0]), Integer.parseInt(dateString[1]), Integer.parseInt(dateString[2])),
                                    null);
                        }
                        app.getTodoList(app.todoList, li.name);
                        break inputCommand;
                    case "complete":
                        app.setDone(li, commandList[1]);
                        app.getTodoList(app.todoList, li.name);
                        break inputCommand;
                    case "incomplete":
                        app.setDone(li, commandList[1]);
                        app.getTodoList(app.todoList, li.name);
                        break inputCommand;
                    case "save":
                        app.save();
                        break inputCommand;
                    case "load":
                        app = app.load();
                        break inputCommand;
                }
            }
        }
    }
}
