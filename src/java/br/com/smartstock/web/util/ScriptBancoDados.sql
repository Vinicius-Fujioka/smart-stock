create database smartstock;

create table cliente(
idcliente serial not null,
cpf varchar (20),
nome varchar (50),
email varchar (50),
endereco varchar (50),
telefone varchar (20),
login varchar (30),
senha varchar (30),
constraint pk_cliente primary key(idcliente)
);

 

create table loja(
idloja serial not null,
cnpj varchar (20),
tipo varchar (60), 
descricao varchar (200),
nome varchar (50),
email varchar (50),
endereco varchar (50),
telefone varchar (20),
cidade varchar (30),
login varchar (30),
senha varchar (30),
constraint pk_loja primary key(idloja)
);

 

create table reserva(
idrescliente integer not null,
idresloja integer not null,
nome varchar (40),
quantidade varchar (20),
observacao varchar (200),
constraint fk_idrescliente foreign key(idrescliente) references cliente(idcliente),
constraint fk_idresloja foreign key(idresloja) references loja(idloja)
);

 

create table estoque(
idestoque serial not null,
nome varchar (40),
descricao varchar (200),
refereidloja integer not null,
constraint pk_estoque primary key(idestoque),
constraint fk_refereidloja foreign key(refereidloja) references loja(idloja)
);

 

create table produto(
idproduto serial not null,
refestoque integer not null,
nome varchar (50),
quantidade varchar (20),
validade varchar (20),
preco varchar (20),
constraint pk_produto primary key(idproduto),
constraint fk_refestoque foreign key(refestoque) references estoque(idestoque)
);