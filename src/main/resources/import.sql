insert into marcas_pc (nombre) values ('Lenovo');
insert into marcas_pc (nombre) values ('HP');
insert into marcas_pc (nombre) values ('Apple');
insert into marcas_pc (nombre) values ('ASUS');
insert into formularios (documento,correo,comentarios,fk_marca_pc, fecha_respuesta) values (123, 'juan@gmail.com', 'Excelente', 1, '2021-11-16');
insert into formularios (documento,correo,comentarios,fk_marca_pc, fecha_respuesta) values (456, 'pedro@gmail.com', 'Excelente', 2, '2021-11-16');
insert into formularios (documento,correo,comentarios,fk_marca_pc, fecha_respuesta) values (654, 'laura@gmail.com', 'Excelente', 3, '2021-11-16');
insert into formularios (documento,correo,comentarios,fk_marca_pc, fecha_respuesta) values (321, 'fernando@gmail.com', 'Excelente', 4, '2021-11-16');

insert into usuarios (username, password, activo, rol) values ('frank', '$2a$10$v8Z6pAODd.e.uqPx.dCrj.2CuAwZ8Xmv/bq5J5XmWLNi4LIsfkfXG', 1, 'ROLE_USER');
insert into usuarios (username, password, activo, rol) values ('juan', '$2a$10$DlbcZvXXd5DIh0Iem5.x7uJpW3ua9GEeqlnOHrwYcF5o9Lx99esJW', 1, 'ROLE_USER');