package com.itschool.Task2;

public class User
{
	private int userID;
	private String login;
	private String password;
	private String name;

	public User(String name, String login, String password)
	{
		this.login = login;
		this.password = password;
		this.name = name;
	}

	public int getUserID()
	{
		return userID;
	}

	public void setUserID(int userID)
	{
		this.userID = userID > 0 ? userID : -1;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		StringBuilder info = new StringBuilder();
		info.append("|" + String.format("%4d", this.getUserID()) + "\t|\t" + String.format("%10s",
				this.getName()) + "\t|\t" + String.format("%12s",
				this.getLogin()) + "\t|\t" + String.format("%10s", this.getPassword()) + "\t\t|\n");

		return info.toString();
	}
}
