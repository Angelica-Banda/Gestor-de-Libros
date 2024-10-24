package com.BookNet.Libros.controller;

import org.springframework.ui.Model; // Importación correcta
import com.BookNet.Libros.domain.Libro;
import com.BookNet.Libros.service.LibroService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListadoController {

    private final LibroService libroService;

    public ListadoController(LibroService libroService) {
        this.libroService = libroService;
    }

    @RequestMapping("/")
    public String listarLibros(Model model) {
        List<Libro> buscarDestacados = libroService.buscarDestacados();
        model.addAttribute("libros", buscarDestacados);
        return "listado";
    }
}

