package different_package.matcher;

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
public class Cortado_And_Matcher_Availability_Tests {

    private Cortado.And.Matcher matcher;

    @Before
    public void setup() {
        matcher = Cortado.view().withText("text").and().isDisplayed();
    }

    @Test
    public void and_isVisible() {
        assertVisible(matcher, "and");
    }
}
