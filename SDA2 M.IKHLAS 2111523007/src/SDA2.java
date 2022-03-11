import java.util.LinkedList;

public class SDA2 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();
       
        //karakter nama "MUHAMMAD IKHLAS"
        saya.add("M");
        saya.add("U");
        saya.add("H");
        saya.add("A");
        saya.add("M");
        saya.add("M");
        saya.add("A");
        saya.add("D");
        saya.add("");
        saya.add("I");
        saya.add("K");
        saya.add("H");
        saya.add("L");
        saya.add("A");
        saya.add("S");

        System.out.println("=====================================");
        System.out.println(saya);
        System.out.println("\n");

        saya.add("R");
        saya.add("A");
        saya.add("M");
        saya.add("A");
        saya.add("H");
        
        System.out.println("List sebelum di tambahkan karakter: " + saya);
        System.out.println("\n");

        //fungsi menyisipkan karakter
        saya.set(0,"S");
        saya.set(5,"A");
        saya.set(2,"B");
        saya.set(10,"A");
        saya.set(0,"R");

        System.out.println("List setelah ditambahkan karakter: " + saya);
        System.out.println("\n");

        //fungsi Remove
        saya.remove(5);
        saya.remove(3);
        saya.remove(7);
        saya.remove(3);
        saya.remove(2);
        saya.remove(8);
        saya.remove(1);
        saya.remove(4);
        System.out.println("List setalah di remove: " + saya);
        System.out.println(" \n");

        //Fungsi push
        saya.push("DERMAWAN");
        saya.push("HEMAT");
        saya.push("TABAH");
        System.out.println("Setelah elemen di push" + saya);
        System.out.println("\n");

        //Fungsi POP
        saya.pop();
        System.out.println("setelah pop: " + saya);
        //System.out.println(saya.pop());

    }
    
    }