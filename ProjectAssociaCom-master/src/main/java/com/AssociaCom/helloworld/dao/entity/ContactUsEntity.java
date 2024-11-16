package com.AssociaCom.helloworld.dao.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@Table(name="contact_us")
@NoArgsConstructor
@AllArgsConstructor
public class ContactUsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String subject;
    private String message;
}
