package com.example.flex_reserve;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlotRestController {

    @GetMapping("/slot")
    public String get() {
        return "Test 123";
    }


}
