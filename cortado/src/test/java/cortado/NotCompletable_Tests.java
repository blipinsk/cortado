package cortado;

import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;
import android.widget.ImageView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cortado.internal.OrderedJUnit4TestRunner;
import cortado.internal.SimpleMatcher;

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

    private void assertExpected(org.hamcrest.Matcher<View> expectedMatcher) {
        assertThat(cortado.matchers).hasSize(1);
        Utils.assertThat(cortado.matchers.get(0)).isEqualTo(expectedMatcher);
    }

    @Test
    public void isAssignableFrom_addsCorrectMatcher() {
        final Class<ImageView> test = ImageView.class;
        notCompletable.isAssignableFrom(test);
        assertExpected(ViewMatchers.isAssignableFrom(test));
    }

    @Test
    public void withClassName_addsCorrectMatcher() {
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        notCompletable.withClassName(testMatcher);
        assertExpected(ViewMatchers.withClassName(testMatcher));
    }

    @Test
    public void isDisplayed_addsCorrectMatcher() {
        notCompletable.isDisplayed();
        assertExpected(ViewMatchers.isDisplayed());
    }

    @Test
    public void isCompletelyDisplayed_addsCorrectMatcher() {
        notCompletable.isCompletelyDisplayed();
        assertExpected(ViewMatchers.isCompletelyDisplayed());
    }

    @Test
    public void isDisplayingAtLeast_addsCorrectMatcher() {
        notCompletable.isDisplayingAtLeast(5);
        assertExpected(ViewMatchers.isDisplayingAtLeast(5));
    }

    @Test
    public void isEnabled_addsCorrectMatcher() {
        notCompletable.isEnabled();
        assertExpected(ViewMatchers.isEnabled());
    }

    @Test
    public void isFocusable_addsCorrectMatcher() {
        notCompletable.isFocusable();
        assertExpected(ViewMatchers.isFocusable());
    }

    @Test
    public void hasFocus_addsCorrectMatcher() {
        notCompletable.hasFocus();
        assertExpected(ViewMatchers.hasFocus());
    }

    @Test
    public void isSelected_addsCorrectMatcher() {
        notCompletable.isSelected();
        assertExpected(ViewMatchers.isSelected());
    }

    @Test
    public void hasSibling_addsCorrectMatcher() {
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        notCompletable.hasSibling(testMatcher);
        assertExpected(ViewMatchers.hasSibling(testMatcher));
    }

    @Test
    public void hasSibling_withCortadoMatcher_addsCorrectMatcher() {
        Matcher testMatcher = Cortado.view().withText("Test");
        notCompletable.hasSibling(testMatcher);
        assertExpected(ViewMatchers.hasSibling(testMatcher));
    }

    @Test
    public void withContentDescription_withResource_addsCorrectMatcher() {
        //noinspection ResourceType
        notCompletable.withContentDescription(1);
        assertExpected(ViewMatchers.withContentDescription(1));
    }

    @Test
    public void withContentDescription_withString_addsCorrectMatcher() {
        notCompletable.withContentDescription("test");
        assertExpected(ViewMatchers.withContentDescription("test"));
    }

    @Test
    public void withContentDescription_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<CharSequence> testMatcher = SimpleMatcher.instance();
        notCompletable.withContentDescription(testMatcher);
        assertExpected(ViewMatchers.withContentDescription(testMatcher));
    }

    @Test
    public void withId_withResource_addsCorrectMatcher() {
        //noinspection ResourceType
        notCompletable.withId(1);
        assertExpected(ViewMatchers.withId(1));
    }

    @Test
    public void withId_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<Integer> testMatcher = SimpleMatcher.instance();
        notCompletable.withId(testMatcher);
        assertExpected(ViewMatchers.withId(testMatcher));
    }

    @Test
    public void withResourceName_withString_addsCorrectMatcher() {
        notCompletable.withResourceName("test");
        assertExpected(ViewMatchers.withResourceName("test"));
    }

    @Test
    public void withResourceName_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        notCompletable.withResourceName(testMatcher);
        assertExpected(ViewMatchers.withResourceName(testMatcher));
    }

    @Test
    public void withTagKey_addsCorrectMatcher() {
        notCompletable.withTagKey(1);
        assertExpected(ViewMatchers.withTagKey(1));
    }

    @Test
    public void withTagKey_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<Object> testMatcher = SimpleMatcher.instance();
        notCompletable.withTagKey(1, testMatcher);
        assertExpected(ViewMatchers.withTagKey(1, testMatcher));
    }

    @Test
    public void withTagValue_addsCorrectMatcher() {
        org.hamcrest.Matcher<Object> testMatcher = SimpleMatcher.instance();
        notCompletable.withTagValue(testMatcher);
        assertExpected(ViewMatchers.withTagValue(testMatcher));
    }

    @Test
    public void withText_withString_addsCorrectMatcher() {
        notCompletable.withText("test");
        assertExpected(ViewMatchers.withText("test"));
    }

    @Test
    public void withText_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        notCompletable.withText(testMatcher);
        assertExpected(ViewMatchers.withText(testMatcher));
    }

    @Test
    public void withText_withResource_addsCorrectMatcher() {
        //noinspection ResourceType
        notCompletable.withText(1);
        assertExpected(ViewMatchers.withText(1));
    }

    @Test
    public void withHint_withString_addsCorrectMatcher() {
        notCompletable.withHint("test");
        assertExpected(ViewMatchers.withHint("test"));
    }

    @Test
    public void withHint_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        notCompletable.withHint(testMatcher);
        assertExpected(ViewMatchers.withHint(testMatcher));
    }

    @Test
    public void withHint_withResource_addsCorrectMatcher() {
        //noinspection ResourceType
        notCompletable.withHint(1);
        assertExpected(ViewMatchers.withHint(1));
    }

    @Test
    public void isChecked_addsCorrectMatcher() {
        notCompletable.isChecked();
        assertExpected(ViewMatchers.isChecked());
    }

    @Test
    public void isNotChecked_addsCorrectMatcher() {
        notCompletable.isNotChecked();
        assertExpected(ViewMatchers.isNotChecked());
    }

    @Test
    public void hasContentDescription_addsCorrectMatcher() {
        notCompletable.hasContentDescription();
        assertExpected(ViewMatchers.hasContentDescription());
    }

    @Test
    public void hasDescendant_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        notCompletable.hasDescendant(testMatcher);
        assertExpected(ViewMatchers.hasDescendant(testMatcher));
    }

    @Test
    public void hasDescendant_withCortadoMatcher_addsCorrectMatcher() {
        Matcher testMatcher = Cortado.view().withText("Test");
        notCompletable.hasDescendant(testMatcher);
        assertExpected(ViewMatchers.hasDescendant(testMatcher));
    }

    @Test
    public void isClickable_addsCorrectMatcher() {
        notCompletable.isClickable();
        assertExpected(ViewMatchers.isClickable());
    }

    @Test
    public void isDescendantOfA_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        notCompletable.isDescendantOfA(testMatcher);
        assertExpected(ViewMatchers.isDescendantOfA(testMatcher));
    }

    @Test
    public void isDescendantOfA_withCortadoMatcher_addsCorrectMatcher() {
        Matcher testMatcher = Cortado.view().withText("Test");
        notCompletable.isDescendantOfA(testMatcher);
        assertExpected(ViewMatchers.isDescendantOfA(testMatcher));
    }

    @Test
    public void withEffectiveVisibility_addsCorrectMatcher() {
        final ViewMatchers.Visibility testVisibility = ViewMatchers.Visibility.GONE;
        notCompletable.withEffectiveVisibility(testVisibility);
        assertExpected(ViewMatchers.withEffectiveVisibility(testVisibility));
    }

    @Test
    public void withParent_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        notCompletable.withParent(testMatcher);
        assertExpected(ViewMatchers.withParent(testMatcher));
    }

    @Test
    public void withParent_withCortadoMatcher_addsCorrectMatcher() {
        Matcher testMatcher = Cortado.view().withText("Test");
        notCompletable.withParent(testMatcher);
        assertExpected(ViewMatchers.withParent(testMatcher));
    }

    @Test
    public void withChild_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        notCompletable.withChild(testMatcher);
        assertExpected(ViewMatchers.withChild(testMatcher));
    }

    @Test
    public void withChild_withCortadoMatcher_addsCorrectMatcher() {
        Matcher testMatcher = Cortado.view().withText("Test");
        notCompletable.withChild(testMatcher);
        assertExpected(ViewMatchers.withChild(testMatcher));
    }

    @Test
    public void isRoot_addsCorrectMatcher() {
        notCompletable.isRoot();
        assertExpected(ViewMatchers.isRoot());
    }

    @Test
    public void supportsInputMethods_addsCorrectMatcher() {
        notCompletable.supportsInputMethods();
        assertExpected(ViewMatchers.supportsInputMethods());
    }

    @Test
    public void hasImeAction_withInteger_addsCorrectMatcher() {
        notCompletable.hasImeAction(1);
        assertExpected(ViewMatchers.hasImeAction(1));
    }

    @Test
    public void hasImeAction_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<Integer> testMatcher = SimpleMatcher.instance();
        notCompletable.hasImeAction(testMatcher);
        assertExpected(ViewMatchers.hasImeAction(testMatcher));
    }

    @Test
    public void hasLinks_addsCorrectMatcher() {
        notCompletable.hasLinks();
        assertExpected(ViewMatchers.hasLinks());
    }

    @Test
    public void withSpinnerText_withResource_addsCorrectMatcher() {
        //noinspection ResourceType
        notCompletable.withSpinnerText(1);
        assertExpected(ViewMatchers.withSpinnerText(1));
    }

    @Test
    public void withSpinnerText_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        notCompletable.withSpinnerText(testMatcher);
        assertExpected(ViewMatchers.withSpinnerText(testMatcher));
    }

    @Test
    public void withSpinnerText_withString_addsCorrectMatcher() {
        notCompletable.withSpinnerText("test");
        assertExpected(ViewMatchers.withSpinnerText("test"));
    }

    @Test
    public void isJavascriptEnabled_addsCorrectMatcher() {
        notCompletable.isJavascriptEnabled();
        assertExpected(ViewMatchers.isJavascriptEnabled());
    }

    @Test
    public void hasErrorText_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        notCompletable.hasErrorText(testMatcher);
        assertExpected(ViewMatchers.hasErrorText(testMatcher));
    }

    @Test
    public void hasErrorText_addsCorrectMatcher() {
        notCompletable.hasErrorText("test");
        assertExpected(ViewMatchers.hasErrorText("test"));
    }

    @Test
    public void withInputType_addsCorrectMatcher() {
        notCompletable.withInputType(1);
        assertExpected(ViewMatchers.withInputType(1));
    }

    @Test
    public void matching_withMatcher_addsCorrectMatcher() {
        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        notCompletable.matching(testMatcher);
        assertExpected(testMatcher);
    }

    @Test
    public void matching_withCortadoMatcher_addsCorrectMatcher() {
        Matcher testMatcher = Cortado.view().withText("Test");
        notCompletable.matching(testMatcher);
        assertExpected(testMatcher);
    }
}
