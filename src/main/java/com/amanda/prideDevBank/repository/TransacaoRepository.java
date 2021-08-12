package com.amanda.prideDevBank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.amanda.prideDevBank.entity.TransacaoEntity;

@Repository
public interface TransacaoRepository extends CrudRepository<TransacaoEntity, Integer> {

}
