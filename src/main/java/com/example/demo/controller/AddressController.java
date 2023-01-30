package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Repository.AddressRepository;

@Controller
public class AddressController {
 @Autowired
 AddressRepository addressRepository;
 @GetMapping("/adresses")
 public String showAddresses(Model model) {
 model.addAttribute("allAddresses", addressRepository.findAll());
 return "addresses";
 }
 
 @GetMapping("/adresse")
 public String showAddressForm() {
   return "adresse";
 }
}