package com.es.diecines.service;


import com.es.diecines.dto.PeliculaDTO;
import com.es.diecines.model.Pelicula;
import com.es.diecines.repository.PeliculaRepository;
import com.es.diecines.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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

        // repository.save() ESTO DEVUELVE EL OBJETO QUE SE PASA
        return (p == null) ? null : Mapper.entityToDTO(p);
    }

    public PeliculaDTO insert(PeliculaDTO pelicula) {
        Pelicula p = repository.save(Mapper.dtoToEntity(pelicula));
        return (p == null) ? null : Mapper.entityToDTO(p);
    }

    public PeliculaDTO update(String id, PeliculaDTO dto) {
        Long idL = 0L;
        try{
            idL = Long.parseLong(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Pelicula p = repository.findById(idL).orElse(null);
        //Hacer comprobaciones de todos los datos

        return null;
    }

    public PeliculaDTO delete(String id) {
        Long idL = 0L;
        try{
            idL = Long.parseLong(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Pelicula p = repository.findById(idL).orElse(null);
        try{
            repository.delete(p);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return (p == null) ? null : Mapper.entityToDTO(p);
    }
}