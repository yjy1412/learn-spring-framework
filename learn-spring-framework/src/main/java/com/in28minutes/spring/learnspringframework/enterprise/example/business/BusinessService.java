package com.in28minutes.spring.learnspringframework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.learnspringframework.enterprise.example.data.DataService;

@Component
public class BusinessService {

	private DataService dataService;
	
	@Autowired
	public BusinessService(DataService dataService) {
		super();
		System.out.println("Contructor Injection");
		this.dataService = dataService;
	}

//	@Autowired
//	public void setDataService(DataService dataService) {
//		System.out.println("Setter Injection");
//		this.dataService = dataService;
//	}
	
	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}
}

