package com.pinterest.Pinterest_clone.service;
import com.pinterest.Pinterest_clone.model.Pin;
import com.pinterest.Pinterest_clone.repository.PinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PinServiceImpl implements PinService {
    @Autowired
    private PinRepository pinRepository;

    @Override
    public Pin createPin(Pin pin) {
        return pinRepository.save(pin);
    }

    @Override
    public List<Pin> getAllPins() {
        return pinRepository.findAll();
    }

    @Override
    public Pin getPinById(Long id) {
        return pinRepository.findById(id).orElseThrow();
    }

    @Override
    public Pin updatePin(Long id, Pin updatedPin) {
        Pin pin = pinRepository.findById(id).orElseThrow();
        pin.setTitle(updatedPin.getTitle());
        pin.setImageUrl(updatedPin.getImageUrl());
        pin.setDescription(updatedPin.getDescription());
        return pinRepository.save(pin);
    }

    @Override
    public void deletePin(Long id) {
        pinRepository.deleteById(id);
    }
}
