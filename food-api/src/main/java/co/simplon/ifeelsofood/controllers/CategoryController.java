package co.simplon.ifeelsofood.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ifeelsofood.dtos.CategoryView;
import co.simplon.ifeelsofood.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
	this.service = service;

    }

    @GetMapping("/names")
    public List<CategoryView> names() {
	return service.findNames();
    }

}
