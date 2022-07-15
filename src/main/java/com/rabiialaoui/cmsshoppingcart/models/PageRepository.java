package com.rabiialaoui.cmsshoppingcart.models;

import java.util.List;

import com.rabiialaoui.cmsshoppingcart.models.data.Page;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PageRepository extends JpaRepository<Page, Integer>{
    
    Page findBySlug(String slug);
    
    Page findBySlugAndIdNot(String slug, int id);

    List<Page> findAllByOrderBySortingAsc();

}