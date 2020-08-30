/*   Created by IntelliJ IDEA.
 *   Author: Jaish Chimnani (dbc2201)
 *   Date: 30-08-2020
 *   Time: 13:08
 *   File: Book.java
 */

package definitions;

import java.util.Objects;

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

    public String getBookName() {

        return bookName;
    }

    // above method returns the name of the book
    public void setBookName(String bookName) {

        this.bookName = bookName;
    }
    // above method sets the book name

    public String getAuthorName() {

        return authorName;
    }

    /**
     * This method return author name of book .
     *
     * @return The author name of the books
     */

    public void setAuthorName(String authorName) {

        this.authorName = authorName;
    }

    public String getBookISBNNumber() {

        return bookISBNNumber;
    }

    public void setBookISBNNumber(String bookISBNNumber) {

        this.bookISBNNumber = bookISBNNumber;
    }

    /**
     * This method return ISBN number of book .
     *
     * @return The ISBN number of the books
     */
    @Override
    public String toString() {
        return String.format("bookName :%s , AuthorName: %s , bookISBNNumber : %s ", getBookName(), getAuthorName(), getBookISBNNumber()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getBookISBNNumber(), book.getBookISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getBookISBNNumber());
    }
}