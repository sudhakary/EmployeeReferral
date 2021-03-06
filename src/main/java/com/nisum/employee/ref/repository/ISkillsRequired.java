package com.nisum.employee.ref.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nisum.employee.ref.domain.SkillsEntity;

@Repository
public interface ISkillsRequired  extends CrudRepository<SkillsEntity, String>{

}
