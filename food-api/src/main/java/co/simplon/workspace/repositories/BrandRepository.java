package co.simplon.workspace.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.workspace.dtos.BrandName;
import co.simplon.workspace.entities.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

    List<BrandName> findAllProjectedBy();
}
