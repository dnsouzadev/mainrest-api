package com.dnsouzadev.car.service;

import com.dnsouzadev.car.dto.OwnerPostDTO;
import com.dnsouzadev.car.entity.OwnerPostEntity;
import com.dnsouzadev.car.repository.OwnerPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostServiceImpl implements OwnerPostService {

    @Autowired
    private OwnerPostRepository ownerPostRepository;

    @Override
    public void createOwnerPost(OwnerPostDTO ownerPostDTO) {

        OwnerPostEntity ownerPost = new OwnerPostEntity();
        ownerPost.setName(ownerPostDTO.getName());
        ownerPost.setType(ownerPostDTO.getType());
        ownerPost.setContactNumber(ownerPostDTO.getContactNumber());

        ownerPostRepository.save(ownerPost);

    }
}

