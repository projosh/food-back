package co.simplon.workspace.dtos;

public class ProductCreate {

    private String barcode;

    private String designation;

    private Boolean lactose;

    private Boolean gluten;

    private String photoLink;

    public ProductCreate() {
	super();

    }

    public String getBarcode() {
	return barcode;
    }

    public void setBarcode(String barcode) {
	this.barcode = barcode;
    }

    public String getDesignation() {
	return designation;
    }

    public void setDesignation(String designation) {
	this.designation = designation;
    }

    public String getPhotoLink() {
	return photoLink;
    }

    public void setPhotoLink(String photoLink) {
	this.photoLink = photoLink;
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
}
