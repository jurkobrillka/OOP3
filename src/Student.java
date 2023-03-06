import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Student {





    private int ID;
    //moze byt ID velkym alebo ma byt ako premenna malym?
    private String name;

    private String surname;

    private int age;

    public Student(){

    };

    public Student(int ID, String name, String surname, int age) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public void createStudents(){
        String randomLetters = "dcblachdsnxslhdfvilykhcvsd";
        for (int i = 0; i < Main.students.length ; i++) {
            Student s = new Student(i,randomLetters.charAt(i)+"xyz",randomLetters.charAt(i+2)+"abc",(i+32));
            Main.students[i] = s;
        }
    }

    public void sortingStudents(){
        System.out.println("Zadaj parameter podla ktoreho chces sortovat: (id, name, surname, age)");
        String choiceMenu = Main.sc.nextLine();
        System.out.println("Zadaj asc/ desc (0/1)");
        int ascChoice = Main.sc.nextInt();


        for (Student s: sortedArr(Main.students,choiceMenu,ascChoice)){
            System.out.println(s.toString());
        }
    }

    public Student[] sortedArr(Student[] students, String whatToSort, int asc){
        switch(whatToSort.toLowerCase()){
            case "id":
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getID() - o2.getID();
                    }
                });
                break;
                //TODO testgit

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