package co.simplon.ifeelsofood.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.ifeelsofood.dtos.CategoryView;
import co.simplon.ifeelsofood.repositories.CategoryRepository;

@Service
public class CategoryserviceImpl implements CategoryService {

    private final CategoryRepository repository;

    public CategoryserviceImpl(CategoryRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<CategoryView> findNames() {
	return repository.findAllProjectedBy();

    }

}
