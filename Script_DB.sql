-- TABLA LOGIN --

CREATE TABLE login (id int  NOT NULL AUTO_INCREMENT,
							   usuario VARCHAR(20),
							   pw VARCHAR(20),
                               PRIMARY KEY (id));
															


select * from login;

select * from login where usuario = pvasquez and pw = 1234

-- TABLA REQUERIMIENTOS --

CREATE TABLE gerencias (codigo_ger int  NOT NULL AUTO_INCREMENT,
							   gerencia VARCHAR(80),
							   PRIMARY KEY (codigo_ger));
                               
CREATE TABLE departamentos (codigo_dep int  NOT NULL AUTO_INCREMENT,
							   departamento VARCHAR(80),
							   PRIMARY KEY (codigo_dep),
                               codigo_ger int, 
                               foreign key(codigo_ger) references gerencias(codigo_ger));

CREATE TABLE areas (codigo_ar int  NOT NULL AUTO_INCREMENT,
							   area VARCHAR(80),
							   PRIMARY KEY (codigo_ar));

CREATE TABLE encargados (codigo_en int  NOT NULL AUTO_INCREMENT,
							   encargado VARCHAR(80),
							   PRIMARY KEY (codigo_en),
                               codigo_ar int, 
                               foreign key(codigo_ar) references areas(codigo_ar));

CREATE TABLE datos (id int  NOT NULL AUTO_INCREMENT,
							   gerencia VARCHAR(80),
                               departamento VARCHAR(80),
                               area VARCHAR(80),
                               encargado VARCHAR(80),
                               requerimineto varchar(200),
							   PRIMARY KEY (id));

-- INSERTs --

INSERT INTO login (usuario,pw) VALUES ('pvasquez','1234');
															
INSERT INTO gerencias (codigo_ger,gerencia) VALUES ('2','Mercado Empresarial TIC');
INSERT INTO departamentos (departamento,codigo_ger) VALUES ('Seguridad','2');

INSERT INTO areas (codigo_ar,area) VALUES ('2','Gestion de Accesos');
INSERT INTO encargados (encargado,codigo_en) VALUES ('Ciro G.','2');

INSERT INTO datos (gerencia,departamento,area,encargado,requerimineto) VALUES ('Mercado Empresarial TIC','Seguridad','Gestion de Accesos','Ciro G','Solicitud test');



select * from login;
select * from gerencias;
select * from departamentos;
select * from areas;
select * from encargados;
select * from datos;




