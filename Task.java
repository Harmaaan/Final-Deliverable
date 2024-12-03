import java.util.Date;

public class Task {
    private int taskID;
    private int userID;
    private String title;
    private String description;
    private Date dueDate;
    private String status;

    public Task(int taskID, int userID, String title, String description, Date dueDate, String status) {
        this.taskID = taskID;
        this.userID = userID;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    public int getUserID() {
        return userID;
    }

    public String getTitle() {
        return title;
    }

    public void createTask() {
        System.out.println("Task created: " + title);
    }

    public void updateTask(String newTitle, String newDescription) {
        this.title = newTitle;
        this.description = newDescription;
        System.out.println("Task updated to: " + newTitle);
    }

    public void deleteTask() {
        System.out.println("Task deleted: " + title);
    }

    public void markAsCompleted() {
        this.status = "completed";
        System.out.println("Task marked as completed: " + title);
    }
}
