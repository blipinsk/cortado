package cortado;

import android.annotation.SuppressLint;
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;
import android.widget.ImageView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import internal.OrderedJUnit4TestRunner;
import internal.SimpleMatcher;
import internal.Utils;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Bartosz Lipinski
 * 01.03.2017
 */
@RunWith(OrderedJUnit4TestRunner.class)
public class NotCompletable_Tests {

    private Cortado cortado;
    private NotCompletable<Void> notCompletable;

    @Before
    public void setup() {
        cortado = Cortado.view().getCortado();
        assertThat(cortado.matchers).hasSize(0);
        notCompletable = new NotCompletable<Void>(cortado) {
            @Override
            Void returned() {
                return null;
            }
        };
    }

    private void assertExpectedAddedMatcher(org.hamcrest.Matcher<View> expectedMatcher) {
        assertThat(cortado.matchers).hasSize(1);
        Utils.assertThat(cortado.matchers.get(0)).isEqualTo(expectedMatcher);
    }

    @Test
    public void isAssignableFrom_addsCorrectMatcher() {
        //given
        final Class<ImageView> test = ImageView.class;

        //when
        notCompletable.isAssignableFrom(test);
        assertExpectedAddedMatcher(ViewMatchers.isAssignableFrom(test));
    }

    @Test
    public void withClassName_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withClassName(testMatcher);
        assertExpectedAddedMatcher(ViewMatchers.withClassName(testMatcher));
    }

    @Test
    public void isDisplayed_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isDisplayed();
        assertExpectedAddedMatcher(ViewMatchers.isDisplayed());
    }

    @Test
    public void isCompletelyDisplayed_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isCompletelyDisplayed();
        assertExpectedAddedMatcher(ViewMatchers.isCompletelyDisplayed());
    }

    @Test
    public void isDisplayingAtLeast_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isDisplayingAtLeast(5);

        //then
        assertExpectedAddedMatcher(ViewMatchers.isDisplayingAtLeast(5));
    }

    @Test
    public void isEnabled_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isEnabled();

        //then
        assertExpectedAddedMatcher(ViewMatchers.isEnabled());
    }

    @Test
    public void isFocusable_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isFocusable();

        //then
        assertExpectedAddedMatcher(ViewMatchers.isFocusable());
    }

    @Test
    public void hasFocus_addsCorrectMatcher() {
        //given
        //when
        notCompletable.hasFocus();

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasFocus());
    }

    @Test
    public void isSelected_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isSelected();

        //then
        assertExpectedAddedMatcher(ViewMatchers.isSelected());
    }

    @Test
    public void hasSibling_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.hasSibling(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasSibling(testMatcher));
    }

    @Test
    public void hasSibling_withCortadoMatcher_addsCorrectMatcher() {
        //given
        Matcher testMatcher = Cortado.view().withText("Test");

        //when
        notCompletable.hasSibling(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasSibling(testMatcher));
    }

    @SuppressLint("ResourceType")
    @Test
    public void withContentDescription_withResource_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withContentDescription(1);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withContentDescription(1));
    }

    @Test
    public void withContentDescription_withString_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withContentDescription("test");

        //then
        assertExpectedAddedMatcher(ViewMatchers.withContentDescription("test"));
    }

    @Test
    public void withContentDescription_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<CharSequence> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withContentDescription(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withContentDescription(testMatcher));
    }

    @SuppressLint("ResourceType")
    @Test
    public void withId_withResource_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withId(1);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withId(1));
    }

    @Test
    public void withId_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<Integer> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withId(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withId(testMatcher));
    }

    @Test
    public void withResourceName_withString_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withResourceName("test");

        //then
        assertExpectedAddedMatcher(ViewMatchers.withResourceName("test"));
    }

    @Test
    public void withResourceName_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withResourceName(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withResourceName(testMatcher));
    }

    @Test
    public void withTagKey_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withTagKey(1);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withTagKey(1));
    }

    @Test
    public void withTagKey_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<Object> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withTagKey(1, testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withTagKey(1, testMatcher));
    }

    @Test
    public void withTagValue_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<Object> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withTagValue(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withTagValue(testMatcher));
    }

    @Test
    public void withText_withString_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withText("test");

        //then
        assertExpectedAddedMatcher(ViewMatchers.withText("test"));
    }

    @Test
    public void withText_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withText(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withText(testMatcher));
    }

    @SuppressLint("ResourceType")
    @Test
    public void withText_withResource_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withText(1);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withText(1));
    }

    @Test
    public void withHint_withString_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withHint("test");

        //then
        assertExpectedAddedMatcher(ViewMatchers.withHint("test"));
    }

    @Test
    public void withHint_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withHint(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withHint(testMatcher));
    }

    @SuppressLint("ResourceType")
    @Test
    public void withHint_withResource_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withHint(1);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withHint(1));
    }

    @Test
    public void isChecked_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isChecked();

        //then
        assertExpectedAddedMatcher(ViewMatchers.isChecked());
    }

    @Test
    public void isNotChecked_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isNotChecked();

        //then
        assertExpectedAddedMatcher(ViewMatchers.isNotChecked());
    }

    @Test
    public void hasContentDescription_addsCorrectMatcher() {
        //given
        //when
        notCompletable.hasContentDescription();

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasContentDescription());
    }

    @Test
    public void hasDescendant_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.hasDescendant(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasDescendant(testMatcher));
    }

    @Test
    public void hasDescendant_withCortadoMatcher_addsCorrectMatcher() {
        //given
        Matcher testMatcher = Cortado.view().withText("Test");

        //when
        notCompletable.hasDescendant(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasDescendant(testMatcher));
    }

    @Test
    public void isClickable_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isClickable();

        //then
        assertExpectedAddedMatcher(ViewMatchers.isClickable());
    }

    @Test
    public void isDescendantOfA_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.isDescendantOfA(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.isDescendantOfA(testMatcher));
    }

    @Test
    public void isDescendantOfA_withCortadoMatcher_addsCorrectMatcher() {
        //given
        Matcher testMatcher = Cortado.view().withText("Test");

        //when
        notCompletable.isDescendantOfA(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.isDescendantOfA(testMatcher));
    }

    @Test
    public void withEffectiveVisibility_addsCorrectMatcher() {
        //given
        ViewMatchers.Visibility testVisibility = ViewMatchers.Visibility.GONE;

        //when
        notCompletable.withEffectiveVisibility(testVisibility);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withEffectiveVisibility(testVisibility));
    }

    @Test
    public void withParent_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withParent(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withParent(testMatcher));
    }

    @Test
    public void withParent_withCortadoMatcher_addsCorrectMatcher() {
        //given
        Matcher testMatcher = Cortado.view().withText("Test");

        //when
        notCompletable.withParent(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withParent(testMatcher));
    }

    @Test
    public void withChild_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withChild(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withChild(testMatcher));
    }

    @Test
    public void withChild_withCortadoMatcher_addsCorrectMatcher() {
        //given
        Matcher testMatcher = Cortado.view().withText("Test");

        //when
        notCompletable.withChild(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withChild(testMatcher));
    }

    @Test
    public void isRoot_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isRoot();

        //then
        assertExpectedAddedMatcher(ViewMatchers.isRoot());
    }

    @Test
    public void supportsInputMethods_addsCorrectMatcher() {
        //given
        //when
        notCompletable.supportsInputMethods();

        //then
        assertExpectedAddedMatcher(ViewMatchers.supportsInputMethods());
    }

    @Test
    public void hasImeAction_withInteger_addsCorrectMatcher() {
        //given
        //when
        notCompletable.hasImeAction(1);

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasImeAction(1));
    }

    @Test
    public void hasImeAction_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<Integer> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.hasImeAction(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasImeAction(testMatcher));
    }

    @Test
    public void hasLinks_addsCorrectMatcher() {
        //given
        //when
        notCompletable.hasLinks();

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasLinks());
    }

    @SuppressLint("ResourceType")
    @Test
    public void withSpinnerText_withResource_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withSpinnerText(1);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withSpinnerText(1));
    }

    @Test
    public void withSpinnerText_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.withSpinnerText(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withSpinnerText(testMatcher));
    }

    @Test
    public void withSpinnerText_withString_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withSpinnerText("test");

        //then
        assertExpectedAddedMatcher(ViewMatchers.withSpinnerText("test"));
    }

    @Test
    public void isJavascriptEnabled_addsCorrectMatcher() {
        //given
        //when
        notCompletable.isJavascriptEnabled();

        //then
        assertExpectedAddedMatcher(ViewMatchers.isJavascriptEnabled());
    }

    @Test
    public void hasErrorText_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.hasErrorText(testMatcher);

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasErrorText(testMatcher));
    }

    @Test
    public void hasErrorText_addsCorrectMatcher() {
        //given
        //when
        notCompletable.hasErrorText("test");

        //then
        assertExpectedAddedMatcher(ViewMatchers.hasErrorText("test"));
    }

    @Test
    public void withInputType_addsCorrectMatcher() {
        //given
        //when
        notCompletable.withInputType(1);

        //then
        assertExpectedAddedMatcher(ViewMatchers.withInputType(1));
    }

    @Test
    public void matching_withMatcher_addsCorrectMatcher() {
        //given
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();

        //when
        notCompletable.matching(testMatcher);

        //then
        assertExpectedAddedMatcher(testMatcher);
    }

    @Test
    public void matching_withCortadoMatcher_addsCorrectMatcher() {
        //given
        Matcher testMatcher = Cortado.view().withText("Test");

        //when
        notCompletable.matching(testMatcher);

        //then
        assertExpectedAddedMatcher(testMatcher);
    }
}
