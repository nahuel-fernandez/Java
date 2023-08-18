CREATE SCHEMA `usuarios` ;

USE usuarios;

DROP TABLE IF EXISTS permisos;

CREATE TABLE IF NOT EXISTS `usuarios`.`permisos` (
  `usuario` VARCHAR(45) NULL,
  `modulo` CHAR(45) NULL,
  `activo` BOOLEAN NULL);
  
  SELECT * FROM permisos;