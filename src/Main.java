import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruct = new ArrayList<>();
        ArrayList<String> fruct2 = new ArrayList<>();
        ArrayList<String> fruct3 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название фруктов списка А");
        String a []=new String [5];
        for (int i = 0; i < 5; i++) {
        a[i]=scanner.nextLine();
        fruct.add(a[i]);
        }
        System.out.println(fruct);
//        fruct.add("апельсин");
//        System.out.println(fruct);
        System.out.println("Введите название фруктов списка Б");
        String b []=new String [5];
        for (int j = 0; j < 5; j++) {
            b[j]=scanner.nextLine();
            fruct2.add(b[j]);
        }
        System.out.println(fruct2);
        Collections.reverse(fruct2);
        System.out.println(fruct2);

//        fruct3.addAll(fruct);
//        System.out.println(fruct3);
//        fruct3.addAll(fruct2);
//        System.out.println(fruct3);

        for (int i = 0; i < fruct.size() ; i++) {
            fruct3.add(fruct.get(i));
            fruct3.add(fruct2.get(i));
            }
        System.out.println(fruct3);
        fruct3.sort(Comparator.comparingInt(String::length));
        System.out.println(fruct3);
        }

    }
