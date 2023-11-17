package com.project.hairs.domain.service;

import com.project.hairs.domain.pojo.ProviderPojo;

import java.util.List;
import java.util.Optional;

public interface IProviderService {

    /**
     * Devuelve todas los proveedores
     * @return Lista de proveedores
     */
    List<ProviderPojo> getAll();

    /**
     * Devuelve un proveedor dado su nit
     * @param nit Proveedor
     * @return Optional del proveedor encontrado
     */
    Optional<ProviderPojo> getProvider (String nit);

    /**
     * Guarda un nuevo proveedor
     * @param newProvider proveedor a guardar
     * @return proveedor guardado
     */
    ProviderPojo save(ProviderPojo newProvider);

    /**
     * Elimina un proveedor dado su nit
     * @param nitProvider nit del proveedor a eliminar
     * @return true si eliminó falso si es lo contrario
     */
    boolean delete(String nitProvider);
}
