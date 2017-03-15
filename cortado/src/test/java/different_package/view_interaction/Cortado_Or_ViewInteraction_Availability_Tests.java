package different_package.view_interaction;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cortado.Cortado;
import internal.OrderedJUnit4TestRunner;

import static different_package.Availability.assertVisible;

/**
 * Created by Bartosz Lipinski
 * 15.03.2017
 */
@RunWith(OrderedJUnit4TestRunner.class)
public class Cortado_Or_ViewInteraction_Availability_Tests {

    private Cortado.Or.ViewInteraction viewInteraction;

    @Before
    public void setup() {
        viewInteraction = Cortado.onView().withText("text").or().isDisplayed();
    }

    @Test
    public void or_isVisible() {
        assertVisible(viewInteraction, "or");
    }
}
