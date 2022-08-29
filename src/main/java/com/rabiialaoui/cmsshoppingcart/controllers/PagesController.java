package com.rabiialaoui.cmsshoppingcart.controllers;

import com.rabiialaoui.cmsshoppingcart.models.PageRepository;
import com.rabiialaoui.cmsshoppingcart.models.data.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PagesController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
}
