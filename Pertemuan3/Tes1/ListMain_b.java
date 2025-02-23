package Pertemuan3.Tes1;

import Pertemuan3.Latihan2dan3.StrukturList;

public class ListMain_b {

    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(1);
        list.addTail(4);
        list.addTail(5);
        list.addTail(7);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
