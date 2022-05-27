package co.simplon.workspace.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import co.simplon.workspace.dtos.ProductCreate;
import co.simplon.workspace.dtos.ProductDetail;
import co.simplon.workspace.entities.Product;
import co.simplon.workspace.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<ProductDetail> findDetails() {
	return repository.findAllProjectedBy();
    }

    /* create */
    @Override
    @Transactional
    public void createProduct(ProductCreate inputs) {
	Product product = new Product();
	product.setBarCode(inputs.getBarcode());
	product.setDesignation(inputs.getDesignation());
	product.setLactose(inputs.getLactose());
	product.setGluten(inputs.getGluten());
	product.setPhotoLink(inputs.getPhotoLink());
	repository.save(product);

    }

}
