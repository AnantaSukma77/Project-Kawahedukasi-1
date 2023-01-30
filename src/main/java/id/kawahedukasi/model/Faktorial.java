package id.kawahedukasi.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "faktorial")
@Entity
public class Faktorial extends PanacheEntityBase {

    @Column(name = "n", nullable = false, length = 10)
    private Integer n;

    @Column(name = "faktorial", nullable = false, length = 10)
    private Integer faktorial;

    public Faktorial() {
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getFaktorial() {
        return faktorial;
    }

    public void setFaktorial(Integer faktorial) {
        this.faktorial = faktorial;
    }
}
