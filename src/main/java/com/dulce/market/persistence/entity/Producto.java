package com.dulce.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCTOS")
public class Producto {

    @Id //Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Informa que es la clave primaria y va generarse automaticamente
    @Column (name = "id_producto") //El nombre que verdaderamente tiene esa columna
    private Integer idProducto;

    private String nombre;

    @Column (name = "id_categoria")
    private Integer idCategoria;

    @Column (name = "codigo_barras")
    private String codigoBarras;

    @Column (name = "precio_venta")
    private Integer precioVenta;

    @Column (name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false) //A traves de esta relacion no vamos a actualizar ni borrar una nueva categoria
    private Categoria categoria;
    //Todo esto recupera a que categoria pertenece el producto




    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Integer getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
