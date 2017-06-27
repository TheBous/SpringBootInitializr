package com.myPackage.persistence.Entity;


import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

import javax.persistence.*;

/**
 * Created by thebous on 26/06/17.
 */

@Entity
@Table(name = "Amici")
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class AmiciENTITY {

    @Id
    private Integer Id;

    @Column
    private String Name;


    @Column
    private String Surname;


}
