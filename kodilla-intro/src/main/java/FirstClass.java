import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        Grades grades = new Grades();
        System.out.println(grades.add(10));
        System.out.println(grades.add(1));
        System.out.println(grades.add(3));
        System.out.println(grades.add(5));

        System.out.println("recent grades= " +grades.recentGrades());
        System.out.println("average grades= " +grades.averageGrades());
        System.out.println("max grade: " +grades.maxGrade());
        System.out.println("min grade: " +grades.minGrade());

// ------------------------  RandomNumbers ---------------///

        User ala = new User(10,"Ala");
        User kuba = new User(42,"Kuba");
        User ula = new User(30,"Ula");
        User karol = new User(15,"Karol");

        User[] users = new User[]{ala,kuba,ula,karol};

        float sum = 0;
        for (int i=0; i<users.length; i++) {
            sum += users[i].getAge();
        }
        float userAverageAge = sum / users.length;

        System.out.println("average age: " + userAverageAge);

        for (int i=0; i<users.length; i++) {
            if (userAverageAge > users[i].getAge()) {
                System.out.println(users[i].getName());
            }
        }



        RandomNumbers r = new RandomNumbers();
        r.sum();

//------------------ Zmiana kodu na obiektowy ----------------///

    Person person = new Person("Adam",40.5, 178);
    person.checkPerson();

//------------------- Book ---------------------///

        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.getAuthor() +", " + book.getTitle() );

//        -----------------KOLORY-----------------///

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first color letter: ");
            String input = scanner.next();
            System.out.println("You pressed: " + input.charAt(0));
            if (String.valueOf(input.charAt(0)).equalsIgnoreCase("q")) {
                break;
            }
            switch (String.valueOf(input.charAt(0))) {
                case "B","b":
                    System.out.println("Blue");
                    break;
                case "R", "r":
                    System.out.println("Red");
                    break;
                default:
                    System.out.println("No match found");
            }
        }
        System.out.println("Bye");
    }
}
