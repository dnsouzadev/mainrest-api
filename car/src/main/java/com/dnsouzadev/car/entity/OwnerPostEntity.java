package com.dnsouzadev.car.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "owner_post")
@Data
@NoArgsConstructor
public class OwnerPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @Column(name = "owner_type")
    private String type;

    @Column(name = "owner_contact")
    private String contactNumber;


}
