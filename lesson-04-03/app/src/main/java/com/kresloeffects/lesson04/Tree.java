package com.kresloeffects.lesson04;

/**
 * Created by nogte on 18.01.2016.
 */
public class Tree {
    private Departmant director = new Departmant("Директорат");
    private Departmant bugalter = new Departmant("Директорат");
    private Departmant upravlenie = new Departmant("Директорат");
    private Departmant uprRazrabotkoi = new Departmant("Директорат");
    private Departmant uprTestirovaniem = new Departmant("Директорат");
    private Departmant razPO = new Departmant("Директорат");
    private Departmant razMobile = new Departmant("Директорат");
    private Departmant testFunkcionalnoe = new Departmant("Директорат");
    private Departmant testKachestvo = new Departmant("Директорат");

    public Tree(){
        addPersons();
        addChildsDepartmant();
    }

    private void addPersons(){
        director.addPerson("Nikodim", "Kozlovskiy", 50, 1200);
        bugalter.addPerson("Nikodim", "Kozlovskiy", 30, 1000);
        bugalter.addPerson("Nikodim", "Kozlovskiy", 35, 900);
        upravlenie.addPerson("Nikodim", "Kozlovskiy", 18, 950);
        upravlenie.addPerson("Nikodim", "Kozlovskiy", 39, 900);
        uprRazrabotkoi.addPerson("Nikodim", "Kozlovskiy", 50, 800);
        uprTestirovaniem.addPerson("Nikodim", "Kozlovskiy", 22, 850);
        razPO.addPerson("Nikodim", "Kozlovskiy", 50, 1000);
        razPO.addPerson("Nikodim", "Kozlovskiy", 26, 1100);
        razMobile.addPerson("Nikodim", "Kozlovskiy", 21, 750);
        testFunkcionalnoe.addPerson("Nikodim", "Kozlovskiy", 18, 700);
        testFunkcionalnoe.addPerson("Nikodim", "Kozlovskiy", 18, 550);
        testKachestvo.addPerson("Nikodim", "Kozlovskiy", 50, 600);
    }
    private void addChildsDepartmant(){
        director.addChildDepartmant(bugalter);
        director.addChildDepartmant(upravlenie);
        upravlenie.addChildDepartmant(uprRazrabotkoi);
        upravlenie.addChildDepartmant(uprTestirovaniem);
        uprRazrabotkoi.addChildDepartmant(razPO);
        uprRazrabotkoi.addChildDepartmant(razMobile);
        uprTestirovaniem.addChildDepartmant(testFunkcionalnoe);
        uprTestirovaniem.addChildDepartmant(testKachestvo);
    }
    protected Departmant getRoot(){
        return this.director;
    }

}
