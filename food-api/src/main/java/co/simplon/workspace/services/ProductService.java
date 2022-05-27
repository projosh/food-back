
package co.simplon.workspace.services;

import java.util.List;

import co.simplon.workspace.dtos.ProductCreate;
import co.simplon.workspace.dtos.ProductDetail;

public interface ProductService {

    List<ProductDetail> findDetails();

    void createProduct(ProductCreate product);

}
