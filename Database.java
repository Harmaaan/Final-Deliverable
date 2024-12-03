import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<User> users = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();

    public void connect() {
        System.out.println("Connected to database.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added to database: " + user.getUsername());
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added to database: " + task.getTitle());
    }

    public List<Task> getTasksByUser(int userID) {
        List<Task> userTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getUserID() == userID) {
                userTasks.add(task);
            }
        }
        return userTasks;
    }

    public void disconnect() {
        System.out.println("Disconnected from database.");
    }
}
