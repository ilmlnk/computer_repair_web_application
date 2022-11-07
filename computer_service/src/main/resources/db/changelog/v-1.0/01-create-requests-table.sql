create table requests
(
    id           serial
        constraint requests_pk
            primary key,
    user_name    varchar(50)  not null,
    user_surname varchar(100) not null,
    phone_number varchar(15)  not null,
    request_date date         not null,
    request_time time         not null
);



-- GO