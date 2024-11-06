package com.es.diecines.utils;

import com.es.diecines.dto.PeliculaDTO;
import com.es.diecines.dto.SesionDTO;
import com.es.diecines.model.Pelicula;
import com.es.diecines.model.Sesion;

import java.time.LocalDate;

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
    public static Pelicula dtoToEntity(PeliculaDTO dto){
        Pelicula p = new Pelicula();
        p.setDirector(dto.getDirector());
        p.setTime(dto.getTime());
        p.setTitle(dto.getTitle());
        p.setPosterImage(dto.getPosterImage());
        p.setScreenshot(dto.getScreenshot());
        p.setRating(dto.getRating());
        p.setTrailer(dto.getTrailer());
        p.setSynopsis(dto.getSynopsis());
        p.setId(dto.getId());

        return p;
    }

    public static SesionDTO entityToDTO(Sesion sesion){
        SesionDTO sDto = new SesionDTO();
        sDto.setId(sesion.getId());
        sDto.setMovieId(sesion.getPelicula().getId());
        sDto.setRoomId(sesion.getRoomId());
        sDto.setDate(sesion.getDate());

        return sDto;
    }
    public static Sesion dtoToEntity(SesionDTO dto, Pelicula p){
        Sesion s = new Sesion();
        s.setId(dto.getId());
        s.setPelicula(p);
        s.setRoomId(dto.getRoomId());
        s.setDate(dto.getDate());
        return s;
    }
}
