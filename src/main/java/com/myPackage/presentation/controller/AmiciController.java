package com.myPackage.presentation.controller;

/**
 * Created by thebous on 27/06/17.
 */

import com.myPackage.persistence.Entity.AmiciENTITY;
import com.myPackage.persistence.RepositoryDAO.AmiciDAO;
import com.myPackage.presentation.dto.AmiciDTO;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin("*")
@RestController
public class AmiciController
{
    public AmiciDAO repo;

    @Autowired
    public AmiciController(AmiciDAO daoAmici) {
        this.repo = daoAmici;
    }

    @RequestMapping(value = "/demo", method = RequestMethod.POST)
    public void getIndex(@RequestBody AmiciDTO amici){
        repo.save(AmiciENTITY.builder().id(amici.getId()).name(amici.getName()).surname(amici.getSurname()).build());
    }

    @RequestMapping(value = "/findAmici", method = RequestMethod.POST)
    public List<AmiciENTITY> findAmiciEntities(){
        return (List<AmiciENTITY>) this.repo.findAll();
    }


    @RequestMapping(value = "/findAmiciByName", method = RequestMethod.GET)
    @ResponseBody
    public List<AmiciENTITY> findAmiciByName(@RequestParam String name){
        return this.repo.findAmiciEntitiesByName(name);
    }

}