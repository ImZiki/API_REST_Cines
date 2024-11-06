package com.es.diecines.service;


import com.es.diecines.dto.PeliculaDTO;
import com.es.diecines.model.Pelicula;
import com.es.diecines.repository.PeliculaRepository;
import com.es.diecines.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService {

    @Autowired
    private PeliculaRepository repository;

    public PeliculaDTO getById(String id){
        Long idL = 0L;
        try{
            idL = Long.parseLong(id);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        Pelicula p = repository
                .findById(idL)
                .orElse(null);
        return (p == null) ? null : Mapper.entityToDTO(p);
    }
}
