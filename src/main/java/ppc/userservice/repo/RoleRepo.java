package ppc.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ppc.userservice.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
