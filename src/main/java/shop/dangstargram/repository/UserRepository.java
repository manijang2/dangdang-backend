package shop.dangstargram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.dangstargram.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

