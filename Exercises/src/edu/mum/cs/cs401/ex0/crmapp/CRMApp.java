package edu.mum.cs.cs401.ex0.crmapp;

import java.time.LocalDate;

import edu.mum.cs.cs401.ex0.crmapp.model.Customer;

public class CRMApp {

	public static void main(String[] args) {
		
		Customer[] customer = new Customer[3];
		customer[0] = new Customer(3109128478L, "John Dean", LocalDate.of(1989, 12, 07)); 
		customer[1] = new Customer(2910019138L,"Anna Smith", LocalDate.of(1977, 1, 31));
		customer[2] = new Customer(7281100287L, "Albert Einstein", LocalDate.of(1951, 11, 18));
		
		printAllCustomers(customer);
		System.out.println();
		printEliteCustomer(customer);
			
		}
	public static void printAllCustomers(Customer[] customer) {
		for (Customer cst : customer ) {
			System.out.println(cst );
		}

	}
	
	public static void printEliteCustomer(Customer[] customer) {
		for (Customer cst : customer ) {
			if(cst.getName().startsWith("A")) {
				System.out.println(cst);
			}
		}
	}

}
