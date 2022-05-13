package Employeewagebuilder;

public class Employeewagebuilder {
         static final int IS_FULL_TIME = 1;

    public static void main(String[] args) {

        System.out.println("welcome to computation problem");
        double a = Math.floor(Math.random() * 10) % 2;

        if (a == IS_FULL_TIME)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
