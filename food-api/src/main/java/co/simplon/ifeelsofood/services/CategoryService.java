package co.simplon.ifeelsofood.services;

import java.util.List;

import co.simplon.ifeelsofood.dtos.CategoryView;

public interface CategoryService {

    List<CategoryView> findNames();

}
