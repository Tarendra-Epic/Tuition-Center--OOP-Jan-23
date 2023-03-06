import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Declare the objects and input values via constructors
        TuitionCenter center1 = new TuitionCenter("John", "Wick", "Hero", 2,"51", "Jalan Indah", "32610",  "Seri Iskandar", "Johor");
        Tutor tutor1 = new Tutor("James", "Bond", "Steve", "123456789", "53", "Jalan Indah 2", "32610",  "Seri Iskandar", "Perak", "Degree in Masters", 35,
                                    new Date("31", "April", "2023"), 2, 3);
        Tutor tutor2 = new Tutor("Iron", "Tony", "Stark", "234567891", "52", "Jalan Indah 3", "32610",  "Seri Iskandar", "Perak", "Degree in Foundation", 35,
                                    new Date("23", "May", "2023"), 1, 3);

        Tutor tutorList[] = {tutor1, tutor2};

        center1.setTutors(tutorList);

        //Create objects for new students and input values
        for(int i = 0; i < tutorList.length; i++) {
            for (int j = 1; j <= 3; j++) {

                Student student = new Student(new Name("Student #" + j), "1230012314", new Address("51", "Jalan Baru", "32610", "Seri Iskandar", "Perak"), 5, "SMK UTP");
                float score[] = {85, 92, 97, 73, 81, 89, 91};
                student.setScore(score);
                tutorList[i].setStudents(student, j-1);
            }
        }

        //Declaration of variables
        String response = "Y";
        Scanner scanner = new Scanner(System.in);
        DisplayInfo display = new DisplayInfo();

        //Call the method to display the output
        display.displayCenterInfo(center1);

        System.out.print("\nDo you want to view the tutors' background? [Y/N]: ");
        response = scanner.nextLine();   //Get the response from user

        if (response.toUpperCase().equals("Y")){
            display.displayTutorsBackground(center1);
        }

        System.out.print("\nDo you want to view the students' background? [Y/N]: ");
        response = scanner.nextLine();   //Get the response from user

        if (response.toUpperCase().equals("Y")){
            display.displayStudentsBackground(center1);
        }


    }

}
