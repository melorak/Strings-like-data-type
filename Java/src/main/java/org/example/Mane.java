package org.example;

import java.util.Arrays;
import java.util.Random;

public class Mane {
   public static void main (String[] args) {
      // Создать метод, который удаляет все пробелы в начале и конце строки, переводит в нижний регистр и возвращает реультат.

      String str = new String("   SOME text   ");
      System.out.println(str.trim().toLowerCase());

      // Заменить второе слово в строке str1 если оно есть на str2  вернуть результат.
      // Если второе слово равно str2, то вернуть "Замена бессмыслена".

      String str1 = new String("I hate coffee");
      String str2 = new String("love ");

      String st1 = str1.substring(2, 7);

      if (st1.equals(str2)) {
         System.out.println("Замена не требуется.");
      } else {
          str1 = "I hate coffee".replace(st1, str2);
      }
      System.out.println(str1);
   }
}