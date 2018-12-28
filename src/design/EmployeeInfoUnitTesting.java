package design;

import org.testng.Assert;



public class EmployeeInfoUnitTesting {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

        EmployeeInfo employee1 = new EmployeeInfo("John", 1212);
     
        int result1 = cal.salary(8000, 12);
        Assert.assertEquals(96000);
        int result2 = cal.bonus(8000, .1, 12);
        Assert.assertEquals(9600);
        int result3 = cal.pension(8000, .25);
        Assert.assertEquals(2000);

        //Assert.assertEquals(EmployeeInfo.calculateEmployeeSalary());
        //Assert.assertEquals(EmployeeInfo.calculateEmployeeBonus((8000, 8), 9600);
        //Assert.assertEquals(EmployeeInfo.calculateEmployeePension((8000), 2000 );

    }
}
