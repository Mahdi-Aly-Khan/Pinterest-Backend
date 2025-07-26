package com.pinterest.Pinterest_clone.repository;

import com.pinterest.Pinterest_clone.model.Pin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PinRepository extends JpaRepository<Pin, Long> {
}