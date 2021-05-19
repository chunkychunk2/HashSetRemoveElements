package Minions;

import java.util.*;
import java.io.IOException;
import java.io.*;

/*
Удаляем элементы из HashSet
*/

public class test {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> numbers = new HashSet<>();
        for (int n = 0; n < 20; n++) {
            numbers.add(n);
        }
        return numbers;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>(set);
        for (Integer number : copy) {
            if (number > 10) {
                set.remove(number);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set = createSet();
        System.out.println(set);
        removeAllNumbersGreaterThan10(set);
        System.out.println(set);
    }
}
