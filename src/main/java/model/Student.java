package model;

interface Citizen {
    String getAdress();
    int getIdentityCardNumber();

}

public abstract class Student {

    String name;
    String id;
    String major;
    String adress;

    public Student(String name, String id, String major, String adress) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.adress = adress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    void goToUniversity () {
        System.out.println("The Student goes to university");
    }

    void graduateFromUniversity () {
        System.out.println("The Student graduates from university");
    }

    abstract void goOutForLunch();
}

class BiologyStudent extends Student implements Citizen {

    public BiologyStudent(String name, String id, String major, String adress) {
        super(name, id, major, adress);
    }

    public String getAdress () {
        String adress = "Hamburg";
        return adress;
    }

    public int getIdentityCardNumber () {
        int number = 123;
        return number;
    }

    @Override
    void goOutForLunch(){
            System.out.println("The CS-Student has a lunch at home");
    }

}

class ComputerSceinceStudent extends Student implements Citizen {

    public ComputerSceinceStudent(String name, String id, String major, String adress) {
        super(name, id, major, adress);
    }

    public String getAdress(){
        String adress = "Berlin";
        return adress;
    }

    public int getIdentityCardNumber () {
        int number = 234;
        return number;
    }

    @Override
    void goToUniversity () {
        super.goToUniversity();
        System.out.println("The CS-Student goes to the new campus");
    }

    @Override
    void goOutForLunch(){
        System.out.println("The CS-Student has a lunch at home");
    }

}

class ComputerScienceStudentFirstYear extends ComputerSceinceStudent {
    String year;
    public ComputerScienceStudentFirstYear(String name, String id, String major, String adress, String year) {
        super(name, id, major, adress);
        this.year = year;
    }

    @Override
    void goOutForLunch(){
        System.out.println("The CS-Student has a lunch in the cafeteria");
    }

}

class Main {
    public static void main(String[] args) {
        ComputerSceinceStudent csStudent = new ComputerSceinceStudent ("CS-Student", "123", "Computer Science", "Hamburg");
        BiologyStudent bioStudent = new BiologyStudent("Bio-Student", "456", "Biology", "Berlin");
        csStudent.goToUniversity();
        csStudent.graduateFromUniversity();
        System.out.println("The Student: " + csStudent.name + " is majoring in " + csStudent.major);
        System.out.println("The Student: " + csStudent.name + " has an ID Card with Number: " + csStudent.getIdentityCardNumber());
        System.out.println("The Student: " + csStudent.name + " lives in " + csStudent.getAdress());
        System.out.println("The Student: " + bioStudent.name + " is majoring in " + bioStudent.major);
        System.out.println("The Student: " + bioStudent.name + " has an ID Card with Number: " + bioStudent.getIdentityCardNumber());
        System.out.println("The Student: " + bioStudent.name + " lives in " + bioStudent.getAdress());
    }
}



