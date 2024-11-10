package com.tka.eci.client;

import java.util.List;
import java.util.Scanner;

import com.tka.eci.controller.Controller;
import com.tka.eci.entity.Candidate;

public class ECIClient {

	public static void main(String[] args) {

		Controller controller = new Controller();

		while (true) {
			System.out.println("*******************************************************************************");
			System.out.println("                     Candidates From Satara Region                    ");
			System.out.println("*******************************************************************************");
			System.out.println("1.All Candidates");
			System.out.println("2.Independent Candidates");
			System.out.println("3.NCP Candidates");
			System.out.println("4.Candidates From Patan Assembly");
			System.out.println("5.Exit");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println(choice);
				List<Candidate> allcandidates = controller.getAllCandidates();
				System.out.println(
						"*****************************************************************************************************************");
				System.out.println("                                    All Candidates                            ");
				System.out.println(
						"*****************************************************************************************************************");

				for (Candidate candidate : allcandidates) {
					System.out.println(candidate);
					System.out.println(
							"-----------------------------------------------------------------------------------------------------------------");

				}
				break;

			case 2:
				System.out.println(choice);
				List<Candidate> IndependentCandidate = controller.getAllIndeCandidates();
				System.out.println(
						"*****************************************************************************************************************");
				System.out.println(
						"                                  Independent Candidates                              ");
				System.out.println(
						"*****************************************************************************************************************");
				for (Candidate indcandidate : IndependentCandidate) {
					System.out.println(indcandidate);
					System.out.println(
							"-----------------------------------------------------------------------------------------------------------------");
				}
				break;

			case 3:
				System.out.println(choice);
				List<Candidate> ncpCandidates = controller.getAllNCPCandidates();
				System.out.println(
						"*****************************************************************************************************************");
				System.out.println("                                 NCP Candidates                               ");
				System.out.println(
						"*****************************************************************************************************************");

				for (Candidate c2 : ncpCandidates) {
					System.out.println(c2);
					System.out.println(
							"-------------------------------------------------------------------------------------------------------------");
				}
				break;

			case 4:
				System.out.println(choice);
				List<Candidate> patanAssembly = controller.getAllCandidatesFromPatan();
				System.out.println(
						"**************************************************************************************");
				System.out.println(
						"                                Patan Assembly Candidates                                        ");
				System.out.println(
						"**************************************************************************************");

				for (Candidate c3 : patanAssembly) {
					System.out.println(c3);
					System.out.println(
							"--------------------------------------------------------------------------------------");

				}
				break;

			case 5:
				System.out.println(choice);
				System.out.println("Thank You For Using Our System...");

				break;

			default:
				System.out.println(choice);
				System.out.println("Please Enter Valid Choice");

				break;
			}
			if (choice == 5) {
				break;
			}
		}

	}

}
