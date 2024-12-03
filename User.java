public class User {
    private int userID;
    private String username;
    private String passwordHash;
    private String email;
    private boolean isAdmin;

    public User(int userID, String username, String passwordHash, String email, boolean isAdmin) {
        this.userID = userID;
        this.username = username;
        this.passwordHash = passwordHash;
        this.email = email;
        this.isAdmin = isAdmin;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // Methods
    public void registerUser() {
        System.out.println("User registered: " + username);
    }

    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.passwordHash.equals(password);
    }

    public void updateUserInfo(String newEmail) {
        this.email = newEmail;
        System.out.println("User email updated to: " + newEmail);
    }

    public void deleteAccount() {
        System.out.println("User account deleted for: " + username);
    }
}
