package com.es.diecines.controller;


import com.es.diecines.dto.PeliculaDTO;
import com.es.diecines.repository.PeliculaRepository;
import com.es.diecines.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    PeliculaService pService;

    @PostMapping("/")
    public PeliculaDTO insert(@RequestBody PeliculaDTO pelicula) {
        return null;
    }

    @GetMapping("/")
    public List<PeliculaDTO> getAll() {
        return null;
    }

    @GetMapping("/{id}")
    public PeliculaDTO getById(@PathVariable String id) {
        if(id == null || id.isEmpty()) return null;

        PeliculaDTO p = pService.getById(id);

        return (p == null) ? null : p;
    }


}
