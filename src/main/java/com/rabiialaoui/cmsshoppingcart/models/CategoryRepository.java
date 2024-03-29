package com.rabiialaoui.cmsshoppingcart.models;

import java.util.List;

import com.rabiialaoui.cmsshoppingcart.models.data.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByName(String name);

    List<Category> findAllByOrderBySortingAsc();

    Category findBySlug(String slug);
    
}
