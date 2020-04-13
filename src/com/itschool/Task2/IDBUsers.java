package com.itschool.Task2;

public interface IDBUsers
{
	void addUser(User user);

	void removeUser(int userID);

	String getInfo();

	void clear();
}