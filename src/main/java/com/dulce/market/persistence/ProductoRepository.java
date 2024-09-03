package com.dulce.market.persistence;

import com.dulce.market.persistence.crud.ProductoCrudRepository;
import com.dulce.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    //Creamos un metodo que recupere una lista de productos
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
