package com.application.car_shop.controller;

import com.application.car_shop.model.Supply;
import com.application.car_shop.service.SupplyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class SupplyController {

    SupplyService supplyService;

    @GetMapping(value = "/supply")
    public ResponseEntity<Object> getSupply(@RequestParam(required = false) String name) {
        return new ResponseEntity<>(supplyService.getSupplyByName(name), HttpStatus.OK);
    }

    @GetMapping(value = "/supply/{id}")
    public ResponseEntity<Object> getSupply(@PathVariable("id") Integer id) {
        return  new ResponseEntity<>(supplyService.getSupplyById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/supply")
    public ResponseEntity<Object> addSupply(@RequestBody Supply supply) {

        long newId = supplyService.addSupply(supply);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newId)
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/supply/{id}")
    public ResponseEntity<Object> deleteSupply(@PathVariable("id") Integer id) {
        supplyService.deleteSupply(id);
        return new ResponseEntity<>("Record successfully deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/supply/{id}")
    public ResponseEntity<Object> updateSupply(@PathVariable("id") Integer id, @RequestBody Supply supply) {
        supplyService.updateSupply(id, supply);
        return new ResponseEntity<>("Record successfully updated", HttpStatus.NO_CONTENT);
    }
}