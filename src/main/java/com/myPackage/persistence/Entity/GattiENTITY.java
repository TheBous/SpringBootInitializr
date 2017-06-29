package com.myPackage.persistence.Entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by thebous on 29/06/17.
 */
@Entity
@Table(name = "gatti")
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class GattiENTITY {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nickname")
    private String name;

    @Column
    private int age;

}
