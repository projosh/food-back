package co.simplon.ifeelsofood.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.ifeelsofood.dtos.CategoryView;
import co.simplon.ifeelsofood.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<CategoryView> findAllProjectedBy();

}
