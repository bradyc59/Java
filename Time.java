public class Time {

    private String time1;
    private int hour;
    private int minute;

    public Time(String time2)
    {
        hour = Integer.parseInt(time2.substring(0, 2));
        minute = Integer.parseInt(time2.substring(2, 4));
        time = time2;
    }

    public boolean isLater(Time anotherTime)
    {
        if(this.hour == anotherTime.hour && this.minute > anotherTime.minute)
        {
            return true;
        }
        else if(this.hour > anotherTime.hour)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return(hour + ":" + minute);
    }
}
