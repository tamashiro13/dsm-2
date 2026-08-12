create database if not exists BD_Supermercado_Felipe;
use BD_Supermercado_Felipe;

create table if not exists fornecedores
(
id_fornec int primary key auto_increment,
nome varchar(100) not null
);

create table if not exists produtos
(
id_prod int primary key auto_increment,
nome varchar(120) not null,
preco decimal(10,2) not null check (preco >=0),
qtd_estoque int not null default 0,
id_fornec int,
foreign key (id_fornec) references fornecedores (id_fornec)
);

create table if not exists compras
(
id_compra int primary key auto_increment,
qtd_prod int not null check (qtd_prod > 0),
id_prod int,
foreign key (id_prod) references produtos (id_prod)
);

insert into fornecedores (nome) values 
("Satio"), ("Hector"), ("Enzo"), ("Mario");

insert into produtos (nome, preco, qtd_estoque, id_fornec) values
('Caixa Banana Prata', 25.00, 18, 1),
('Caixa Banana Nanica', 30.00, 67, 1),
('Doce de Banana', 20.00, 13, 1);

insert into produtos (nome, preco, qtd_estoque, id_fornec) values
('Caixa de Som', 120.00, 7, 2),
('Microfone', 60.00, 23, 2),
('Gravador', 130.00, 17, 2);

insert into produtos (nome, preco, qtd_estoque, id_fornec) values
('Fone de Ouvido', 99.90, 43, 3),
('Mouse', 70.00, 89, 3),
('Teclado', 89.90, 77, 3);

insert into produtos (nome, preco, qtd_estoque, id_fornec) values
('Galão Plástico', 25.00, 71, 4),
('Rodo', 15.00, 66, 4),
('Esfregão', 45.00, 55, 4);

insert into compras (qtd_prod, id_prod) values
(1,2),
(3,3),
(2,1),
(6,4),
(7,3);

insert into compras (qtd_prod, id_prod) values
(8, 5),
(4, 12),
(10, 2),
(6, 7),
(3, 9);

insert into compras (qtd_prod, id_prod) values
(12, 1),
(5, 6),
(9, 11),
(4, 3),
(7, 8);

insert into compras (qtd_prod, id_prod) values
(15, 10),
(2, 4),
(11, 7),
(5, 12),
(9, 1);

insert into compras (qtd_prod, id_prod) values
(7, 3),
(15, 9),
(4, 6),
(10, 12),
(8, 2);

select * from compras;