package eformer.back.eformer_backend.repository;

import eformer.back.eformer_backend.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findUserByUserId(Integer userId);

    Optional<User> findUserByUsername(String username);

    boolean existsByUsernameAndPassword(String username, String password);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);

    List<User> findAllByCreateTimeAfter(Date date);

    List<User> findAllByCreateTimeBefore(Date date);
}
