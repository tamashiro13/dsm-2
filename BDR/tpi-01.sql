create database bancojava;

use bancojava;

create table cliente(
id int auto_increment primary key,
codigo int(5),
nome varchar(60),
telefone varchar(18),
email varchar (120));

insert into cliente(codigo,nome,telefone,email)values
(1,'Felipe','(13)99999-8888','felipe@email.com');

select * from cliente;