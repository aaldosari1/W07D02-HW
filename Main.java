package com.company;

public class Main {

    public static void main(String[] args) {
        // Those two variables are for the swap method
        int value1 = 10;
        int value2 = 20;

        System.out.println(countVowels("Fahad"));
        System.out.println(countVowels("Olive"));
        System.out.println(countVowels("Othman"));

        System.out.println(max(2, 3));
        System.out.println(max(88, 3));
        System.out.println(max(3, 3));

        System.out.println("The value of value1 before swapping:  " + value1);
        System.out.println("The value of value2 before swapping:  " + value2);
        Swap(value1, value2);

        Country country1 = new Country("Saudi Arabia", "Arabic", "35 Million", "Riyadh","Jeddah, Dammam, and Abha");
        Country country2 = new Country("Algeria", "Arabic & French", "43 Million", "Algiers", "Oran, Saida and Batna");
        Country country3 = new Country("Canada", "English & French", "38 Million", "Ottawa", "Halifax , Toronto and Vancouver");
        System.out.println("\n" + country1.toString());
        System.out.println("\n" + country2.toString());
        System.out.println("\n" + country3.toString());
    }

    public static int countVowels(String name) {
        int count = 0;

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u')
                count++;
        }
        return count;


    }

    public static String max(int num1, int num2) {

        if (num1 > num2)
            return "The larger number is: " + num1;
        else if (num1 == num2)
            return "Tie";
        else
            return "The larger number is: " + num2;
    }



    public static void Swap(int num1, int num2) { //source https://stackoverflow.com/questions/3624525/how-to-write-a-basic-swap-function-in-java
        int swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("The value of value1 after swapping:  " + num1);
        System.out.println("The value of value2 after swapping:  " + num2);
    }
}