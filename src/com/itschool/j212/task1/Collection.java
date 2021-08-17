package com.itschool.j212.task1;

import java.util.Arrays;

public class Collection implements ICollection {
   Integer[] array;
   int size;
   int capacity;

   public Collection(Integer... values) {
      this.capacity = values.length;
      array = new Integer[this.capacity];
      size = this.capacity;

      for (int i = 0; i < this.capacity; i++) {
         array[i] = values[i];
      }
   }

   public Collection(int capacity) {
      this.capacity = capacity;
      array = new Integer[capacity];
      size = 0;
   }

   @Override
   public String toString() {
      return "Capasity: " + this.capacity + ", size: " + this.size + " " + Arrays.toString(array);
   }

   @Override
   public void add(Integer value, int index) {
      if (index + 1 > capacity) {
         array = Arrays.copyOf(array, array.length + (index - array.length) + 1);
         array[index] = value;
         this.capacity = array.length;
      } else {
         Integer[] temp = new Integer[array.length + 1];
         for (int i = 0; i < index; i++) {
            temp[i] = array[i];
         }
         temp[index] = value;
         for (int i = index + 1; i < temp.length; i++) {
            temp[i] = array[i - 1];
         }
         array = temp;
         this.capacity++;
      }
      this.size++;
   }

   @Override
   public void add(Integer value) {
      this.add(value, size);
   }

   @Override
   public Integer remove(int index) {
      if (index >= 0 && index < capacity) {
         Integer temp = array[index];
         array[index] = null;
         this.size--;
         return temp;
      }

      return null;
   }

   @Override
   public void clear() {
      for (int i = 0; i < capacity; i++) {
         array[i] = null;
      }
      size = 0;
   }

   public int getSize() {
      return size;
   }

   @Override
   public boolean isExists(Integer value) {
      for (Integer item : array) {
         if (item != null && item.equals(value))
            return true;
      }
      return false;
   }

   @Override
   public Integer[] getCopy() {
      return getCopy(0, capacity - 1);
   }

   @Override
   public Integer[] getCopy(int firstIndex, int lastIndex) {
      Integer[] temp = new Integer[array.length];
      int k = 0;
      for (int i = firstIndex; i < (this.capacity < lastIndex ? this.capacity : lastIndex + 1); i++) {
         if (array[i] != null)
            temp[k++] = array[i];
      }
      return Arrays.copyOf(temp, k);
   }

   @Override
   public Integer getElement(int index) {
      return (index >= 0 && index < capacity) ? this.array[index] : null;
   }

   @Override
   public int findFirst(Integer value) {
      for (int i = 0; i < capacity; i++) {
         if ((value == null && array[i] == null) || array[i].equals(value))
            return i;
      }
      return -1;
   }

   @Override
   public int findLast(Integer value) {
      for (int i = capacity - 1; i >= 0; i--) {
         if ((value == null && array[i] == null) || array[i].equals(value))
            return i;
      }
      return -1;
   }

   public int getCapacity() {
      return capacity;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Collection temp = (Collection) o;
      return getSize() == temp.getSize() && Arrays.equals(array, temp.array);
   }
}