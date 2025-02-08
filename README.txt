# TaskMaster: A Simple To-Do List Console Application

## Introduction
TaskMaster is a console-based Java application designed to help you manage your daily tasks like a pro. With TaskMaster, you can easily add tasks, mark them as completed, and view your pending and completed task lists.

---

## Features
- **Add tasks:** Keep track of all your tasks.
- **Mark tasks as completed:** Organize and keep a record of completed tasks.
- **Display tasks:** View both pending and completed tasks.
- **Simple console interface:** User-friendly navigation with basic commands.

---

## How to Use
### Running the Application
1. Clone this repository to your local machine.
2. Compile the Java program using:
   ```bash
   javac TaskMaster.java
   ```
3. Run the program:
   ```bash
   java TaskMaster
   ```

### Application Menu
Upon starting the program, you will be presented with the following options:
1. Add to the To-Do List
2. Check out a task from the list
3. Display all tasks
4. Exit

### Example Usage
1. **Adding Tasks:**
   Enter task names when prompted. Select `y` to continue adding more tasks or `n` to stop.
2. **Checking Out Tasks:**
   View the list of tasks and select the task number you wish to complete.
3. **Displaying Tasks:**
   View all current pending and completed tasks.
4. **Exiting:**
   Choose option `4` to exit the application.

---

## Project Structure
```plaintext
TaskMaster.java   // Main program file with task management logic
```

---

## Error Handling
- Handles invalid integer inputs with appropriate error messages.
- Prevents removal of non-existent tasks.

---

## Future Improvements
- Save tasks to an external file for persistence.
- Graphical User Interface (GUI) support.
- Task due dates and reminders.

---

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

---

Happy task managing!
