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
public class Cortado_And_ViewInteraction_Availability_Tests {

    private Cortado.And.ViewInteraction viewInteraction;

    @Before
    public void setup() {
        viewInteraction = Cortado.onView().withText("text").and().isDisplayed();
    }

    @Test
    public void and_isVisible() {
        assertVisible(viewInteraction, "and");
    }
}
