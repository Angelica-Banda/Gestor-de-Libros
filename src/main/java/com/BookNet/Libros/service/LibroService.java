package com.BookNet.Libros.service;

import com.BookNet.Libros.domain.Libro;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService {

    public List<Libro> buscarDestacados() {
        List<Libro> destacados = new ArrayList<>();

        Libro lib = new Libro();
        lib.setNombre("No sé cómo mostrar dónde me duele");
        lib.setDescripcion("Amalia Andrade Arango");
        lib.setImagenUrl("https://www.planetadelibros.com.co/usuaris/libros/fotos/386/m_libros/portada_no-se-como-mostrar-donde-me-duele_amalia-andrade_202307311626.png");
        destacados.add(lib);

        lib = new Libro();
        lib.setNombre("El ruido de las cosas al caer");
        lib.setDescripcion("Juan Gabriel Vásquez");
        lib.setImagenUrl("https://www.tornamesa.co/imagenes/9789587/978958758145.GIF");
        destacados.add(lib);

        lib = new Libro();
        lib.setNombre("Donde cantan las ballenas");
        lib.setDescripcion("Sara Jarramillo");
        lib.setImagenUrl("https://librosmedellin.com/wp-content/uploads/2022/02/Donde-cantan-las-ballenas-Sara-Jaramillo-Klinkert.png");
        destacados.add(lib);

        lib = new Libro();
        lib.setNombre("Perder es cuestión de metodo");
        lib.setDescripcion("Santiago Gamboa");
        lib.setImagenUrl("https://www.penguinlibros.com/co/2086144/perder-es-cuestion-de-metodo-edicion-conmemoativa.jpg");
        destacados.add(lib);

        return destacados;
    }
}
