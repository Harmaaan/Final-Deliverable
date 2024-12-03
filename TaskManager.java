import java.util.List;

public class TaskManager {
    private Database database;

    public TaskManager(Database database) {
        this.database = database;
    }

    public List<Task> getUserTasks(int userID) {
        return database.getTasksByUser(userID);
    }

    public void addTask(Task task) {
        database.addTask(task);
    }

    public void editTask(int taskID, Task newTask) {
        System.out.println("Editing task with ID: " + taskID);
    }

    public void deleteTask(int taskID) {
        System.out.println("Task with ID: " + taskID + " deleted.");
    }
}
