package com.deloitte.springboot.jpa.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.springboot.jpa.entity.Account;
import com.deloitte.springboot.jpa.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository repository;

	public void addAccount(Account aobj) {
		repository.save(aobj);
	}

	public void updateAccount(Account prod) {
		if(getAccountByNumber(prod.getAccnumber())!=null)
		repository.save(prod);
	}

	public void deleteAccount(int accnum) {
		if(getAccountByNumber(accnum)!=null)
		repository.delete(getAccountByNumber(accnum));
	}

	public List<Account> getAllAccount() {
		return repository.findAll();
	}

	public Account getAccountByNumber(int id) {
		return repository.findById(id).get();

	}

	public ArrayList<Account> getAccountByStatus(String status) {

		List<Account> account = repository.findAll();
		List<Account> stsacc = new ArrayList<Account>();
		Iterator<Account> iterator = account.iterator();
		for (; iterator.hasNext();) {
			Account account2 = iterator.next();
			if (account2.getAccstatus().equalsIgnoreCase(status)) {
				stsacc.add(account2);
			}

		}
		return (ArrayList<Account>) stsacc;

	}

	public ArrayList<Account> getAccountByType(String type) {
		List<Account> account = repository.findAll();
		List<Account> stsacc = new ArrayList<Account>();
		Iterator<Account> iterator = account.iterator();
		for (; iterator.hasNext();) {
			Account account2 = iterator.next();
			if (account2.getAcctype().equalsIgnoreCase(type)) {
				stsacc.add(account2);
			}

		}
		return (ArrayList<Account>) stsacc;
	}

	public ArrayList<Account> getAccountByCity(String city) {
		List<Account> account = repository.findAll();
		List<Account> stsacc = new ArrayList<Account>();
		Iterator<Account> iterator = account.iterator();
		for (; iterator.hasNext();) {
			Account account2 = iterator.next();
			if (account2.getAcccity().equalsIgnoreCase(city)) {
				stsacc.add(account2);
			}

		}
		return (ArrayList<Account>) stsacc;
	}
	

}
