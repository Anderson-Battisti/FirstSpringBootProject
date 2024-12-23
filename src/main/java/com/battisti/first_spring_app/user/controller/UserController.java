package com.battisti.first_spring_app.user.controller;

import com.battisti.first_spring_app.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.battisti.first_spring_app.user.model.User;

@RestController
@RequestMapping("/user")
public class UserController
{
    @PostMapping
    @ResponseBody
    public ResponseEntity<User> addUser(@RequestBody User body)
    {
        if (!body.username.isEmpty() && !body.password.isEmpty())
        {
            try
            {
                User userToAdd = new User();
                userToAdd.username = body.username;
                userToAdd.password = body.password;
                userToAdd.active = true;

                UserService.saveUser(userToAdd);
                return ResponseEntity.ok(userToAdd);
            }
            catch (Exception exception)
            {
                return ResponseEntity.badRequest().build();
            }
        }
        else
        {
            return ResponseEntity.badRequest().build();
        }
    }
}
