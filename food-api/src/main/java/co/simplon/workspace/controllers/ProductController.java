package co.simplon.workspace.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.workspace.dtos.ProductCreate;
import co.simplon.workspace.dtos.ProductDetail;
import co.simplon.workspace.dtos.ProductUpdate;
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

    @GetMapping("/{id}")
    public ProductDetail findById(@PathVariable("id") Long id) {
	return service.findById(id);
    }

    /* create */

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody ProductCreate product) {
	service.create(product);
    }

    /* update */

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody ProductUpdate inputs) {
	service.update(id, inputs);
    }

    /* Delete */

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }

}
