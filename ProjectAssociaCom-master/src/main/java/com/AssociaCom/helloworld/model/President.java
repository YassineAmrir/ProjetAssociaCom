package com.AssociaCom.helloworld.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class President {

    private String lastName;
    private String firstName;
    private LocalDate birthday;
    private String phone;
    private String email;
    private String gender;
}
