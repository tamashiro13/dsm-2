use loja_virtual;
select nome, preco from produto where preco > 100;

#Consulta Básica sem condição
select nome, preco from produto;

#Consulta Básica todos os campos e todos os registros sem condicional
select * from produto;

#Consulta Básica todos os campos e todos os registros com condicional
select * from produto where preco > 100;

/*Buscar Registro no BD na Tabela clientes, retornando apenas nome, cidade 
buscando os clientes que são da cidade ('São Paulo' , 'Campinas'), onde o 
nome comece com a letra "A" onde a data de cadastro seja entre 01/01/2026
a 31/12/2026*/

select nome, cidade from cliente
where cidade in ('São Paulo','Campinas')
and nome like 'A%'
and data_cadastro between '2026-01-01' and '2026-12-31';

insert into cliente (nome, email, cidade) values
('Gustavo Marcondes' , 'gu.m@email.com' , 'São Paulo'),
('João Victor Toth', 'jvt@email.com', 'Campinas'),
('Alice Silva', 'alice.silva@outlook.com', 'São Paulo'),
('Isis Marcondes', 'isis.marc@email.com', 'Cajati'),
('Iury Guedes', 'iury.guedes35@gmail.com', 'Registro')
;

select nome, cidade from cliente
where cidade in ('São Paulo','Campinas')
and nome like 'A%'
and data_cadastro between '2026-01-01' and '2026-12-31';

/*Retornar o nome, cidade, email dos clientes que possuam email @outlook*/

select nome, cidade, email from cliente
where email like '%@outlook%';

/*Retornar produtos que tenham preco entre 50,00 a 300,00*/
select * from produto
where preco between 50 and 300;