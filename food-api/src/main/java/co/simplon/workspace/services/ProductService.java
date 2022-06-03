
package co.simplon.workspace.services;

import java.util.List;

import co.simplon.workspace.dtos.ProductCreate;
import co.simplon.workspace.dtos.ProductDetail;
import co.simplon.workspace.dtos.ProductUpdate;

public interface ProductService {

    List<ProductDetail> findDetails();

    ProductDetail findById(Long id);

    void create(ProductCreate inputs);

    void update(Long id, ProductUpdate inputs);

    void delete(Long id);

}
