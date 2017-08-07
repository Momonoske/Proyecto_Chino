create database ejemplo;
use ejemplo;
create table perfil (
id int(5) primary key not null,
nombre varchar(30) not null);
insert into perfil values
(1, 'Rol_1');
insert into perfil values
(2, 'Rol_2');



CREATE TABLE usuario (
	
usuario varchar(10) primary key not null,
	pass varchar(10) not null,
 
	nombre varchar(50) not null,
  
	idperfil int(5) not null
,
	foreign key(idperfil) references perfil (id));

insert into usuario values 
('alex', '1234', 'Alejandro Vala', 1);
insert into usuario values 
('juan', '5678', 'Juan Rosas', 1);