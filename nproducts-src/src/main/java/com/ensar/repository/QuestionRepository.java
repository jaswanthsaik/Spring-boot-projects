package com.ensar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensar.models.Question;
import com.ensar.models.User;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
  
}
