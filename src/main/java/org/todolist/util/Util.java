package org.todolist.util;

import java.util.Scanner;

public class Util {
  public String getALine() {
    return "------------------------------------------------------------";
  }

  public void printALine() {
    System.out.println(getALine());
  }

  public void cls() {
    System.out.println(new String(new char[50]).replace("\0", "\r\n"));
  }

  public void printToAlertEmpty() {
    System.out.println("Your to-do list is empty!");
  }

  public int userChoice(String choiceDisc) {
    System.out.println(choiceDisc);
    System.out.println("1. Yes, I want to!");
    System.out.println("2. No, thanks");
    System.out.print("Choose one: ");

    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }

  public int userChoice(String... choices) {
    for (int i = 0; i < choices.length; i++) {
      System.out.println(i + 1 + ". " + choices[i]);
    }

    System.out.print("Choose one: ");

    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    cls();
    return userInput;
  }
}