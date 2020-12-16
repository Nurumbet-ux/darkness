package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        int i = 0;
        System.out.println("Create A list!..");
        while (i < 5) {
            System.out.println("add the " + i + " item: ");
            A.add(s.next());
            i++;
        }
        System.out.println("Create B List!..");

        int k = 0;
        while (k < 5) {
            System.out.println("add the " + k + " item: ");
            B.add(s.next());
            k++;
        }

        System.out.println("The A list!\n________________");
        Iterator <String> iterator = A.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("The B list\n_________________________");
        Iterator <String> iterator1 = B.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        iterator = A.iterator();
        iterator1 = B.iterator();
        while (iterator.hasNext() && iterator1.hasNext()) {
            C.add(iterator.next());
            C.add(iterator1.next());
        }

        System.out.println("The C list\n_____________________");
        Iterator <String> iterator2 = C.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println("Sorted list!..");
        System.out.println("_______________________");
        C.sort(Comparator.comparing(String :: length));
        iterator2 = C.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }


    }


}
