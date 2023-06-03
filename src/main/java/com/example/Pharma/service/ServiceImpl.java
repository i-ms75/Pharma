package com.example.Pharma.service;


import com.example.Pharma.entity.Medicines;
import com.example.Pharma.model.POS;
import com.example.Pharma.repository.MedicineRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.text.html.Option;
import java.util.ArrayList;
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

    List<POS> testCustom;
    public List findMed()
    {
        List<Object[]> result = medicineRepository.findAllPOS();
        List<POS> posList = new ArrayList<>();

        for (Object[] row : result) {
            POS pos = new POS();
            pos.setName((String) row[0]);
            pos.setQuantity((String) row[1]);
            pos.setRetail_Rate_Strip(String.valueOf((Integer) row[2]));
            posList.add(pos);
        }

        return posList;
    }
//        testCustom=medicineRepository.findAllPOS();
//        return testCustom;
    }






