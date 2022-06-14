create database if not exists bancozilla;
use bancozilla;

-- drop database bancozilla;

create table if not exists cliente(
cod_cliente int primary key not null auto_increment,
nome varchar (50),
dt_nasc varchar(15),
telefone varchar(50),
email varchar (50),
cep varchar(40),
logadouro varchar (30),
numero int,
bairro varchar (30),
cidade varchar (30),
estado char(2),
cpf varchar(20),
senha varchar(20)
);

create table if not exists produto(
cod_prod int not null auto_increment primary key,
produto varchar(50),
quantidade int,
preco float,
estMin int
);

create table if not exists venda(
cod_venda int not null auto_increment primary key,
cod_cliente int not null,
valor_total float ,
dt_venda varchar(30) not null,
foreign key (cod_cliente) references cliente (cod_cliente),
pagamento varchar(20) check (pagamento in('Crédito','Débito','Dinheiro','Vale Alimentação')));


create table if not exists item_venda(
cod_venda int not null,
cod_item int not null,
cod_prod int not null,
valor_unitario float not null,
prod_comprado varchar(30) not null,
quant_item int not null,
primary key (cod_item, cod_venda),
foreign key (cod_prod) references estoque_de_podrutos (cod_prod),
foreign key (cod_venda) references venda (cod_venda)
);

create table if not exists autentica(
 idautentica int primary key auto_increment,
 nome varchar(50),
 senha varchar(10),
 cpf varchar(20),
 cargo varchar(30)
 );
  

  
insert into autentica values(01,"Denerson Eduardo","1234","12345678910", "Gerente"),(02,"Mairon Azevedo","1234", "12387654312","Atendente"),(03,"Beatriz Dellatorre","1234","16342674918", "Gerente"),(04,"Jardeson Nogueira","longe","1235278313","Atendente");

insert into cliente (nome, dt_nasc, telefone, email, cep, logadouro, numero, bairro, cidade, estado)values
("Eduardo Duarte","31/05/1999","(21)97366-3501","dukenobi31@gmail.com","220392-303", "Estrada Caribu", 600, "Freguesia",
"Rio de Janeiro","RJ"),
("Guilherme Cassemiro","11/09/2000","(21)98454-3748","guiguicazemiro@gmail.com","221392-202","Rua da Abolituda", 169, "Abolição",
"Rio de Janeiro","RJ"),
("Vitor Hugo Prado","21/03/2001","(21)94823-4823","vitor@gmail.com","200230-302","Rua do dinossauro", 183, "Itaboraí",
"Rio de Janeiro","RJ"),
("Octa","31/10/2018","(21)97956-3476","octa@epoluto.com","200483-932","Rua do Epoluto",650,"Engenho Novo",
"Rio de Janeiro","RJ");

insert into produto (produto, quantidade, preco, estMin) values ("Pedra",10,10,5),("Papel",20,20,6),("Tesoura",10,30,4);

/*select * from venda 
where (substring(dt_venda from 1 for 2) between substring('15/05/2018' from 1 for 2) and substring('25/05/2018' from 1 for 2) )
and (substring(dt_venda from 4 for 2) between substring('15/05/2018' from 4 for 2) and substring('25/05/2018' from 4 for 2) )
and (substring(dt_venda from 7 for 4) between substring('15/05/2018' from 7 for 4) and substring('25/05/2018' from 7 for 4) )
order by dt_venda;

select i.quant_item from item_venda i, venda v where v.cod_venda=i.cod_venda and
 i.prod_comprado="Papel" and (substring(v.dt_venda from 1 for 2) between substring('27/10/2018' from 1 for 2) 
 and substring('29/10/2018' from 1 for 2) )and (substring(v.dt_venda from 4 for 2)
 between substring('27/10/2018' from 4 for 2) and substring('29/10/2018' from 4 for 2) )and 
 (substring(v.dt_venda from 7 for 4) between substring('27/10/2018' from 7 for 4) 
 and substring('29/10/2018' from 7 for 4) ) order by v.dt_venda;*/
 
 /*select v.cod_venda, v.cod_cliente, c.nome , v.valor_total,v.dt_venda,v.pagamento from venda v, cliente c where (substring(v.dt_venda from 1 for 2) between substring('27/10/2018' from 1 for 2) 
 and substring('29/10/2018' from 1 for 2) )and (substring(v.dt_venda from 4 for 2)
 between substring('27/10/2018' from 4 for 2) and substring('29/10/2018' from 4 for 2) )and 
 (substring(v.dt_venda from 7 for 4) between substring('27/10/2018' from 7 for 4) 
 and substring('29/10/2018' from 7 for 4) ) and c.cod_cliente = v.cod_cliente order by v.cod_venda;
 
select nome, dt_nasc from cliente where (substring(dt_nasc from 4 for 2) between substring('01/09/2018' from 4 for 2) and substring('31/09/2018' from 4 for 2) );
 
select nome, dt_nasc from cliente
where (substring(dt_nasc from 1 for 2) between substring('01/05' from 1 for 2) and substring('31/05' from 1 for 2) )
and (substring(dt_nasc from 4 for 2) between substring('01/05' from 4 for 2) and substring('31/05' from 4 for 2) )
order by dt_nasc*/


