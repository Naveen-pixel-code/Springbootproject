package com.naveen.springboot.SpringBootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.springboot.SpringBootproject.model.Item;

public interface ItemRepository extends JpaRepository<Item,Long>{

}
