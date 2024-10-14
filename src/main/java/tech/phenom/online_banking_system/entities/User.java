package tech.phenom.online_banking_system.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import tech.phenom.online_banking_system.utils.BaseEntity;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "user_email")
    private  String email;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_phone_number")
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "user_address",referencedColumnName = "id")
    private Address addresses;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
