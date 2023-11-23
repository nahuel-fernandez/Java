drop database if exists credenciales;

-- CREACION DE LA BASE DE DATOS
create database if not exists credenciales;

-- USO DE LA BASE DE DATOS 
use credenciales;

-- CREACION DE LA TABLA USUARIOS
create table if not exists usuarios(
	correo varchar(255) not null primary key,
	clave varchar(100) not null
);


insert into usuarios (correo,clave) values 
('user1@dominio.com','user1.1234'),
('user2@dominio.com','user2.1235'),
('user3@dominio.com','user3.1236');