package a05.src;

public class StringTable {

    public String[] table;
    public int capacity;
    public static boolean report = true;    //Set this variable to false, in order to disable detailed report output.

    public StringTable(int M) {
        table = new String[M];
        capacity = M;
    }

    public int hash(String string) {
        int pos = 0;
        for (int i = 0; i < string.length(); i++) {
            pos = pos + string.charAt(i);
        }
        return pos % capacity;
    }

    //insert returns the number of collisions while inserting. Since it was not specified otherwise in the task, a word may be inserted twice.

    public int insert(String insertion) {
        if (report) {
            System.out.println();
            System.out.println("inserting '" + insertion + "'");
            System.out.println("hash: " + hash(insertion));
        }

        int i = hash(insertion);

        if ((this.table[i] != null) && (this.table[i] != "-")) {
            i = (i + 1) % this.capacity;
            while ((this.table[i] != null) && (this.table[i] != "-") && (i != hash(insertion)))
                i = (i + 1) % this.capacity;
            if (i != hash(insertion)) {
                this.table[i] = insertion;
            } else {
                throw new RuntimeException();
            }
        } else {
            this.table[i] = insertion;
        }

        if (hash(insertion) > i)
            i = i + this.capacity;

        if (report) {
            System.out.println("collisions: " + (i - hash(insertion)));
            System.out.println("index: " + i);
        }

        return i - hash(insertion);
    }

    //contains returns the index of the word, if the word was not found, it returns -1.

    public int contains(String check) {
        if (report) {
            System.out.println();
            System.out.println("checking for '" + check + "'");
            System.out.println("hash: " + hash(check));
        }

        int r = -1;
        int i = hash(check);

        if (this.table[i] != check) {
            i = (i + 1) % this.capacity;
            while ((this.table[i] != check) && (this.table[i] != null) && (i != hash(check)))
                i = (i + 1) % this.capacity;
        }

        if (this.table[i] == check){
            r = i;
            if (report) {
                System.out.println("collisions: " + (i - hash(check)));
                System.out.println("index: " + i);
            }
        }else{
            if (report) {
                System.out.println("not found");
            }
        }

        return r;
    }

    //delete() returns number of collisions that occured while inserting the word. If the word was not in the Array to begin with, it returns -1.

    public int delete(String deletion) {
        int i = contains(deletion);

        if (report) {
            System.out.println();
            System.out.println("deleting '" + deletion + "'");
            if (i != -1)
                System.out.println("index: " + i);
            else
                System.out.println(deletion + " was not in the array to begin with.");
        }

        if (i != -1) {
            this.table[i] = "-";
            if (hash(deletion) > i)
                i = i + this.capacity;
            i = i + hash(deletion);
        }

        return i;
    }

    public static void main(String... args) {

        int testcap = 10;

        System.out.println();
        if (report) {
            System.out.println("Starting test sequence with table capacity " + testcap + ". Detailed report is enabled.");
        } else {
            System.out.println("Starting test sequence with table capacity " + testcap + ". Detailed report is disabled.");
        }
        StringTable test = new StringTable(testcap);

        //Testing insert():
        System.out.println();
        System.out.println("Testing insert()");

        test.insert("Absolutismus");
        test.insert("Rotkehlchen");
        test.insert("Witzbold");
        test.insert("Hundehuette");
        test.insert("Abrissbirne");
        test.insert("Grundbeduerfnis");
        test.insert("Holzwurm");
        test.insert("Zimmermann");
        test.insert("leidenschaftlich");
        test.insert("Gurkenglass");

        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Testing delete() / contains()");

        test.delete("Holzwurm");
        test.delete("Zimmermann");
        test.delete("leidenschaftlich");
        test.delete("Reibung");

        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Testing insert() after deletions");

        test.insert("Holzwurm");
        test.insert("Zimmermann");

        System.out.println();
        System.out.println("final table:");
        System.out.println("----------------------------");
        System.out.println("Index     Word");
        System.out.println("----------------------------");
        for (int i = 0; i < testcap; i++) {
            System.out.println(i + "         " + test.table[i]);
        }
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("ending test");
    }
}