package Pertemuan3.Tes3;

import Pertemuan3.Tes2.addHead;

public class addHead_a {
    public static void main(String[] args) {
        addHead list = new addHead();
        list.addHead(1);
        list.addHead(2);
        list.addHead(3);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
