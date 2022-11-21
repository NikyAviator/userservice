package ppc.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ppc.userservice.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
