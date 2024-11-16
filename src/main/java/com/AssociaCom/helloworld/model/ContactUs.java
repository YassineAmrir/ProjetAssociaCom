package com.AssociaCom.helloworld.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactUs {
    private String name;
    private String email;
    private String subject;
    private String message;
}
