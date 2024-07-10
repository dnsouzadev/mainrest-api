package com.dnsouzadev.api.service;

import com.dnsouzadev.api.dto.CarPostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarPostStoreService {

    List<CarPostDTO> getCarForSales();

    void changeCarForSale(CarPostDTO carPostDTO, String id);

    void removeCarForSale(String id);

}
