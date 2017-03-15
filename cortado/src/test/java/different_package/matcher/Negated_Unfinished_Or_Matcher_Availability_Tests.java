package different_package.matcher;

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
public class Negated_Unfinished_Or_Matcher_Availability_Tests {

    private Negated.Unfinished.Or.Matcher matcher;

    @Before
    public void setup() {
        matcher = Cortado.view().withText("text").or().not();
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
