CREATE DATABASE IF NOT EXISTS cadena_hotelera;
-- Uso de la base de datos
USE cadena_hotelera;

-- Creación de la tabla de usuarios
CREATE TABLE usuarios (
	id_usuario INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(20) NOT NULL,
    password VARCHAR(100) NOT NULL,
    activo BOOLEAN NOT NULL,
    PRIMARY KEY (id_usuario));

-- Creación de la tabla de roles
CREATE TABLE roles (
    id_rol INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    id_usuario INT,
    PRIMARY KEY (id_rol),
	FOREIGN KEY fk_rol_usuario (id_usuario) references usuarios(id_usuario)
);

/*-- Creación de la tabla intermedia para la relación muchos a muchos entre usuarios y roles
CREATE TABLE usuario_roles (
    usuario_id VARCHAR(20),
    rol_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(username),
    FOREIGN KEY (rol_id) REFERENCES roles(id),
    PRIMARY KEY (usuario_id, rol_id)
);*/

-- Creación de la tabla de hoteles
CREATE TABLE hoteles (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    ubicacion VARCHAR(100) NOT NULL,
    descripcion TEXT
);

-- Creación de la tabla de empleados
CREATE TABLE empleados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    cargo VARCHAR(100) NOT NULL,
    hotel_id INT,
    FOREIGN KEY (hotel_id) REFERENCES hoteles(id)
);

-- Creación de la tabla de reservas
CREATE TABLE reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_nombre VARCHAR(100) NOT NULL,
    num_huespedes INT NOT NULL,
    fecha_ingreso DATE NOT NULL,
    fecha_salida DATE NOT NULL,
    hotel_id INT,
    id_usuario INT,
    FOREIGN KEY (hotel_id) REFERENCES hoteles(id),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

-- Datos de ejemplo para la tabla de roles
INSERT INTO roles (nombre) VALUES 
('ADMINISTRADOR'),
('CLIENTE');

-- Datos de ejemplo para la tabla de usuarios
INSERT INTO usuarios (username, password, activo) VALUES
('123456789', '$2a$10$E2u3nNBTMCgIhT0Pr2jjzuFbmkfiP.HyvUzDCMdIkRr2ZOlDpuCIK', true), -- Contraseña: 123
('987654321', '$2a$10$FQmJGte7Eh/t28Q3oxg/.u4yBL6T8z9Bh4TzPj5up.NYwphj0fTVW', true), -- Contraseña: 456
('654321987', '$2a$10$WKWz4q6F03yFdRZp2PNk3uh.Ox0FDDkF6G.PkYzi/6pAV5ML8a6Fm', true); -- Contraseña: 789

/*-- Asignación de roles a los usuarios
INSERT INTO usuario_roles (usuario_id, rol_id) VALUES
('123456789', 1), -- Admin tiene el rol de ADMINISTRADOR
('987654321', 2), -- cliente1 tiene el rol de CLIENTE
('654321987', 2); -- cliente2 tiene el rol de CLIENTE*/

-- Datos de ejemplo para la tabla de hoteles
INSERT INTO hoteles (nombre, ubicacion, descripcion) VALUES
('Hotel Conchal', 'Playa Conchal, Guanacaste', 'Un hermoso hotel ubicado en la playa Conchal.'),
('Hotel Avellanas', 'Playa Avellanas, Guanacaste', 'Un acogedor hotel ubicado en la playa Avellanas.'),
('Hotel Gregorio', 'Playa Gregorio, Guanacaste', 'Un exclusivo hotel ubicado en la playa Gregorio.');

-- Datos de ejemplo para la tabla de empleados
INSERT INTO empleados (nombre, cargo, hotel_id) VALUES
('Juan Pérez', 'Gerente General', 1), -- Juan Pérez trabaja en Hotel Conchal
('María González', 'Recepcionista', 1), -- María González trabaja en Hotel Conchal
('Pedro Sánchez', 'Chef', 2), -- Pedro Sánchez trabaja en Hotel Avellanas
('Ana Ramírez', 'Limpieza', 3); -- Ana Ramírez trabaja en Hotel Gregorio

-- Datos de ejemplo para la tabla de reservas
INSERT INTO reservas (cliente_nombre, num_huespedes, fecha_ingreso, fecha_salida, hotel_id, id_usuario) VALUES
('Carlos García', 2, '2024-04-15', '2024-04-20', 1, 1), -- Reserva en Hotel Conchal
('Laura Martínez', 1, '2024-05-10', '2024-05-15', 2, 2), -- Reserva en Hotel Avellanas
('Roberto Jiménez', 4, '2024-06-20', '2024-06-25', 3, 3); -- Reserva en Hotel Gregorio