package com.company;

import java.lang.reflect.Array;

class Tram extends publicTransport{
    @Override
    void welcome() {
        System.out.println("Welcome to our Transport!");
    }

    String[] getStops(){
        return stops;
    }


    @Override
    public void takeTheTram(String stop1) {
        if(Fare){
            boolean yes = false;
            for (String st:stops) {
                if(st.equals(stop1)){
                    yes = true;
                    System.out.println("Have a good trip!");
                }
            }
            if(!yes){
                System.out.println("This Tram has no such stop");
            }
        }
        else {
            System.out.println("You did not pay the fare yet");
        }
    }

    @Override
    public void getOffTheTram(String stop2) {
        boolean yes = false;
        for (String st:stops) {
            if(st.equals(stop2)){
                yes = true;
                System.out.println("Fate is "+stop2);
                System.out.println("Goodbye!");
            }
        }
        if(!yes){
            System.out.println("This Tram has no such stop");
        }

    }

}

