package com.AssociaCom.helloworld.dao.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@Table(name="authentification_Data")
@NoArgsConstructor
@AllArgsConstructor

public class SingInEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String associationName;



}
