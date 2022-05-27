package co.simplon.workspace.services;

import java.util.List;

import co.simplon.workspace.dtos.CategoryName;

public interface CategoryService {

    List<CategoryName> findNames();

}
