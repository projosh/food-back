package co.simplon.ifeelsofood.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ifeelsofood.dtos.BrandView;
import co.simplon.ifeelsofood.services.BrandService;

@RestController
@RequestMapping("/brands")
public class BrandController {

    private final BrandService service;

    public BrandController(BrandService service) {
	this.service = service;
    }

    @GetMapping("/names")
    public List<BrandView> names() {
	return service.findNames();
    }
}
