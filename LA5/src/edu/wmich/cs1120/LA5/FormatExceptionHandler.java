package edu.wmich.cs1120.LA5;

import java.io.FileNotFoundException;

public class FormatExceptionHandler implements IFormatExceptionHandler{
	
	
	public void handleFileNotFoundException(FileNotFoundException e) {
		System.out.println(e.getMessage());
	}
	
	public void handlePhoneNumberFormatException(PhoneNumberFormatException e) {
		String phoneNumber = e.getPhoneNumber();
		phoneNumber = phoneNumber.replaceAll("[^0-9.]", ""); // Removes any non number characters

		System.out.print("(");
		for(int i = 0; i < 3; i++) {
			System.out.print(phoneNumber.charAt(i));
		}
		System.out.print(")-");
		for(int i = 3; i < 6; i++) {
			System.out.print(phoneNumber.charAt(i));
		}
		System.out.print("-");
		for(int i = 6; i < 9; i++) {
			System.out.print(phoneNumber.charAt(i));
		}
		System.out.print("\n");
	}
	
	public void handleEmailFormatException(EmailAddressFormatException e) {
		String email = e.getEmail();
		System.out.println(email.toLowerCase());
	}

	public void handleNameFormatException(NameFormatException e) {
		String[] nameArr = e.getName().split(" ");
		for(int i = 0; i < nameArr.length; i++) {
				String nameFormat = nameArr[i].substring(0, 1).toUpperCase() + nameArr[i].substring(1, nameArr[i].length()).toLowerCase();
				System.out.print(nameFormat + " ");
		}
		System.out.print("\n");
		
	}
}
