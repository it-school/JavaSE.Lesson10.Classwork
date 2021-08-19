package com.itschool.j212;

import com.itschool.j212.task1.Collection;
import com.itschool.j212.task2.User;
import com.itschool.j212.task2.Users;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      //task1();
      task2();
   }

   private static void task2() {
      Users users = new Users();
      System.out.println(users);
      users.addUser(new User("user1", "password", "name1"));
      users.addUser(new User("user2", "password", "name2"));
      users.addUser(new User("user3", "password", "name3"));
      System.out.println(users);
      users.removeUser(1);
      System.out.println(users);
      users.pack();
      System.out.println(users);

      System.out.println(users.search("user"));
      System.out.println();
      System.out.println(users.searchUsers("user").searchUsers("3"));

   }

   private static void task1() {
      Collection collection = new Collection(1, 4, 0, -3, 7);
      System.out.println(collection);
      collection.add(555, 3);
      collection.add(666, 3);
      System.out.println(collection);
      collection.add(777);
      System.out.println(collection);

      System.out.println(collection.remove(5));
      System.out.println(collection);

//      collection.clear();
//      System.out.println(collection);

      System.out.println(collection.isExists(555));
      System.out.println(collection.isExists(333));

      collection.add(111, 10);
      collection.remove(10);
      System.out.println(collection);

      Integer[] newArray = collection.getCopy();
      System.out.println("copy: " + Arrays.toString(newArray));

      newArray = collection.getCopy(2, 4);
      System.out.println("copy(2, 4): " + Arrays.toString(newArray));

      System.out.println(collection.getElement(4));

      System.out.println(collection.findFirst(555));

      System.out.println(new Collection(1, 3, 6, 9).remove(0).equals(new Collection(1, 3, 6, 9).remove(0)));
   }
}