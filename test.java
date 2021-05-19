package Minions;

import java.util.*;
import java.io.IOException;
import java.io.*;

/*
Удаляем элементы из HashSet
*/

public class test {
    public static void main(String[] args)  {

        Set<Integer> set = new HashSet<>();
        for (int n = 0; n < 20; n++) {
            set.add(n);
        }

        Set<Integer> copy = new HashSet<>(set);
        for (Integer number : copy) {
            if (number > 10) {
                set.remove(number);
            }
        }
        System.out.println(set);

    }
}
