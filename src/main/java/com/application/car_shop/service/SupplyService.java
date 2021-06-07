package com.application.car_shop.service;
import com.application.car_shop.model.Supply;

import java.util.List;

public interface SupplyService {

        List<Supply> getSupplyByName(String name);

        Supply getSupplyById(long id);

        long addSupply(Supply supply);

        void deleteSupply(long id);

        void updateSupply(long id, Supply supply);
}

