package com.example.postgresdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
