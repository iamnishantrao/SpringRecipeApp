package org.example.springrecipeapp.repositories;

import org.example.springrecipeapp.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
