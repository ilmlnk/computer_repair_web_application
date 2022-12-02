package com.web.computerservice.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

import static javax.persistence.GenerationType.SEQUENCE;

@Data
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity(name = "request")
@Table(
        name = "requests"
)
public class ClientRequest {
    @Id
    @SequenceGenerator(
            name = "request_sequence",
            sequenceName = "request_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "request_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private int id;
    @Column(
            name = "user_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;
    @Column(
            name = "user_surname",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String surname;
    @Column(
            name = "phone_number",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String phoneNumber;
    @Column(
            name = "request_date",
            nullable = false
    )
    private LocalDate requestDate;
    @Column(
            name = "request_time",
            nullable = false
    )
    private LocalTime requestTime;

    public ClientRequest(String name, String surname, String phoneNumber,
                         LocalDate requestDate, LocalTime requestTime) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.requestDate = requestDate;
        this.requestTime = requestTime;
    }
}
