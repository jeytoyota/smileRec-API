package com.fiap.smileRec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.smileRec.model.Tutor;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long>{

}
