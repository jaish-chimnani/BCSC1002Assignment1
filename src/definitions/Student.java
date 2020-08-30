/*   Created by IntelliJ IDEA.
 *   Author: Jaish Chimnani (dbc2201)
 *   Date: 30-08-2020
 *   Time: 13:08
 *   File: Book.java
 */
package definitions;

public class Student{
    private String[] studentName;
    private long universityRollNumber;
    private int booksIssued;
    private Book[] books;


    public Student(String nameOfTheStudent, long universityRollNumber, int numberOfBooksIssued) {
        this.studentName = nameOfTheStudent.split(" ");
        this.universityRollNumber = universityRollNumber;
        this.booksIssued = booksIssued;
        this.books = new Book[numberOfBooksIssued];
    }

    /**
     * above method returns the name of the student (first name, middle name, last name- all String).
     *
     * @return the name of the student (first name, middle name, last name- all String).
     */
    public String[] getStudentName() {
        return studentName;
    }

    public void setNameOfStudent(String[] nameOfStudent) {
        this.studentName = studentName;
    }

}