package com.application.car_shop.controller;

import com.application.car_shop.service.RepairedCarItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class RepairedCarItemController {

    RepairedCarItemService repairService;

    @GetMapping(value = "/repair")
    public ResponseEntity<Object> getRepair(@RequestParam(required = false) String name) {
        return new ResponseEntity<>(repairService.getRepairByName(name), HttpStatus.OK);
    }

    @GetMapping(value = "/repair/{id}")
    public ResponseEntity<Object> getRepair(@PathVariable("id") Integer id) {
        return  new ResponseEntity<>(repairService.getRepairById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/repair")
    public ResponseEntity<Object> addRepair(@RequestBody RepairedCarItemService repair) {

        long newId = repairService.addRepair(repair);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newId)
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/repair/{id}")
    public ResponseEntity<Object> deleteRepair(@PathVariable("id") Integer id) {
        repairService.deleteRepair(id);
        return new ResponseEntity<>("Record deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/repair/{id}")
    public ResponseEntity<Object> updateRepair(@PathVariable("id") Integer id, @RequestBody RepairedCarItemService repair) {
        repairService.updateRepair(id, repair);
        return new ResponseEntity<>("Record updated", HttpStatus.NO_CONTENT);
    }
}
