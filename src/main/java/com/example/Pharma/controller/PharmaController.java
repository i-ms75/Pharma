package com.example.Pharma.controller;

import com.example.Pharma.entity.Medicines;
import com.example.Pharma.model.MedicineEntry;
import com.example.Pharma.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PharmaController
{
    @Autowired
    ServiceImpl medicineService;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String Index()
    {
        return "index";
    }
    @CrossOrigin(value = "http://localhost:4200")
    @RequestMapping(value = "/searchMedicines",method = RequestMethod.GET)
    public ResponseEntity<String> searchCompanyByNameAndID(/*@RequestBody MedicineEntry medicineEntry*/)
    {
        MedicineEntry md=new MedicineEntry();

        ResponseEntity<String> responseEntity;
        List<Medicines> medicinesList;
        medicinesList=medicineService.findAllMedicines();
        System.out.println(medicinesList);

        responseEntity=new ResponseEntity(medicinesList, HttpStatus.OK);
        return responseEntity;
    }



  /*  public ResponseEntity<String> searchCompanyByNameAndID(@RequestBody Incoming incoming)
    {
        // System.out.println(incoming.getCompanyID()+incoming.getCompanyName()+incoming.getOffset()+incoming.getPageSize());
        Integer offset=incoming.getOffset();
        Integer pageSize=incoming.getPageSize();
        Company companyDetails = new Company();
        companyDetails.setCompanyID(incoming.getCompanyID().strip());
        companyDetails.setCompanyName(incoming.getCompanyName());
        if (pageSize!=null && offset!=null)
        {
            Page<Company> searchCompanyDetails=ecmictService.searchCompanyDetailsPagenated(companyDetails,offset,pageSize);
            List<Company> companyList=searchCompanyDetails.getContent();

            System.out.println("the company list is:"+companyList);

            // System.out.println(ecmictService.getTotalCount(companyDetails));
            ResponseEntity<String> responseEntity ;
            CompanyDataWithCount cdwc=new CompanyDataWithCount();
            cdwc.setCompanySearchResultList(companyList);
            cdwc.setTotalCount(searchCompanyDetails.getTotalElements());
            // System.out.println(cdwc.getTotalCount()+" frm page");
            CompanySearchResult musi=new CompanySearchResult();
            // musi.companyID;
            musi.setCompanyID("I love you my musi");

            responseEntity=new ResponseEntity(cdwc, HttpStatus.OK);
            return responseEntity;

        }

   */
}
