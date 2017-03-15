package different_package;

import android.support.test.espresso.matcher.ViewMatchers;

import cortado.Matching;

import static different_package.Availability.assertVisible;

public class Matching_Availability<T extends Matching<?>> {

    private final T toTest;

    public Matching_Availability(T toTest) {
        this.toTest = toTest;
    }

    public static <T extends Matching<?>> Matching_Availability<T> with(T toTest) {
        return new Matching_Availability<>(toTest);
    }

    public void assertAllMethodsAreVisible() {
        assertVisible(toTest, "isAssignableFrom", Class.class);
        assertVisible(toTest, "withClassName", org.hamcrest.Matcher.class);
        assertVisible(toTest, "isDisplayed");
        assertVisible(toTest, "isCompletelyDisplayed");
        assertVisible(toTest, "isDisplayingAtLeast", int.class);
        assertVisible(toTest, "isEnabled");
        assertVisible(toTest, "isFocusable");
        assertVisible(toTest, "hasFocus");
        assertVisible(toTest, "isSelected");
        assertVisible(toTest, "hasSibling", org.hamcrest.Matcher.class);
        assertVisible(toTest, "hasSibling", cortado.Matcher.class);
        assertVisible(toTest, "withContentDescription", int.class);
        assertVisible(toTest, "withContentDescription", String.class);
        assertVisible(toTest, "withContentDescription", org.hamcrest.Matcher.class);
        assertVisible(toTest, "withId", int.class);
        assertVisible(toTest, "withId", org.hamcrest.Matcher.class);
        assertVisible(toTest, "withResourceName", String.class);
        assertVisible(toTest, "withResourceName", org.hamcrest.Matcher.class);
        assertVisible(toTest, "withTagKey", int.class);
        assertVisible(toTest, "withTagKey", int.class, org.hamcrest.Matcher.class);
        assertVisible(toTest, "withTagValue", org.hamcrest.Matcher.class);
        assertVisible(toTest, "withText", String.class);
        assertVisible(toTest, "withText", org.hamcrest.Matcher.class);
        assertVisible(toTest, "withText", int.class);
        assertVisible(toTest, "withHint", String.class);
        assertVisible(toTest, "withHint", org.hamcrest.Matcher.class);
        assertVisible(toTest, "withHint", int.class);
        assertVisible(toTest, "isChecked");
        assertVisible(toTest, "isNotChecked");
        assertVisible(toTest, "hasContentDescription");
        assertVisible(toTest, "hasDescendant", org.hamcrest.Matcher.class);
        assertVisible(toTest, "hasDescendant", cortado.Matcher.class);
        assertVisible(toTest, "isClickable");
        assertVisible(toTest, "isDescendantOfA", org.hamcrest.Matcher.class);
        assertVisible(toTest, "isDescendantOfA", cortado.Matcher.class);
        assertVisible(toTest, "withEffectiveVisibility", ViewMatchers.Visibility.class);
        assertVisible(toTest, "withParent", org.hamcrest.Matcher.class);
        assertVisible(toTest, "withParent", cortado.Matcher.class);
        assertVisible(toTest, "withChild", org.hamcrest.Matcher.class);
        assertVisible(toTest, "withChild", cortado.Matcher.class);
        assertVisible(toTest, "isRoot");
        assertVisible(toTest, "supportsInputMethods");
        assertVisible(toTest, "hasImeAction", int.class);
        assertVisible(toTest, "hasImeAction", org.hamcrest.Matcher.class);
        assertVisible(toTest, "hasLinks");
        assertVisible(toTest, "withSpinnerText", int.class);
        assertVisible(toTest, "withSpinnerText", org.hamcrest.Matcher.class);
        assertVisible(toTest, "withSpinnerText", String.class);
        assertVisible(toTest, "isJavascriptEnabled");
        assertVisible(toTest, "hasErrorText", org.hamcrest.Matcher.class);
        assertVisible(toTest, "hasErrorText", String.class);
        assertVisible(toTest, "withInputType", int.class);
        assertVisible(toTest, "matching", org.hamcrest.Matcher.class);
        assertVisible(toTest, "matching", cortado.Matcher.class);
    }
}
