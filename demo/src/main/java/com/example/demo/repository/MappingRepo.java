package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Mapping;

public interface MappingRepo extends  JpaRepository<Mapping, Long>{

}
