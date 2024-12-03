import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Step 1: Setup the database
        Database database = new Database();
        database.connect();

        // Step 2: Create users
        User user1 = new User(1, "john_doe", "password123", "john@example.com", false);
        Admin admin1 = new Admin(2, "admin_user", "adminpass", "admin@example.com");

        database.addUser(user1);

        // Step 3: Test User functionality
        System.out.println("Testing User Functionality:");
        user1.registerUser();
        boolean loginSuccess = user1.loginUser("john_doe", "password123");
        System.out.println("Login successful: " + loginSuccess);
        user1.updateUserInfo("new_john@example.com");
        user1.deleteAccount();

        // Step 4: Test Task functionality
        System.out.println("\nTesting Task Functionality:");
        Task task1 = new Task(1, 1, "Finish Homework", "Complete Java Assignment", new Date(), "pending");
        task1.createTask();
        task1.updateTask("Finish Homework Updated", "Complete Java Assignment with examples");
        task1.markAsCompleted();
        task1.deleteTask();

        // Step 5: Admin functionality
        System.out.println("\nTesting Admin Functionality:");
        admin1.updateUserAccount(user1, "updated_email@example.com");
        admin1.deleteUserAccount(user1);

        // Step 6: Authentication
        System.out.println("\nTesting Authentication:");
        Authentication auth = new Authentication();
        String sessionID = auth.createSession(user1);
        auth.endSession();

        // Step 7: Database and Task Manager
        System.out.println("\nTesting Database and TaskManager:");
        TaskManager taskManager = new TaskManager(database);
        taskManager.addTask(task1);
        System.out.println("Tasks for user 1: " + taskManager.getUserTasks(1));

        // Disconnect from the database
        database.disconnect();
    }
}
