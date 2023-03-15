package com.knoldus.task10;
import java.util.LinkedHashSet;

    class Book
    {
        String author;
        Integer id;
        Book(String author, Integer id)
        {
            this.author = author;
            this.id = id;
        }

        //overriding hashCode function
        @Override
        public int hashCode(){
            int hashcode = 0;
            hashcode = id*20;
            hashcode += author.hashCode();
            return hashcode;
        }

        //overriding equals function to compare elements
        @Override
        public boolean equals(Object object){
            System.out.println("In equals");
            if (object instanceof Book){
                Book book = (Book) object;
                return (book.author.equals(this.author) && book.id == this.id);
            }
            else{
                return false;
            }
        }
    }

public class RemoveDuplicates {
        public static void main(String[] args)
        {
            LinkedHashSet<Book> booksSet = new LinkedHashSet<>();
            booksSet.add(new Book("Austen", 201));
            booksSet.add(new Book("Jeffrey", 401));
            booksSet.add(new Book("Kepler", 303));
            booksSet.add(new Book("Bronte", 202));

            for (Book book: booksSet)
            {
                System.out.println(book.author+" "+book.id);
            }

        }
    }

