package com.itschool;

import com.itschool.Classes.Collection;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Collection collection1 = new Collection();
        Collection collection2 = new Collection();

        System.out.println(collection1.Length());
        System.out.println(collection1);
        collection1.Add(5);
        collection1.Add(6);
        collection1.Add(7);
        collection1.Add(8);
        collection1.Add(9);
        collection1.Add(10);
        collection1.Add(8);
        collection1.Add(10);
        collection1.Add(8);
        collection1.Add(18);

        System.out.println(collection1.Length());
        System.out.println(collection1);


        collection1.Add(1,1);
        System.out.println(collection1);

        System.out.println(collection1.Remove(1));
        System.out.println(collection1);

        //collection.Clean();
//        System.out.println(collection);

        System.out.println(Arrays.toString(collection1.Part(3)));
        System.out.println(Arrays.toString(collection1.Part(3, 2)));

        System.out.println("First '8' is at position: " + collection1.FindFirst(8));
        System.out.println("Last '8' is at position: " + collection1.FindLast(8));


        collection2.Add(5);
        collection2.Add(6);
        collection2.Add(7);
        collection2.Add(8);
        collection2.Add(9);
        collection2.Add(10);
        collection2.Add(8);
        collection2.Add(10);
        collection2.Add(8);
        collection2.Add(1);

        boolean isEqual = collection1.equals(collection2.getElements());
        System.out.println(isEqual);
    }
}
