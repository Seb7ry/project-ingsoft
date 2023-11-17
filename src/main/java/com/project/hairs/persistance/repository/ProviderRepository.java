package com.project.hairs.persistance.repository;

import com.project.hairs.domain.pojo.ProviderPojo;
import com.project.hairs.domain.repository.IProviderRepository;
import com.project.hairs.persistance.entity.ProviderEntity;
import com.project.hairs.persistance.mapper.IProviderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio de proveedor
 */
@Repository
@RequiredArgsConstructor //Crea el contructor con los atributos final.
public class ProviderRepository implements IProviderRepository {

    /**
     * Crud de proveedor
     */
    private final IProviderCrudRepository iProviderCrudRepository;

    /**
     * Mapper de proveedor
     */
    private final IProviderMapper iProviderMapper;


    /**
     * Devuelve todas los proveedores
     * @return Lista de proveedores
     */
    @Override
    public List<ProviderPojo> getAll() {
        return iProviderMapper.toProviderPojo(iProviderCrudRepository.findAll());
    }

    /**
     * Devuelve un proveedor dado su nit
     * @param nit Proveedor
     * @return Optional del proveedor encontrado
     */
    @Override
    public Optional<ProviderPojo> gerProvider(String nit) {
        return iProviderCrudRepository.findById(nit)
                .map(iProviderMapper::toProviderPojo);
        //providerEntity -> iProviderMapper.toProviderPojo(providerEntity) - LAMBDA
        //iProviderMapper::toProviderPojo - Método por referencia
    }

    /**
     * Guarda un nuevo proveedor
     * @param newProvider proveedor a guardar
     * @return proveedor guardado
     */
    @Override
    public ProviderPojo save(ProviderPojo newProvider) {
        ProviderEntity providerEntity = iProviderMapper.toProviderEntity(newProvider);
        return iProviderMapper.toProviderPojo(iProviderCrudRepository.save(providerEntity));
    }

    /**
     * Elimina un proveedor dado su nit
     * @param nitProvider nit del proveedor a eliminar
     */
    @Override
    public void delete(String nitProvider) {
        iProviderCrudRepository.deleteById(nitProvider);
    }
}
