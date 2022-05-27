package co.simplon.workspace.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.workspace.dtos.BrandName;
import co.simplon.workspace.repositories.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository repository;

    public BrandServiceImpl(BrandRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<BrandName> findNames() {
	return repository.findAllProjectedBy();
    }
}
