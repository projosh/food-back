package co.simplon.workspace.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.workspace.dtos.ProductCreate;
import co.simplon.workspace.dtos.ProductDetail;
import co.simplon.workspace.services.ProductService;

@RestController
@RequestMapping("/products")

public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
	this.service = service;
    }

    @GetMapping("/details")
    public List<ProductDetail> findDetails() {
	return service.findDetails();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductCreate product) {
	service.createProduct(product);
    }
}
