package Aufgabe_04;

public class main {
    public static void main(String[] args) {
        MyString myString = new MyString("Ferdinand");
        MyString myBenedikt = new MyString("Ferdinand");

        System.out.println(myString.equals(myBenedikt));
    }
}
