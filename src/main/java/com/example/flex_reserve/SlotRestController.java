package com.example.flex_reserve;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j

@RestController
public class SlotRestController {

    private final SlotRepository slotRepository;

    public SlotRestController(SlotRepository slotRepository) {
        this.slotRepository = slotRepository;
    }

    // GET -> Lecture
    // POST -> Création (Persistance DB)
    // PUT  -> Mise à jour (Persistance DB)
    // DELETE -> Suppression (Persistance DB)

    @GetMapping("/slot")
    public String get(@RequestParam String slotCode,
                      @RequestParam String slotBuilding,
                      @RequestParam Integer slotFloor
    ) {

        log.info(String.valueOf(slotCode));
        log.info(String.valueOf(slotBuilding));
        log.info(String.valueOf(slotFloor));

        SlotEntity existingSlot = slotRepository.findFirstByCodeAndBuilding(slotCode, slotBuilding);

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