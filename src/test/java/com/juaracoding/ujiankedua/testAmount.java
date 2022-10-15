package com.juaracoding.ujiankedua;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testAmount {
    Account account;
    Amount amount;

    @BeforeMethod
    public void setUp(){
        account = new Account();
        account.name = "Widya Fitri";
        account.acc_no = 17211111;
        account.amount = 500000;
        account.withdraw(5000);

    }

    @Test
    public void Insert(){
        account.name = "Widya Fitri";
        account.acc_no = 17211111;
        account.amount = 50000;
        account.display();

    }

    @Test
    @Parameters
    public void Asserttrue (String text){
        String actual = "Input Data Berhasil";
        String expect = "Input Data Berhasil";
        Assert.assertTrue(actual.equals(expect));
    }

}
