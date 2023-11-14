package com.project.hairs.persistance.mapper;

import com.project.hairs.domain.pojo.ProveedorPojo;
import com.project.hairs.persistance.entity.ProveedorEntity;
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
public interface IProveedorMapper {

    /**
     * Convierte una entidad ProveedorEntity a un POJO ProveedorPojo.
     *
     * @param proveedorEntity La entidad ProveedorEntity a ser convertida.
     * @return Un objeto ProveedorPojo mapeado desde la entidad.
     */
    @Mapping(source = "nit", target = "nit")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "mail", target = "mail")
    @Mapping(source = "cellphone", target = "cellphone")
    @Mapping(source = "address", target = "address")
    ProveedorPojo toProveedorPojo(ProveedorEntity proveedorEntity);

    /**
     * Convierte un POJO ProveedorPojo a una entidad ProveedorEntity.
     * Utiliza la configuración inversa heredada de la operación de mapeo
     * toProveedorPojo.
     *
     * @param proveedorPojo El POJO ProveedorPojo a ser convertido.
     * @return Una entidad ProveedorEntity mapeada desde el POJO.
     */
    @InheritInverseConfiguration
    ProveedorEntity toProveedorEntity(ProveedorPojo proveedorPojo);

    /**
     * Retorna una lista de proveedores transormada a POJO de una lista de entidades
     * @param proveedoresEntity Entidad a transformar
     * @return Lista transformada
     */
    List<ProveedorPojo> toProveedorPojo(List<ProveedorEntity> proveedoresEntity);
}