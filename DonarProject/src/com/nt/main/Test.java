package com.nt.main;

import java.util.Scanner;

import com.nt.Bean.Donar;
import com.nt.service.DonarService;

public class Test {
	
	
	public static void main(String[] args) {
          DonarService ds=new DonarService();
          Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enter 1 add donar");
			System.out.println("enter 2 for get donar");
			int n=sc.nextInt();
			
			
			switch(n) {
			case 1:
				Donar d=new Donar();
				System.out.println("enter the donar id");
				d.setDid(sc.nextInt());
				System.out.println("enter the donar name");
				d.setDname(sc.next());
				System.out.println("enter the donar blood group");
				d.setDname(sc.next());System.out.println("enter the donar phoneNumber ");
				d.setDname(sc.next());
				
				ds.addDonar(d);
				break;
			case 2:
				System.out.println("enter the donar id");
				int id=sc.nextInt();
						ds.getDonar(id);
						break;
				
			}
		}
	}

}
