//take 3 number from user and make a function to print there averese //dn
//write a function to print sum of all odd number from 1 to n //dn
//write a function which take 2 number and return the gratest of the two //dn
//write a function which takes radious as input and return the circumefarance //dn
// write a function which takes age as input and return if the pertion is elliageble for vote or not //dn
//write a function to enter number till the user wants and at the end it should display the count of positive , negative ,zero enter by the user
//two number enter by the user , x,n, write a function whichfind the value of one number raised to the power of another i.e. x^n;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        twoDArray();

    }

    public static void averaseOfThreeNumber() {
        Scanner ak = new Scanner(System.in);
        System.out.println("print a number");
        float num1 = ak.nextInt();
        System.out.println("enter another number");
        float num2 = ak.nextInt();
        System.out.println("enter anoher number");
        float num3 = ak.nextInt();
        float sum = (num1 + num2 + num3);
        float averase = sum / 3;

        System.out.println("the aveserse of 3 given number is " + averase);


    }

    public static void sumOfOddNumber() {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 0;
        for (int i = 1; i <= number; i = i + 2) {
            a = a + i;
        }
        System.out.print("the sum of all the odd number upto n is ");
        System.out.println(a);
    }

    public static void returnTheGrsest() {
        System.out.println("enter a numer");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("enter another number ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is the gratter number");
            return;


        }
        if (num1 < num2) {
            System.out.println(num2 + " is the gratter number");
            return;

        } else {
            System.out.println(" the given numer are equal");
        }
    }

    public static void circumfaranceOfCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        float radious = sc.nextFloat();
        double cir = 6.28 * radious;
        System.out.println("the circumfarance of the given circle is " + cir);
    }

    public static void elligiableForVote() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a your age ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are elligiable for voteing");
        } else {
            System.out.println("you are not elligiable for voteing");
        }
    }

    public static void countOfNumbers() {
        Scanner sc = new Scanner(System.in);
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        for (int i = 0; i <= 10; i++) {
            int number = sc.nextInt();
            if (number > 0) {
                counter1 = counter1 + 1;
            }
            if (number < 0) {
                counter2 = counter2 + 1;
            }
            if (number == 0) {
                counter3 = counter3 + 1;
            }
        }
        System.out.println("the number of positive number entered is " + counter1);
        System.out.println("the number of nagative number entered is " + counter2);
        System.out.println("the number of zero  entered is " + counter3);
    }

    public static void powerRaised() {
        Scanner aks = new Scanner(System.in);
        System.out.println("enter base number");
        int num1 = aks.nextInt();
        System.out.println("enter power ");
        int num2 = aks.nextInt();
        int arya = 1;
        for (int i = 1; i <= num2; i++) {
            arya = arya * num1;


        }
        System.out.println("the power raised to base number is given by " + arya);

    }

    public static void calculateGCD() {
        Scanner sk = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = sk.nextInt();
        System.out.println("enter another number");
        int num2 = sk.nextInt();
        int arya = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                arya = i;
            }
        }
        System.out.println("the gratest common  divisior of the two given number is " + arya);
    }

    public static void fibonacciSeries() {
        Scanner aks = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int num1 = aks.nextInt();

        int arya = 0; // First Fibonacci number
        int ak = 1;   // Second Fibonacci number

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < num1; i++) { // Loop for num1 terms
            System.out.print(arya + " "); // Print the current Fibonacci number
            int next = arya + ak; // Calculate the next Fibonacci number
            arya = ak; // Move to the next term
            ak = next; // Update ak to the new term
        }
    }
    //1d array and 2d array
    //array is a data storage entities where we can store multipole data at once time
    //declaration of array
    //array type[] arrayname=new arraytype[size of array];
    //example
    public static void array() {

        int[] newArray = new int[3];
        newArray[0] = 15;
        newArray[1] = 17;
        newArray[2] = 20;
        System.out.println(newArray[2]);
        //we can also directly give acess to it given as
        int[] newAr={5,2,14,21,54,1,2,2}; //here all intizer are stored in this array
        System.out.println(newAr[3]);
        //we can also take  input from user also so we can go like
        Scanner sc=new Scanner(System.in);
        System.out.println("print the number of element in the arrAY");
        int m=sc.nextInt();
        int[] inputArray=new int[m];
        for(int counter=0;counter<m;counter++){
            inputArray[counter]=sc.nextInt();

        }
        //output
        for(int i=0;i<m;i++){
            System.out.print("the element with "+ i +" index is");
            System.out.println(inputArray[i]);
        }
    }
    public static void twoDArray(){
        //syntax
        //arraytype[][] arrayname =new arraytype[row size][column size];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row");
        int m= sc.nextInt();
        System.out.println("enter number of column");
        int n=sc.nextInt();
        int[][] twoDAr=new int[m][n];
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                twoDAr[i][j]=sc.nextInt();

            }
        }
        for(int a=0;a<m;a++){
            for(int b=0;b<n;b++){
                System.out.print(twoDAr[a][b] + "  ");
            }
            System.out.println(); //for next line in out put
            //all dn in this topic
        }
    }public static void Strings(){
//        public static void Strings(){
//            //strintg declaration
//            String /*name of the String */ hd = "THIS IS A DECLARATION OF STRING WHRER string IS DATA TYPE OF THE STRING";
//            System.out.println(hd);
//            //all about strings
//            String FristName= "arya";
//            String lastName="sahu";
//            String fullName=FristName+ " " +lastName;//or simply you can creat a empty string and add all of that
//            System.out.println(fullName);
//        }
//        public static void userString(){
//            Scanner scv=new Scanner (System.in);
//            String name=scv.nextLine();
//            System.out.println( name);
//
//        }public static void importantFunctions(){
//            //concatenation
//            String FristName= "arya";
//            String lastName="sahu";
//            String fullName=FristName+ " " +lastName;//or simply you can creat a empty string and add all of that
//            System.out.println(fullName);
//            //length of any string
//            System.out.println(fullName.length());//.length() gives the length of a string
//            //charAt:: this function is used to print each charater of a string
//            for(int i=0; i<fullName.length();i++){
//                System.out.println(fullName.charAt(i));//.charAt(here the index number to be printed)::
//            }
//            //.compareTo():: this function is used to compair 2 string
//            String arya="tolny";
//            String ak="tolny";
//            if (arya.compareTo(ak)==0){               ////see how string are calculated
//                //// 1. s1>s2 : +ve value
//                ////2. s1==s2: 0
//                ////3. s1<s2: - ve value
//                System.out.println("the two string are equal");
//            }else{
//                System.out.println("the two string are unequal");
//            }
//            //substring:: used to print or use a part of a string like "this is arya kumar sahu"  if i wants only name part i.e arya i can  use this function
//            String name1="this is arya kumkar sahuj";
//            String name2=name1.substring(11,name1.length());//.substring :: .substring(beging index,ending index);
//            System.out.println(name2);
//
//            //dn upto this
//            //string are immutable(we cant cahange a value of a variable once we define)//?////
//
//
//
//        }
//        public static void thisIsArya(){
//            System.out.println("this is arya kumar sahu");
//        }



    }


}