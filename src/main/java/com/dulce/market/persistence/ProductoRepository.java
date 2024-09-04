package com.dulce.market.persistence;

import com.dulce.market.persistence.crud.ProductoCrudRepository;
import com.dulce.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository //indicamos que esta clase se encarga de interactuar con la BD
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    //Creamos un metodo que recupere una lista de productos
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
    //Muestra una lista de los productos por categoria
    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
        }
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    //Buscar producto por nombre y precio
    public Optional<List<Producto>> getByProducto(String nombre, Integer precioVenta){
        return Optional.ofNullable(productoCrudRepository.findByNombreAndPrecioVenta(nombre, precioVenta));
    }

    //Buscar un producto en particular
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    //Guardar producto
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    //Eliminar producto
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
    }

