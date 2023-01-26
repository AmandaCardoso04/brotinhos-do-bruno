create table alunos(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    nomeMae varchar(100) not null,
    nomePai varchar(100) not null,
    matricula varchar(6) not null,
    idade varchar(100) not null,
    email varchar(100) not null unique,
    curso varchar(100) not null,
    periodo varchar(100) not null,
    
    primary key(id)
);