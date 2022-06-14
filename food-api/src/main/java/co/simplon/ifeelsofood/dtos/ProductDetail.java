package co.simplon.ifeelsofood.dtos;

public interface ProductDetail {
    Long getId();

    String getBarCode();

    String getDesignation();

    Boolean getGluten();

    Boolean getLactose();

    String getPhotoLink();

}
