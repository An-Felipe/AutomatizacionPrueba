package starter.cart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.login.DoLogin;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoCart implements Task {




    public DoCart(){

    }

    public static Performable addCart(){
        return instrumented(DoCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(cart.BUTTON_BACKPACK),
                Click.on(cart.BUTTON_LIGHT),
                Click.on(cart.BUTTON_SHIRT)

        );
    }
}
