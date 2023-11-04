DROP DATABASE IF EXISTS stockSystem;

CREATE DATABASE stockSystem;

USE stockSystem;

CREATE TABLE IF NOT EXISTS stock (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price_buy DECIMAL(10, 2) NOT NULL,
    price_sell DECIMAL(10, 2) NOT NULL,
    cant INT NOT NULL,
    isDiscontinuous BOOLEAN NOT NULL
);


INSERT INTO stock (name, description, price_buy, price_sell, cant, isDiscontinuous)
VALUES
    ('FIFA 22', 'Simulador de fútbol', 39.99, 59.99, 100, 0),
    ('The Legend of Zelda: Breath of the Wild', 'Aventura de acción', 49.99, 69.99, 50, 0),
    ('Cyberpunk 2077', 'RPG de ciencia ficción', 29.99, 49.99, 75, 0),
    ('Grand Theft Auto V', 'Mundo abierto de crimen', 19.99, 39.99, 120, 0),
    ('Red Dead Redemption 2', 'Aventura en el Salvaje Oeste', 34.99, 54.99, 80, 0),
    ('Call of Duty: Warzone', 'Juego de disparos en línea', 0, 29.99, 200, 0),
    ('Assassins Creed Valhalla', 'Aventura de acción vikinga', 39.99, 59.99, 60, 0),
    ('Minecraft', 'Juego de construcción y aventura', 19.99, 29.99, 150, 0),
    ('The Witcher 3: Wild Hunt', 'RPG de fantasía', 24.99, 44.99, 70, 0),
    ('Super Mario Odyssey', 'Aventura de plataformas', 39.99, 49.99, 40, 0);
