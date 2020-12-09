public class LeapYear {
    public static void main(String[] args)
    { int year = 1957;
        System.out.println();
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Rok jest przestępny");
        else
            System.out.println("Rok nie jest przestępny");
        System.out.println();
    }

}
