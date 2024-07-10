package com.MalcaSuarezYosthinSebastian.infraccionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MalcaSuarezYosthinSebastian.infraccionservice.entity.Infraccion;

@Repository
public interface InfraccionRepository extends JpaRepository<Infraccion, Integer> {

}