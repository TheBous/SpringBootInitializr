package com.myPackage.persistence.Entity;


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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column
    private String Name;


    @Column
    private String Surname;

}
