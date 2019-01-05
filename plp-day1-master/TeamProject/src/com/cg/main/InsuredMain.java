package com.cg.main;

import java.util.Scanner;

import com.cg.service.IInsuranceService;
import com.cg.service.InsuranceServiceImpl;

public class InsuredMain {

	static Scanner sc = new Scanner(System.in);
	static IInsuranceService insuranceservice = null;
	static InsuranceServiceImpl insuranceserviceimpl = null;

	@SuppressWarnings("unused")
	public void user() {
		insuranceservice = new InsuranceServiceImpl();
		// Get the username from login screen
		String username = insuranceservice.accountCreation("well");
		// int option=0;
		if (username == null) {
			System.out.println("1.Account creation");
			System.out.println("2.View Policy");
			System.out.println("Enter the choice");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				accountCreation();
				break;
			case 2:
				viewPolicy();
			default:
				break;
			}
		} else if (username != null) {
			System.out.println("1.view policy");
		} else {
			System.out.println("enter correct credentials");
		}
	}

	public static void accountCreation() {
		System.out.println("Enter the Insured Name ");
		String insuredName = sc.next();
		System.out.println("Enter the Insured Street ");
		String insuredStreet = sc.next();
		System.out.println("Enter the Insured City ");
		String insuredCity = sc.next();
		System.out.println("Enter the Insured State ");
		String insuredState = sc.next();
		System.out.println("Enter the Insured Zip ");
		String insuredZip = sc.next();
		System.out.println("Enter the Business Segment ");
		System.out.println("-----------------------------------");
		// String businessSegment=sc.next();
		System.out.println("select u r business segment");
		System.out.println("1.health insurance");
		System.out.println("2.business insurance");
		int bs = sc.nextInt();
		switch (bs) {
		case 1:
			System.out.println("health insurance");

			break;
		case 2:
			System.out.println("business insurance");

			break;

		default:
			System.out.println("select valid insurance");
			break;
		}
	}

	public static void viewPolicy() {

		insuranceservice=new InsuranceServiceImpl();
		System.out.println("enter the account number");
		System.out.println(insuranceservice.viewPolicy());
	}

	public static void main(String[] args) {
		InsuredMain in = new InsuredMain();
		in.user();
	}
}
