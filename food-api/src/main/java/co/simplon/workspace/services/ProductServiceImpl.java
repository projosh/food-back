package co.simplon.workspace.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import co.simplon.workspace.dtos.ProductCreate;
import co.simplon.workspace.dtos.ProductDetail;
import co.simplon.workspace.dtos.ProductUpdate;
import co.simplon.workspace.entities.Product;
import co.simplon.workspace.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository products;

    public ProductServiceImpl(ProductRepository products) {
	this.products = products;

    }

    @Override
    public List<ProductDetail> findDetails() {
	return products.findAllProjectedBy();
    }

    /* create */
    @Override
    @Transactional
    public void create(ProductCreate inputs) {
	Product product = new Product();
	product.setBarCode(inputs.getBarcode());
	product.setDesignation(inputs.getDesignation());
	product.setLactose(inputs.getLactose());
	product.setGluten(inputs.getGluten());
	product.setPhotoLink(inputs.getPhotoLink());
	products.save(product);

    }

    /* update */
    @Transactional
    @Override
    public void update(Long id, ProductUpdate inputs) {
	Product product = products.findById(id).get();
	product.setBarCode(inputs.getBarcode());
	product.setDesignation(inputs.getDesignation());
	product.setLactose(inputs.getLactose());
	product.setGluten(inputs.getGluten());
	product.setPhotoLink(inputs.getPhotoLink());
	products.save(product);

    }

    @Override
    public ProductDetail findById(Long id) {
	return products.findProjectedById(id).get();

    }

    @Transactional
    @Override
    public void delete(Long id) {
	products.deleteById(id);
    }

}
