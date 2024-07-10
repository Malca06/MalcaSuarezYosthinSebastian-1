package com.MalcaSuarezYosthinSebastian.infraccionservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MalcaSuarezYosthinSebastian.infraccionservice.entity.Infraccion;

import java.util.List;

@Repository
public interface InfraccionRepository extends JpaRepository<Infraccion, Integer> {
    Page<Infraccion> findAll(Pageable pageable);
    List<Infraccion> findByDni(String dni);
}
