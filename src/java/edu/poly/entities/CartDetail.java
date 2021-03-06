package edu.poly.entities;
// Generated Oct 19, 2019 11:11:47 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CartDetails generated by hbm2java
 */
@Entity
@Table(name="CartDetails"
    ,schema="dbo"
    ,catalog="java4"
)
public class CartDetail  implements java.io.Serializable {


     private int cartDetailId;
     private Cart carts;
     private Product products;
     private Integer quantity;
     private double price;
     private String note;

    public CartDetail() {
    }

	
    public CartDetail(int cartDetailId, Cart carts, Product products, double price) {
        this.cartDetailId = cartDetailId;
        this.carts = carts;
        this.products = products;
        this.price = price;
    }
    public CartDetail(int cartDetailId, Cart carts, Product products, Integer quantity, double price, String note) {
       this.cartDetailId = cartDetailId;
       this.carts = carts;
       this.products = products;
       this.quantity = quantity;
       this.price = price;
       this.note = note;
    }
   
     @Id 

    
    @Column(name="CartDetailId", unique=true, nullable=false)
    public int getCartDetailId() {
        return this.cartDetailId;
    }
    
    public void setCartDetailId(int cartDetailId) {
        this.cartDetailId = cartDetailId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cartId", nullable=false)
    public Cart getCarts() {
        return this.carts;
    }
    
    public void setCarts(Cart carts) {
        this.carts = carts;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ProductId", nullable=false)
    public Product getProducts() {
        return this.products;
    }
    
    public void setProducts(Product products) {
        this.products = products;
    }

    
    @Column(name="Quantity")
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
    @Column(name="Price", nullable=false, precision=53, scale=0)
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    
    @Column(name="Note")
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


