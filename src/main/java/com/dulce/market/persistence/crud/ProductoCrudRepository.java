package com.dulce.market.persistence.crud;

import com.dulce.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

//Controlamos la tabla producto usando CrudRepository
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
