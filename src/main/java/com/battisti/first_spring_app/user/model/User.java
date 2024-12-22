package com.battisti.first_spring_app.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User
{
    public String username;
    public String password;
    public boolean active;
}
