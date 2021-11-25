package com.E2.HealthApp.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class userController {

    @GetMapping
    public List<User> getAllUsers(){
        return List.of(
                new User(UUID.randomUUID(), "jb007", "James", "Bond", "jbond@gmail.com", User.Gender.MALE, 70, 190),
                new User(UUID.randomUUID(), "hb007", "Halle", "Barry", "hbarry@gmail.com", User.Gender.FEMALE, 60, 120)
        );
    }
}
