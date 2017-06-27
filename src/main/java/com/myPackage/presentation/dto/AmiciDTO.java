package com.myPackage.presentation.dto;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by thebous on 27/06/17.
 */
@Getter @Setter @Builder
public class AmiciDTO {


    private Integer id;

    private String Name;

    private String Surname;

}
