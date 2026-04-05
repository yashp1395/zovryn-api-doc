import java.util.ArrayList;
import java.util.Scanner;

class Task {
    int id;
    String name;

    Task(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class TaskManager {
    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Update Task\n4. Delete Task\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> updateTask();
                case 4 -> deleteTask();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void addTask() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();

        tasks.add(new Task(id, name));
    }

    static void viewTasks() {
        for (Task t : tasks) {
            System.out.println(t.id + " - " + t.name);
        }
    }

    static void updateTask() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Task t : tasks) {
            if (t.id == id) {
                System.out.print("Enter new name: ");
                t.name = sc.nextLine();
            }
        }
    }

    static void deleteTask() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        tasks.removeIf(t -> t.id == id);
    }
}