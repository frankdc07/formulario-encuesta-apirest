insert into marcas_pc (nombre) values ('Lenovo');
insert into marcas_pc (nombre) values ('HP');
insert into marcas_pc (nombre) values ('Apple');
insert into marcas_pc (nombre) values ('ASUS');
insert into formularios (documento,correo,comentarios,fk_marca_pc, fecha_respuesta) values ('123', 'juan@gmail.com', 'Excelente', 1, '2021-11-16');
insert into formularios (documento,correo,comentarios,fk_marca_pc, fecha_respuesta) values ('456', 'pedro@gmail.com', 'Excelente', 2, '2021-11-16');
insert into formularios (documento,correo,comentarios,fk_marca_pc, fecha_respuesta) values ('654', 'laura@gmail.com', 'Excelente', 3, '2021-11-16');
insert into formularios (documento,correo,comentarios,fk_marca_pc, fecha_respuesta) values ('321', 'fernando@gmail.com', 'Excelente', 4, '2021-11-16');

insert into usuarios (username, password, activo, rol) values ('frank', '$2a$10$Wo03Qn2NY4WpzxOhmgUW2OtwY/DX.6uKNkT6Jh.Je6EYM5JThbeVy', 1, 'ROLE_USER');
insert into usuarios (username, password, activo, rol) values ('juan', '$2a$10$ofvuEPfYhFQwxG5TYJzfBeNb.LsQ6tBk3zr9CSCLVgWWKlzpB/TTC', 1, 'ROLE_USER');