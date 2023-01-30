package id.kawahedukasi.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Table(name = "employee")
@Entity
public class Employee extends PanacheEntityBase {
    @Id
    @SequenceGenerator(
            name = "employeeSequence",
            sequenceName = "employee_sequence",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(generator = "employeeSequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, length = 36)
    private Integer id;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "manager_id", nullable = true, length = 5)
    private Integer manager_id;

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }
}
