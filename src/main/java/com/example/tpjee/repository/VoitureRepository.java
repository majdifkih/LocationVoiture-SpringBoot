package com.example.tpjee.repository;

import com.example.tpjee.Entity.Client;
import com.example.tpjee.Entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Long>{

}
