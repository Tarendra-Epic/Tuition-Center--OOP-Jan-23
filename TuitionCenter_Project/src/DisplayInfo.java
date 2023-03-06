import java.text.DecimalFormat;
public class DisplayInfo {
    //Display the details of the center
    public void displayCenterInfo(TuitionCenter center){

        System.out.println("\t\tTuition Center 1\n");
        System.out.print("Headmaster Name: " + center.getHeadmasterName().getName());
        System.out.print("\nAddress: " + center.getAddress().getFullAddress() + "\n");
        System.out.print("\nNo of Tutors: " + center.getTutors().length);

        int sum = 0;
        for(int i = 0; i < center.getTutors().length; i++){
            sum += center.getTutors()[i].getStudentList().length;
        }

        System.out.println("\nNo of Total Students: " + sum);
    }

    //Display the background details of each tutor
    public void displayTutorsBackground(TuitionCenter center){

        for(int i = 0; i < center.getTutors().length; i++) {
            System.out.print("\nTutor " + (i + 1) + ": " + center.getTutors()[i].getTutorName().getName());
            System.out.print("\nTutor IC: " + center.getTutors()[i].getTutorIc());
            System.out.print("\nAddress: " + center.getTutors()[i].getTutorAddress().getFullAddress());
            System.out.println("\nNo of years in center: " + center.getTutors()[i].getTutorNoYearsInCenter());
        }
    }

    //Display the background details of each student
    public void displayStudentsBackground(TuitionCenter center){

        //To display the float numbers in two decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        for(int i = 0; i < center.getTutors().length; i++){
            System.out.print("\nTutor " + (i+1) + ": " + center.getTutors()[i].getTutorName().getName());

            for(int j = 0; j < center.getTutors()[i].getStudentList().length; j++){
                System.out.print("\n\tStudent Name: " + center.getTutors()[i].getStudentList()[j].getStudentName().getName());
                System.out.print("\n\tStudent IC: " + center.getTutors()[i].getStudentList()[j].getStudentIc());
                System.out.print("\n\tSchool name: " + center.getTutors()[i].getStudentList()[j].getStudentSchoolName());
                System.out.print("\n\tYear: Form: " + center.getTutors()[i].getStudentList()[j].getStudentYear());
                System.out.print("\n\tAverage Score: " + df.format(center.getTutors()[i].getStudentList()[j].getAverage()) + " %");
                System.out.print("\n\tHighest Score: " + df.format(center.getTutors()[i].getStudentList()[j].getMaxScore()) + " %");
                System.out.println("\n\tLowest Score: " + df.format(center.getTutors()[i].getStudentList()[j].getMinScore()) + " %");
            }
        }
    }

}
