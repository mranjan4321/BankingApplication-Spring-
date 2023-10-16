package com.deloitte.springboot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.springboot.jpa.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
	

}
