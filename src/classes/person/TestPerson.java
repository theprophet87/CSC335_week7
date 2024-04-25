package classes.person;

public class TestPerson {
    public static void main(String [] args){
        Person testPerson = new Person("Jordan Peele", "123 Disco Ave", "2098783456", "peele187@gmail.com");

        //toString
        System.out.println("toString method: " + testPerson);

        //print full details
        testPerson.printDetails();
    }
}
