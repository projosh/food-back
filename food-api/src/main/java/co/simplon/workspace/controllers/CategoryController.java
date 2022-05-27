package co.simplon.workspace.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.workspace.dtos.CategoryName;
import co.simplon.workspace.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
	this.service = service;

    }

    @GetMapping("/names")
    public List<CategoryName> names() {
	return service.findNames();
    }

}
