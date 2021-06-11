package com.application.car_shop.service;


import com.application.car_shop.exception.RecordNotFound;
import com.application.car_shop.model.RepairedCarItem;
import com.application.car_shop.repository.RepairedCarItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairedCarItemServiceImplementation implements RepairedCarItemService {

    final
    RepairedCarItemRepository repairRepository;

    public RepairedCarItemServiceImplementation(RepairedCarItemRepository repairRepository) {
        this.repairRepository = repairRepository;
    }

    @Override
    public List<RepairedCarItem> getRepairByName(String name) {
        if (name == null || name.isEmpty())
            return repairRepository.findAll();
        else
            return repairRepository.findByItemNameStartingWithOrderByItemName(name);
    }

    @Override
    public RepairedCarItem getRepairById(long id) {
        if (repairRepository.existsById(id)) {
            return repairRepository.findById(id).get();
        }
        else {
            throw new RecordNotFound();
        }
    }

    @Override
    public long addRepair(RepairedCarItemService repair) {
        return 0;
    }

    @Override
    public long addRepair(RepairedCarItem repair) {
        RepairedCarItem newSupply = repairRepository.save(repair);
        return newSupply.getId();
    }

    @Override
    public void deleteRepair(long id) {
        if (repairRepository.existsById(id)) {
            repairRepository.deleteById(id);
        }
        else {
            throw new RecordNotFound();
        }
    }

    @Override
    public void updateRepair(long id, RepairedCarItemService repair) {

    }

    @Override
    public void updateRepair(long id, RepairedCarItem repair) {
        if (repairRepository.existsById(id)) {
            RepairedCarItem existingRepair = repairRepository.findById(id).get();
            existingRepair.setItemName(repair.getItemName());
            existingRepair.setPriceInEuro(repair.getPriceInEuro());
            existingRepair.setOperation(repair.getOperation());
            existingRepair.setStatus(repair.getStatus());
            repairRepository.save(existingRepair);

        } else {
            throw new RecordNotFound();
        }
    }
}

