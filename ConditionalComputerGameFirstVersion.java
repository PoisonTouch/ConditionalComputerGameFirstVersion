package com.company;

public class ConditionalComputerGameFirstVersion {
    public static int[] numberOfResources(int[] villageResources, int loadCapacity) {
        float multiplier;//множитель
        int[] stolenRecources = new int[villageResources.length];//массив украденных ресурсов
        int sumVillageResources = 0;
        for (int r : villageResources) {
            sumVillageResources += r;
        }
        multiplier = sumVillageResources / (float) loadCapacity;
        System.out.println("multiplier = " + multiplier);
        int m1 = Math.round(multiplier);
        for (int i = 0; i < villageResources.length; i++) {

            stolenRecources[i] = villageResources[i] / m1;
        }
        int sumStolenResources = 0;
        int remainingResources = 0;
        for (int r : stolenRecources) sumStolenResources += r;
        if (sumStolenResources < loadCapacity) {
            remainingResources = loadCapacity - sumStolenResources;
            System.out.println("remaining resources = " + remainingResources);
            if (remainingResources <= multiplier) {
                int maxStolenResource = stolenRecources[0];
                int index=0;
                for (int i=0;i<stolenRecources.length;i++) {
                    if (stolenRecources[i] > maxStolenResource) {
                        maxStolenResource = stolenRecources[i];
                        index=i;
                    }
                }
                stolenRecources[index]+=remainingResources;
            }



        }
        if (sumStolenResources > loadCapacity) {

        }
        return stolenRecources;

}