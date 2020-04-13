package com.itschool.Task1;

import java.util.Arrays;

public class Collection implements ICollection
{
	private Integer[] elements;

	public Collection()
	{
		this.elements = new Integer[0];
	}

	public Integer[] getElements()
	{
		return elements;
	}

	@Override
	public String toString()
	{
		String result = "";
		if (this.elements.length > 0) {
			for (Integer element : this.elements) {
				result += element + ", ";
			}
		}
		else { result = "Collection is empty!"; }
		return result;
	}

	@Override
	public void Add(Integer element)
	{
		int i = 0;
		Integer[] newElements = new Integer[this.elements.length + 1];

		if (this.elements.length > 0) {
			for (Integer tempElement : this.elements) {
				newElements[i++] = tempElement;
			}
			newElements[this.elements.length] = element;
		}
		else { newElements[0] = element; }

		this.elements = newElements;
	}

	@Override
	public void Add(Integer element, int position)
	{
		if (position >= 0 && position < this.elements.length) {
			Integer[] newElements = new Integer[this.elements.length + 1];

			for (int j = 0; j < position; j++) {
				newElements[j] = this.elements[j];
			}

			newElements[position] = element;

			for (int j = position + 1; j <= this.elements.length; j++) {
				newElements[j] = this.elements[j - 1];
			}
			this.elements = newElements;
		}
		else if (position > 0) {
			this.Add(element);
		}
	}

	@Override
	public Integer Remove(int position)
	{
		Integer temp = null;

		if (position >= 0 && position < this.elements.length) {
			Integer[] newElements = new Integer[this.elements.length - 1];
			for (int j = 0; j < position; j++) {
				newElements[j] = this.elements[j];
			}
			temp = this.elements[position];
			for (int j = position; j < this.elements.length - 1; j++) {
				newElements[j] = this.elements[j + 1];
			}
			this.elements = newElements;
		}

		return temp;
	}

	@Override
	public void Clean()
	{
		this.elements = new Integer[0];
	}

	@Override
	public int Length()
	{
		return elements.length;
	}

	@Override
	public boolean IsExists(Integer element)
	{
		return false;
	}

	@Override
	public Integer[] Part(int quantity)
	{
		return Arrays.copyOf(this.elements, quantity);
	}

	@Override
	public Integer[] Part(int start, int quantity)
	{
		return Arrays.copyOfRange(this.elements, start, start + quantity);
	}

	@Override
	public Integer ElementAt(int position)
	{
		return this.elements[position];
	}

	@Override
	public int FindFirst(Integer element)
	{
		int position = -1;

		for (int i = 0; i < this.elements.length; i++) {
			if (this.elements[i].equals(element)) {
				return i;
//                position = i;
//                break;
			}
		}

		return position;
	}

	@Override
	public int FindLast(Integer element)
	{
		int position = -1;

		for (int i = this.elements.length - 1; i >= 0; i--) {
			if (this.elements[i].equals(element)) {
				return i;
			}
		}

		return position;
	}

	@Override
	public boolean equals(Integer[] elements)
	{
		boolean result = false;
		if (this.elements.length == elements.length) {
			for (int i = 0; i < elements.length; i++) {
				if (!this.elements[i].equals(elements[i])) { return false; }
			}
			result = true;
		}

		return result;
	}


}
