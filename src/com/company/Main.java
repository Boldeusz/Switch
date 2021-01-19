package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 2;
//        if (value == 1){
//            System.out.println("Value was 1");
//        }else if (value == 2){
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
        char value = 'A';
        switch (value){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Was A, B, C or D");
                System.out.println("Character found " +value);
                break;
            default:
                System.out.println("Non of the characters found");
                break;
        }
        String month = "JANUARY";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "april":
                System.out.println("Apr");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
