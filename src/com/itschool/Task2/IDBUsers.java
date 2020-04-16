package com.itschool.Task2;

public interface IDBUsers
{
	void addUser(User user);

	User removeUser(int userID);

	String getInfo();

	void clear();
}