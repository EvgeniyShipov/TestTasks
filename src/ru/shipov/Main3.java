package ru.shipov;

import java.util.*;

/**
 * 3.На вход программе подается литературный текст. Программа должна вывести список слов, встречающихся в тексте,
 * в котором для каждого слова указывается количество вхождений этого слова в текст,
 * а слова выводятся в порядке убывания частоты вхождения.
 */
public class Main3 {
    public static void main(String[] args) {
        String example = "На вход программе подается литературный текст. Программа должна вывести список слов, " +
                "встречающихся в тексте, в котором для каждого слова указывается количество вхождений этого слова в " +
                "текст, а слова выводятся в порядке убывания частоты вхождения.";

        Map<String, Integer> map = new HashMap<>();

        Arrays.stream(example.split(" "))
                .forEach(word -> map.put(word, map.getOrDefault(word, 0) + 1));

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
