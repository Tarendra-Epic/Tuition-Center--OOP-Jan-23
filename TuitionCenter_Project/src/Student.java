public class Student{

    //Declare the data attributes
    private Name name;
    private String Ic;
    private Address address;
    private int year;
    private String schoolName;
    private float scores[];

    //Methods:
    public Student(Name name, String Ic, Address address, int year, String schoolName){

        this.name = name;
        this.Ic = Ic;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
    }

    public Name getStudentName(){
        return name;
    }

    public String getStudentIc(){
        return Ic;
    }

    public String getStudentSchoolName(){
        return schoolName;
    }

    public int getStudentYear(){
        return year;
    }

    public void setScore(float scores[]){

        this.scores = scores;
    }

    public float[] getScore(){
        return scores;
    }

    public float getAverage(){   //Calculate the average

        float sum = 0;

        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }

        return (sum / scores.length);
    }

    public float getMaxScore(){   //Calculate the maximum score
        float largeNum = -99999999f;

        for (int i = 0; i < scores.length; i++){
            if (scores[i] > largeNum){
                largeNum = scores[i];
            }
        }

        return largeNum;
    }

    public float getMinScore(){   //Calculate the minimum score
        float smallNum = 99999999f;

        for (int i = 0; i < scores.length; i++){
            if (scores[i] < smallNum){
                smallNum = scores[i];
            }
        }

        return smallNum;
    }

}
