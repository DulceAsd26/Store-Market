package com.dulce.market.persistence.crud;

import com.dulce.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//Controlamos la tabla producto usando CrudRepository
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //Recuperar toda la lista de productos que pertenezcan a una categoria en especifico
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true) --> Esta es una manera tradicional de manera nativa
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //Queremos recuperar los productos escasos
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    //Buscar producto por nombre y precio
    List<Producto> findByNombreAndPrecioVenta(String nombre, Integer precioVenta);

    //
}
