package com.application.car_shop.repository;

import com.application.car_shop.model.Supply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplyRepository
        extends JpaRepository<Supply, Long> {

    List<Supply> findByItemNameStartingWithOrderByItemName(String name);


}
