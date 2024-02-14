package com.smartmanufacturing.update.repository;


import com.smartmanufacturing.update.model.Role;
import com.smartmanufacturing.update.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
