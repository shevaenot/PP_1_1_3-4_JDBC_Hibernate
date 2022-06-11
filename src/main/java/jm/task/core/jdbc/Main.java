package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {

    private static final UserService us = new UserServiceImpl();
    private static User user1 = new User("Evgeniy", "Shevchenko", (byte) 29);
    private static User user2 = new User("Ivan", "Petrov", (byte) 33);
    private static User user3 = new User("Ekaterina", "Al-Nakib", (byte) 26);
    private static User user4 = new User("Oleg", "Sidorov", (byte) 47);
    public static void main(String[] args) {



        us.createUsersTable();

        us.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        us.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        us.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        us.saveUser(user4.getName(), user4.getLastName(), user4.getAge());

        List<User> strings = us.getAllUsers();
        for (User users : strings) {
            System.out.println(users);
        }

//        us.removeUserById(2);

//        us.cleanUsersTable();

//        us.dropUsersTable();

    }
}
