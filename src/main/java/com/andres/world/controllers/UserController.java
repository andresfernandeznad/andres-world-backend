package com.andres.world.controllers;

import com.andres.world.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class UserController {

    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable int id) {
        User user = new User(id, "Andrés", "Fernández Nadales", "afn@gmail.com", null);
        return user;
    }

    @RequestMapping(value = "users")
    public List<User> getAllUsers() {
        User user = new User(1, "Andrés", "Fernández Nadales", "afn@gmail.com", null);

        List<User> users = List.of(user);
        // Stream<User> users2 = users.stream().filter(user1 -> user1.getEmail().equals("test"));
        // users = users2.collect(Collectors.toList());
        return users;
    }

    @RequestMapping(value = "usere")
    public User editUser() {
        User user = new User(1, "Andrés", "Fernández Nadales", "afn@gmail.com", null);
        return user;
    }

    @RequestMapping(value = "userd")
    public User deleteUser() {
        User user = new User(1, "Andrés", "Fernández Nadales", "afn@gmail.com", null);
        return user;
    }

    @RequestMapping(value = "userse")
    public User searchUser() {
        User user = new User(1, "Andrés", "Fernández Nadales", "afn@gmail.com", null);
        return user;
    }
}
