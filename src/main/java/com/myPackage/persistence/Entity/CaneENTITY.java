package com.myPackage.persistence.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by thebous on 29/06/17.
 */

@Entity
@Table(name="cane")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CaneENTITY implements Serializable{

    @EmbeddedId
    private CaneENTITYPrimaryKey ziobello;

    @Column
    private String name;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_padrone", unique = true, nullable = true, insertable = true, updatable = true)
    private PadroneENTITY padrone;


    class CaneENTITYPrimaryKey implements Serializable{

        @Column
        private int primo;

        @Column
        private int secondo;

        @Column
        private int terzo;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof CaneENTITYPrimaryKey)) return false;

            CaneENTITYPrimaryKey that = (CaneENTITYPrimaryKey) o;

            if (primo != that.primo) return false;
            if (secondo != that.secondo) return false;
            return terzo == that.terzo;
        }

        @Override
        public int hashCode() {
            int result = primo;
            result = 31 * result + secondo;
            result = 31 * result + terzo;
            return result;
        }
    }
}
