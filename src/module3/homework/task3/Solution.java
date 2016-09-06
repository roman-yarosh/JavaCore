package module3.homework.task3;

import java.util.Date;

public class Solution {
    public static void main (String[] args) {
        Course course1 = new Course(new Date(), "Java Core");
        Course course2 = new Course(new Date(), "Java EE");
        Course course3 = new Course(new Date(), "Java Android");
        Course course4 = new Course("Front-end", 175, "Peter");
        Course course5 = new Course("Back-end", 175, "Victor");

        Student student1 = new Student("Roman", "Yarosh", 5);
        Course[] coursesIvanov = {course1, course2};
        Student student2 = new Student("Ivanov", coursesIvanov);

        CollegeStudent collegeStudent1 = new CollegeStudent("Ivan", "Ivanov", 1, "GoIT", 100, 1);
        CollegeStudent collegeStudent2 = new CollegeStudent("Peter", "Petrov", 2);
        Course[] coursesStepanov = {course3, course4, course5};
        CollegeStudent collegeStudent3 = new CollegeStudent("Stepanov", coursesStepanov);

        SpecialStudent specialStudent1 = new SpecialStudent("Victor", "Sidorov", 3, "GoIT", 100, 2);
        SpecialStudent specialStudent2 = new SpecialStudent("Evgen", "Tihonov", 4);
        Course[] coursesSvetlov = {course1, course3};
        SpecialStudent specialStudent3 = new SpecialStudent("Svetlov", coursesSvetlov);
        SpecialStudent specialStudent4 = new SpecialStudent("Dima", "White", 5, 1234567890123456789L);
    }
}
