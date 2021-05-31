package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Flight> flights = new ArrayList<>();  // Flights ArrayList

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);  // Create scanner object

        System.out.println("::FLIGHT::DIRECTORY::");
        while (true){
            // Main menu
            System.out.println("######################");
            System.out.println("ADD-FLIGHT(1)");
            System.out.println("CHANGE-EXISTING-FLIGHT(2)");
            System.out.println("SHOW-ALL-EXISTING-FLIGHTS(3)");
            System.out.println("EXIT(4)");
            System.out.println("PICK-ONE: ");
            int choice = scanIn.nextInt();  // User choice
            System.out.println("######################");

            // ADD FLIGHT
            if (choice == 1){
                System.out.println("######################");
                System.out.println("What is the flight number: ");
                int numb = scanIn.nextInt();  // Get flight number

                System.out.println("What is the model of plane: ");
                int pmod = scanIn.nextInt();  // Get plane model

                System.out.println("What time is the flight: ");
                String time = scanIn.next();  // Get time

                addFlight(numb, pmod, time);  // Append flight to list
                System.out.println("######################");
            }

            // CHANGE EX. FLIGHT
            if (choice == 2){
                System.out.println("######################");
                System.out.println("PICK FLIGHT");
                showAllFlights();
                int c = scanIn.nextInt();

                System.out.println("FLIGHT INFO OF FLIGHT " + flights.get(c - 1).fNum);
                flights.get(c - 1).printFlight();
                System.out.println();
                System.out.println
                        ("What attribute would you like to change; flight number(1), plane model(2), time(3), or all(4)");
                int atr = scanIn.nextInt();

                if (atr == 1){
                    System.out.println("What is the new flight number");
                    int fn = scanIn.nextInt();

                    flights.get(c - 1).setfNum(fn);
                }

                if (atr == 2){
                    System.out.println("What is the new plane model (index 0 - 2)");
                    int pm = scanIn.nextInt();

                    flights.get(c - 1).setPlaneModel(pm);
                }

                if (atr == 3){
                    System.out.println("What is the new time");
                    String ti = scanIn.nextLine();

                    flights.get(c - 1).setTime(ti);
                }

                if (atr == 4){
                    System.out.println("Flight number: ");
                    int flNm = scanIn.nextInt();

                    System.out.println("Plane Model");
                    int pmOd = scanIn.nextInt();

                    System.out.println("What Time");
                    String str = scanIn.next();

                    replaceFlight(c - 1, flNm, pmOd, str);
                }

                System.out.println("######################");
            }

            // SHOW ALL EX. FLIGHTS
            if (choice == 3){
                System.out.println("####FLIGHT#INFO#######");
                showAllFlights();
                System.out.println("Witch flight");
                int p = scanIn.nextInt();

                flights.get(p - 1).printFlight();
                System.out.println("######################");
            }

            // EXIT
            if (choice == 4) break;
        }
    }

    static void addFlight(int fn, int pm, String ti){  // Method for adding a flight to the list
        Flight f = new Flight(fn, pm, ti);  // Create new flight object
        flights.add(f);
    }

    static void replaceFlight(int flightIndex, int fn, int pm, String ti){
        Flight f = new Flight(fn, pm, ti);
        flights.set(flightIndex, f);  // Replace index with flight
    }

    static void showAllFlights(){
        int sz = flights.size();  // Size of the ArrayList
        for(int i = 0; i < sz; i++) {  // Print all flight nums in array
            System.out.println("Flight: " + flights.get(i).fNum);
        }
    }
}
