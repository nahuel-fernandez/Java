CREATE SCHEMA if not exists`paises_ciudades` ;

use paises_ciudades;

drop table if exists ciudades;
drop table if exists paises;

CREATE TABLE IF NOT EXISTS paises (`idpais` INT NOT NULL AUTO_INCREMENT,`descripcion` VARCHAR(45) NULL, PRIMARY KEY (`idpais`));

CREATE TABLE IF NOT EXISTS ciudades (`idciudad` INT NOT NULL AUTO_INCREMENT,
  `idpais` INT(11) NULL,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`idciudad`),
  CONSTRAINT `idpais`
  FOREIGN KEY (`idpais`)
  REFERENCES `paises_ciudades`.`paises` (`idpais`)
);


select * from paises;
select * from ciudades;