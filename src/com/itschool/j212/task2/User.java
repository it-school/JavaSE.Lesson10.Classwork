package com.itschool.j212.task2;

public class User {
   private int ID;
   private String login;
   private String password;
   private String name;
   private boolean isDeleted;

   public User(String login, String password, String name) {
      this.login = login;
      this.password = password;
      this.name = name;
      this.isDeleted = false;
   }

   public int getID() {
      return ID;
   }

   public void setID(int ID) {
      this.ID = ID;
   }

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public boolean isDeleted() {
      return isDeleted;
   }

   public void setDeleted(boolean deleted) {
      isDeleted = deleted;
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
