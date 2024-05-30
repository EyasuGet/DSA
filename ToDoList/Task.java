package ToDoList;

import java.util.Scanner;

public class Task {
    String taskTitle;
    String discription;
    boolean completed;

    public Task() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your task title: ");
        taskTitle = sc.nextLine();

        System.out.print("Enter your task description: ");
        discription = sc.nextLine();

        this.completed = false;

    }

    public Task(String taskTitle, String discription) {
        this.taskTitle = taskTitle;
        this.discription = discription;
        this.completed = false;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getDiscription() {
        return discription;
    }

    public boolean isCompleted(){
        return completed;
    }
    public void markCompleted(){
        this.completed = true;

    }
}
