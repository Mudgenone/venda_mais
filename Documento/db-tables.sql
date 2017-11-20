create table cliente (
  idCliente serial primary key,
  nome varchar(50) not null,
  endereco text,
  telefone varchar(12),
  email text,
  obs text
);

create table categoria (
  idCat serial primary key,
  nome varchar(20) not null
);

create table produto (
  idProd serial primary key,
  nome varchar(40) not null,
  qntEstoque integer not null,
  precoCompra real not null,
  precoVenda real not null,
  idCat integer not null references categoria(idCat)
);

create table venda (
  idVenda serial primary key,
  idCliente integer not null references cliente(idCliente),
  parcela integer not null,
  dataVenda date not null,
  pago boolean not null,
  precoTot real not null
);

create table pagamento (
  idPag serial primary key,
  idVenda integer not null references venda(idVenda),
  dataPag date not null,
  valor real not null
);

create table venda_produto (
  idVendaProd serial primary key,
  idProd integer not null references produto(idProd),
  idVenda integer not null references venda(idVenda),
  qndProd integer not null
);