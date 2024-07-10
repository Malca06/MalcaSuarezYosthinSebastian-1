package com.MalcaSuarezYosthinSebastian.infraccionservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MalcaSuarezYosthinSebastian.infraccionservice.entity.Infraccion;
import com.MalcaSuarezYosthinSebastian.infraccionservice.repository.InfraccionRepository;
import com.MalcaSuarezYosthinSebastian.infraccionservice.service.InfraccionService;

@Service
public class InfraccionServiceImpl implements InfraccionService {
    @Autowired
    private InfraccionRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Infraccion> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Infraccion get(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Infraccion create(Infraccion infraccion) {
        return repository.save(infraccion);
    }

    @Override
    public Infraccion update(Infraccion infraccion) {
        Infraccion registro = get(infraccion.getId());
        if (registro == null) {
            return null;
        } else {
            registro.setDni(infraccion.getDni());
            registro.setFecha(infraccion.getFecha());
            registro.setTipoInfraccion(infraccion.getTipoInfraccion());
            registro.setUbicacion(infraccion.getUbicacion());
            registro.setDescripcion(infraccion.getDescripcion());
            registro.setMontoMulta(infraccion.getMontoMulta());
            registro.setEstado(infraccion.getEstado());
            repository.save(registro);
            return registro;
        }
    }

    @Override
    public Infraccion delete(int id) {
        Infraccion registro = get(id);
        if (registro == null) {
            return null;
        } else {
            repository.delete(registro);
            return registro;
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Infraccion> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Infraccion> getByDni(String dni) {
        return repository.findByDni(dni);
    }
}
