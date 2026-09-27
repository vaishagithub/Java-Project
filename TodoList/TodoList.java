package TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
       public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== TODO LIST =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            // 1. Add Task
            if (choice == 1) {

                System.out.print("Enter task: ");
                String task = sc.nextLine();

                tasks.add(task);

                System.out.println("Task added successfully!");

            }

            // 2. View Tasks
            else if (choice == 2) {

                if (tasks.isEmpty()) {

                    System.out.println("No tasks available.");

                } else {

                    System.out.println("\nYour Tasks:");

                    for (int i = 0; i < tasks.size(); i++) {

                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            }

            // 3. Complete Task
            else if (choice == 3) {

                if (tasks.isEmpty()) {

                    System.out.println("No tasks available.");

                } else {

                    System.out.print("Enter task number to complete: ");
                    int taskNumber = sc.nextInt();

                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {

                        String completedTask = tasks.get(taskNumber - 1);//Array start from 0 so -1

                        tasks.set(taskNumber - 1, completedTask + "✓");// tasks.set(1, "Practice ArrayList ✓");

                        System.out.println("Task completed!");

                    } else {

                        System.out.println("Invalid task number.");
                    }
                }
            }

            // 4. Delete Task
            else if (choice == 4) {

                if (tasks.isEmpty()) {

                    System.out.println("No tasks available.");

                } else {

                    System.out.print("Enter task number to delete: ");
                    int taskNumber = sc.nextInt();

                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {

                        tasks.remove(taskNumber - 1);

                        System.out.println("Task deleted!");

                    } else {

                        System.out.println("Invalid task number.");
                    }
                }
            }
            // tasks.set(index, value) 

            // 5. Exit
            else if (choice == 5) {

                System.out.println("Thank you! Todo List closed.");
                break;

            } else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
