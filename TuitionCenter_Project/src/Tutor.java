public class Tutor{

    //Declare the data attributes
    private Name name;
    private String Ic;
    private Address address;
    private String qualification;
    private int noYearsExp;
    private Date dateJoined;
    private int noYearsInCenter;
    private Student students[];

    //Methods:
    public Tutor(String fname, String mname, String lname, String Ic, String unitNo, String street, String postcode, String district, String state,
                    String qualification, int noYearsExp, Date dateJoined, int noYearsInCenter, int num){

        //Store all the values inside the attributes
        name = new Name(fname, mname, lname);
        address = new Address(unitNo, street, postcode, district, state);
        this.Ic = Ic;
        this.qualification = qualification;
        this.noYearsExp = noYearsExp;
        this.dateJoined = dateJoined;
        this.noYearsInCenter = noYearsInCenter;
        students = new Student[num];
    }

    public void setStudents(Student newStudent, int counter){

        students[counter] = newStudent;
    }

    public Name getTutorName(){

        return name;
    }

    public String getTutorIc(){
        return Ic;
    }

    public Address getTutorAddress(){
        return address;
    }

    public int getTutorNoYearsInCenter(){
        return noYearsInCenter;
    }

    public Student[] getStudentList(){
        return students;
    }

}
