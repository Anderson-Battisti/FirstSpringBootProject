package com.battisti.first_spring_app.user.service;

import com.battisti.first_spring_app.user.model.User;

public class UserService
{
    public static void saveUser(User user)
    {
        System.out.println("User name: " + user.username + "\nPassword: " + user.password);
    }
}
