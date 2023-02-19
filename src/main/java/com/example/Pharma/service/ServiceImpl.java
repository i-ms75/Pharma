package com.example.Pharma.service;


import com.example.Pharma.entity.Medicines;
import com.example.Pharma.repository.MedicineRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ServiceImpl
{
    @Autowired
    MedicineRepository medicineRepository;

    List<Medicines> medicinesReturns;
    public List findAllMedicines()
    {
        medicinesReturns=medicineRepository.findAll();
        return medicinesReturns;
    }






}
