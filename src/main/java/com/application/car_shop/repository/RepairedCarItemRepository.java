package com.application.car_shop.repository;

import com.application.car_shop.model.RepairedCarItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepairedCarItemRepository
        extends JpaRepository<RepairedCarItem, Long> {

    List<RepairedCarItem> findByItemNameStartingWithOrderByItemName(String name);

}
