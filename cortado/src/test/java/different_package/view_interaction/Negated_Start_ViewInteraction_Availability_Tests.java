package different_package.view_interaction;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cortado.Cortado;
import cortado.Negated;
import different_package.Matching_Availability;
import internal.OrderedJUnit4TestRunner;

import static different_package.Availability.assertNotVisible;

/**
 * Created by Bartosz Lipinski
 * 15.03.2017
 */
@RunWith(OrderedJUnit4TestRunner.class)
public class Negated_Start_ViewInteraction_Availability_Tests {

    private Negated.Start.ViewInteraction viewInteraction;

    @Before
    public void setup() {
        viewInteraction = Cortado.onView().not();
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
    public void matchingMethods_areVisible() {
        Matching_Availability.with(viewInteraction).assertAllMethodsAreVisible();
    }
}
