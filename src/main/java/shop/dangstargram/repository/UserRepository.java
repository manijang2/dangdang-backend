package shop.dangstargram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.dangstargram.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(String id);
}

