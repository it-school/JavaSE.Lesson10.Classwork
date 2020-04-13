package com.itschool.Task2;

public class DBUsers implements IDBUsers
{
	private int lastID;
	private User[] users;
	private int size;

	public DBUsers()
	{
		users = new User[size = lastID = 0];
	}

	@Override
	public void addUser(User user)
	{
		if (size >= users.length) {
			this.extendDB();
		}
		user.setUserID(++lastID);
		users[size++] = user;
	}

	@Override
	public void removeUser(int userID)
	{
		if (userID > 0) {
			for (int i = 0; i < size; i++) {
				if (users[i].getUserID() == userID) {
					System.arraycopy(users, i + 1, users, i, size - i - 1);
/*					// Unrecommended style
					for (int j = i; j < size - 1; j++) {
						users[j] = users[j + 1];
					}
*/
					users[size-- - 1] = null;
					break;
				}
			}
		}
	}

	@Override
	public String getInfo()
	{
		StringBuilder info = new StringBuilder();
		info.append(" ---------------------------------------------------------------\n|\tID\t|\t  Name  " +
				"\t|\t\tlogin\t\t|\t  password\t\t|\n" +
				" ---------------------------------------------------------------\n");
		for (int i = 0; i < size; i++) {
			info.append("|" + String.format("%4d", users[i].getUserID()) + "\t|\t" + String.format("%10s",
					users[i].getName()) + "\t|\t" + String.format("%12s",
					users[i].getLogin()) + "\t|\t" + String.format("%10s", users[i].getPassword()) + "\t\t|\n");
		}
		info.append(" ---------------------------------------------------------------\n");
		return info.toString();
	}

	@Override
	public void clear()
	{
		for (int i = 0; i < size; i++) {
			users[i] = null;
		}
	}

	private void extendDB()
	{
		User[] newDB = new User[size + 1];
		for (int i = 0; i < size; i++) {
			newDB[i] = users[i];
		}
		users = newDB;
	}
}