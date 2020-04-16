package com.itschool.Task2_ArrayList;

import com.itschool.Task2.IDBUsers;
import com.itschool.Task2.User;

import java.util.ArrayList;

public class DB implements IDBUsers
{
	private int lastID;
	private ArrayList<User> users;
	private int size;

	public DB()
	{
		users = new ArrayList<>(size = lastID = 0);
	}


	@Override
	public void addUser(User user)
	{
		user.setUserID(++lastID);
		users.add(user);
	}

	@Override
	public User removeUser(int userID)
	{
		for (User user : users) {
			if (user.getUserID() == userID) {
				users.remove(user);
				return user;
			}
		}
		return null;
	}

	@Override
	public String getInfo()
	{
		StringBuilder info = new StringBuilder();
		info.append(" ---------------------------------------------------------------\n|\tID\t|\t  Name  " +
				"\t|\t\tlogin\t\t|\t  password\t\t|\n" +
				" ---------------------------------------------------------------\n");
		for (User user : users) {
			info.append(user);
		}

		info.append(" ---------------------------------------------------------------\n");
		return info.toString();
	}

	@Override
	public void clear()
	{
		users.clear();
	}

	public void clear(int id)
	{
		users.set(id, null);
	}

}
