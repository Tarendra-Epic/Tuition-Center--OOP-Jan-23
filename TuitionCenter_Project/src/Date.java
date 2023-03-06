public class Date{

    //Declare the data attributes
    private String day;
    private String month;
    private String year;

    //Methods
    public Date(String day, String month, String year){

        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Getters for day, month and year
    public String getDay(){
        return day;
    }

    public String getMonth(){
        return month;
    }

    public String getYear(){
        return year;
    }
}
