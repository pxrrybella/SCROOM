create schema proyectBootcampSQL;

use proyectBootcampSQL;

create table Userweb(
	userweb_id integer primary key auto_increment not null,
    userName varchar (25),
    firstName varchar (25),
    lastName varchar (25),
    email varchar (64),
    userPassword varchar (25),
    company varchar (25)
);

create table Proyect(
	proyect_id integer primary key auto_increment not null,
    adminName varchar (25),
    proyectName varchar (15)
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

insert into Userweb (userName, lastName, email, userPassword) values ("Yago", "Ellen", "akira@gmail.com", "1234"),
("Isabella", "Parry", "isabellaparry@gmail.com", "4321"),
("Diego", "Perez", "diego@gmail.com", "12345")
;

insert into Proyect (adminName, proyectName) values ("Isabella", "Scroom"),
("Yago", "MoodMe"),
("Diego", "Dioegoproyect")
;

insert into userwebProyect (userweb_id, proyect_id) values (1,1),
(2,3),
(2,2),
(3,3)
;

select * from userwebProyect;

select * from Userweb;
select * from Proyect;

SELECT Userweb.userName, Userweb.lastName, Proyect.proyectName
FROM Userweb JOIN UserwebProyect ON Userweb.userweb_id = UserwebProyect.userweb_id JOIN Proyect ON Proyect.proyect_id = UserwebProyect.proyect_id
where userName like '%Isabella%';
