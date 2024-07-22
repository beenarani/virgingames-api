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
public class JackPotAssertionTest extends TestBase {

    @Steps
    JackpotSteps jackpotSteps;


    @Title("Test001- Verify Currency is GBP")
    @Test
    public void test001() {
        jackpotSteps.getJackpotInfo().body("data.pots.currency", everyItem(equalTo("GBP")));
    }

    @Title("Test002- Verify Jackpot id is Bingo")
    @Test
    public void test002(){
        jackpotSteps.getJackpotInfo().body("data.jackpotId",equalTo("Bingo"));
    }


}
