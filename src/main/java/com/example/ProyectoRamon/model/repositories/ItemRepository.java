package com.example.ProyectoRamon.model.repositories;

import com.example.ProyectoRamon.model.Entities.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Items,Long> {

}
