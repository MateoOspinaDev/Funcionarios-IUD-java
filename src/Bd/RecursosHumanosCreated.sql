DROP DATABASE IF EXISTS recursosHumanosIUD;

CREATE DATABASE IF NOT EXISTS recursosHumanosIUD;

USE recursosHumanosIUD;

CREATE TABLE tipos_identificacion(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    descripcion VARCHAR(250),
    PRIMARY KEY(id)
);

CREATE TABLE estados_civil(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    descripcion VARCHAR(250),
    PRIMARY KEY(id)
);

CREATE TABLE estados_formacion(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    descripcion VARCHAR(250),
    PRIMARY KEY(id)
);

CREATE TABLE niveles_educativos(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    descripcion VARCHAR(250),
    PRIMARY KEY(id)
);

CREATE TABLE parentescos(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    descripcion VARCHAR(250),
    PRIMARY KEY(id)
);

CREATE TABLE universidades(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE funcionarios(
    id INT NOT NULL AUTO_INCREMENT,
    numero_identificacion VARCHAR(120) NOT NULL,
    nombres VARCHAR(120) NOT NULL,
    apellidos VARCHAR(120) NOT NULL,
    sexo CHAR(2),
    direccion VARCHAR(255),
    telefono VARCHAR(255),
    fecha_nacimiento DATE,
    fecha_creacion DATETIME DEFAULT NOW(),
    fecha_actualizacion DATETIME DEFAULT NOW(),
    tipos_identificacion_id INT NOT NULL,
    estados_civil_id INT NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(numero_identificacion),
    FOREIGN KEY(tipos_identificacion_id) REFERENCES tipos_identificacion(id),
    FOREIGN KEY(estados_civil_id) REFERENCES estados_civil(id) 
);

CREATE TABLE grupo_familiares(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    descripcion VARCHAR(250),
    funcionarios_id INT NOT NULL,
    parentescos_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(funcionarios_id) REFERENCES funcionarios(id),
    FOREIGN KEY(parentescos_id) REFERENCES parentescos(id)
);

CREATE TABLE formaciones_academicas(
    id INT NOT NULL AUTO_INCREMENT,
    funcionarios_id INT NOT NULL,
    universidades_id INT NOT NULL,
    estados_formacion_id INT NOT NULL,
    niveles_educativos_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(funcionarios_id) REFERENCES funcionarios(id),
    FOREIGN KEY(universidades_id) REFERENCES universidades(id),
    FOREIGN KEY(estados_formacion_id) REFERENCES estados_formacion(id),
    FOREIGN KEY(niveles_educativos_id) REFERENCES niveles_educativos(id)
);

/*Llenado de datos*/

INSERT INTO tipos_identificacion(nombre,descripcion) 
VALUES ('CC', 'Cédula de ciudadanía');
INSERT INTO tipos_identificacion(nombre,descripcion) 
VALUES ('TI', 'Tarjeta de identidad');
INSERT INTO tipos_identificacion(nombre,descripcion) 
VALUES ('CE', 'Tarjeta de extranjería');
INSERT INTO tipos_identificacion(nombre,descripcion) 
VALUES ('PS', 'Pasaporte');
INSERT INTO tipos_identificacion(nombre,descripcion) 
VALUES ('OT', 'Otro documento de identificación');

-- llenado tabla estados civiles
INSERT INTO estados_civil(nombre,descripcion) 
VALUES ('SOL', 'Soltero');
INSERT INTO estados_civil(nombre,descripcion) 
VALUES ('CAS', 'Casado');
INSERT INTO estados_civil(nombre,descripcion) 
VALUES ('ULB', 'Unión libre');
INSERT INTO estados_civil(nombre,descripcion) 
VALUES ('OTR', 'Otro estado civil');

INSERT INTO estados_formacion(nombre,descripcion) 
VALUES ('TER', 'Terminado');
INSERT INTO estados_formacion(nombre,descripcion) 
VALUES ('ENC', 'En curso');
INSERT INTO estados_formacion(nombre,descripcion) 
VALUES ('DES', 'Desertado');

INSERT INTO niveles_educativos(nombre,descripcion) 
VALUES ('BA', 'Bachillerato');
INSERT INTO niveles_educativos(nombre,descripcion) 
VALUES ('TEC', 'Tenico laboral');
INSERT INTO niveles_educativos(nombre,descripcion) 
VALUES ('TECN', 'Tecnologo');
INSERT INTO niveles_educativos(nombre,descripcion) 
VALUES ('PRE', 'Pregrado');
INSERT INTO niveles_educativos(nombre,descripcion) 
VALUES ('MAG', 'Maestria');
INSERT INTO niveles_educativos(nombre,descripcion) 
VALUES ('DOC', 'Doctorado');
INSERT INTO niveles_educativos(nombre,descripcion) 
VALUES ('PHD', 'Post-doctorado');

INSERT INTO parentescos(nombre,descripcion) 
VALUES ('HER', 'Hermana o hermano');
INSERT INTO parentescos(nombre,descripcion) 
VALUES ('HI', 'Hijo o hija');
INSERT INTO parentescos(nombre,descripcion) 
VALUES ('ES', 'Esposa o esposo');
INSERT INTO parentescos(nombre,descripcion) 
VALUES ('MP', 'Madre o padre');
INSERT INTO parentescos(nombre,descripcion) 
VALUES ('OTRO', 'Otro lazo');

INSERT INTO universidades(nombre) 
VALUES ('IUD');
INSERT INTO universidades(nombre) 
VALUES ('UDEA');
INSERT INTO universidades(nombre) 
VALUES ('UNAL');
INSERT INTO universidades(nombre) 
VALUES ('UCO');
INSERT INTO universidades(nombre) 
VALUES ('POLI');

-- llenado de tabla funcionario: se hace por la APP de Java
INSERT INTO funcionarios(
    numero_identificacion,
    nombres,
    apellidos,
    sexo,
    direccion,
    telefono,
    fecha_nacimiento,
    tipos_identificacion_id,
    estados_civil_id
) 
VALUES ('111111', 'Julio', 'Martinez', 'M', 'Calle 20',
'603522222', '1985-08-05', 1, 2);

INSERT INTO grupo_familiares(nombre,funcionarios_id,parentescos_id) 
VALUES ('Atila', 1, 1);

INSERT INTO formaciones_academicas(funcionarios_id,universidades_id,estados_formacion_id,niveles_educativos_id) 
VALUES (1, 1, 2, 3,);

