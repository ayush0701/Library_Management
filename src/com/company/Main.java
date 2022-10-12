package com.company;
class library{
    String [] books;
    int no_of_books;
    library(){
        this.books= new String [100];
        int no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(" the book is been added is :"+ book);
    }
    void issueBook(String book){
        for(int i = 0 ; i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println(" the book has been issued"+ book);
                this.books[i]=null;
                return;
            }
        }
        System.out.println(" this book is not available for issue");

    }
    void AvailableBook(){
        for(String book:this.books)
        { if(book== null){
            continue;
        }
            System.out.println("the available books are" + book);

        }


    }
    void retrunBook(String book){
        addBook(book);
    }


}
public class Main {

    public static void main(String[] args) {

                library Rkgit = new library();
                Rkgit.addBook("scindrella");
                Rkgit.issueBook("scindrella");
                Rkgit.AvailableBook();
                Rkgit.addBook("asfs");
                Rkgit.AvailableBook();
                Rkgit.retrunBook("dhs");

            }
        }


