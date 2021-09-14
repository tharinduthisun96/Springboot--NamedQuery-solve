package com.example.sample.dtos;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class UserNameDto {
    private String first_name;
    private String last_Name;
    public UserNameDto(String first_name, String last_Name){
        this.first_name = first_name;
        this.last_Name = last_Name;
    }
}
