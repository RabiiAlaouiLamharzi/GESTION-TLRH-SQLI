package com.rabiialaoui.cmsshoppingcart.controllers;

import java.util.List;

import com.rabiialaoui.cmsshoppingcart.models.PageRepository;
import com.rabiialaoui.cmsshoppingcart.models.data.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {

    @GetMapping
    public String index(Model model){

        return "admin/pages/index";
    }
}