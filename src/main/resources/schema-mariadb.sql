DROP TABLE IF EXISTS libro;

CREATE TABLE libro (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(200) NOT NULL,
    descripcion VARCHAR(3000),
    imagen_url VARCHAR(500)
);

INSERT INTO libro (nombre, descripcion, imagen_url) VALUES
    ('No sé cómo mostrar dónde me duele', 'Amalia Andrade Arango', 'https://www.planetadelibros.com.co/usuaris/libros/fotos/386/m_libros/portada_no-se-como-mostrar-donde-me-duele_amalia-andrade_202307311626.png'),
    ('El ruido de las cosas al caer', 'Juan Gabriel Vásquez', 'https://www.tornamesa.co/imagenes/9789587/978958758145.GIF'),
    ('Donde cantan las ballenas', 'Sara Jaramillo', 'https://librosmedellin.com/wp-content/uploads/2022/02/Donde-cantan-las-ballenas-Sara-Jaramillo-Klinkert.png'),
    ('Perder es cuestión de método', 'Santiago Gamboa', 'https://www.penguinlibros.com/co/2086144/perder-es-cuestion-de-metodo-edicion-conmemoativa.jpg');
schema-mariadb.sql