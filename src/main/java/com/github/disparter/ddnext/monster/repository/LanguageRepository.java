package com.github.disparter.ddnext.monster.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.disparter.ddnext.monster.entity.Language;
import com.github.disparter.ddnext.monster.repository.custom.LanguageCustom;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>, LanguageCustom { 

}
