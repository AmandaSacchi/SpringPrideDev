package com.amanda.prideDevBank.repository;
import com.amanda.prideDevBank.entity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity,Integer> {

}
