package cortado;

import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;
import android.widget.ImageView;

import org.junit.Test;
import org.junit.runner.RunWith;

import cortado.internal.OrderedJUnit4TestRunner;
import cortado.internal.SimpleMatcher;

import static cortado.Utils.assertThat;

@RunWith(OrderedJUnit4TestRunner.class)
public class ViewInteraction_Tests {

    @Test
    public void isAssignableFrom_usesField_assignableFrom() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isAssignableFrom(ImageView.class);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.assignableFrom);
    }

    @Test
    public void className_usesField_className() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withClassName(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.className);
    }

    @Test
    public void isDisplayed_usesField_isDisplayed() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isDisplayed();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isDisplayed);
    }

    @Test
    public void isCompletelyDisplayed_usesField_isCompletelyDisplayed() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isCompletelyDisplayed();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isCompletelyDisplayed);
    }

    @Test
    public void isDisplayingAtLeast_usesField_isDisplayingAtLeast() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isDisplayingAtLeast(5);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isDisplayingAtLeast);
    }

    @Test
    public void isEnabled_usesField_isEnabled() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isEnabled();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isEnabled);
    }

    @Test
    public void isFocusable_usesField_isFocusable() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isFocusable();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isFocusable);
    }

    @Test
    public void hasFocus_usesField_hasFocus() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasFocus();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasFocus);
    }

    @Test
    public void isSelected_usesField_isSelected() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isSelected();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isSelected);
    }

    @Test
    public void hasSibling_usesField_hasSibling() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasSibling(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasSibling);
    }

    @Test
    public void hasSibling_withCortadoMatcher_usesField_hasSibling() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasSibling(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasSibling);
    }

    @Test
    public void withContentDescriptionResource_usesField_withContentDescriptionResource() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        //noinspection ResourceType
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withContentDescription(1);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withContentDescriptionResource);
    }

    @Test
    public void withContentDescriptionString_usesField_withContentDescriptionString() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withContentDescription("test");

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withContentDescriptionString);
    }

    @Test
    public void withContentDescriptionMatcher_usesField_withContentDescriptionMatcher() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<CharSequence> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withContentDescription(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withContentDescriptionMatcher);
    }

    @Test
    public void withIdResource_usesField_withIdResource() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        //noinspection ResourceType
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withId(1);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withIdResource);
    }

    @Test
    public void withIdMatcher_usesField_withIdMatcher() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<Integer> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withId(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withIdMatcher);
    }

    @Test
    public void withResourceNameString_usesField_withResourceNameString() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withResourceName("test");

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withResourceNameString);
    }

    @Test
    public void withResourceNameMatcher_usesField_withResourceNameMatcher() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withResourceName(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withResourceNameMatcher);
    }

    @Test
    public void withTagKey_usesField_withTagKey() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withTagKey(1);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTagKey);
    }

    @Test
    public void withTagKeyMatcher_usesField_withTagKeyMatcher() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<Object> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withTagKey(1, testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTagKeyMatcher);
    }

    @Test
    public void withTagValue_usesField_withTagValue() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<Object> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withTagValue(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTagValue);
    }

    @Test
    public void withTextString_usesField_withTextString() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withText("test");

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTextString);
    }

    @Test
    public void withTextMatcher_usesField_withTextMatcher() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withText(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTextMatcher);
    }

    @Test
    public void withTextResource_usesField_withTextResource() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        //noinspection ResourceType
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withText(1);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTextResource);
    }

    @Test
    public void withHintString_usesField_withHintString() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withHint("test");

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withHintString);
    }

    @Test
    public void withHintMatcher_usesField_withHintMatcher() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withHint(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withHintMatcher);
    }

    @Test
    public void withHintResource_usesField_withHintResource() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        //noinspection ResourceType
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withHint(1);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withHintResource);
    }

    @Test
    public void isChecked_usesField_isChecked() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isChecked();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isChecked);
    }

    @Test
    public void isNotChecked_usesField_isNotChecked() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isNotChecked();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isNotChecked);
    }

    @Test
    public void hasContentDescription_usesField_hasContentDescription() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasContentDescription();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasContentDescription);
    }

    @Test
    public void hasDescendant_usesField_hasDescendant() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasDescendant(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasDescendant);
    }

    @Test
    public void hasDescendant_withCortadoMatcher_usesField_hasDescendant() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasDescendant(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasDescendant);
    }

    @Test
    public void isClickable_usesField_isClickable() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isClickable();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isClickable);
    }

    @Test
    public void isDescendantOfA_usesField_isDescendantOfA() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isDescendantOfA(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isDescendantOfA);
    }

    @Test
    public void isDescendantOfA_withCortadoMatcher_usesField_isDescendantOfA() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isDescendantOfA(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isDescendantOfA);
    }

    @Test
    public void withEffectiveVisibility_usesField_withEffectiveVisibility() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withEffectiveVisibility(ViewMatchers.Visibility.GONE);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withEffectiveVisibility);
    }

    @Test
    public void withParent_usesField_withParent() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withParent(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withParent);
    }

    @Test
    public void withParent_withCortadoMatcher_usesField_withParent() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withParent(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withParent);
    }

    @Test
    public void withChild_usesField_withChild() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withChild(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withChild);
    }

    @Test
    public void withChild_withCortadoMatcher_usesField_withChild() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withChild(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withChild);
    }

    @Test
    public void isRoot_usesField_isRoot() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isRoot();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isRoot);
    }

    @Test
    public void supportsInputMethods_usesField_supportsInputMethods() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.supportsInputMethods();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.supportsInputMethods);
    }

    @Test
    public void hasImeActionInteger_usesField_hasImeActionInteger() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasImeAction(1);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasImeActionInteger);
    }

    @Test
    public void hasImeActionMatcher_usesField_hasImeActionMatcher() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<Integer> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasImeAction(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasImeActionMatcher);
    }

    @Test
    public void hasLinks_usesField_hasLinks() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasLinks();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasLinks);
    }

    @Test
    public void withSpinnerTextResource_usesField_withSpinnerTextResource() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        //noinspection ResourceType
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withSpinnerText(1);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withSpinnerTextResource);
    }

    @Test
    public void withSpinnerTextMatcher_usesField_withSpinnerTextMatcher() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withSpinnerText(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withSpinnerTextMatcher);
    }

    @Test
    public void withSpinnerTextString_usesField_withSpinnerTextString() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withSpinnerText("test");

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withSpinnerTextString);
    }

    @Test
    public void isJavascriptEnabled_usesField_isJavascriptEnabled() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.isJavascriptEnabled();

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isJavascriptEnabled);
    }

    @Test
    public void hasErrorTextMatcher_usesField_hasErrorTextMatcher() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasErrorText(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasErrorTextMatcher);
    }

    @Test
    public void hasErrorTextString_usesField_hasErrorTextString() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.hasErrorText("test");

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasErrorTextString);
    }

    @Test
    public void withInputType_usesField_withInputType() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.withInputType(1);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withInputType);
    }

    @Test
    public void matching_usesField_matching() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.matching(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.matching);
    }

    @Test
    public void matching_withCortado_usesField_matching() {
        Cortado.Start.ViewInteraction startViewInteraction = Cortado.onView();

        Cortado cortadoBefore = startViewInteraction.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.ViewInteraction endViewInteraction = startViewInteraction.matching(testMatcher);

        Cortado cortadoAfter = endViewInteraction.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.matching);
    }
}
