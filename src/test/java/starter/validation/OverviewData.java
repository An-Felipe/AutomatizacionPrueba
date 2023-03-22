package starter.validation;

import com.sun.jna.WString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.TextContent;

public class OverviewData implements Question<String>{
    public static Question<String>value(){
        return new OverviewData();
    }

    @Override
    public String answeredBy(Actor actor){
        return BrowseTheWeb.as(actor).find(validation.VALIDATION_CART).getText();
    }
}
