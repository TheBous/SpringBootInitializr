package com.myPackage.persistence.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by thebous on 29/06/17.
 */
@Entity
@Table(name = "padrone")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PadroneENTITY implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
