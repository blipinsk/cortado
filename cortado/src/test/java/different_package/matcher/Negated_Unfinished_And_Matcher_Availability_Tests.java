package different_package.matcher;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cortado.Cortado;
import cortado.Negated;
import cortado.Unfinished;
import different_package.Matching_Availability;
import internal.OrderedJUnit4TestRunner;

import static different_package.Availability.assertNotVisible;
import static different_package.Availability.assertVisible;

/**
 * Created by Bartosz Lipinski
 * 15.03.2017
 */
@RunWith(OrderedJUnit4TestRunner.class)
public class Negated_Unfinished_And_Matcher_Availability_Tests {

    private Negated.Unfinished.And.Matcher matcher;

    @Before
    public void setup() {
        matcher = Cortado.view().withText("text").and().not();
    }

    @Test
    public void returned_isNotVisible() {
        assertNotVisible(matcher, "returned");
    }

    @Test
    public void getCortado_isNotVisible() {
        assertNotVisible(matcher, "getCortado");
    }

    @Test
    public void matchingMethods_areVisible() {
        Matching_Availability.with(matcher).assertAllMethodsAreVisible();
    }
}
