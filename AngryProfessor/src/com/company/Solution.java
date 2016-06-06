package com.company;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases > 0) {
            int numberOfStudents = scanner.nextInt();
            int classThreshold = scanner.nextInt();
            int[] studentsArrivalTime = new int[numberOfStudents];
            for (int j = 0; j < studentsArrivalTime.length; j++) {
                studentsArrivalTime[j] = scanner.nextInt();
            }
            int[] valueHolder = new int[studentsArrivalTime.length];
            for (int k = 0; k < valueHolder.length; k++) {
                if (studentsArrivalTime[k] <= 0) {
                    valueHolder[k] = 1;
                } else {
                    valueHolder[k] = 0;
                }
            }
            int thresholdHolder = 0;
            for (int m = 0; m < valueHolder.length; m++) {
                thresholdHolder += valueHolder[m];
            }
            if (thresholdHolder >= classThreshold) {
                System.out.println("NO");
                testCases--;
            } else {
                System.out.println("YES");
                testCases--;
            }

        }
    }
}
