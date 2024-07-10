package com.MalcaSuarezYosthinSebastian.infraccionservice.service;

import java.util.List;

import com.MalcaSuarezYosthinSebastian.infraccionservice.entity.Infraccion;

public interface InfraccionService {
    public List<Infraccion> getAll();
    public Infraccion get(int id);
    public Infraccion create(Infraccion infraccion);
    public Infraccion update(Infraccion infraccion);
    public Infraccion delete(int id);
}