package com.devtw.Shop.repository;

import com.devtw.Shop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    User save(User user);
//    Optional<User> findById(Long id);
//    Optional<User> findByUserId(String userId);
//
//    List<User> findAll();

}
