package com.itschool.j212.task2;

import java.util.Arrays;

public class Users implements IUsers {
   private User[] db;
   private int usersCounter;

   public Users() {
      db = new User[0];
      usersCounter = 1;
   }

   @Override
   public void addUser(User user) {
      db = Arrays.copyOf(db, db.length + 1);
      db[db.length - 1] = user;
      user.setID(usersCounter++);
   }

   @Override
   public void removeUser(int ID) {
      for (int i = 0; i < db.length; i++) {
         if (db[i].getID() == ID) {
            db[i].setDeleted(true);
            break;
         }
      }
   }

   @Override
   public void pack() {
      int deletedCounter = 0;
      for (int i = 0; i < db.length; i++) {
         if (db[i].isDeleted()) {
            deletedCounter++;
         }
      }

      User[] tempUsers = new User[db.length - deletedCounter];

      int k = 0;
      for (int i = 0; i < db.length; i++) {
         if (!db[i].isDeleted())
            tempUsers[k++] = db[i];
      }

      db = tempUsers;
   }

   @Override
   public User search(String text) {
      for (User user : db) {
         if (
                 user.getName().toLowerCase().contains(text.toLowerCase())
                         || user.getLogin().toLowerCase().contains(text.toLowerCase())
         )
            return user;
      }
      return null;
   }

   @Override
   public Users searchUsers(String text) {
      Users tempUsers = new Users();
      for (User user : db) {
         if (
                 user.getName().toLowerCase().contains(text.toLowerCase())
                         || user.getLogin().toLowerCase().contains(text.toLowerCase())
         )
            tempUsers.addUser(user);
      }
      return tempUsers;
   }

   @Override
   public String toString() {
      return "Users{" + Arrays.toString(db) + '}';
   }
}
