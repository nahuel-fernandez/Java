CREATE SCHEMA `banco` ;
USE banco;

DROP TABLE IF EXISTS error_log;

CREATE TABLE  IF NOT EXISTS `banco`.`error_log` (
  `id_log` INT NULL AUTO_INCREMENT,
  `fecha_hora` TIMESTAMP  NOT NULL ,
  `clase_afectada` VARCHAR(45) NULL,
  `producto_afectado` VARCHAR(45) NULL,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`id_log`));