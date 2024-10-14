package LSP;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a waiting list for users.
 */
public class WaitingList {
    protected List<String> users = new ArrayList<>();

    /**
     * Adds a user to the waiting list.
     * @param user The user to be added.
     */
    public void addUser(String user) {
        users.add(user);
    }

    /**
     * Processes the next user in the waiting list.
     */
    public void processNextUser() {
        if (!users.isEmpty()) {
            String user = users.remove(0);
            System.out.println("Processing user: " + user);
        } else {
            System.out.println("No users in the waiting list.");
        }
    }
}
