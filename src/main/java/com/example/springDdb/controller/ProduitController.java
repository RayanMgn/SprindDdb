package com.example.springDdb.controller;

import com.example.springDdb.model.Produit;
import com.example.springDdb.repository.ProduitRepository;
import com.example.springDdb.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("listProduit", produitService.findAll());
        return "home";
    }

    @GetMapping("/nouveau/produit")
    public String nouveau (Model model, Produit produit){
        model.addAttribute("produit", produit);
        return "nouveau-produit";
    }

    @PostMapping("/nouveau/produit")
    public String saveForm(@ModelAttribute Produit produit){
        produitService.save(produit);
        return "redirect:/";
    }
    @GetMapping("/delete/produit/{id}")
    public String deleteProduit(@PathVariable int id){
        produitService.deleteById(id);
        return "redirect:/";
    }

    //@GetMapping("/update/produit/{id}")
    //public String updateProduit(Model model, int id){
    //    Produit produit = produitService.findById(id);
    //    model.addAttribute("produit", produit);
    //    return "update-produit";
    //}
}
