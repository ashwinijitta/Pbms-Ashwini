package com.capg.pecunia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pecunia.entity.Passbook;
import com.capg.pecunia.service.IPassbookService;

@RestController
@RequestMapping("/pbms")
public class PassbookController {

	@Autowired
	IPassbookService service;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * @PostMapping("/add") public String addAccount(@RequestBody Passbook passbook)
	 * {
	 * 
	 * service.addAccount(passbook); return "Account added Succesfully"; }
	 * 
	 * @GetMapping("/get") public String getPassbookById(@RequestBody long id) {
	 * 
	 * service.getPassbookById(id); return "Account find Succesfully"; }
	 * 
	 * @PutMapping("/update") public String updatePassbook(@RequestBody Passbook
	 * account) {
	 * 
	 * service.updatePassbook(account); return "Account Updated Succesfully"; }
	 */

}
