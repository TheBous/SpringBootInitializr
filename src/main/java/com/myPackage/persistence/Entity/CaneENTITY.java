package com.myPackage.persistence.Entity;

import javax.persistence.*;

/**
 * Created by thebous on 29/06/17.
 */
@IdClass(CaneENTITY.CaneENTITYPrimaryKey.class)
public class CaneENTITY {

    @EmbeddedId
    private CaneENTITYPrimaryKey id;


    @Column
    private String name;


    class CaneENTITYPrimaryKey {
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int primo;

        @GeneratedValue(strategy = GenerationType.AUTO)
        private int secondo;

        @GeneratedValue(strategy = GenerationType.AUTO)
        private int terzo;

    }
}
