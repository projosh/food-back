package co.simplon.ifeelsofood.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.ifeelsofood.dtos.BrandView;
import co.simplon.ifeelsofood.entities.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

    List<BrandView> findAllProjectedBy();
}
