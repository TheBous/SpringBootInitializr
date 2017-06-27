package com.myPackage.presentation.controller;

/**
 * Created by thebous on 27/06/17.
 */

import com.myPackage.persistence.Entity.AmiciENTITY;
import com.myPackage.persistence.RepositoryDAO.AmiciDAO;
import com.myPackage.presentation.dto.AmiciDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
public class AmiciController
{
    @Autowired
    public AmiciDAO repo;

    @RequestMapping(value = "/demo", method = RequestMethod.POST)
    public AmiciDTO getIndex(@RequestBody AmiciDTO amici){

        repo.save(AmiciENTITY.builder().Id(amici.getId()).Name(amici.getName()).Surname(amici.getSurname()).build());
        return amici;
    }
}