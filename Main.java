package com.company;

public class Main {

    public static void main(String[] args) {
        int[] villageResources = {300, 100, 200};
        int[] stolenRecources = ConditionalComputerGameFirstVersion.numberOfResources(villageResources, 120);
        for (int r : stolenRecources) {
            System.out.println(r);
        }
    }
}
