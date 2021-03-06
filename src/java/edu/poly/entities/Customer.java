package edu.poly.entities;
// Generated Oct 19, 2019 11:11:47 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Customers generated by hbm2java
 */
@Entity
@Table(name="Customers"
    ,schema="dbo"
    ,catalog="java4"
)
public class Customer  implements java.io.Serializable {


     private int customerId;
     private String name;
     private boolean gender;
     private Date dob;
     private String email;
     private String phone;
     private String satatus;
     private String password;
     private Date registeredDate;
     private Set<Cart> cartses = new HashSet<Cart>(0);

    public Customer() {
    }

	
    public Customer(int customerId, String name, boolean gender, String email, String phone, String password) {
        this.customerId = customerId;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
    public Customer(int customerId, String name, boolean gender, Date dob, String email, String phone, String satatus, String password, Date registeredDate, Set<Cart> cartses) {
       this.customerId = customerId;
       this.name = name;
       this.gender = gender;
       this.dob = dob;
       this.email = email;
       this.phone = phone;
       this.satatus = satatus;
       this.password = password;
       this.registeredDate = registeredDate;
       this.cartses = cartses;
    }
   
     @Id 

    
    @Column(name="CustomerId", unique=true, nullable=false)
    public int getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    
    @Column(name="Name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="Gender", nullable=false)
    public boolean isGender() {
        return this.gender;
    }
    
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DOB", length=10)
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }

    
    @Column(name="Email", nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="Phone", nullable=false)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="Satatus")
    public String getSatatus() {
        return this.satatus;
    }
    
    public void setSatatus(String satatus) {
        this.satatus = satatus;
    }

    
    @Column(name="Password", nullable=false, length=50)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="RegisteredDate", length=10)
    public Date getRegisteredDate() {
        return this.registeredDate;
    }
    
    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="customers")
    public Set<Cart> getCartses() {
        return this.cartses;
    }
    
    public void setCartses(Set<Cart> cartses) {
        this.cartses = cartses;
    }




}


