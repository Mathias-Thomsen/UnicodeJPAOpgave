package com.example.unicodejpaopgave.repositories;


import com.example.unicodejpaopgave.model.Unicode;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {


}
