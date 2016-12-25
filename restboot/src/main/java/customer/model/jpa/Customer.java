package customer.model.jpa;

import lombok.Builder;

import javax.persistence.*;

/**
 * Created by Filip Burlaga on 2016-12-25.
 */
@Entity
@Table(name = "CUSTOMER")
@SequenceGenerator(name = "customerIdGenerator", sequenceName = "SEQ_CUSTOMER", allocationSize = 1)
public class Customer {

    @Id
    @GeneratedValue(generator = "customerIdGenerator")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
