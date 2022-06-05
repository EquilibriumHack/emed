package com.juniper.emed.repository;


import com.juniper.emed.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Set;

@Repository
public interface RoleRepository extends JpaRepository<Roles,Long> {

    Set<Roles> findAllByName(String name);

}
