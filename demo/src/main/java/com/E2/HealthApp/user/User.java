package com.E2.HealthApp.user;

import java.util.UUID;

public class User {

    private final UUID userID;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private final Gender gender;
    private float height;
    private float weight;

    public User(UUID userID,
                String username,
                String firstName,
                String lastName,
                String email,
                Gender gender,
                float height,
                float weight) {
        this.userID = userID;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public enum Gender{
        MALE, FEMALE;
    }

    public UUID getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
