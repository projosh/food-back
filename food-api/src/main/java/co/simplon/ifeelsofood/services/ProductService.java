
package co.simplon.ifeelsofood.services;

import java.util.List;

import co.simplon.ifeelsofood.dtos.ProductCreate;
import co.simplon.ifeelsofood.dtos.ProductDetail;
import co.simplon.ifeelsofood.dtos.ProductUpdate;

public interface ProductService {

    List<ProductDetail> findDetails();

    ProductDetail findById(Long id);

    void create(ProductCreate inputs);

    void update(Long id, ProductUpdate inputs);

    void delete(Long id);

}
