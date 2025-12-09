package com.example.flex_reserve;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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
    public SlotEntity get() {

        SlotEntity newSlot = SlotEntity.builder()
                                        .code("M201")
                                        .building("Maille Nord 1")
                                        .floor(2)
                                        .slotIndex(1)
                                        .build();

        log.info(newSlot.toString());

        slotRepository.save(newSlot);

        return newSlot;
    }


}
