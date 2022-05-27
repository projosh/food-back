package co.simplon.workspace.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.workspace.dtos.CategoryName;
import co.simplon.workspace.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<CategoryName> findAllProjectedBy();

}
