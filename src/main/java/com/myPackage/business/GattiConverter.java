package com.myPackage.business;

import com.myPackage.persistence.Entity.AmiciENTITY;
import com.myPackage.persistence.Entity.GattiENTITY;
import com.myPackage.presentation.dto.GattiDTO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by thebous on 29/06/17.
 */
public class GattiConverter {


    public static GattiENTITY GattiConverter(GattiDTO gatti){
        GattiENTITY gattiEntity = new GattiENTITY();
        gattiEntity.setId(gatti.getId());
        gattiEntity.setName(gatti.getName());
        gattiEntity.setAge(gatti.getAge());
        return gattiEntity;
    }
}
