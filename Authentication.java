public class Authentication {
    private String sessionID;

    public boolean verifyCredentials(String username, String password, User user) {
        return user.loginUser(username, password);
    }

    public String createSession(User user) {
        this.sessionID = "SESSION_" + user.getUserID();
        System.out.println("Session created for: " + user.getUsername());
        return sessionID;
    }

    public void endSession() {
        System.out.println("Session ended: " + sessionID);
        this.sessionID = null;
    }
}
