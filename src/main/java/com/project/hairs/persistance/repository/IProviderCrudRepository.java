package com.project.hairs.persistance.repository;

import com.project.hairs.persistance.entity.ProviderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProviderCrudRepository extends JpaRepository<ProviderEntity, String> {

}
