create database bancoTPI;

use bancoTPI;

create table usuario(
id int auto_increment primary key,
codigo int(5),
login varchar(30),
senha varchar(25),
telefone varchar(18));

insert into usuario(codigo,login,senha,telefone)values
(1,'fhnt1234','1234','(13)98765-4321');

select * from usuario;