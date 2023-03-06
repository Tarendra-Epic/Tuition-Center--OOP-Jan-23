public class TuitionCenter{

    //Declare the data attributes
    private Name headmasterName;
    private Address address;
    private Tutor tutors[];

    //Methods:
    public TuitionCenter(String fname, String mname, String lname, int tutorsNum, String unitNo, String street, String postcode, String district, String state){

        tutors = new Tutor[tutorsNum];

        headmasterName = new Name(fname, mname, lname);
        address = new Address(unitNo, street, postcode, district, state);
    }

    public void setTutors(Tutor tutorList[]){   //Add the list of tutors

        for (int i=0; i < tutors.length; i++){

            tutors[i] = tutorList[i];
        }
    }
    
    //Getters for the attributes
    public Name getHeadmasterName(){
        return headmasterName;
    }

    public Address getAddress(){
        return address;
    }

    public Tutor[] getTutors(){
        return tutors;
    }

}
