package com.pinterest.Pinterest_clone.controller;
import com.pinterest.Pinterest_clone.model.Pin;
import com.pinterest.Pinterest_clone.service.PinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pins")

public class PinController {
    @Autowired
    private PinService pinService;

    @PostMapping
    public Pin create(@RequestBody Pin pin) {
        return pinService.createPin(pin);
    }

    @GetMapping
    public List<Pin> getAll() {
        return pinService.getAllPins();
    }

    @GetMapping("/{id}")
    public Pin getById(@PathVariable Long id) {
        return pinService.getPinById(id);
    }

    @PutMapping("/{id}")
    public Pin update(@PathVariable Long id, @RequestBody Pin pin) {
        return pinService.updatePin(id, pin);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pinService.deletePin(id);
    }
}
