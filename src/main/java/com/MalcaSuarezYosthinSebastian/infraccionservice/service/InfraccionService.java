package com.MalcaSuarezYosthinSebastian.infraccionservice.service;

import java.util.List;

import com.MalcaSuarezYosthinSebastian.infraccionservice.entity.Infraccion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface InfraccionService {
    List<Infraccion> getAll();
    Infraccion get(int id);
    Infraccion create(Infraccion infraccion);
    Infraccion update(Infraccion infraccion);
    Infraccion delete(int id);
    Page<Infraccion> getAll(Pageable pageable);
    List<Infraccion> getByDni(String dni);
}
