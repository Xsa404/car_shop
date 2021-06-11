package com.application.car_shop.service;

import  com.application.car_shop.model.RepairedCarItem;
import java.util.List;

public interface RepairedCarItemService {

    List<RepairedCarItem> getRepairByName(String name);

    RepairedCarItem getRepairById(long id);

    long addRepair(RepairedCarItemService repair);

    long addRepair(RepairedCarItem repair);

    void deleteRepair(long id);

    void updateRepair(long id, RepairedCarItemService repair);

    void updateRepair(long id, RepairedCarItem repair);
}
