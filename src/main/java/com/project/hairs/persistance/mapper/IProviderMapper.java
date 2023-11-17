package com.project.hairs.persistance.mapper;

import com.project.hairs.domain.pojo.ProviderPojo;
import com.project.hairs.persistance.entity.ProviderEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de proveedor de entidades o pojos.
 * Utiliza la biblioteca MapStruct para generar automáticamente la implementación
 * de los métodos de mapeo.
 */
@Mapper(componentModel = "spring")
public interface IProviderMapper {

    /**
     * Convierte una entidad ProviderEntity a un POJO ProviderPojo.
     *
     * @param providerEntity La entidad ProviderEntity a ser convertida.
     * @return Un objeto ProviderPojo mapeado desde la entidad.
     */
    @Mapping(source = "nit", target = "nit")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "mail", target = "mail")
    @Mapping(source = "cellphone", target = "cellphone")
    @Mapping(source = "address", target = "address")
    ProviderPojo toProviderPojo(ProviderEntity providerEntity);

    /**
     * Convierte un POJO ProviderPojo a una entidad ProviderEntity.
     * Utiliza la configuración inversa heredada de la operación de mapeo
     * toProviderPojo.
     *
     * @param providerPojo El POJO ProviderPojo a ser convertido.
     * @return Una entidad ProviderEntity mapeada desde el POJO.
     */
    @InheritInverseConfiguration
    ProviderEntity toProviderEntity(ProviderPojo providerPojo);

    /**
     * Retorna una lista de providers transormada a POJO de una lista de entidades
     * @param providersEntity Entidad a transformar
     * @return Lista transformada
     */
    List<ProviderPojo> toProviderPojo(List<ProviderEntity> providersEntity);
}