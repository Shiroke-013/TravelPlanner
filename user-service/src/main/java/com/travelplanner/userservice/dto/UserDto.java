package com.travelplanner.userservice.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    @NotEmpty(message = "Email cannot be empty")
    private String email;

    @NotEmpty(message = "First name cannot be empty")
    private String firstName;

    @NotEmpty(message = "Last name cannot be empty")
    private String lastName;
    
    @NotEmpty(message = "Password cannot be empty")
    private String password;

    private String username;

    public UserDto() {
    }

    public UserDto(String email, String firstName, String lastName, String password, String username) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.username = username;
    }
}
