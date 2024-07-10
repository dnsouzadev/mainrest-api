package com.dnsouzadev.data.service;

import com.dnsouzadev.data.dto.CarPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface PostAnalyticsService {

    void saveDataAnalytics(CarPostDTO carPostDTO);

}