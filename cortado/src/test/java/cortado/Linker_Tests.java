package cortado;

import android.view.View;

import org.hamcrest.Matcher;
import org.hamcrest.core.AllOf;
import org.hamcrest.core.AnyOf;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import internal.Order;
import internal.OrderedJUnit4TestRunner;
import internal.SimpleWrappingViewMatcher;

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
        //given
        List<Matcher<? super View>> matchers = new ArrayList<>();
        matchers.add(new SimpleWrappingViewMatcher<>(null));
        matchers.add(new SimpleWrappingViewMatcher<>(null));

        //when
        REGULAR.link(matchers);

        //then -> throws exception handled by `expected`
    }

    @Test
    @Order(2)
    public void regular_returnsFirst() {
        //given
        List<Matcher<? super View>> matchers = new ArrayList<>();
        Matcher<View> matcher = new SimpleWrappingViewMatcher<>(null);
        matchers.add(matcher);

        //when
        Matcher<? super View> link = REGULAR.link(matchers);

        //then
        assertThat(link).isEqualTo(matcher);
    }

    @Test
    public void and_returns_instanceOf_AllOf() {
        //given
        List<Matcher<? super View>> matchers = new ArrayList<>();
        Matcher<View> matcher = new SimpleWrappingViewMatcher<>(null);
        matchers.add(matcher);

        //when
        Matcher<? super View> link = AND.link(matchers);

        //then
        assertThat(link).isInstanceOf(AllOf.class);
    }

    @Test
    public void or_returns_instanceOf_AnyOf() {
        //given
        List<Matcher<? super View>> matchers = new ArrayList<>();
        Matcher<View> matcher = new SimpleWrappingViewMatcher<>(null);
        matchers.add(matcher);

        //when
        Matcher<? super View> link = OR.link(matchers);

        //then
        assertThat(link).isInstanceOf(AnyOf.class);
    }
}
