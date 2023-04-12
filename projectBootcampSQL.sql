create schema projectBootcampSQL;

use projectBootcampSQL;

create table Userweb(
	userweb_id integer primary key auto_increment not null,
    user_name varchar (25),
    first_name varchar (25),
    last_name varchar (25),
    email varchar (64),
    user_password varchar (30),
    company_position varchar (50),
    company_id integer not null
);

create table Project(
	project_id integer primary key auto_increment not null,
    admin_name varchar (30),
    project_name varchar (50),
    project_code integer (7)
);

create table Survey(
	survey_id integer primary key auto_increment not null,
    date date,
    answer1 integer,
    answer2 integer,
    answer3 integer,
    answer4 integer,
    answer5 integer,
    answer6 integer,
    answer7 integer,
    answer8 integer,
    answer9 integer,
    answer10 integer,
    userweb_id integer not null,
    sprint_id integer not null,
    company_id integer not null
);

create table Sprint(
	sprint_id integer primary key auto_increment not null,
    start_date date,
    end_date date,
    project_id integer not null
);

create table Userweb_Project(
	userweb_project_id integer primary key auto_increment not null,
    userweb_id integer not null,
    project_id integer not null
);

create table Company(
	company_id integer primary key auto_increment not null,
    company_rut integer,
    company_name varchar (50),
    general_score double
);

#----------------------------------FOREIGN KEYS--------------------------------------------------
alter table Userweb
add foreign key (company_id) references Company(company_id);

alter table Userweb_Project
add foreign key (userweb_id) references Userweb(userweb_id);

alter table Userweb_Project
add foreign key (project_id) references Project(project_id);

alter table Survey
add foreign key (userweb_id) references Userweb(userweb_id);

alter table Survey
add foreign key (company_id) references Company(company_id);

alter table Survey
add foreign key (sprint_id) references Sprint(sprint_id);

alter table Sprint
add foreign key (project_id) references Project(project_id);
#----------------------------------FOREIGN KEYS--------------------------------------------------


#--------------------------------------------INSERT INTO NUEVOS------------------------------------
INSERT INTO Company (company_rut, company_name)
VALUES 
(456785439, 'Empresa 1'),
(768945067, 'Empresa 2');
INSERT INTO Userweb (user_name, first_name, last_name, email, user_password, company_position, company_id)
VALUES 
('yago123', 'Yago', 'González', 'yago.gonzalez@email.com', 'contraseña123', 'Gerente de Marketing', 1),
('isabella345', 'Isabella', 'Rodríguez', 'isabella.rodriguez@email.com', 'contraseña456', 'Analista de datos', 1),
('diego789', 'Diego', 'López', 'diego.lopez@email.com', 'contraseña789', 'Desarrollador web', 2),
('mary111', 'Mary', 'Smith', 'mary.smith@email.com', 'contraseñaabc', 'Gerente de Recursos humanos', 2);
INSERT INTO Project (admin_name, project_name)
VALUES 
('yago123', 'Proyecto A'),
('mary111', 'Proyecto B');
INSERT INTO Sprint (start_date, end_date, project_id)
VALUES 
('2022-01-01', '2022-01-15', 1),
('2022-02-01', '2022-02-15', 1),
('2022-03-01', '2022-03-15', 2),
('2022-04-01', '2022-04-15', 2);
INSERT INTO Userweb_Project (userweb_id, project_id)
VALUES 
(1, 1),
(2, 1),
(3, 2),
(4, 2);
INSERT INTO Survey (date, answer1, answer2, answer3, answer4, answer5, userweb_id, sprint_id, company_id)
VALUES 
('2022-01-16', 5, 3, 5, 1, 5, 1, 1, 1),
('2022-02-16', 5, 4, 5, 4, 4, 1, 2, 1),
('2022-03-16', 4, 4, 3, 1, 5, 3, 3, 2),
('2022-04-16', 5, 5, 5, 4, 4, 3, 4, 2);
#--------------------------------------------INSERT INTO NUEVOS------------------------------------

#-------------------------------------------------INSERT INTO ANTIGUOS------------------------------------------------
#insert into Userweb (user_name, first_name, last_name, email, user_password, company_position, company_id) 
#values 
#("isa", "Isabella", "Parry", 'isabella@gmail.com', "hola12", "Desarrolladora UX/UI", 1),
#("akirayago", "Yago", "Ellen", 'yago@gmail.com', "hola1", "Desarrollador Back-End", 1);

#insert into Project (admin_name, project_name) values ("isa", "IsaProject"),
#("isa", "SCROOM"),
#("akirayago", "YagoProject"),
#("akirayago", "MoodMe");

#insert into UserwebProject (userweb_id, project_id) values (1, 1),
#(1, 2),
#(2, 3),
#(2, 4);
#-------------------------------------------------INSERT INTO ANTIGUOS------------------------------------------------

#--------------------------------------------QUERYS-----------------------------------------------------
select * from Userweb;
select * from Project;
select * from Company;
select * from Survey;
select * from Sprint;
#--------------------------------------------QUERYS-----------------------------------------------------

#--------------------------------------------QUERYS PERSONALIZADAS-----------------------------------------------------
SELECT Userweb.user_name, Project.project_name
FROM Userweb JOIN Userweb_Project ON Userweb.userweb_id = Userweb_Project.userweb_id JOIN Project ON Project.project_id = Userweb_Project.project_id
WHERE user_name LIKE '%isa%';
#--------------------------------------------QUERYS PERSONALIZADAS-----------------------------------------------------
select Userweb.userweb_id, Userweb.user_name, Userweb.first_name, Userweb.last_name, Userweb.email, Userweb.user_password, Userweb.company_position, Userweb.company_id
from Userweb join Userweb_Project on Userweb.userweb_id = Userweb_Project.userweb_id
where Userweb_Project.project_id = 2;