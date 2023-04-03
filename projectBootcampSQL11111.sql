create schema projectBootcampSQL;

use projectBootcampSQL;

create table Userweb(
	userweb_id integer primary key auto_increment not null,
    user_name varchar (25),
    first_name varchar (25),
    last_name varchar (25),
    email varchar (64),
    user_password varchar (25),
    company varchar (25)
);

create table Project(
	project_id integer primary key auto_increment not null,
    admin_name varchar (25),
    project_name varchar (15)
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

create table UserwebProject(
	userProject_id integer primary key auto_increment not null,
    userweb_id integer not null,
    project_id integer not null
);

insert into Userweb (user_name, first_name, last_name, email, user_password, company) values ("isa", "Isabella", "Parry", 'isabella@gmail.com', "hola12", "empresaIsa"),
("akirayago", "Yago", "Ellen", 'yago@gmail.com', "hola1", "empresaYago");

insert into Project (admin_name, project_name) values ("isa", "IsaProject"),
("isa", "SCROOM"),
("akirayago", "YagoProject"),
("akirayago", "MoodMe");

insert into UserwebProject (userweb_id, project_id) values (1, 1),
(1, 2),
(2, 3),
(2, 4);

select * from Userweb;
select * from Project;

select * from userwebProject;

SELECT Userweb.user_name, Project.project_name
FROM Userweb JOIN UserwebProject ON Userweb.userweb_id = UserwebProject.userweb_id JOIN Project ON Project.project_id = UserwebProject.project_id
WHERE user_name LIKE '%isa%';

SELECT Project.project_name FROM Userweb JOIN UserwebProject ON Userweb.userweb_id = UserwebProject.userweb_id
JOIN Project ON Project.project_id = UserwebProject.project_id WHERE Userweb.user_name = 'isa'

SELE