public class Person {
    private final String name;
    private final double age;
    private final double height;

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        //checkPerson();
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void checkPerson() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }


}
