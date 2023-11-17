package com.project.hairs.domain.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * Pojo de proovedor
 */
@Getter
@Setter
public class ProviderPojo {

    /**
     * Identificador único de proveedor (NIT).
     */
    private String nit;

    /**
     * Nombre del proveedor.
     */
    private String name;

    /**
     * Correo electrónico del proveedor.
     */
    private String mail;

    /**
     * Número de teléfono del proveedor.
     */
    private Integer cellphone;

    /**
     * Dirección del proveedor.
     */
    private String address;
}
