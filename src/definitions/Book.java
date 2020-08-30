/*   Created by IntelliJ IDEA.
 *   Author: Jaish Chimnani (dbc2201)
 *   Date: 30-08-2020
 *   Time: 13:08
 *   File: Book.java
 */

package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String bookISBNNumber;

    public Book(String bookName, String authorName, String bookISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookISBNNumber = bookISBNNumber;
    }

    public Book() {

    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.authorName = " DBMS  ";
        this.bookISBNNumber = "1548965239575";
    }

    /*
     * This method return name of book .
     *
     * @return The name of the books
     */
}