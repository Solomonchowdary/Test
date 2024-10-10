package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.Bean.Donar;

public class DonarService {
	List<Donar> l=new ArrayList<>();
	
	public void addDonar(Donar donar) {
		l.add(donar);
		
	}
	public void deleteDonar(Donar donar) {
		l.stream().filter(d->{
			if(d.getDid()==donar.getDid()) {
				l.remove(d);
				return true;
				
		}
			return true;
		
		});
		
		
		
		
		
		for(Donar d:l) {
			if(d.getDid()==donar.getDid()) {
				l.remove(d);
			}
		}
		
	}
	
	
	public void getDonar(int id) {
		l.stream().filter(a->a.getDid()==id).forEach(System.out::println);
		
	}

}
