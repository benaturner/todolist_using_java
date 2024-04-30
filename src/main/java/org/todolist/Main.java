package org.todolist;

import org.todolist.actions.Actions;
import org.todolist.db.Todolist;
import org.todolist.util.Util;

import java.io.*;
import java.util.List;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Util util = new Util();
    Actions actions = new Actions();
    List<Todolist.Task> tasks = new Todolist().getTasks();

    while (true) {
      util.printALine();
      int userChoice = util.userChoice( "see the to-do list:", "create a new to-do:", "delete a to-do:");

      switch (userChoice) {
        case 1:
          actions.viewTodoList(tasks);
          break;
        case 2:
          tasks = actions.addNewTodo(tasks);
          break;
        case 3:
          tasks = actions.deleteTodos(tasks);
          break;
      }
    }
  }
}