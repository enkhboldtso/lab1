package lab1;
import java.lang.*;
import java.util.Scanner;

import lab1.Queue;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue daraalal = new Queue();
		System.out.println("Ta hiih uildelee oruulna uu\n1 bol daraalald utga nemeh\n"
				+ "2 bol daraalalig hooson uguig shalgah\n"
				+ "3 bol daraalaliin tolgoi buyu ehnii utgiig avah\n"
				+ "4 bol daraalliin tolgoi buyu suulin utgiig avah\n"
				+ "5 bol daraalliin ehnii utgiig ustgaj hevleh\n"
				+ "6 bol daraallin hemjeeg harah");
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		switch(a) {
		case 1: System.out.println("Ta daraalald oruulah utgaa oruulna uu");
		int data = scr.nextInt();
		daraalal.add(data);
		break;
		case 2: if(daraalal.isEmpty()) {
			System.out.println("Daraalal hooson bna");
		}
		else {
			System.out.println("Daraalal utgatai bna");
		}
		break;
		case 3: System.out.println("daraallin ehnii utga: " + daraalal.getHeadData());
		break;
		case 4: System.out.println("daraallin suulin utga: " + daraalal.getTailData());
		break;
		case 5: System.out.println("daraallin ustgagdsan utga: " + daraalal.remove());
		break;
		case 6: System.out.println("daraallin hemjee: " + daraalal.size());
		default: System.out.println("ta buruu utga oruulsan bna");
		break;
		}
	}

}
