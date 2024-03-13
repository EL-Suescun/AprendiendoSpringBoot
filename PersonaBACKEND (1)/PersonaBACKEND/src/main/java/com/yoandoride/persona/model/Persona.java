package com.yoandoride.persona.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/* Este tipo de etiquetas son conocidos como de persistencia,
 * esta define una entidad de la base de datos
 */
@Entity
@Table(name = "persona")/* Esta define que es una tabla */
public class Persona {

    @Id /* Esta que el atributo de abajo "id" es un identificador unico de la tabla */
    @GeneratedValue(strategy = GenerationType.AUTO) /* Esta define que el identificador sea auto incrementable */
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    @ManyToOne /* Esta define una relacion en la tabla de muchos a uno */
    @JoinColumn(name = "id_pais") /* Esta define que este campo sera unira por medio de la columna "id_pais" */
    private Pais pais;
    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    /* Metodo Constructor, no se pone el Id porque es auto incrementable */
    public Persona(String nombre, String apellido, int edad, Pais pais, Estado estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.estado = estado;
    }

    /* Metodos Getters And Setters  */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
