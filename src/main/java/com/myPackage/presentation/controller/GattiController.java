package com.myPackage.presentation.controller;

import com.myPackage.business.GattiConverter;

import com.myPackage.persistence.RepositoryDAO.GattiDAO;
import com.myPackage.presentation.dto.GattiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by thebous on 29/06/17.
 */

@CrossOrigin("*")
@RestController
public class GattiController extends GattiConverter {

    private final GattiDAO gattiDao;


    @Autowired
    public GattiController(GattiDAO gatti) {
        this.gattiDao = gatti;
    }



    @RequestMapping(value="/insertNewGatto", method = RequestMethod.POST)
    @ResponseBody
    public void insertGatti(@RequestBody GattiDTO gatti){
        gattiDao.save(GattiConverter(gatti));
    }
}
