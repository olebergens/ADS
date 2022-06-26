package a05.src;

import java.sql.SQLOutput;

public class StringTable {

    public String[] table;
    public int capacity;
    public boolean report = true;

    public StringTable(int M){
        table = new String[M];
        capacity = M;
    }

    public int hash(String string) {
        int pos = 0;
            for (int i = 0; i < capacity; i++) {
                pos = pos + string.charAt(i);
            }
        return pos % capacity;
    }

    public int insert(String insertion) {
    if (report == true) {
        System.out.println("");
        System.out.println("insertion");
        System.out.println("word: " + insertion);
        System.out.println("hash: " + hash(insertion));
    }

        int i = hash(insertion);
        while (this.table[i] != null)
            i = (i + 1) % this.capacity;
        this.table[i] = insertion;
        if (hash(insertion) > i)
            i = i + this.capacity;

    if (report == true) {
        System.out.println("collisions: " + (i - hash(insertion)));
        System.out.println("index: " + i);
    }

        return i - hash(insertion);
    }

    public static void main(String...args) {
     //   String lul = "Weltanschauung";
     //   System.out.println(lul.charAt(4));

        int testcap = 5;
        StringTable test = new StringTable(testcap);
        test.insert("Absolutismus");
        test.insert("Weber");
        test.insert("Witzbold");
        test.insert("Hundehuette");
        test.insert("Abrissbirne");

        System.out.println("");
        System.out.println("Test-table:");
        for (int i = 0; i < testcap; i++)
        System.out.println(test.table[i]);
    }
}
