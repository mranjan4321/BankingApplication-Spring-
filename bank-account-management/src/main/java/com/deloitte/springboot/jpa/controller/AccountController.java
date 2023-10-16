package com.deloitte.springboot.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.springboot.jpa.entity.Account;
import com.deloitte.springboot.jpa.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	private AccountService service;

	@GetMapping("/")
	public ModelAndView getHomePage(ModelAndView mView) {
		List<Account> accList = service.getAllAccount();
		mView.setViewName("viewproducts");
		mView.addObject("accList", accList);
		return mView;
	}

	@GetMapping("/showAddForm")
	public String getAddForm() 
	{
		return "index";
	}
	@GetMapping("/showAccountByCity")
	public String getAccountByCity() {
		return "cityForm";
	}
	

	@GetMapping("/back")
	public String back() {
		return "redirect:/";
	}
	@PostMapping("/updateDelAccount/{accnumber}")
	public String getUpdateForm(@PathVariable("accnumber") int acno)
	{
		service.deleteAccount(acno);
		return "updateForm";
	}

	@PostMapping("/addAccount")
	public String addAccount(@RequestParam int num, @RequestParam String name, @RequestParam String type,
			@RequestParam String ifsc, @RequestParam String branch, @RequestParam String city,
			@RequestParam String status) {
		Account prod = new Account(num, name, type, ifsc, branch, city, status);
		service.addAccount(prod);
		return "redirect:/";
	}

//	@PostMapping("/updateAccount/{accnumber}")
//	public String updateAccount(@RequestParam int num, @RequestParam String name, @RequestParam String type,
//			@RequestParam String ifsc, @RequestParam String branch, @RequestParam String city,
//			@RequestParam String status) {
//		Account prod = new Account(num, name, type, ifsc, branch, city, status);
//		service.updateAccount(prod);
//		return "redirect:/";
//	}

	@GetMapping("/deleteAccount/{accnumber}")
	public String deleteAccount(@PathVariable("accnumber") int accnumber) {
		service.deleteAccount(accnumber);
		return "redirect:/";
	}

	@GetMapping("/showActiveAccount")
	public ModelAndView getActiveAccount(ModelAndView mView)
	{
		
		List<Account> accList = (ArrayList<Account>) service.getAccountByStatus("active");
		mView.setViewName("ActiveAccount");
		mView.addObject("accList", accList);
		return mView;
		 
	}

	@GetMapping("/showInactiveAccount")
	public ModelAndView getInActiveAccount(ModelAndView mView) {
		List<Account> accList = (ArrayList<Account>) service.getAccountByStatus("inactive");
		mView.setViewName("InActiveAccount");
		mView.addObject("accList", accList);
		return mView;
		 
	}
	@GetMapping("/showSavingAccount")
	public ModelAndView getSavingAccount(ModelAndView mView) {
		List<Account> accList = (ArrayList<Account>)service.getAccountByType("saving");
		mView.setViewName("SavingAccount");
		mView.addObject("accList", accList);
		return mView;
		
	}
	@GetMapping("/cityAccount")
	public ModelAndView getAccountByCity(ModelAndView mView,@RequestParam String city) {
		List<Account> accList = (ArrayList<Account>) service.getAccountByCity(city);
		mView.setViewName("CityAccount");
		mView.addObject("accList", accList);
		return mView;
	}
	
	
	
	

}
