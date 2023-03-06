import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        String randomLetters = "dcblachdsnxslhdfvilykhcvsd";


        for (int i = 0; i <students.length ; i++) {
            Student s = new Student(i,randomLetters.charAt(i)+"xyz",randomLetters.charAt(i+2)+"abc",(i+32));
            students[i] = s;
        }

        System.out.println("Zadaj parameter podla ktoreho chces sortovat: (id, name, surname, age)");
        String choiceMenu = sc.nextLine();
        System.out.println("Zadaj asc/ desc (0/1)");
        int ascChoice = sc.nextInt();


        for (Student s: sortedArr(students,choiceMenu,ascChoice)){
            System.out.println(s.toString());
        }

    }

    public static Student[] sortedArr(Student[] students, String whatToSort, int asc){
        switch(whatToSort.toLowerCase()){
            case "id":
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getID() - o2.getID();
                    }
                });
                break;

            case "name":
                //sortByName
                System.out.println("turuuru");
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {

                        return o1.getName().compareTo(o2.getName());
                    }
                });
                break;

            case "surname":
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getSurname().compareTo(o2.getSurname());
                    }
                });
                break;

            case "age":
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getAge() - o2.getAge();
                    }
                });
                break;

        }


        if (asc == 0) {
            Collections.reverse(Arrays.asList(students));
        } else {
            Collections.reverse(Arrays.asList(students));
        }

        return students;
    }




}
