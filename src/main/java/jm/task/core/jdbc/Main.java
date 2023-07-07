package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Piter","Parker", (byte) 17);
        userService.saveUser("Ben","Parker", (byte) 56);
        userService.saveUser("MaryDjein","Watsan", (byte) 17);
        userService.saveUser("May","Parker", (byte) 57);//
        System.out.println(userService.getAllUsers());// реализуйте алгоритм здесь

    }
}
