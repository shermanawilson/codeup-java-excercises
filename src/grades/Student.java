package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    //The grades property should be an ArrayList of integers
    private ArrayList<Integer> grades;

    // have a constructor that sets name property,
    // and initializes the grades property as an empty ArrayList.
    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        // for i loop
        //Step 1: Calculate sum of grades

        double sum = 0;
        for (Integer grade : this.grades) {
                    sum += grade;
        }
        return sum / this.grades.size();

        //Step 2: Return sum / num of grades

    }

    public static void main(String[] args) {

        Student shy = new Student("Shy");
        shy.addGrade(58);
        shy.addGrade(95);
        shy.addGrade(59);

        System.out.println(shy.getGradeAverage());

    }
}
