package co.simplon.workspace.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.workspace.dtos.CategoryName;
import co.simplon.workspace.repositories.CategoryRepository;

@Service
public class CategoryserviceImpl implements CategoryService {

    private final CategoryRepository repository;

    public CategoryserviceImpl(CategoryRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<CategoryName> findNames() {
	return repository.findAllProjectedBy();

    }

}
