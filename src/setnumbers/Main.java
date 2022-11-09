package setnumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setNumbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            addNumber(setNumbers);
        }
        System.out.println(setNumbers);
        removeEvenNumbers(setNumbers);
        System.out.println(setNumbers);

    }

    public static void addNumber(Set<Integer> setNumbers) {
        setNumbers.add((int) (Math.random() * 1000));
    }

    public static void removeEvenNumbers(Set<Integer> setNumbers) {
        List<Integer> toRemove = new ArrayList<>();

        for (Integer setNumber : setNumbers) {
            if (setNumber % 2 == 0) {
                toRemove.add(setNumber);
            }
        }
        setNumbers.removeAll(toRemove);
    }
}
