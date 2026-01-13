package com.example.springDdb.service;

import com.example.springDdb.model.Produit;
import com.example.springDdb.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    public Produit findById (int id){
        return produitRepository.findById(id).get();
    }

    public void deleteById(int id){
        produitRepository.deleteById(id);
    }
}
