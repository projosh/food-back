package co.simplon.workspace.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.workspace.dtos.BrandName;
import co.simplon.workspace.services.BrandService;

@RestController
@RequestMapping("/brands")
public class BrandController {

    private final BrandService service;

    public BrandController(BrandService service) {
	this.service = service;
    }

    @GetMapping("/names")
    public List<BrandName> names() {
	return service.findNames();
    }
}
