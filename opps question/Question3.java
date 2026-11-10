/* Ride Booking App (Abstraction)
Scenario: Uber/Ola jaisa system jahan base logic chhupa hua (Abstract) hoga.

Abstract Class: Ride banao. Isme ek abstract method rakho calculateFare(int distance). Ek normal method rakho startRide() jo print kare "Ride started".

Subclass 1: MicroCab (extends Ride). Fare logic: distance * 15 Rs.

Subclass 2: MiniCab (extends Ride). Fare logic: distance * 20 Rs.
Task: Main method mein dono cabs ka object (Upcasting ke through) banao, startRide() call karo aur 10 km ka fare calculate karke print karo. */

abstract class Ride{
   abstract void calculateFare(int distance);

   void startRide(){
    System.out.println("ride started");
   }

   void startRide(int distance){
       System.out.println("ride started for " + distance + " km");
   }
}

class MicroCab extends Ride{
    @Override
    void calculateFare(int distance) {
        int fare = distance * 15;
        System.out.println("Fare for " + distance + " km is: " + fare);
    }
}

class MiniCab extends Ride{
    @Override
    void calculateFare(int distance){
        int fare = distance * 20;
        System.out.println("Fare for " + distance + " km is: " + fare);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Ride obj = new MiniCab();

        obj.startRide(10);
        obj.calculateFare(10);
    }
}
