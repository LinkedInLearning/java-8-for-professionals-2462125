package ch6;

import java.util.List;
import java.util.Optional;

public class ExampleOptional {

    public static List<User> userList;

    public void sendMail() {
        User recipient = getUserNull("Brandon");
        if(recipient != null) {
            // rest of the logic
        }

        Optional<User> recipient1 = getUserOptional("Brandon");
        if(recipient1.isPresent()) {
            recipient1.get();
        }

    }

    public User getUserNull(String name) {
        for(User user : userList) {
            if(user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public Optional<User> getUserOptional(String name) {
        return userList.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst();
    }
}
