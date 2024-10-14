package tech.phenom.online_banking_system.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="user_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String street;

    private  String village;

    private  String post;

    @Column(name = "sub_district")
    private  String  subDistrict;

    @Column(nullable = false)
    private String  district;

    @Column(name = "pin_code",nullable = false)
    private String pincode;

    @Column(nullable = false)
    private String  state;
}
