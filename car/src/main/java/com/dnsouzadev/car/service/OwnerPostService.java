package com.dnsouzadev.car.service;

import com.dnsouzadev.car.dto.OwnerPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface OwnerPostService {

    void createOwnerPost(OwnerPostDTO ownerPostDTO);

}
