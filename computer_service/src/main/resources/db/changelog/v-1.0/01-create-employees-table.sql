create table employees
(
    id           serial
        constraint employees_pk
        primary key,
    employee_name    varchar(50)  not null,
    employee_surname varchar(100) not null,
    employee_phone varchar(15)  not null,
    login varchar(50)         not null,
    password varchar(100)         not null
);