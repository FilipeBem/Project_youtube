package org.example;

import java.awt.datatransfer.SystemFlavorMap;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de POO");
        v[2] = new Video(" Aula 1 de web");

        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Pedro", 22, "M", "123");
        a[1] = new Aluno("Maria",19,"F","Ma");

        System.out.println(v[0].toString());
        System.out.println(a[0].toString());

    }
}