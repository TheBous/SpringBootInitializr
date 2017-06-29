package com.myPackage.business.Converter;

import com.myPackage.persistence.Entity.GattiENTITY;
import com.myPackage.presentation.dto.GattiDTO;

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
