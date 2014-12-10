create table pantalones (idpantalon integer primary key auto_increment, corte varchar(20),talla integer(10),tipo varchar(20) );


create table corte (idcorte integer primary key auto_increment, recto varchar(20), skinny varchar(20),baggy varchar(20));


create table tipo (idtipo integer primary key auto_increment,mujer varchar(20), hombre varchar(20));