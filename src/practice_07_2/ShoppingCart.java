/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_07_2;

public class ShoppingCart {
    public static void main(String[] args) {

        String custName = "Steve Smith";
        int spaceIdx = custName.indexOf(" ");
        String firstName= custName.substring(0,spaceIdx);
        StringBuilder sb = new StringBuilder(firstName);
        sb.append(" Smith");

        System.out.println(sb);

        sb.append(custName.substring(0,spaceIdx));
        System.out.println(sb);
        //Instantiate and initialize sb to firstName.
        

	// Put the full name back together, using StringBuilder append method.
	// You can just enter the String literal for the last name.
	// Print the full name.
        
	
	// (Optional) Can you append the last name without using a String literal?


    }
}