package net.codejava.customer;
 
import javax.persistence.*;

@Entity
@SequenceGenerator(name="sessionInfoIdSeq", sequenceName="SQ_CUSTOMER", initialValue = 1, allocationSize = 1)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="sessionInfoIdSeq")
    private Long id;
 
    private String name;
    private String email;
    private String address;
 
    protected Customer() {
    }
 
    protected Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}