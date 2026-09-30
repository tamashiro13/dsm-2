create database bancoClinica;

use bancoClinica;

create table usuario(
id int auto_increment primary key,
codigo_paciente int(5),
nome_paciente varchar(30),
endereco varchar(100),
complemento varchar(50),
rg varchar(20),
cpf varchar(20),
data_nascimento(14));

insert into usuario(codigo_paciente,nome_paciente,endereco,complemento,rg,cpf,data_nascimento)values
(1,'felipe','rua da felicidade','apto 33','11111');

select * from usuario;