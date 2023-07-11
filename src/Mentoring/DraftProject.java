package Mentoring;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class DraftProject {
    public static void main(String[] args) {
        String str = "emre emre John.berk.berk.berk";
        str = str.replace(".", " ");
        str = str.replace("  ", " ");
        str = str.toLowerCase();
        System.out.println(str);

        Map<String, Integer> map = new LinkedHashMap<>();

        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            map.put(arr[i], count);
        }
        System.out.println(map);
    }
}
