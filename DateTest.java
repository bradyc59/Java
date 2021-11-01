public class DateTest {
    public static void main(String [] args)
    {
        Date day1 = new Date("27 7 2006");
        Date day2 = new Date("27 7 2007");

        System.out.println(day1.isOnOrAfter(day2)); // prints false. day1 is not after day2
        System.out.println(day2.isOnOrAfter(day1)); // prints true. day2 is after day1
    }

}
