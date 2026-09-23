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
 
 #Subconsulta
 select nome, preco from produto where preco > (select avg(preco) from produto);
 
 /*Messe exemplo, a subconsulta calcula o preço médio e a consulta externa retorna 
 os produtos acima dessa média.*/
 
 #Subconsultas com listas e existência
 /*Quando a subconsulta retorna vários valores, usam-se os operadores 
 IN, EXISTS, ANY e ALL. O IN verifica se um valor pertence ao conjunto retornado.
 O EXISTS testa apenas se a subconsulta produz alguma linha, sendo bastante eficiente
 para verificar existência. O exemplo busca clientes que fizeram ao menos um pedido*/
 
 select nome from cliente c where exists
 (select 1 from pedido p where p.id_cliente = c.id_cliente);
 
 #Subconsulta no from e no select
 /*A subconsulta também pode aparecer na claúsla FROM,
 funcionando como uma tabela temporária, ou na lista de colunas do SELECT,
 retornando um valor único por linha. O exemplo a seguir mostra cada
 categoria ao lado da quantidade de produtos, calculada por uma subconsulta no SELECT: */
 
 select c.nome,(select count(*) from produto p where p.id_categoria = c.id_categoria) as
 "Quantidade de produtos" from categoria c;
 
 #Organizando com CTEs e combinando com Union
 /*Consultas longas tornam-se difíceis de ler quando muitas subconsultas se aninham.
 A Common Table Expression (CTE), introduzida pela claúsla WITH, dá nome a um resultado 
 intermediário e melhora a clareza. Ela é especialmente útil quando o mesmo subresultado 
 é referenciado mais de uma vez.*/
 
 with faturamento_cliente as (
 select p.id_cliente, sum(ip.quantidade * ip.preco_unitario) as "Total" from pedido p
 join item_pedido ip on p.id_pedido = ip.id_pedido
 group by p.id_cliente
 )
 select c.nome, f.total from faturamento_cliente f
 join cliente c on c.id_cliente = f.id_cliente
 where f.total > 500;
 
 #Funções Internas
 /*Os SGBDs oferecem um conjunto amplo de funções internas que
 processam valores durante a consulta. As funções de texto manipulam 
 cadeias de caracteres. CONCAT junta strings, UPPER e LOWER alteram a caixa, 
 SUBSTRING extrai um trecho, LENGTH mede o comprimento e TRIM remove espaços 
 nas extremidades. */
 
 select concat(nome, '(', cidade,')')as "Idenficação",
	upper (cidade) as "Email em Maiúsculo" from cliente;

#Função interna de data
/*As funções de data permitem extrair e calcular informações temporais
NOW retorna o instante atual, DATEDIFF calcular a diferença entre dataas e funções de formatação ajustam a exibição.
O exemplo apura quantos dias cada cliente esta cadastrado*/
 
 select nome, datediff(current_date,data_cadastro) as "Dias de cadastro" from cliente;

# Funções numéricas e condicionais
/*As funções numéricas arredondam e ajustam valores:
ROUND arredonda, FLOOR e CEIL aproximam para baixo e para cima.
Já as funções condicionais decidem o valor de saída conforme uma regra.
O comando CASE funciona como uma estrutura de decisão dentro da consulta,
e COALESCE substitui valores nulos por uma alternativa. */

select nome, preco,
	case
		when preco >= 500 then "Premium"
        when preco >= 100 then "Intermediário"
        else "Econômico"
	end as "faixa",
    coalesce(id_categoria, 0) as "Categoria Segura"
from produto;

#Visões - O que são visões?
/*Uma visão, ou view, é uma consulta armazenada que se comporta como uma tabela
virtual. Ela não guarda dados próprios, mas sim a definição de um SELECT
que é executado sempre que a visão é consultada.
Silberschatz e colaboradores destacam que as visões cumprem 
dois papéis centrais: simplificar consultas complexas e controlar
o que cada usuário pode enxergar. */

create view vw_produtos_categoria as
select p.id_produto, p.nome as "produto",
p.preco, c.nome as "categoria" from produto p 
join categoria c on p.id_categoria = c.id_categoria;

/*Depois de criada, a visão é consultada como se fosse uma tabela comum,
o que dispensa repetir a junção a cada uso: */

SELECT * FROM vw_produtos_categoria WHERE preco > 200;

#Visões como camada de segurança
/*Além de simplificar, as visões protegem os dados.
É possível expor apenas algumas colunas de uma tabela,
escondendo informações sensíveis. Uma visão que mostra
clientes sem revelar o e-mail, por exemplo, permite que 
relatórios sejam gerados sem dar acesso ao dado privado.
A claúsla WITH CHECK OPTION, por sua vez, impede que atualizações
feitas através da visão violem a condição que a define. */

create view vw_cliente_publico as
select id_cliente, nome, cidade from cliente;

select * from vw_cliente_publico;

#Procedimentos (Procedures)
/*Um procedimento recebe parámetros, que podem ser de entrada (IN), de saída (OUT) ou ambos (INOUT)
Como o corpo do procedimento contém vários comandos separados por ponto e vírgula, é preciso redefinir
o delimitador temporariamente com DELIMITER para que o SGBD entenda onde o procedimento termina.*/

delimiter $$
create procedure cadastrar_cliente(in p_nome varchar (100), in p_email varchar (150), in p_cidade varchar (60))
begin
	insert into cliente (nome, email, cidade) values
    (p_nome, p_email, p_cidade);
end$$
delimiter ;

alter table cliente add column email varchar (150);

/*A chamda do procedimento é feita com o comando CALL, informando os valores dos parâmetros: */
call cadastrar_cliente('Bruno Lima e Silva', 'bruno.ls@email.com','Cajati');

select * from cliente;

Delimiter $$
create procedure calcular_desconto (
	in p_valor decimal(10,2),
    out p_desconto decimal(10,2)
)
begin
	if p_valor >= 1000 then
		set p_desconto = p_valor * 0.10;
	elseif p_valor >=500 then
		set p_desconto = p_valor * 0.05;
	else
		set p_desconto = 0;
	end if;
end $$
delimiter ;

# Chamar a procedure calcular desconto
/*Sua procedure já calcula corretamente o desconto. Como você definiu p_desconto como parâmetro OUT,
para visualizar o valor retornada você precisa chamar a procedure usando uma variável e depois fazer
um SELECT*/
call calcular_desconto(499,@desconto);
# Mostrar o desconto
select @desconto as valor_desconto;

#Tratamento de erros
/*Procedimento robustos precisam lidar com situações inesperadas,
como tentar inserir um e-mail já existente. O comando DECLARE HANDLER
define o que fazer quando um erro ocorre, e SIGNAL SQLSTATE permite gerar erros personalizados.
Isso evita que o procedimento falhe de forma silenciosa ou deixe dados pela metade.*/

delimiter $$
create procedure baixar_estoque (
	in p_produto int,
    in p_qtd int
)
begin
	declare v_estoque int;
    select estoque into v_estoque from produto where id_produto = p_produto;
    if v_estoque < p_qtd then
		signal sqlstate '45000'
        set message_text = 'Estoque insuficiente';
	else
		update produto set esoque = estoque - p_qtd
        where id_produto = p_produto;
	end if;
end $$
delimiter ;

select * from produto;
call baixar_estoque(1,9);

#Função armazenada 
/*A função armazenada é parente próxima do procedimento,
mas com uma diferença essencial: ela sempre retorna um único valor
e pode ser usada dentro de uma consulta, como se fosse uma função interna.
Procedimentos executam ações; funções calculam e devolvem resultados.*/

delimiter $$
create Function total_pedido (p_pedido int) returns  decimal (10,2)
deterministic #é uma característica usada em funções armazenadas do MySQL
			  #para indicar que, recebendo os mesmo valores de entrada,
              #a função sempre retornará o mesmo resultado.

begin
	declare v_total decimal(10,2);
    select sum(quantidade * preco_unitario) into v_total
    from item_pedido where id_pedido = p_pedido;
    return coalesce(v_total, 0);
    
end$$
delimiter ;

select id_pedido, total_pedido(id_pedido) as valor from pedido;

#Gatilhos (triggers)
/*O que é um gatilho?

Um gatilho, ou trigger, é um bloco de código que o SGBD executa automaticamente
quando ocorre um evento em uma tabela, como uma inserção, uma atualização ou uma exclusão.
Diferente do procedimento, que precisa ser chamado, o gatilho dispara sozinho.
Isso o torna ideal para tarefas que devem acontecer sem depender da aplicação,
como registrar um histórico ou validar uma regra.*/

delimiter $$
create trigger tg_valida_preco
before insert on produto
for each row
begin
	if NEW.preco <0 then
    signal SQLSTATE '45000'
    set message_text = "Preço não pode ser negativo";
    end if;
end$$
delimiter ;

insert into produto (nome,preco,estoque,id_categoria)values
("Apagador Quadro Branco", "5.00", 15, 2);

select * from produto;

/*Os gatilhos são classificados pelo momento e pelo evento.
Quanto ao momento, podem ser BEFORE, exectados antes da operação,
ou AFTER, executados depois. Quanto ao evento, respondem a INSERT,
UPDATE ou DELETE. Dentro do gatilho, as referências NEW e OLD dão
acesso aos valores novos e antigos da linha afetada.*/

#Criar uma Tabela de Log para auditoria
create table log_preco(
id_log int primary key auto_increment,
id_produto int,
preco_antigo Decimal(10,2),
preco_novo decimal(10,2),
alterado_em datetime default current_timestamp
);

delimiter $$
create trigger tg_log_preco
after update on produto
for each row 
begin
	if old.preco <> new.preco then
		insert into log_preco(id_produto,preco_antigo,preco_novo)
		values (old.id_produto, old.preco, new.preco);
    end if;
end $$
delimiter ;

select * from produto;
update produto set preco = 10.00 where id_produto=21;
select * from log_preco;

select * from produto where id_produto = 1;

#Transação (transaction)
start transaction; #Inicia uma transação (Rodar essa linha primeiro, para começar a transação)
update produto set estoque = estoque - 2 where id_produto = 1;
insert into pedido (id_cliente,data_pedido) values (1,'2026-06-06');
commit; #finaliza a transação 
rollback; #faz as transações feitas serem canceladas

select * from item_pedido;

select pedido.id_pedido as "ID", produto.nome as "Produto", cliente.nome as "Nome Cliente" from item_pedido
join produto on produto.id_produto = item_pedido.id_produto
join pedido on pedido.id_pedido = item_pedido.id_pedido
join cliente on cliente.id_cliente = pedido.id_cliente;

create index idx_nomePod on produto(nome);

drop index idx_nomeProd on produto;