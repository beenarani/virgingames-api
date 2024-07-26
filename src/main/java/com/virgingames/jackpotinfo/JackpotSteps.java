package com.virgingames.jackpotinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class JackpotSteps {

    @Step("Get jackpot information by id-ROXOR")
    public ValidatableResponse getJackpotInfo(){
        return SerenityRest.given().
                queryParams("currency","GBP")
                .when()
                .get(EndPoints.GET_JACKPOT_ROXOR)
                .then();
    }
}
