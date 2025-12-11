package com.example.flex_reserve;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotRepository extends JpaRepository<SlotEntity, Long> {

    public SlotEntity findFirstByCodeAndBuilding(String code, String building);
}
