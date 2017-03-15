package different_package.view_interaction;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cortado.Cortado;
import cortado.Start;
import different_package.Matching_Availability;
import internal.OrderedJUnit4TestRunner;

import static different_package.Availability.assertNotVisible;
import static different_package.Availability.assertVisible;

/**
 * Created by Bartosz Lipinski
 * 15.03.2017
 */
@RunWith(OrderedJUnit4TestRunner.class)
public class Start_ViewInteraction_Availability_Tests {

    private Start.ViewInteraction viewInteraction;

    @Before
    public void setup() {
        viewInteraction = Cortado.onView();
    }

    @Test
    public void returned_isNotVisible() {
        assertNotVisible(viewInteraction, "returned");
    }

    @Test
    public void getCortado_isNotVisible() {
        assertNotVisible(viewInteraction, "getCortado");
    }

    @Test
    public void not_isVisible() {
        assertVisible(viewInteraction, "not");
    }

    @Test
    public void matchingMethods_areVisible() {
        Matching_Availability.with(viewInteraction).assertAllMethodsAreVisible();
    }
}
