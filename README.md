
# SCROOM

**Proyecto Integrador de Bootcamp Generation. Docente Pamela Nahum, Alejandro Heredia (Estudiantes: Yago Ellen, Isabella Parry, Diego Pérez, María Pino).**


"Scroom es la mejor plataforma para cultivar un ambiente laboral positivo."

SCROOM, una plataforma donde equipos de trabajo podrán responder encuestas efectivas, relevantes y anónimas acerca de su Motivación, Responsabilidad y Ambiente laboral.

Con esta informacion permitirá saber a las empresas la auto percepción que tienen los trabajadores tanto individualmente como dentro de su equipo acerca de su motivación y responsabilidad, también darán a conocer que tan bien se relacionan entre compañeros de trabajo.

Todo esto hará que la empresa pueda tener una mejor perspectiva del bienestar general de sus trabajadores, permitiendo identificar posibles problemas a futuro.

## Backend:

Este repositorio corresponde al backend del proyecto, el cual está construido con MySQL y Java con Springboot (Maven project).

Trabajamos con seis tablas para manejar la información de manera precisa obteniendo los datos a los que queremos acceder.

## Dependencias:
- spring-boot-devtools
- spring-boot-starter-validation
- spring-boot-starter-data-jpa
- spring-boot-starter-test
- spring-boot-starter-tomcat
- spring-boot-starter-web
- tomcat-embed-jasper
- mysql-connector-java
- lombok
- jbcrypt
- antlr
- jstl

## Server local:
Para correr el server de manera local utilizamos:

- IDE Visual Studio Code ( Aquí utilizamos las siguientes extensiones: Springboot Dashboard (Microsoft), Springboot Tools (VMWare), Spring Initializr Java Support (Microsoft), Debugger for Java (Microsoft), Extension Pack for Java (Microsoft), Maven for Java (Microsoft), Project Manager for Java (Microsoft), Test Runner for Java (Microsoft), Language Support for Java(TM) (RedHat), todos están disponibles desde Visual Studio Code )
- Java
- JDK
- MySQL
- MySQL Workbench
Al clonar el repositorio, necesitaremos primero crear y poblar la base de datos.

Para eso abrimos MySQL Workbench y buscamos el archivo ``projectBootcampSQL.sql`` que se encuentra en la carpeta del proyecto.

Presionamos el tercer icono para ejecutar el script.

Una vez creada y poblada la base dedatos, abrimos la carpeta del proyecto con Visual Studio.

Al estar cargadas las dependencias (se encuentran en el archivo ``pom.xml``), usamos el Springboot Dashboard desde el último icono del Primary Side Bar. En el apartado de "APPS", corremos la aplicación "scroom".

Una vez esté funcionando tendremos acceso a un server local con los endpoints disponibles en la carpeta "controller" para cada tabla (CRUD).

## Última actualización:
- Query personalizada.