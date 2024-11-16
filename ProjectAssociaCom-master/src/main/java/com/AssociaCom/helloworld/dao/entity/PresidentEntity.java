package com.AssociaCom.helloworld.dao.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@Entity
@Builder
@Table(name="president")
@NoArgsConstructor
@AllArgsConstructor
public class PresidentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String lastName;
	private String firstName;
	private LocalDate birthday;
	private String phone;
	private String email;
	private String gender;

	@OneToOne(mappedBy = "president" )
	private AssociationEntity association;

} 
