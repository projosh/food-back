package co.simplon.ifeelsofood.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.ifeelsofood.dtos.BrandView;
import co.simplon.ifeelsofood.repositories.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository repository;

    public BrandServiceImpl(BrandRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<BrandView> findNames() {
	return repository.findAllProjectedBy();
    }
}
