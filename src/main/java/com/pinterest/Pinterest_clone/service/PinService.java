package com.pinterest.Pinterest_clone.service;
import com.pinterest.Pinterest_clone.model.Pin;

import java.util.List;
public interface PinService {
    Pin createPin(Pin pin);
    List<Pin> getAllPins();
    Pin getPinById(Long id);
    Pin updatePin(Long id, Pin pin);
    void deletePin(Long id);
}
