CREATE DATABASE livraria;
USE livraria;
CREATE TABLE tb_editora (
id_editora INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
descricao VARCHAR(255) NULL ,
PRIMARY KEY(id_editora));
CREATE TABLE tb_categoria (
id_categoria INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
descricao VARCHAR(255) NULL ,
PRIMARY KEY(id_categoria));
CREATE TABLE tb_autor (
id_autor INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
nome VARCHAR(255) NULL ,
PRIMARY KEY(id_autor));
CREATE TABLE tb_livro (
id_livro INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
fk_editora INTEGER UNSIGNED NOT NULL ,
fk_categoria INTEGER UNSIGNED NOT NULL ,
fk_autor INTEGER UNSIGNED NOT NULL ,
titulo VARCHAR(255) NULL ,
qtd INTEGER UNSIGNED NULL ,
PRIMARY KEY(id_livro) ,
INDEX tb_livro_FKIndex1(fk_autor) ,
INDEX tb_livro_FKIndex2(fk_categoria) ,
INDEX tb_livro_FKIndex3(fk_editora),
FOREIGN KEY(fk_autor)
REFERENCES tb_autor(id_autor)
ON DELETE NO ACTION
ON UPDATE NO ACTION,
FOREIGN KEY(fk_categoria)
REFERENCES tb_categoria(id_categoria)
ON DELETE NO ACTION
ON UPDATE NO ACTION,
FOREIGN KEY(fk_editora)
REFERENCES tb_editora(id_editora)
ON DELETE NO ACTION
ON UPDATE NO ACTION);

insert into tb_autor values (default, 'Robert');
insert into tb_categoria values (default, 'ficção');
insert into tb_editora values (default, 'Arqueiro');
insert into tb_livro values (default, 1,1,1,'A origem', 2);
select * from tb_autor;
select * from tb_categoria;
select * from tb_editora;
select * from tb_livro;
select
l.id_livro as id_livro, 
e.descricao as editora, 
c.descricao as categoria, 
a.nome as autor, 
l.titulo as titulo, 
l.qtd as qtd from
tb_livro as l inner join tb_editora as e on l.fk_editora=e.id_editora
inner join tb_categoria as c on l.fk_categoria=id_categoria
inner join tb_autor as a on l.fk_autor=a.id_autor;
create view view_livro as
select
l.id_livro as id_livro, 
e.descricao as editora, 
c.descricao as categoria, 
a.nome as autor, 
l.titulo as titulo, 
l.qtd as qtd from
tb_livro as l inner join tb_editora as e on l.fk_editora=e.id_editora
inner join tb_categoria as c on l.fk_categoria=id_categoria
inner join tb_autor as a on l.fk_autor=a.id_autor;
select * from view_livro;