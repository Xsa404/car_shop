package com.application.car_shop.service;

import com.application.car_shop.exception.RecordNotFound;
import com.application.car_shop.model.Supply;
import com.application.car_shop.repository.SupplyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyServiceImplementation implements SupplyService {

    final
    SupplyRepository supplyRepository;

    public SupplyServiceImplementation(SupplyRepository supplyRepository) {
        this.supplyRepository = supplyRepository;
    }


    @Override
    public List<Supply> getSupplyByName(String name) {
        if (name == null || name.isEmpty())
            return supplyRepository.findAll();
        else
            return supplyRepository.findByItemNameStartingWithOrderByItemName(name);
    }

    @Override
    public Supply getSupplyById(long id) {
        if (supplyRepository.existsById(id)) {
            return supplyRepository.findById(id).get();
        }
        else {
            throw new RecordNotFound();
        }
    }

    @Override
    public long addSupply(Supply supply) {
        Supply newSupply = supplyRepository.save(supply);
        return newSupply.getId();
    }

    @Override
    public void deleteSupply(long id) {
        if (supplyRepository.existsById(id)) {
            supplyRepository.deleteById(id);
        }
        else {
            throw new RecordNotFound();
        }
    }

    @Override
    public void updateSupply(long id, Supply supply) {
        if (supplyRepository.existsById(id)) {
            Supply existingSupply = supplyRepository.findById(id).get();
            existingSupply.setItemName(supply.getItemName());
            existingSupply.setPriceInEuro(supply.getPriceInEuro());
            existingSupply.setStorageLocation(supply.getStorageLocation());
            existingSupply.setProductNumber(supply.getProductNumber());
            supplyRepository.save(existingSupply);

        } else {
            throw new RecordNotFound();
        }
    }
}
