package com.pluralsight.collection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private final List<T> items = new ArrayList<>();
    private final int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        } else {
            System.out.println("Error in adding item. List is at full capacity.");
        }
    }

    public List<T> getItems() {
        return items;
    }

    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail (List Full)
        System.out.println("Number of items in List: " + numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.ofEpochDay(15)); // this line should fail (Compilation error)
        System.out.println("Number of dates in List: " + dates.getItems().size());

        FixedList<String> letters = new FixedList<>(5);
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        System.out.println("Letters within List: " + letters.getItems());

        FixedList<Double> cost = new FixedList<>(2);
        cost.add(2.19);
        cost.add(15.99);
        cost.add(20.00);
        System.out.println("Costs within List: " + cost.getItems());
    }
}
