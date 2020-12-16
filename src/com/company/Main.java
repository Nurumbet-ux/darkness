package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        Iterator iterator = A.iterator();
        Iterator iterator1 = B.iterator();
        Iterator iterator2 = C.iterator();
        int i = 0;
        while (i < 5) {
            System.out.println("add the " + i + " item: ");
            A.add(s.next());
            i++;
        }

        int k = 0;
        while (k < 5) {
            System.out.println("add the " + k + " item: ");
            B.add(s.next());
            k++;
        }

        System.out.println("The A list!\n________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("The B list\n_________________________");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        iterator = A.iterator();
        iterator1 = B.iterator();
        while (iterator.hasNext() || iterator1.hasNext()) {
            C.add((String) iterator.next());
            C.add((String) iterator1.next());
        }

        System.out.println("The C list\n_____________________");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }

}
