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
//        ssm.SumMarks();

        FullStack fs = new FullStack("Andile",23, "Male");
        fs.showDetails();
    }
}
