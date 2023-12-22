package oops;

import java.util.Scanner;

interface Pet {
    public void petname(String name);
  public   double age();
 public   void breed();
 public   int price();
}

class Petshop implements Pet {
  String petname;
    Scanner sc = new Scanner(System.in);
    @Override
    public void petname(String name) {
        petname = name;
        System.out.println("Pet name: " + petname);
    }

    @Override
    public double age() {
        System.out.print("Enter pet age: ");
       double age = sc.nextDouble();
        System.out.println("Age: " + age);
        return age;
    }

    @Override
    public void breed() {
        sc.nextLine();
        System.out.print("Enter pet breed: ");
      String  breed = sc.nextLine();
        System.out.println("Breed: " + breed);
    }

    @Override
    public int price() {
        System.out.print("Enter pet price: ");
       int price = sc.nextInt();
        System.out.println("Price: " + price);
        return price;
    }
}

public class Pets {
    public static void main(String[] args) {
        Petshop shop = new Petshop();
        shop.petname("Tiger");
        shop.age();
        shop.breed();
        shop.price();
    }
}

