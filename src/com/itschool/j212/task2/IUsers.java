package com.itschool.j212.task2;

public interface IUsers {
   void addUser(User user);

   void removeUser(int ID);

   void pack();

   User search(String text);

   Users searchUsers(String text);
}
