CREATE SCHEMA `paises_ciudades` ;
USE paises_ciudades;

DROP TABLE IF EXISTS paises;
DROP TABLE IF EXISTS ciudades;

CREATE TABLE IF NOT EXISTS paises (`idpais` INT NOT NULL AUTO_INCREMENT,`descripcion` VARCHAR(45) NULL, PRIMARY KEY (`idpais`));
  
CREATE TABLE ciudades (`idciudad` INT NOT NULL AUTO_INCREMENT,`descripcion` VARCHAR(45) NULL, PRIMARY KEY (`idciudad`));  