package com.example.Pharma.service;

import com.example.Pharma.entity.Medicines;
import com.example.Pharma.repository.MedicineRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ServiceImpl
{
    @Autowired
    MedicineRepository medicineRepository;
    List<Medicines> medicinesReturns;
   // medicines=medicineRepository.findAll();
    public List findAllMedicines()
    {
        medicinesReturns=medicineRepository.findAll();
        return medicinesReturns;
    }

}
