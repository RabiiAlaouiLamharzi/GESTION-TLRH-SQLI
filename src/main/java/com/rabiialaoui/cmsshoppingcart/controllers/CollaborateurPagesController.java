package com.rabiialaoui.cmsshoppingcart.controllers;

import java.util.List;

import javax.validation.Valid;

import com.rabiialaoui.cmsshoppingcart.models.PageRepository;
import com.rabiialaoui.cmsshoppingcart.models.data.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/gestion/collaborateur")
public class CollaborateurPagesController {

    @Autowired
    private PageRepository pageRepo;

    @GetMapping
    public String index(Model model){

        List<Page> pages = pageRepo.findAllByOrderBySortingAsc();
        model.addAttribute("pages", pages);

        return "gestion/collaborateur/index";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute Page page) {
        return "gestion/collaborateur/add";
    }

    @PostMapping("/add")
    public String add(@Valid Page page, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if(bindingResult.hasErrors()){
            return "gestion/collaborateur/add";
        }
        redirectAttributes.addFlashAttribute("message", "Collaborateur Ajouté");
        redirectAttributes.addFlashAttribute("alertClass", "alert alert-success");
        page.setSorting(100);
        pageRepo.save(page);
        return "redirect:/gestion/collaborateur/add";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {

        Page page = pageRepo.getOne(id);

        model.addAttribute("page", page);

        return "gestion/collaborateur/edit";
        
    }

    @PostMapping("/edit")
    public String edit(@Valid Page page, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {

        Page pageCurrent = pageRepo.getOne(page.getMatricule());

        if (bindingResult.hasErrors()) {
            model.addAttribute("pageTitle", pageCurrent.getNom());
            return "gestion/collaborateur/edit";
        }

        redirectAttributes.addFlashAttribute("message", "Collaborateur Modifié");
        redirectAttributes.addFlashAttribute("alertClass", "alert alert-success");

        pageRepo.save(page);
        return "redirect:/gestion/collaborateur/edit/" + page.getMatricule();
    }

    @GetMapping("/delete/{id}")
    public String edit(@PathVariable int id, RedirectAttributes redirectAttributes) {

        pageRepo.deleteById(id);

        redirectAttributes.addFlashAttribute("message", "Collaborateur Supprimé");
        redirectAttributes.addFlashAttribute("alertClass", "alert alert-success");

        return "redirect:/gestion/collaborateur";
        
    }

}