package com.flex_reserve.library.slot.service;

import com.flex_reserve.library.slot.model.SlotEntity;
import org.springframework.stereotype.Service;
import com.flex_reserve.library.slot.persistence.SlotRepository;

@Service

public class SlotService {

    private final SlotRepository slotRepository;

    public SlotService(SlotRepository slotRepository) {
        this.slotRepository = slotRepository;
    }

    public String createSlot(String slotCode, String slotBuilding, Integer slotFloor) {

        SlotEntity existingSlot = slotRepository.findByCodeAndBuildingAndFloor(slotCode, slotBuilding, slotFloor);

        if (existingSlot == null) {

            SlotEntity newSlot = SlotEntity.builder()
                    .code(slotCode)
                    .building(slotBuilding)
                    .floor(slotFloor)
                    .build();

            slotRepository.save(newSlot);

            return "La place a bien été créé !";
        } else {

            return "La place existe déjà !";
        }

    }

}
