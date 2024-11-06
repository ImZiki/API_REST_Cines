package com.es.diecines.utils;

import com.es.diecines.dto.PeliculaDTO;
import com.es.diecines.dto.SesionDTO;
import com.es.diecines.model.Pelicula;
import com.es.diecines.model.Sesion;

public class Mapper {

    public static PeliculaDTO entityToDTO(Pelicula p){
        PeliculaDTO dto = new PeliculaDTO();
        dto.setDirector(p.getDirector());
        dto.setTime(p.getTime());
        dto.setTitle(p.getTitle());
        dto.setPosterImage(String.valueOf(p.getPosterImage()));
        dto.setScreenshot(String.valueOf(p.getScreenshot()));
        dto.setRating(p.getRating());
        dto.setTrailer(p.getTrailer());
        dto.setSynopsis(p.getSynopsis());
        dto.setId(p.getId());

        return dto;
    }
    public static Pelicula DTOToEntity(PeliculaDTO dto){
        Pelicula p = new Pelicula();
        p.setDirector(dto.getDirector());
        p.setTime(dto.getTime());
        p.setTitle(dto.getTitle());
        p.setPosterImage(String.valueOf(dto.getPosterImage()));
        p.setScreenshot(String.valueOf(dto.getScreenshot()));
        p.setRating(dto.getRating());
        p.setTrailer(dto.getTrailer());
        p.setSynopsis(dto.getSynopsis());
        p.setId(dto.getId());
    }

    public static SesionDTO entityToDTO(Sesion sesion){
        return null;
    }
    public static Sesion DTOToEntity(SesionDTO dto){
        return null;
    }
}
