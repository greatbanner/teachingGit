package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libreria/api")
public class LibreriaController {

    @PostMapping("/libros")
    public ResponseEntity<String> guardarLibro(@RequestParam String libreria, @RequestBody LibroDTO libroAGuardar){
        System.out.println(libroAGuardar.getTitulo());
        return ResponseEntity.ok("Libro guardado en "+ libreria);
    }

}
