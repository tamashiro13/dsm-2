CREATE DATABASE loja_aula;

USE loja_aula;

CREATE TABLE categoria (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE produto (
    id_produto INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    estoque INT,
    id_categoria INT,

    FOREIGN KEY (id_categoria)
        REFERENCES categoria(id_categoria)
);

CREATE TABLE cliente (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cidade VARCHAR(50),
    data_cadastro DATE
);

CREATE TABLE pedido (
    id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    data_pedido DATE,
    id_cliente INT,

    FOREIGN KEY (id_cliente)
        REFERENCES cliente(id_cliente)
);

CREATE TABLE item_pedido (
    id_item INT PRIMARY KEY AUTO_INCREMENT,
    id_pedido INT,
    id_produto INT,
    quantidade INT,
    preco_unitario DECIMAL(10,2),
    FOREIGN KEY (id_pedido)
        REFERENCES pedido(id_pedido),
    FOREIGN KEY (id_produto)
        REFERENCES produto(id_produto)
);

/*INSERINDO DADOS*/

INSERT INTO categoria (nome) VALUES
('Informática'),
('Acessórios'),
('Escritório'),
('Games'),
('Celulares'),
('Eletrônicos');

INSERT INTO produto (nome, preco, estoque, id_categoria) VALUES
('Notebook Lenovo', 3500.00, 10, 1),
('Mouse Logitech', 120.00, 30, 2),
('Teclado Mecânico', 280.00, 20, 2),
('Monitor 24', 950.00, 15, 1),
('Cadeira Gamer', 1250.00, 8, 4),
('Mouse Pad', 45.00, 50, 2),
('Caneta Azul', 3.50, 100, 3),
('Caderno Executivo', 35.00, 40, 3),
('Smartphone Samsung', 2200.00, 12, 5),
('Controle Gamer', 350.00, 25, 4);

INSERT INTO produto (nome, preco, estoque, id_categoria) VALUES
('Notebook Lenovo', 3500.00, 10, 1),
('Mouse Logitech', 120.00, 30, 2),
('Teclado Mecânico', 280.00, 20, 2),
('Monitor 24', 950.00, 15, 1),
('Cadeira Gamer', 1250.00, 8, 4),
('Mouse Pad', 45.00, 50, 2),
('Caneta Azul', 3.50, 100, 3),
('Caderno Executivo', 35.00, 40, 3),
('Smartphone Samsung', 2200.00, 12, 5),
('Controle Gamer', 350.00, 25, 4);

INSERT INTO cliente (nome, cidade, data_cadastro) VALUES
('Ana Silva', 'São Paulo', '2025-02-10'),
('Bruno Costa', 'Campinas', '2025-04-15'),
('Carlos Oliveira', 'Registro', '2025-05-20'),
('Amanda Souza', 'São Paulo', '2025-07-01'),
('Mariana Santos', 'Santos', '2024-11-25'),
('Pedro Lima', 'Campinas', '2026-01-10');

INSERT INTO pedido (data_pedido, id_cliente) VALUES
('2026-08-01', 1),
('2026-08-02', 2),
('2026-08-03', 1),
('2026-08-04', 3),
('2026-08-05', 4),
('2026-08-06', 5);

INSERT INTO item_pedido (id_pedido, id_produto, quantidade, preco_unitario) VALUES
(1, 1, 1, 3500.00),
(1, 2, 2, 120.00),
(2, 3, 1, 280.00),
(2, 6, 3, 45.00),
(3, 4, 2, 950.00),
(3, 2, 1, 120.00),
(4, 7, 10, 3.50),
(4, 8, 3, 35.00),
(5, 5, 1, 1250.00),
(5, 10, 2, 350.00),
(6, 9, 1, 2200.00),
(6, 6, 2, 45.00);

/*CONSULTAS NO BANCO DE DADOS*/
/*LISTAGEM DE PRODUTOS*/
SELECT * FROM PRODUTO;

/*Listagem com campos especificos*/
select nome, preco from produto;

/*Listagem com condição - O gerente quer descobrir os produtos que custam mais de R$ 500,00*/
select nome, preco from produto where preco > 500;

/*Order by - Ordenação dos dados decrescente (do maior para o menor)*/
select nome, preco from produto where preco > 500 order by preco desc;

/*Order by - Ordenação dos dados ascendente (do menor para o maior)*/
select nome, preco from produto where preco > 500 order by preco asc;
#ou assim
select nome, preco from produto where preco > 500 order by preco;

/*Between - Quais os produtos custam entre R$ 100,00 e R$ 1000,00*/
select nome, preco from produto where preco between 100 and 1000 order by preco;

/*IN - A empresa realizará uma campanha somente em São Paulo e Campinas.
Quais clientes pertencem a essas cidades?*/
select nome, cidade from cliente where cidade in ('São paulo', 'Campinas');
#ou assim mais elegante
select nome, cidade from cliente where cidade = 'São Paulo' or cidade = 'Campinas';

/*Like*/
select nome from cliente where nome like "a%";
select nome from cliente where nome like "%silva%";

/*Combinando filtros*/
/*Problema: Precisamos encontrar clientes de São Paulo ou Campinas, cujo o nome comece com a letra A*/
select nome, cidade from cliente where cidade in ('São Paulo', 'Campinas')
and nome like "A%";

/*Count - Quantos produtos existem na loja?*/
select count(*) as total_produtos from produto;
/*Apelido de campo, todo o campo ao ser utilizado as apelido_campo recebe o apelido de referência ao campo, mudando assim
o título da coluna da tabela resultado temporariamente*/
select count(nome) from produto;
#ou assim
select count(*) as "Total de Produtos" from produto;

/*AVG - Qual é o preço médio dos produtos?*/
select avg (preco) as "Valor Médio dos Produtos" from produto;
#Preço médio de categoria específica
select avg (preco) as "Valor Médio" from produto where id_categoria = 1;
#Arredondar casas decimais
select round (avg(preco),2) as "Valor Médio" from produto;

/*Min e Max - Qual é valor mais caro e o mais barato dos produtos?*/
select min(preco) as "Menor Valor", max(preco) as "Maior Valor" from produto;

/*Várias funções de agregação*/
select
count(*) as "Quantidade de Produtos",
round(avg(preco),2) as "Preço Médio",
min(preco) as "Menor Preço",
max(preco) as "Maior Preço"
from produto;

/*SUM - Qual o valor financeiro aproximado do estoque da loja?*/
select sum(preco) as "Total Aproximado Estoque" from produto;
select sum(preco * estoque) as "Total do Estoque" from produto;

/*Agrupamento de Valores - group by()*/
#Descobri o valor médio por categoria
select id_categoria, round(avg(preco),2) as "Preço Médio" from produto group by(id_categoria);
#ou assim trazendo o nome da categoria
select produto.id_categoria as "ID",categoria.nome as "Categoria", round(avg(preco),2) as "Preço Médio" from produto
inner join categoria on categoria.id_categoria = produto.id_categoria
group by produto.id_categoria order by "ID";

/*Having - Quais categorias possuem preço médio maior que R$500,00*/
select id_categoria, round (avg(preco),2) as "Preço Médio" from produto
group by id_categoria having avg(preco) > 500;

/*Inner Join*/
select p.nome as "Produto", c.nome as "Categoria", p.preco as "Valor" from produto p 
join categoria c on p.id_categoria = c.id_categoria;
#ou assim mais reduzido a query
select p.nome as "Produto", c.nome as "Categoria", p.preco as "Valor" from produto p
join categoria c using (id_categoria);

/*Group by + inner join - Quantos produtos existem em cada categoria*/
select c.nome as "Categoria", count(p.id_produto) as "Quantidade" from categoria c
join produto p on c.id_categoria = p.id_categoria group by c.nome;

/*Left join*/
select c.nome as "Categoria", p.nome as "Produto"
from categoria c left join produto p
on c.id_categoria = p.id_categoria;

/*Quais clientes estçao cadastrados, mas nunca compraram*/
select c.nome as "Cliente" from cliente c left join pedido p
on c.id_cliente = p.id_cliente where p.id_pedido is NULL;

/*Quem comprou e em qual pedido comprou?*/
select c.nome as "Cliente", p.id_pedido, p.data_pedido from  cliente c 
 join pedido p on c.id_cliente = p.id_cliente order by c.nome;