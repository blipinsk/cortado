package cortado;

import android.view.View;

import org.hamcrest.Matcher;
import org.hamcrest.core.AllOf;
import org.hamcrest.core.AnyOf;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import cortado.internal.Order;
import cortado.internal.OrderedJUnit4TestRunner;
import cortado.internal.SimpleWrappingViewMatcher;

import static com.google.common.truth.Truth.assertThat;
import static cortado.Linker.AND;
import static cortado.Linker.OR;
import static cortado.Linker.REGULAR;

/**
 * Created by Bartosz Lipinski
 * 18.02.2017
 */
@RunWith(OrderedJUnit4TestRunner.class)
public class Linker_Tests {

    @Test(expected = IllegalArgumentException.class)
    @Order(1)
    public void regular_throws_IfMoreThanOne() {
        List<Matcher<? super View>> matchers = new ArrayList<>();
        matchers.add(new SimpleWrappingViewMatcher<>(null));
        matchers.add(new SimpleWrappingViewMatcher<>(null));
        REGULAR.link(matchers);
    }

    @Test
    @Order(2)
    public void regular_returnsFirst() {
        List<Matcher<? super View>> matchers = new ArrayList<>();
        Matcher<View> matcher = new SimpleWrappingViewMatcher<>(null);
        matchers.add(matcher);
        assertThat(REGULAR.link(matchers)).isEqualTo(matcher);
    }

    @Test
    public void and_returns_instanceOf_AllOf(){
        List<Matcher<? super View>> matchers = new ArrayList<>();
        Matcher<View> matcher = new SimpleWrappingViewMatcher<>(null);
        matchers.add(matcher);
        assertThat(AND.link(matchers)).isInstanceOf(AllOf.class);
    }

    @Test
    public void or_returns_instanceOf_AnyOf(){
        List<Matcher<? super View>> matchers = new ArrayList<>();
        Matcher<View> matcher = new SimpleWrappingViewMatcher<>(null);
        matchers.add(matcher);
        assertThat(OR.link(matchers)).isInstanceOf(AnyOf.class);
    }
}
