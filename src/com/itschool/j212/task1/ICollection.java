package com.itschool.j212.task1;

public interface ICollection {
   void add(Integer value);

   void add(Integer value, int index);

   Integer remove(int index);

   void clear();

   int getSize();

   boolean isExists(Integer value);

   Integer[] getCopy();

   Integer[] getCopy(int firstIndex, int lastIndex);

   Integer getElement(int index);

   int findFirst(Integer value);

   int findLast(Integer value);
}
