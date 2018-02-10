package com.codercalledcole;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//	    if(value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        // switch statement is used to replace if/else that has too many options
        int switchValue = 3;
	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char myChar = 'F';
	    switch(myChar) {
            case 'A':
                System.out.println("You found A");
                break;
            case 'B':
                System.out.println("You found B");
                break;
            case 'C':
                System.out.println("You found C");
                break;
            case 'D':
                System.out.println("You found D");
                break;
            case 'E':
                System.out.println("You found E");
                break;
            case 'F': case 'G': case'H':
                System.out.println("Could not find B, C, D, or E");
                break;
            default:
                System.out.println("Nothing was found");
                break;
        }

        String month = "APRIL";
	    switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "april":
                System.out.println("Birthday");
                break;
            default:
                System.out.println("Not my birthday");
                break;
        }
    }
}
