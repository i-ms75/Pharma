package com.example.Pharma.repository;

import com.example.Pharma.entity.Medicines;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicineRepository extends JpaRepository<Medicines, Integer>
{
    List findAll();
}
