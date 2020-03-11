package com.practice.Test1.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Test1.repository.Repository1;

@Service
public class Service1 {
	@Autowired
	Repository1 repository1;
	 
	public String add20() {
		return repository1.add20();
	}
//public String now(String s,int v) {
//	return repository1.now();
//}
	
}
