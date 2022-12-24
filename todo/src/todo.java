/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author SANDHIYA
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class datanotinlist extends Exception{
     public datanotinlist(String h){
        super(h);
}
}
public class todo {
    private static final Optional<String> port = Optional.ofNullable(System.getenv("PORT")); 
public static final String BASE_URI = "http://0.0.0.0:"+port.orElse("8080")+"/myapp/";
    private static Scanner scanner =new Scanner(System.in);
    private static List<String> currentList = new ArrayList<String>();
  
    public static void main(String[] args) {

        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {
            case 1:
                showList();
                break;
            case 2:
                addItem();
                break;
            case 3:
                removeItem();
                break;
            case 0:
                break;
            default:
                System.out.println("Enter a valid option");
            }
        }
    }

    public static int menu() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Main Menu");
        System.out.println("----------------------");
        System.out.println("0. Exit the program");
        System.out.println("1. Display to-do list");
        System.out.println("2. Add item to list");
        System.out.println("3. Remove item from list");
        System.out.println();
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        return choice;
    }

    public static void showList() {
        System.out.println();
        System.out.println("----------------------");       
        System.out.println("To-Do List");
        System.out.println("----------------------");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
        System.out.println("----------------------");


    }

    public static void addItem() {
        System.out.println("Add Item");
        System.out.println("----------------------");
        System.out.print("Enter an item: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        currentList.add(item);
        try{
            System.out.println("Loading........");
            Thread.sleep(5000);}
         catch(Exception e){
            System.out.println(e);
        }
        showList();
    }

    public static void removeItem() {
        System.out.println("Remove Item");
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to remove?");
        int index = scanner.nextInt();
        try{
        if((index-1)<0 || index>currentList.size()) {
            
            System.out.println("Wrong index number! Please enter in range of 1 to "+currentList.size());            
            throw new datanotinlist("No");
        }else {
            currentList.remove(index-1);
        }}
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("----------------------");
        showList();


    }
}
