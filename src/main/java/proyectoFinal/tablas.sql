CREATE TABLE TARJETA(
ID_TARJETA INTEGER AUTO_INCREMENT PRIMARY KEY,
NOMBRE VARCHAR(120),DIACORTE INTEGER);

CREATE TABLE GASTOS(
ID_GASTOS INTEGER AUTO_INCREMENT PRIMARY KEY,
FECHA DATE,
CONCEPTO VARCHAR(500),
CANTIDAD FLOAT,
ID_TARJETA INTEGER,
FOREIGN KEY (ID_TARJETA) REFERENCES TARJETA(ID_TARJETA));

INSERT INTO TABLE TARJETA (

select * from TARJETA;