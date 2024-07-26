package com.virgingames.testsuite;

import com.virgingames.jackpotinfo.JackpotSteps;
import com.virgingames.testbase.TestBase;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.*;

@RunWith(SerenityRunner.class)
public class Assertion extends TestBase {

    @Steps
    JackpotSteps jackpotSteps;


    @Title("Verify Currency is GBP")
    @Test
    public void test001() {
        jackpotSteps.getJackpotInfo().body("data.pots.currency", everyItem(equalTo("GBP")));
    }

    @Title("Verify Jackpot id is ROXOR")
    @Test
    public void test002(){
        jackpotSteps.getJackpotInfo().body("data.jackpotId",equalTo("Roxor Progressives"));
    }


}
