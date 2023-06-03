package com.example.Pharma.repository;


import com.example.Pharma.entity.Medicines;
import com.example.Pharma.model.POS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedicineRepository extends JpaRepository<Medicines, Integer>
{

    List findAll();
    @Query("SELECT m.Name AS name, m.Quantity AS quantity, m.Retail_Rate_Strip AS retailRateStrip FROM Medicines m")
    List<Object[]> findAllPOS();



//    @Query("SELECT m FROM Medicine m WHERE m.Name = :name")
//    List<Medicines> findByName(@Param("name") String name);

//Optional<Medicines> findByName(String Name);
}
