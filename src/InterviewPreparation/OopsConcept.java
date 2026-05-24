package InterviewPreparation;

public class OopsConcept {
 //Encapsulation - hide internal implementation only show required features to the user
    public class BankAccount{
        private double balance;
        private final String accountNumber;

        public BankAccount(String accountNumber, double initialBalance){
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }
        public double getBalance(){
            return balance;
        }
        public void deposit(double amount){
            if(amount <= 0) throw new IllegalArgumentException("Amount must be positive");
            balance += amount;
        }

        public boolean withdraw(double amount){
            if(amount>0 && amount <= balance){
                balance -= amount;
                return true;
            }
            return false;
        }


    //Inheritance - Reuse via IS-A relationship

    public abstract class Vehicle {
        protected String brand;
        protected int year;

        public final void startJourney() {
            startEngine();
            checkSafety();
            move();
        }

        protected abstract void startEngine();

        protected abstract void move();

        private void checkSafety() {
            System.out.println("safety checks completed");
        }

        public class Car extends Vehicle {
            private int numberOfDoors;

            public Car(String brand, int year, int numberOfDoors) {
                super.brand = brand;
                super.year = year;
                this.numberOfDoors = numberOfDoors;
            }

            @Override
            protected void startEngine() {
                System.out.println("Car engine started");
            }

            @Override
            protected void move() {
                System.out.println("Car is moving");
            }

            // Method Overloading (compile-time polymorphism)
            public void honk() {
                System.out.println("Beep!");
            }

            public void honk(int times) {
                for (int i = 0; i < times; i++) System.out.println("Beep!");
            }

        }
    }


    //Polymorphism - one interface, many implementation

     public class VehicleDemo {
         public static void main(String[] args) {
             Vehicle[] vehicles = {
//                     new Car("Toyota", 2023, 4),
//                     new Motorcycle("Honda", 2022),
//                     new Truck("Ford", 2021, 10000)
             };

             for (Vehicle v : vehicles) {
                 v.startJourney();  // Resolved at runtime
             }
         }
     }

     public static void main(String[] args) {

     }
    }

}
