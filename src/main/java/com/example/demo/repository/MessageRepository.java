package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

    Optional<Message> findById(Integer id);

    Optional<List<Message>> findByUserId(Integer userId);

    Message save(Message entity);
}
