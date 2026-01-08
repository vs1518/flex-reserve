package com.flex_reserve.library.slot.persistence;

import com.flex_reserve.library.slot.model.SlotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotRepository extends JpaRepository<SlotEntity, Long> {

    public SlotEntity findFirstByCodeAndBuilding(String code, String building, Integer slotFloor);

    SlotEntity findByCodeAndBuildingAndFloor(String slotCode, String slotBuilding, Integer slotFloor);
}
