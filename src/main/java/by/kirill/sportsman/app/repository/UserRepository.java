package by.kirill.sportsman.app.repository;

import by.kirill.sportsman.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
