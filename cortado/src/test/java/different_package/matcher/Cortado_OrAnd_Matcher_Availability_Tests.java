package different_package.matcher;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cortado.Cortado;
import internal.OrderedJUnit4TestRunner;

import static different_package.Availability.assertNotVisible;
import static different_package.Availability.assertVisible;

/**
 * Created by Bartosz Lipinski
 * 15.03.2017
 */
@RunWith(OrderedJUnit4TestRunner.class)
public class Cortado_OrAnd_Matcher_Availability_Tests {

    private Cortado.OrAnd.Matcher matcher;

    @Before
    public void setup() {
        matcher = Cortado.view().withText("text");
    }

    @Test
    public void or_isVisible() {
        assertVisible(matcher, "or");
    }

    @Test
    public void and_isVisible() {
        assertVisible(matcher, "and");
    }
}
