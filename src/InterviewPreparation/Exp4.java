package InterviewPreparation;

public class Exp4 {

    public class Parent{
        void display(){
            System.out.println("Inside parent class");
        }
    }

    public class child extends Parent{
        @Override
        void display(){
            System.out.println("inside child class");
        }
    }

    public static void main(String[] args) {
        Exp4 e = new Exp4();
        Parent p = e.new child();
        p.display();
    }
}
