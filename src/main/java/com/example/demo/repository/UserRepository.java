package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findById(Integer id);

//  @Query("SELECT user FROM User user LEFT JOIN FETCH user.messages")
//  @EntityGraph(attributePaths = {"messages"})
    List<User> findAll();

    User save(User entity);
}
