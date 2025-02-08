import java.util.*; // Importing utility classes for ArrayList and Scanner

public class TaskMaster {

    // Method to add tasks to the to-do list
    public static void AddTask(ArrayList<String> tasks, Scanner sc) {
        String ans;
        do {
            System.out.print("Enter the task that you want to add: ");
            String task = sc.nextLine();
            tasks.add(task); // Add the task to the list

            // Ask if the user wants to add more tasks
            System.out.println("Do you have more inputs?\ny\nn");
            System.out.print("-> ");
            ans = sc.next();
            sc.nextLine(); // Clear the newline character
        } while (ans.equalsIgnoreCase("y"));
    }

    // Method to display all tasks in the list
    public static void DisplayTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display! Start adding some. :D");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + " -> " + tasks.get(i));
            }
        }
    }

    // Helper method to check if the task list is empty
    public static boolean isListEmpty(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display! Start adding some. :D");
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Initialize task lists and input scanner
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<String> checked = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String answer = "y";

        // Welcome message and menu options
        System.out.println("Welcome To TaskMaster! Keep track of your tasks like a boss!");
        System.out.println("1) Add to the To-Do List.");
        System.out.println("2) Check out something from the list.");
        System.out.println("3) Display All your Tasks.");
        System.out.println("4) Exit");

        while (answer.equalsIgnoreCase("y")) {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        AddTask(tasks, sc);
                        break;

                    case 2:
                        if (isListEmpty(tasks)) {
                            break;
                        } else {
                            // Remove a task from the list
                            System.out.println("Which one do you want to check out?: ");
                            DisplayTasks(tasks);
                            int checkOut = sc.nextInt();
                            sc.nextLine(); // Clear the buffer

                            // Ask for confirmation before checking out the task
                            System.out.println("Are you sure you want to check this task out? y/n");
                            System.out.println("The task you have chosen is: " + tasks.get(checkOut - 1));
                            String confirm = sc.nextLine();

                            if (confirm.equalsIgnoreCase("y")) {
                                if (checkOut > 0 && checkOut <= tasks.size()) {
                                    checked.add(tasks.get(checkOut - 1)); // Move task to checked list
                                    tasks.remove(checkOut - 1);

                                    // Display updated task list
                                    System.out.println("Task successfully checked out!");
                                    System.out.println("The remaining tasks look like this: ");
                                    DisplayTasks(tasks);

                                    // Display completed tasks
                                    if (!checked.isEmpty()) {
                                        System.out.println("Completed Tasks: ");
                                        DisplayTasks(checked);
                                    }
                                } else {
                                    System.out.println("Invalid Task number!");
                                    System.out.println("Please enter numbers between 1 and " + tasks.size());
                                }
                            } else {
                                System.out.println("Good luck on completing the tasks!");
                            }
                            break;
                        }

                    case 3:
                        if (!isListEmpty(tasks)) {
                            DisplayTasks(tasks);
                        }
                        break;

                    case 4:
                        System.out.println("All the best for completing your tasks!");
                        break;

                    default:
                        System.out.println("Wrong Input, Please Try Again.");
                        break;
                }

                if (choice != 4) {
                    System.out.println("Do you want to do more operations? y/n");
                    System.out.print("-> ");
                    answer = sc.next();
                }
            } catch (InputMismatchException e) {
                System.out.println("An error occurred: " + e + "\nTry entering a valid integer!");
                sc.nextLine(); // Clear invalid input
            }
        }
        sc.close();
    }
}