package com.company.Tema5Interfaz;

public class Tema5Main {

    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
