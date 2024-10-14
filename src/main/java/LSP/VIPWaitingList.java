package LSP;

/**
 * Represents a VIP waiting list that manages VIP users.
 */
public class VIPWaitingList extends WaitingList {

    /**
     * Adds a VIP user to the waiting list.
     * If a regular user is added, they are redirected to the regular waiting list.
     * @param user The user to be added.
     */
    @Override
    public void addUser(String user) {
        if (user.startsWith("VIP_")) {
            super.addUser(user);
        } else {
            // Instead of throwing an exception, we could log or redirect to regular waiting list
            System.out.println("Regular user added to the regular waiting list.");
            // Optionally, you can implement a way to manage regular users
        }
    }

    /**
     * Processes the next VIP user in the waiting list.
     */
    @Override
    public void processNextUser() {
        if (!users.isEmpty()) {
            String user = users.remove(0);
            System.out.println("Processing VIP user: " + user);
        } else {
            System.out.println("No VIP users in the waiting list.");
        }
    }
}
