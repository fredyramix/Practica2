create database practica2;
\c practica2;

create sequence autocentros
    start 1
    increment 1
    NO MAXVALUE
    CACHE 1;

create sequence autocescuelas
    start 1
    increment 1
    NO MAXVALUE
    CACHE 1;
create sequence autocarrera
    start 1
    increment 1
    NO MAXVALUE
    CACHE 1;

create sequence automateria
    start 1
    increment 1
    NO MAXVALUE
    CACHE 1;

create sequence autoexamen
    start 1
    increment 1
    NO MAXVALUE
    CACHE 1;

create sequence autopregunta
    start 1
    increment 1
    NO MAXVALUE
    CACHE 1;

create sequence autorespuesta
    start 1
    increment 1
    NO MAXVALUE
    CACHE 1;
create sequence autoalumno
    start 1
    increment 1
    NO MAXVALUE
    CACHE 1;


create table CentrosDeTrabajo(
			 idCDT serial primary key not null,
			 nombre varchar(45) not null
			 );

create table Escuela(
			 idEscuela serial primary key not null,
			 nombre varchar(45) not null,
			 CDT_id serial not null references CentrosDeTrabajo(idCDT)
			 on delete cascade on update cascade,
			 foreign key(CDT_id) references 
			 CentrosDeTrabajo(idCDT)
			 );


create table Carrera(
					idCarrera serial primary key not null,
					nombre varchar(45) not null,
					duracion varchar(45) not null,
					ESC_id serial not null references Escuela(idEscuela)
					on delete cascade on update cascade,
					foreign key (ESC_id) references Escuela(idEscuela)
					);

create table Materia(
					idMateria serial primary key not null,
					nombre varchar(45) not null,
					credito varchar(45) not null,
					CAR_id serial not null references Carrera(idCarrera)
					on delete cascade on update cascade,
					foreign key (CAR_id) references Carrera(idCarrera)
					);


create table Examen(
					idExamen serial primary key not null,
					parcial varchar(45) not null,
					MAT_id serial not null references Materia(idMateria)
					on delete cascade on update cascade,
					foreign key (MAT_id) references Materia(idMateria)
					);

create table Pregunta(
					idPregunta serial primary key not null,
					pregunta varchar(45) not null,
					respuestaCorrecta varchar(45) not null,
					EXA_id serial not null references Examen(idExamen)
					on delete cascade on update cascade,
					foreign key (EXA_id) references Examen(idExamen)
					);

create table Respuesta(
					idRespuesta serial primary key not null,
					respuesta varchar(45) not null,
					PRE_id serial not null references Pregunta(idPregunta)
					on delete cascade on update cascade,
					foreign key (PRE_id) references Pregunta(idPregunta)
					);


create table Alumno(
	matricula serial primary key not null,
    nombre varchar(45) not null,
    paterno varchar(45) not null,
    materno varchar(45) not null,
    email varchar(45) not null,
    fnacimiento varchar(45) not null,
    tipo varchar(45) not null,
	CAR_id serial not null references Carrera(idCarrera)
	on delete cascade on update cascade,
	foreign key (CAR_id) references Carrera(idCarrera)
					);

create table Alumno_has_Respuesta(
	alumno_id serial references Alumno(matricula) on delete cascade on update cascade,
	respuesta_id serial references Respuesta(idRespuesta) on delete cascade on update cascade,
	constraint alumno_respuesta_pkey primary key (alumno_id,respuesta_id)
	);


create table Alumno_has_Examen(
	alumno_id serial references Alumno(matricula) on delete cascade on update cascade,
	examen_id serial references Examen(idExamen) on delete cascade on update cascade,
	constraint alumno_examen_pkey primary key (alumno_id,examen_id)
	);