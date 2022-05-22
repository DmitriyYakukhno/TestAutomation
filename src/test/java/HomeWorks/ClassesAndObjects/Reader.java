package HomeWorks.ClassesAndObjects;

import org.testng.annotations.Test;

public class Reader {

    String readerName;
    int ticketNumber;
    long phoneNumber;

    public void takeBooks(int takenBooks, int booksToGive){
        int allBooks = takenBooks + booksToGive;
        int forfeit = (allBooks - 5) * 50;;
        System.out.println("HomeWorks.ClassesAndObjects.Reader Petrov took today " + booksToGive + " books. Total amount of books which reader took is " + allBooks + " books");
        if (allBooks > 5){
            System.out.println("Limit exceeded. The amount of the forfeit = " + forfeit + " hryvnias");
        } else {
            System.out.println("Limit not exceeded");
        }
    }

    public void returnBooks(int takenBooks, int returnBooks){
        int allBooks = takenBooks - returnBooks;
        int forfeit1 = (takenBooks - 5) * 50;
        int forfeit2 = (allBooks - 5) * 50;
        System.out.println("HomeWorks.ClassesAndObjects.Reader Petrov returned today " + returnBooks + " books. Total amount of books which reader is left is " + allBooks + " books");
        if (takenBooks > 5){
            System.out.println("Limit exceeded. The amount of the forfeit = " + forfeit1 + " hryvnias");
        } else {
            System.out.println("Limit not exceeded");
        }

        if (allBooks > 5){
            System.out.println("Future limit exceeded. The amount of the forfeit will be = " + forfeit2 + " hryvnias");
        } else {
            int i = 0;
        }
    }

    @Test
    public void doTakeBooks(){
        takeBooks(3,5);
    }

    @Test
    public void doReturnBooks(){
        returnBooks(10,3);
    }
}
