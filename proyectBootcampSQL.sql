create schema proyectBootcampSQL;

use proyectBootcampSQL;

create table Userweb(
	userweb_id integer primary key auto_increment not null,
    user_name varchar (25),
    first_name varchar (25),
    last_name varchar (25),
    email varchar (64),
    user_password varchar (25),
    company varchar (25)
);

create table Proyect(
	proyect_id integer primary key auto_increment not null,
    admin_name varchar (25),
    proyect_name varchar (15)
);

create table Survey(
	survey_id integer primary key auto_increment not null,
    userweb_id integer not null,
    rol varchar (25),
    date date,
    answer1 varchar (25),
    answer2 varchar (25),
    answer3 varchar (25),
    answer4 varchar (25)    
);

create table sprint(
	sprint_id integer primary key auto_increment not null
);

create table UserwebProyect(
	userProyect_id integer primary key auto_increment not null,
    userweb_id integer not null,
    proyect_id integer not null
);

insert into UserwebProyect (userweb_id, proyect_id) values
(1, 1),
(1, 2),
(2, 3),
(2, 4);

select * from userwebProyect;

select * from Userweb;
select * from Proyect;

SELECT Userweb.user_name, Userweb.last_name, Proyect.proyect_name
FROM Userweb JOIN UserwebProyect ON Userweb.userweb_id = UserwebProyect.userweb_id JOIN Proyect ON Proyect.proyect_id = UserwebProyect.proyect_id
where user_name like '%diego%';
