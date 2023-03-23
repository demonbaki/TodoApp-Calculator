import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<String> tasks;

    public Main() {
        tasks = new ArrayList<String>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void completeTask(int index) {
        tasks.remove(index);
    }

    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to do.");
        } else {
            System.out.println("Tasks to do:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Main todoList = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Add task");
            System.out.println("2 - Complete task");
            System.out.println("3 - Print tasks");
            System.out.println("4 - Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Task description: ");
                    String taskDescription = scanner.next();
                    todoList.addTask(taskDescription);
                    break;

                case 2:
                    System.out.print("Task number: ");
                    int taskNumber = scanner.nextInt();
                    todoList.completeTask(taskNumber - 1);
                    break;

                case 3:
                    todoList.printTasks();
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
