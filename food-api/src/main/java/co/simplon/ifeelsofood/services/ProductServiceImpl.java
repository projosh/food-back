package co.simplon.ifeelsofood.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import co.simplon.ifeelsofood.dtos.ProductCreate;
import co.simplon.ifeelsofood.dtos.ProductDetail;
import co.simplon.ifeelsofood.dtos.ProductUpdate;
import co.simplon.ifeelsofood.entities.Brand;
import co.simplon.ifeelsofood.entities.Category;
import co.simplon.ifeelsofood.entities.Product;
import co.simplon.ifeelsofood.repositories.BrandRepository;
import co.simplon.ifeelsofood.repositories.CategoryRepository;
import co.simplon.ifeelsofood.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository products;

    private final BrandRepository brands;

    private final CategoryRepository categories;

    public ProductServiceImpl(ProductRepository products, BrandRepository brands, CategoryRepository categories) {
	this.products = products;
	this.brands = brands;
	this.categories = categories;

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
	// brand
	Brand brand = brands.getById(inputs.getBrandId());
	product.setBrand(brand);
	// category
	Category category = categories.getById(inputs.getCategoryId());
	product.setCategory(category);
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
