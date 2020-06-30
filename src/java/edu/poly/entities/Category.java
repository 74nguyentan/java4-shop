package edu.poly.entities;
// Generated Oct 19, 2019 11:11:47 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categories generated by hbm2java
 */
@Entity
@Table(name="Categories"
    ,schema="dbo"
    ,catalog="java4"
)
public class Category  implements java.io.Serializable {


     private int categoryId;
     private String name;
     private Set<Product> productses = new HashSet<Product>(0);

    public Category() {
    }

	
    public Category(int categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }
    public Category(int categoryId, String name, Set<Product> productses) {
       this.categoryId = categoryId;
       this.name = name;
       this.productses = productses;
    }
   
     @Id 

    
    @Column(name="CategoryId", unique=true, nullable=false)
    public int getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    
    @Column(name="Name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="categories")
    public Set<Product> getProductses() {
        return this.productses;
    }
    
    public void setProductses(Set<Product> productses) {
        this.productses = productses;
    }




}


