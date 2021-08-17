package com.itschool.j212.task2;

public class User {
   int ID;
   String login;
   String password;
   String name;
   boolean isDeleted;

   public User(String login, String password, String name) {
      this.login = login;
      this.password = password;
      this.name = name;
      this.isDeleted = false;
   }

   @Override
   public String toString() {
      return "User{" +
              "ID=" + ID +
              ", login='" + login + '\'' +
              ", password='" + password + '\'' +
              ", name='" + name + '\'' +
              ", isDeleted=" + isDeleted +
              '}';
   }
}
