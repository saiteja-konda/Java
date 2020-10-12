package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListc {
    // Lets create Book class
    static class Book implements Comparable {
        int Id;
        String Name;

        public Book() {
        }

        // Constructor for Book class
        public Book(int id, String name) {
            Id = id;
            Name = name;
        }

        @Override
        public int compareTo(Object object) {
            int val =0;
            Book book = (Book)object;
            val = this.Name.compareTo(book.Name);
            return -val;
        }

        @Override
        public String toString() {
            return "\n Book{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}'+"\n";
        }
    }

    //Main class
    public static void main(String[] args) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";

        //Lets create 5 books
        Book programmingBook1 = new Book(1, "Core Java");
        Book programmingBook2 = new Book(2, "Adv Java");
        Book programmingBook3 = new Book(3, "Spring Boot");
        Book programmingBook4 = new Book(4, "JavaScript");
        Book programmingBook5 = new Book(5, "React Js");
        Book book6 = new Book(6, "Vue Js");
        Book book7 = new Book();

        Book comicBook1 = new Book(11, "Spider Man");
        Book comicBook2 = new Book(22, "Star Trek");
        Book comicBook3 = new Book(33, "Archie");
        Book comicBook4 = new Book(44, "BatMan");
        Book comicBook5 = new Book(55, "Avengers");

        // Lets Create new Array List programmingBooks and  add 5 book to it (normal Collection)
        ArrayList programmingBooks = new ArrayList();
        programmingBooks.add(programmingBook1);
        programmingBooks.add(programmingBook2);
        programmingBooks.add(programmingBook3);
        programmingBooks.add(programmingBook4);
        programmingBooks.add(programmingBook5);

        //Lets create new Array List for ComicBooks
        ArrayList<Book> ComicBooks = new ArrayList<Book>();
        ComicBooks.add(comicBook1);
        ComicBooks.add(comicBook2);
        ComicBooks.add(comicBook3);
        ComicBooks.add(comicBook4);
        ComicBooks.add(comicBook5);

        // Lets prints programmingBooks
        System.out.println();
        System.out.println(ANSI_RED + "Programming Books");
        System.out.println("-------------------");
        System.out.println(ANSI_GREEN + "Id" + ANSI_BLUE + "\tBook Name");
        System.out.println("-------------------");
        for (Object obj : programmingBooks) {
            Book book = (Book) obj;
            System.out.println(ANSI_PURPLE + book.Id + "\t" + ANSI_YELLOW + book.Name);
        }

        // Let create new Array List of programming book and add same books but this time we will use Generics
        ArrayList<Book> ProgrammingBooks = new ArrayList<Book>();

        ProgrammingBooks.add(programmingBook1);
        ProgrammingBooks.add(programmingBook2);
        ProgrammingBooks.add(programmingBook3);
        ProgrammingBooks.add(programmingBook5);
        ProgrammingBooks.add(programmingBook4);

        /*
         * Collections provides Methods that we can use to perform various operations on Collection
         * add() used to add object (like we used in Line 51)
         * get() can me used to access object from the ArrayList by passing index of the objects as an argument
         * remove() used to remove object
         * ***  [1] an object can be removed with the help of index and
         * ***  [2] object can be removed by passing object itself as an argument
         * size() can be used to determine the length of the ArrayList
         * isEmpty() returns boolean value depending upon the object empty or not
         * set() can be used to update replace object with new object
         * with help of Collections class we can swap the objects between indexes
         * using subList() we can get the objects between indexes
         * clear() will remove all objects in the ArrayList
         * removeAll will remove all the objects in ArrayList
         * retainAll() will retains the object which is passed as an argument and removes all other objects from the ArrayList
         * */
        /* addAll() method can be used to add collection another collection
         ***** Lets Use all these methods on ProgrammingBooks ******
         */


        //Add
        ProgrammingBooks.add(programmingBook4);
        ProgrammingBooks.add(programmingBook5);

        //remove book using index
        ProgrammingBooks.remove(5);

        //remove book using Object
        ProgrammingBooks.remove(programmingBook5);

        //replace programmingBook5 with book6
        ProgrammingBooks.set(4, book6);

        //Swap programmingBook4 and book6
        Collections.swap(ProgrammingBooks, 4, 3);

        //Sublist
        ArrayList<Book> javaBooks = new ArrayList(ProgrammingBooks.subList(0, 2));


        //size of ProgrammingBooks
        System.out.println(ANSI_PURPLE + "\n Length of the Book Array List is : " + ANSI_GREEN + ProgrammingBooks.size());

        // isEmpty
        System.out.println("\n Is the list of javaBook Empty?\t" + ANSI_GREEN + javaBooks.isEmpty());
        //addAll
        ArrayList<Book> MyBookCollectionArray = new ArrayList<Book>();
        MyBookCollectionArray.addAll(ProgrammingBooks);
        MyBookCollectionArray.addAll(ComicBooks);


        // Lets prints ProgrammingBooks
        System.out.println();
        System.out.println(ANSI_CYAN + "Programming Books");
        System.out.println("-------------------");
        System.out.println(ANSI_GREEN + "Id" + ANSI_PURPLE + "\tBook Name");
        System.out.println("-------------------");
        System.out.println();

        /*
         * Using Generics gives an advantage we just simple iterate through
         * Array List and get the objects with out worrying about
         * Type Checking and Type Casting
         * Like we did on Line 51
         * */

        ProgrammingBooks.forEach(
            book -> System.out.println(
                ANSI_RED + book.Id + "\t" + ANSI_BLUE + book.Name
            )
        );

        System.out.println();
        System.out.println(ANSI_PURPLE + "Only Java Books");
        System.out.println("-------------------");
        System.out.println(ANSI_RED + "Id" + ANSI_YELLOW + "\tBook Name");
        System.out.println("-------------------");
        javaBooks.forEach(book -> System.out.println(
            ANSI_RED + book.Id + "\t" + ANSI_BLUE + book.Name
        ));


        /*
         * ArrayList can be converted as normal Array and similarly an Array can be converted into ArrayList
         * */

        Object[] objects = ProgrammingBooks.toArray();

        System.out.println("\n" + ANSI_GREEN + " My book collection");
        System.out.println("-------------------");
        System.out.println(ANSI_GREEN + "Id" + ANSI_PURPLE + "\tBook Name");
        System.out.println("-------------------");
        MyBookCollectionArray.forEach(
            book -> System.out.println(
                ANSI_RED + book.Id + "\t" + ANSI_BLUE + book.Name
            )
        );

        //Displaying objects in ArrayList using Iterator
        Iterator it = MyBookCollectionArray.iterator();
        System.out.println("\n my books collection using iterator");

        while (it.hasNext()) {
            Book book = (Book) it.next();
            if(book.equals(programmingBook2)){
                it.remove();
            }
            System.out.println(
                ANSI_RED + book.Id + "\t" + ANSI_BLUE + book.Name
            );
        }

        System.out.println(MyBookCollectionArray.toString());
    }
}
