CREATE TABLE db_estudiantes.alumnos (
  dni varchar(100) NOT NULL,
  nombres varchar(100) NOT NULL,
  apellidos varchar(100) NOT NULL,
  nacimiento date DEFAULT NULL,
  correo varchar(100) NOT NULL,
  direccion varchar(100),
  CONSTRAINT alumnos_pk PRIMARY KEY (dni)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
