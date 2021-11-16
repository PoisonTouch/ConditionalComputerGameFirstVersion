package com.company;

public class Main {

    public static void main(String[] args) {
        int[] villageResources = {200, 100, 300};
        int[] stolenRecources = ConditionalComputerGameFirstVersion.numberOfResources(villageResources, 121);
        for (int r : stolenRecources) {
            System.out.println(r);
        }
    }
}
