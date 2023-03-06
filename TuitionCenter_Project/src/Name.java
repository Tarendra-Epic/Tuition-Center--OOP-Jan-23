public class Name{

    //Declare the data attributes
    // Initialize it with empty string
    private String fname = "";
    private String mname = "";
    private String lname =  "";

    //Methods:
    //Consist of different types of constructors for different purposes, overloading
    public Name(String fname){

        this.fname = fname;
    }

    public Name(String fname, String lname){

        this.fname = fname;
        this.lname = lname;
    }

    public Name(String fname, String mname, String lname){

        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public String getName(){
        return (this.fname + " " + this.mname + " " + this.lname);
    }
}
