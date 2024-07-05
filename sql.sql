CREATE TABLE usuarios(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	username  VARCHAR(50) NOT NULL UNIQUE,
	fecha_alta date NOT NULL
);

/*VER DEFAULT DE CURDATE*/

CREATE TABLE roles(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	rolename VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE usuarios_roles(
	usuarios_id INT NOT NULL,
	roles_id INT NOT NULL,
	PRIMARY KEY (usuarios_id,roles_id)
);

/*INSERT */
INSERT INTO usuarios (username,fecha_alta) VALUES('carlos@mail.com',CURDATE())
INSERT INTO usuarios (username,fecha_alta) VALUES('mairtin@mail.com',CURDATE())
INSERT INTO usuarios (username,fecha_alta) VALUES('maria@mail.com',CURDATE())

SELECT * FROM usuarios;

/*roles*/
INSERT INTO roles (rolename) VALUES('ADMIN');
INSERT INTO roles (rolename) VALUES('USER');

SELECT * FROM roles;

/*crear las constraint fk*/
ALTER TABLE usuarios_roles 
ADD CONSTRAINT usuarios_roles_fk FOREIGN KEY (usuarios_id)
REFERENCES usuarios(id);

ALTER TABLE usuarios_roles 
ADD CONSTRAINT usuarios_roles_roles_fk FOREIGN KEY (roles_id)
REFERENCES roles(id);

/*'JUNTAR' USUARIOS CON ROLES*/
INSERT INTO usuarios_roles (usuarios_id,roles_id) VALUES(1,1)
INSERT INTO usuarios_roles (usuarios_id,roles_id) VALUES(1,2)
INSERT INTO usuarios_roles (usuarios_id,roles_id) VALUES(2,2)