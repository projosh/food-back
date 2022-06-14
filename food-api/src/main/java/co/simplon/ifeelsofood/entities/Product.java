package co.simplon.ifeelsofood.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "barcode")
    private String barCode;

    @Column(name = "designation")
    private String designation;

    @Column(name = "lactose")
    private Boolean lactose;

    @Column(name = "gluten")
    private Boolean gluten;

    @Column(name = "photo_link")
    private String photoLink;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    public Category getCategory() {
	return category;
    }

    public void setCategory(Category categoryId) {
	this.category = categoryId;
    }

    public Brand getBrand() {
	return brand;
    }

    public void setBrand(Brand brandId) {
	this.brand = brandId;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Product() {

	//
    }

    public String getBarCode() {
	return barCode;
    }

    public void setBarCode(String barCode) {
	this.barCode = barCode;
    }

    public String getDesignation() {
	return designation;
    }

    public void setDesignation(String designation) {
	this.designation = designation;
    }

    public Boolean getLactose() {
	return lactose;
    }

    public void setLactose(Boolean lactose) {
	this.lactose = lactose;
    }

    public Boolean getGluten() {
	return gluten;
    }

    public void setGluten(Boolean gluten) {
	this.gluten = gluten;
    }

    public String getPhotoLink() {
	return photoLink;
    }

    public void setPhotoLink(String photoLink) {
	this.photoLink = photoLink;
    }

    public Long getId() {
	return id;
    }

    @Override
    public String toString() {
	return "Product [id=" + id + ", barCode=" + barCode + ", designation=" + designation + ", lactose=" + lactose
		+ ", gluten=" + gluten + ", photoLink=" + photoLink + ", categoryId=" + category + ", brandId=" + brand
		+ "]";
    }

}
