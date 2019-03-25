package com.itschool.Classes;

public interface ICollection
{
    void Add(Integer element);
    void Add(Integer element, int position);
    Integer Remove(int position);
    void Clean();
    int Length();
    boolean IsExists(Integer element);
    Integer [] Part(int quantity);
    Integer [] Part(int start, int quantity);
    Integer ElementAt(int position);
    int FindFirst(Integer element);
    int FindLast(Integer element);
    boolean equals(Integer [] elements);

    String toString();
}
