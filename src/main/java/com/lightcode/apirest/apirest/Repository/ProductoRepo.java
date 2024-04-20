package com.lightcode.apirest.apirest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lightcode.apirest.apirest.Models.Producto;

public interface ProductoRepo extends JpaRepository<Producto, Long> {

    

}
