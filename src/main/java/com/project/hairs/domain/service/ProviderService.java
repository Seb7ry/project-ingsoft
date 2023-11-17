package com.project.hairs.domain.service;

import com.project.hairs.domain.pojo.ProviderPojo;
import com.project.hairs.domain.repository.IProviderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio de proveedor
 */
@Service
@RequiredArgsConstructor
public class ProviderService implements IProviderService {

    /**
     * Repositorio de proveedor
     */
    private final IProviderRepository iProviderRepository;

    /**
     * Devuelve todas los proveedores
     * @return Lista de proveedores
     */
    @Override
    public List<ProviderPojo> getAll() {
        return iProviderRepository.getAll();
    }

    /**
     * Devuelve un proveedor dado su nit
     * @param nit Proveedor
     * @return Optional del proveedor encontrado
     */
    @Override
    public Optional<ProviderPojo> getProvider(String nit) {
        return iProviderRepository.getProvider(nit);
    }

    /**
     * Guarda un nuevo proveedor
     * @param newProvider proveedor a guardar
     * @return proveedor guardado
     */
    @Override
    public ProviderPojo save(ProviderPojo newProvider) {
        return iProviderRepository.save(newProvider);
    }

    /**
     * Elimina un proveedor dado su nit
     * @param nitProvider nit del proveedor a eliminar
     * @return true si eliminó falso si es lo contrario
     */
    @Override
    public boolean delete(String nitProvider) {
        try {
            iProviderRepository.delete(nitProvider);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
