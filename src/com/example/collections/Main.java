package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Altria", 8, 12);

        if(theater.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        }else{
            System.out.println("Seat already reserved!");
        }


        if(theater.reserveSeat("D13")){
            System.out.println("Please pay for D13");
        }else{
            System.out.println("Seat already reserved!");
        }



    }

    public static void printList(List<Theater.Seat> list){
        for(Theater.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber() + " " + seat.getPrice());

        }
        System.out.println();
        System.out.println("===========================================================================");

    }



}