package cortado;

import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;
import android.widget.ImageView;

import org.junit.Test;
import org.junit.runner.RunWith;

import cortado.internal.OrderedJUnit4TestRunner;
import cortado.internal.SimpleMatcher;

@RunWith(OrderedJUnit4TestRunner.class)
public class Matcher_Tests {

    @Test
    public void isAssignableFrom_usesField_assignableFrom() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isAssignableFrom(ImageView.class);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.assignableFrom);
    }

    @Test
    public void className_usesField_className() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withClassName(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.className);
    }

    @Test
    public void isDisplayed_usesField_isDisplayed() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isDisplayed();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isDisplayed);
    }

    @Test
    public void isCompletelyDisplayed_usesField_isCompletelyDisplayed() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isCompletelyDisplayed();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isCompletelyDisplayed);
    }

    @Test
    public void isDisplayingAtLeast_usesField_isDisplayingAtLeast() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isDisplayingAtLeast(5);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isDisplayingAtLeast);
    }

    @Test
    public void isEnabled_usesField_isEnabled() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isEnabled();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isEnabled);
    }

    @Test
    public void isFocusable_usesField_isFocusable() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isFocusable();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isFocusable);
    }

    @Test
    public void hasFocus_usesField_hasFocus() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasFocus();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasFocus);
    }

    @Test
    public void isSelected_usesField_isSelected() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isSelected();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isSelected);
    }

    @Test
    public void hasSibling_usesField_hasSibling() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasSibling(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasSibling);
    }

    @Test
    public void hasSibling_withCortadoMatcher_usesField_hasSibling() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasSibling(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasSibling);
    }

    @Test
    public void withContentDescriptionResource_usesField_withContentDescriptionResource() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        //noinspection ResourceType
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withContentDescription(1);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withContentDescriptionResource);
    }

    @Test
    public void withContentDescriptionString_usesField_withContentDescriptionString() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.withContentDescription("test");

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withContentDescriptionString);
    }

    @Test
    public void withContentDescriptionMatcher_usesField_withContentDescriptionMatcher() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<CharSequence> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withContentDescription(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withContentDescriptionMatcher);
    }

    @Test
    public void withIdResource_usesField_withIdResource() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        //noinspection ResourceType
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withId(1);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withIdResource);
    }

    @Test
    public void withIdMatcher_usesField_withIdMatcher() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<Integer> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withId(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withIdMatcher);
    }

    @Test
    public void withResourceNameString_usesField_withResourceNameString() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.withResourceName("test");

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withResourceNameString);
    }

    @Test
    public void withResourceNameMatcher_usesField_withResourceNameMatcher() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withResourceName(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withResourceNameMatcher);
    }

    @Test
    public void withTagKey_usesField_withTagKey() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.withTagKey(1);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTagKey);
    }

    @Test
    public void withTagKeyMatcher_usesField_withTagKeyMatcher() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<Object> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withTagKey(1, testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTagKeyMatcher);
    }

    @Test
    public void withTagValue_usesField_withTagValue() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<Object> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withTagValue(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTagValue);
    }

    @Test
    public void withTextString_usesField_withTextString() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.withText("test");

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTextString);
    }

    @Test
    public void withTextMatcher_usesField_withTextMatcher() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withText(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTextMatcher);
    }

    @Test
    public void withTextResource_usesField_withTextResource() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        //noinspection ResourceType
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withText(1);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withTextResource);
    }

    @Test
    public void withHintString_usesField_withHintString() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.withHint("test");

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withHintString);
    }

    @Test
    public void withHintMatcher_usesField_withHintMatcher() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withHint(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withHintMatcher);
    }

    @Test
    public void withHintResource_usesField_withHintResource() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        //noinspection ResourceType
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withHint(1);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withHintResource);
    }

    @Test
    public void isChecked_usesField_isChecked() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isChecked();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isChecked);
    }

    @Test
    public void isNotChecked_usesField_isNotChecked() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isNotChecked();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isNotChecked);
    }

    @Test
    public void hasContentDescription_usesField_hasContentDescription() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasContentDescription();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasContentDescription);
    }

    @Test
    public void hasDescendant_usesField_hasDescendant() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasDescendant(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasDescendant);
    }

    @Test
    public void hasDescendant_withCortadoMatcher_usesField_hasDescendant() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasDescendant(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasDescendant);
    }

    @Test
    public void isClickable_usesField_isClickable() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isClickable();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isClickable);
    }

    @Test
    public void isDescendantOfA_usesField_isDescendantOfA() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.isDescendantOfA(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isDescendantOfA);
    }

    @Test
    public void isDescendantOfA_withCortadoMatcher_usesField_isDescendantOfA() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.Matcher endMatcher = startMatcher.isDescendantOfA(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isDescendantOfA);
    }

    @Test
    public void withEffectiveVisibility_usesField_withEffectiveVisibility() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.withEffectiveVisibility(ViewMatchers.Visibility.GONE);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withEffectiveVisibility);
    }

    @Test
    public void withParent_usesField_withParent() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withParent(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withParent);
    }

    @Test
    public void withParent_withCortadoMatcher_usesField_withParent() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withParent(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withParent);
    }

    @Test
    public void withChild_usesField_withChild() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withChild(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withChild);
    }

    @Test
    public void withChild_withCortadoMatcher_usesField_withChild() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withChild(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withChild);
    }

    @Test
    public void isRoot_usesField_isRoot() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isRoot();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isRoot);
    }

    @Test
    public void supportsInputMethods_usesField_supportsInputMethods() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.supportsInputMethods();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.supportsInputMethods);
    }

    @Test
    public void hasImeActionInteger_usesField_hasImeActionInteger() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasImeAction(1);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasImeActionInteger);
    }

    @Test
    public void hasImeActionMatcher_usesField_hasImeActionMatcher() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<Integer> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasImeAction(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasImeActionMatcher);
    }

    @Test
    public void hasLinks_usesField_hasLinks() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasLinks();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasLinks);
    }

    @Test
    public void withSpinnerTextResource_usesField_withSpinnerTextResource() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        //noinspection ResourceType
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withSpinnerText(1);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withSpinnerTextResource);
    }

    @Test
    public void withSpinnerTextMatcher_usesField_withSpinnerTextMatcher() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.withSpinnerText(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withSpinnerTextMatcher);
    }

    @Test
    public void withSpinnerTextString_usesField_withSpinnerTextString() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.withSpinnerText("test");

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withSpinnerTextString);
    }

    @Test
    public void isJavascriptEnabled_usesField_isJavascriptEnabled() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.isJavascriptEnabled();

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.isJavascriptEnabled);
    }

    @Test
    public void hasErrorTextMatcher_usesField_hasErrorTextMatcher() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<String> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasErrorText(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasErrorTextMatcher);
    }

    @Test
    public void hasErrorTextString_usesField_hasErrorTextString() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.hasErrorText("test");

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.hasErrorTextString);
    }

    @Test
    public void withInputType_usesField_withInputType() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Cortado.OrAnd.Matcher endMatcher = startMatcher.withInputType(1);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.withInputType);
    }

    @Test
    public void matching_usesField_matching() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        org.hamcrest.Matcher<View> testMatcher = SimpleMatcher.instance();
        Cortado.OrAnd.Matcher endMatcher = startMatcher.matching(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.matching);
    }

    @Test
    public void matching_withCortado_usesField_matching() {
        Cortado.Start.Matcher startMatcher = Cortado.view();

        Cortado cortadoBefore = startMatcher.getCortado();
        Utils.assertThat(cortadoBefore).hasNoChunksUsed();

        Matcher testMatcher = Cortado.view().withText("Test");
        Cortado.OrAnd.Matcher endMatcher = startMatcher.matching(testMatcher);

        Cortado cortadoAfter = endMatcher.getCortado();
        Utils.assertThat(cortadoAfter).hasOnlyOneChunkUsed(cortadoAfter.matching);
    }
}
