package com.web.computerservice.model;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity (name = "employee")
@Table (name = "employees")
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "employee_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;
    @Column(
            name = "employee_surname",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String surname;
    @Column(
            name = "employee_phone",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String phoneNumber;
    @Column(
            name = "employee_email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;
    @Column(
            name = "login",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String login;
    @Column(
            name = "encrypted_password",
            nullable = false
    )
    private String password;
}
