package co.edu.uniquindio.proyectofinal.clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import co.edu.uniquindio.proyectofinal.excepciones.NegativoException;

public class Producto implements Serializable {
    private List<Vendedor> likes;
    private String nombre;
    private double precio;
    private String descripcion;
    private String codigo;
    private LocalTime horaDePublicacion;
    private LocalDate fechaDePublicacion;
    private Vendedor autor;
    private List<Comentario> comentarios;


    public Producto(int likes, String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public void verLista(){}

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalTime getHoraDePublicacion() { 
        return horaDePublicacion;
    }

    public void setHoraDePublicacion(LocalTime horaDePublicacion) {
        this.horaDePublicacion = horaDePublicacion;
    }

    public LocalDate getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws NegativoException { 

        if (precio < 0){
            throw new NegativoException("El precio no puede ser negativo");
        }
        else{
            this.precio = precio;
        }

        }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void recibirLike (Vendedor usuario){ 
        likes.add(usuario);
        
    }
    public void perderLike (Vendedor usuario){
        likes.remove(usuario);
    }

    public void agregarComentario (Comentario comentario){
        comentarios.add(comentario);
    }

    public void eliminarComtenario (Comentario comentario){
        comentarios.remove(comentario);
    }

}
