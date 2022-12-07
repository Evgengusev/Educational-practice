package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ////////////////++++++++++++
        book[] book_list = books();                   ///// ручное заполнение
        //book[] book_list = bo();           ////// автозаполнение
        System.out.println("----------a)Вывести список книг заданного автора;");
        System.out.print("Введите автора: ");
        check_autor(book_list,scanner.next());

        System.out.println("----------b)Вывести список книг, выпущенных заданным издательством;");
        System.out.print("Введите издателя: ");
        check_publisher(book_list,scanner.next());

        System.out.println("----------c)Вывести список книг, выпущенных после заданного года.");
        System.out.print("Введите год: ");
        check_year(book_list,scanner.nextInt());
    }

    ///////////////// 5 Book

    static book[] books() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество книг: ");
        book[] books = new book[scanner1.nextInt()];
        for (int i = 0; i < books.length; i++) {
            books[i] = new book();
            System.out.println();
            System.out.print("Введите id: ");
            books[i].setId(scanner1.nextInt());
            System.out.print("Введите название книги: ");
            books[i].setName(scanner1.next());
            System.out.print("Введите количество авторов: ");
            int n = scanner1.nextInt();
            String[] mass = new String[n];
            for (int j=0; j<n; j++) {
                System.out.print("Введите автора: ");
                mass[j] = scanner1.next();
            }
            books[i].setAutor(mass);

            System.out.print("Введите издательство: ");
            books[i].setPublisher(scanner1.next());
            System.out.print("Введите год издания: ");
            books[i].setYear(scanner1.nextInt());
            System.out.print("Введите количество страниц: ");
            books[i].setPages(scanner1.nextInt());
            System.out.print("Введите цену: ");
            books[i].setPrice(scanner1.nextInt());
            System.out.print("Введите тип переплета: ");
            books[i].setCover(scanner1.next());
        }
        return books;
    }
    static book[] bo(){
        book[] book_list = new book[3];
        String[] autors = {"Толкин"};
        book_list[0]= new book(0,"Хоббит",autors,"Единорог",1976,322,560,"Твердый переплет");
        String[] autors1 = {"Пупкин"};
        book_list[1]= new book(1,"Книга",autors1,"Общество Атеистов",1994,752,1260,"Твердый переплет");
        String[] autors2 = {"Пупкин","Семенов"};
        book_list[2]= new book(2,"Мифы",autors2,"Единорог",1960,152,320,"Твердый переплет");
        return book_list;
    }
    static void check_autor(book[] books,String autor){
        for (book book : books) {
            String[] autors = book.getAutor();

            for (String s : autors) {
                if(s.equals(autor)){
                    System.out.println(book.toString());
                    break;
                }
            }
        }
    }
    static void check_publisher(book[] books, String publisher){
        for (book book : books) {
            if(book.getPublisher().equals(publisher)){
                System.out.println(book.toString());
            }
        }
    }
    static void check_year(book[] books, int year){
        for (book book : books) {
            if(year<book.getYear()){
                System.out.println(book.toString());
            }
        }
    }
}
