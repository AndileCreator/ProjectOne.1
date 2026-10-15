package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StudentDetails John = new StudentDetails();
        System.out.println("Student name is: " + John.stdName);
        System.out.println("Student age is: " + John.stdAge);
        System.out.println("Student average marks are:" + John.avgMarks);
        System.out.println("Is the student registered: " + John.isReg);

        ShoppingTotal banana = new ShoppingTotal("Banana",8,12,0.20);
        banana.totalCost();

        TemperatureConversion heat = new TemperatureConversion(40,40);
        heat.fa();
        heat.ce();

        PassOrFail results = new PassOrFail(50);
        results.Pass();
        results.Fail();
        results.Invalid();

        GradeCalculator vd = new GradeCalculator(20);
        vd.Outcome();

        NumberAnalysis dv = new NumberAnalysis(32);
        dv.Check();
        dv.OddEven();

        LoginCheck credentials = new LoginCheck("Andile","12345678");
        credentials.Validation("magwaza","987654321");
        credentials.Validation("Andile","987654321");
        LoginCheck credentials2 = new LoginCheck("Andile","123456789");
        credentials2.Validation("Andile","123456789");

        StoreStudentMarks ssm = new StoreStudentMarks(new int[]{30, 32, 24, 34, 40});
        ssm.StoredMarks();
        ssm.SumMarks();
        ssm.AvgMarks();

        FullStack fs = new FullStack("Andile",23, "Male");
        fs.showDetails();

        Car c1 = new Car("Red", "Toyota", "Camry", 2020);
        Car c2 = new Car("Blue", "Ford", "Bakkie", 2021);
        Car c3 = new Car("Green", "BMW", "SUV", 2022);

        Car[] cars = {c1,c2,c3};
        for (Car car : cars) {
            car.display();
        }

        HighestAndLowestValues halv = new HighestAndLowestValues(new int[]{120,90,30,50,70,77,654});
        halv.highestValue();
        halv.lowestValue();
        halv.numOfElements();
        halv.numGreaterEqual();


        SearchAnArray saa = new SearchAnArray(new int []{10,30,20,24,30,40,30,77},30);
        saa.targetValueIndex();
        saa.foundTimes();
    }

}
