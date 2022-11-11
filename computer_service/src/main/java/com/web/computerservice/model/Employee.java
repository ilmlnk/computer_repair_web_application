package com.web.computerservice.model;

import lombok.*;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String surname;
    private String login;
    private String password;
}
