package co.simplon.ifeelsofood.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.ifeelsofood.dtos.ProductDetail;
import co.simplon.ifeelsofood.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<ProductDetail> findAllProjectedBy();

    Optional<ProductDetail> findProjectedById(Long id);

}