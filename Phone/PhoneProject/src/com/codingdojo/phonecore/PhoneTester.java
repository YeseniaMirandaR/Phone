package com.codingdojo.phonecore;
import com.codingdojo.phoneclass.Galaxy;
import com.codingdojo.phoneclass.Iphone;
//import com.codingdojo.phoneclass.Phone;
public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Galaxy S9 says Ring Ring Ring!");
		Iphone iphoneTen = new Iphone("X", 100, "AT&T", "IPhone X says Zing");
		//Phone cel = new Phone("7985", 50, "AT&T", "noisy");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());

		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
		
	}

}
