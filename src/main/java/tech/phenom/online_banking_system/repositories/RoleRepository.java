package tech.phenom.online_banking_system.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import tech.phenom.online_banking_system.entities.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
