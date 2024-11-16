package com.AssociaCom.helloworld.dao.entity;

import com.AssociaCom.helloworld.model.State;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "association")
public class AssociationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    // Todo : add join to president entity
    private String functionalId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "presidentId",referencedColumnName = "id")
    private PresidentEntity president;
    private String name;
    private String description;
    private String email;
    private String phone;

    @Enumerated(EnumType.STRING)
    private State state;
    private String type;
    private LocalDate creationDate;

}

