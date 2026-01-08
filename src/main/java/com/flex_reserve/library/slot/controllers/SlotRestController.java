package com.flex_reserve.library.slot.controllers;


import com.flex_reserve.library.slot.service.SlotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j

@RestController
public class SlotRestController {

    private final SlotService slotService;

    public SlotRestController(SlotService slotService ) {
        this.slotService = slotService;
    }

    // GET -> Lecture
    // POST -> Création (Persistance DB)
    // PUT  -> Mise à jour (Persistance DB)
    // DELETE -> Suppression (Persistance DB)

    @GetMapping("/com/flex_reserve/library/slot")
    public String get(@RequestParam String slotCode,
                      @RequestParam String slotBuilding,
                      @RequestParam Integer slotFloor
    ) {

        log.info(String.valueOf(slotCode));
        log.info(String.valueOf(slotBuilding));
        log.info(String.valueOf(slotFloor));

        String response = slotService.createSlot(slotCode, slotBuilding, slotFloor);

        return response ;
    }

}