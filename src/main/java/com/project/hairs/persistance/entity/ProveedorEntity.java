package com.project.hairs.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity de proovedor
 */
@Getter
@Setter
@Entity
@Table(name = "proveedor")
public class ProveedorEntity {

    /**
     * Identificador único de proveedor (NIT).
     */
    @Id
    private String nit;

    /**
     * Nombre del proveedor.
     */
    @Column(name = "nombre")
    private String name;

    /**
     * Correo electrónico del proveedor.
     */
    @Column(name = "correo")
    private String mail;

    /**
     * Número de teléfono del proveedor.
     */
    @Column(name = "telefono")
    private Integer cellphone;

    /**
     * Dirección del proveedor.
     */
    @Column(name = "direccion")
    private String address;
}