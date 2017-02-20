package cortado;

import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;
import android.widget.ImageView;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;

import cortado.Chunks.TagKeyArgs;
import cortado.internal.OrderedJUnit4TestRunner;
import cortado.internal.SimpleMatcher;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Bartosz Lipinski
 * 18.02.2017
 */
@RunWith(OrderedJUnit4TestRunner.class)
public class Chunk_Tests {

    @Test
    public void assignableFrom_generatesProperMatcher() {
        Chunk<Class<? extends View>> chunk = new Chunks.AssignableFrom();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final Class<ImageView> test = ImageView.class;
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.isAssignableFrom(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void className_generatesProperMatcher() {
        Chunk<Matcher<String>> chunk = new Chunks.ClassName();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<String> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.withClassName(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isDisplayed_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.IsDisplayed();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.isDisplayed();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isCompletelyDisplayed_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.IsCompletelyDisplayed();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.isCompletelyDisplayed();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isDisplayingAtLeast_generatesProperMatcher() {
        Chunk<Integer> chunk = new Chunks.IsDisplayingAtLeast();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(4);
        final Matcher<View> espressoMatcher = ViewMatchers.isDisplayingAtLeast(4);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isEnabled_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.IsEnabled();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.isEnabled();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isFocusable_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.IsFocusable();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.isFocusable();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void hasFocus_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.HasFocus();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.hasFocus();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isSelected_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.IsSelected();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.isSelected();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void hasSibling_generatesProperMatcher() {
        Chunk<Matcher<View>> chunk = new Chunks.HasSibling();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<View> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.hasSibling(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withContentDescription_withResource_generatesProperMatcher() {
        Chunk<Integer> chunk = new Chunks.WithContentDescription_Resource();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        int testContentDescription = 10;
        final Matcher<View> cortadoMatcher = chunk.matcher(testContentDescription);
        final Matcher<View> espressoMatcher = ViewMatchers.withContentDescription(testContentDescription);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withContentDescription_withString_generatesProperMatcher() {
        Chunk<String> chunk = new Chunks.WithContentDescription_String();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        String test = "test";
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.withContentDescription(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withContentDescription_withMatcher_generatesProperMatcher() {
        Chunk<Matcher<? extends CharSequence>> chunk = new Chunks.WithContentDescription_Matcher();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<CharSequence> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.withContentDescription(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withId_withResource_generatesProperMatcher() {
        Chunk<Integer> chunk = new Chunks.WithId_Resource();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        int testId = 10;
        final Matcher<View> cortadoMatcher = chunk.matcher(testId);
        final Matcher<View> espressoMatcher = ViewMatchers.withId(testId);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withId_withMatcher_generatesProperMatcher() {
        Chunk<Matcher<Integer>> chunk = new Chunks.WithId_Matcher();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<Integer> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.withId(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withResourceName_withString_generatesProperMatcher() {
        Chunk<String> chunk = new Chunks.WithResourceName_String();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        String test = "test";
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.withResourceName(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withResourceName_withMatcher_generatesProperMatcher() {
        Chunk<Matcher<String>> chunk = new Chunks.WithResourceName_Matcher();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<String> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.withResourceName(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withTagKey_withInteger_generatesProperMatcher() {
        Chunk<Integer> chunk = new Chunks.WithTagKey();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        int test = 10;
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.withTagKey(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withTagKey_withMatcher_generatesProperMatcher() {
        Chunk<TagKeyArgs> chunk = new Chunks.WithTagKey_Matcher();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final TagKeyArgs testArgs = new TagKeyArgs(10, SimpleMatcher.instance());
        final Matcher<View> cortadoMatcher = chunk.matcher(testArgs);
        final Matcher<View> espressoMatcher = ViewMatchers.withTagKey(testArgs.key, testArgs.matcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withTagValue_generatesProperMatcher() {
        Chunk<Matcher<Object>> chunk = new Chunks.WithTagValue();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<Object> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.withTagValue(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withText_withString_generatesProperMatcher() {
        Chunk<String> chunk = new Chunks.WithText_String();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        String test = "test";
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.withText(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withText_withMatcher_generatesProperMatcher() {
        Chunk<Matcher<String>> chunk = new Chunks.WithText_Matcher();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<String> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.withText(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withText_withResource_generatesProperMatcher() {
        Chunk<Integer> chunk = new Chunks.WithText_Resource();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final int test = 10;
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.withText(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withHint_withString_generatesProperMatcher() {
        Chunk<String> chunk = new Chunks.WithHint_String();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        String test = "test";
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.withHint(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withHint_withMatcher_generatesProperMatcher() {
        Chunk<Matcher<String>> chunk = new Chunks.WithHint_Matcher();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<String> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.withHint(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withHint_withResource_generatesProperMatcher() {
        Chunk<Integer> chunk = new Chunks.WithHint_Resource();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final int test = 10;
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.withHint(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isChecked_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.IsChecked();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.isChecked();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isNotChecked_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.IsNotChecked();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.isNotChecked();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void hasContentDescription_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.HasContentDescription();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.hasContentDescription();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void hasDescendant_generatesProperMatcher() {
        Chunk<Matcher<View>> chunk = new Chunks.HasDescendant();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<View> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.hasDescendant(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isClickable_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.IsClickable();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.isClickable();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void IsDescendantOfA_generatesProperMatcher() {
        Chunk<Matcher<View>> chunk = new Chunks.IsDescendantOfA();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<View> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.isDescendantOfA(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withEffectiveVisibility_generatesProperMatcher() {
        Chunk<ViewMatchers.Visibility> chunk = new Chunks.WithEffectiveVisibility();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final ViewMatchers.Visibility testVisibility = ViewMatchers.Visibility.GONE;
        final Matcher<View> cortadoMatcher = chunk.matcher(testVisibility);
        final Matcher<View> espressoMatcher = ViewMatchers.withEffectiveVisibility(testVisibility);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withParent_generatesProperMatcher() {
        Chunk<Matcher<View>> chunk = new Chunks.WithParent();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<View> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.withParent(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withChild_generatesProperMatcher() {
        Chunk<Matcher<View>> chunk = new Chunks.WithChild();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<View> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.withChild(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isRoot_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.IsRoot();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.isRoot();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void supportsInputMethods_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.SupportsInputMethods();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.supportsInputMethods();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void hasImeAction_withInteger_generatesProperMatcher() {
        Chunk<Integer> chunk = new Chunks.HasImeAction_Integer();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final int test = 10;
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.hasImeAction(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void hasImeAction_withMatcher_generatesProperMatcher() {
        Chunk<Matcher<Integer>> chunk = new Chunks.HasImeAction_Matcher();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<Integer> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.hasImeAction(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void hasLinks_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.HasLinks();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.hasLinks();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withSpinnerText_withString_generatesProperMatcher() {
        Chunk<String> chunk = new Chunks.WithSpinnerText_String();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final String test = "test";
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.withSpinnerText(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withSpinnerText_withMatcher_generatesProperMatcher() {
        Chunk<Matcher<String>> chunk = new Chunks.WithSpinnerText_Matcher();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<String> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.withSpinnerText(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withSpinnerText_withResource_generatesProperMatcher() {
        Chunk<Integer> chunk = new Chunks.WithSpinnerText_Resource();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final int test = 10;
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.withSpinnerText(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void isJavascriptEnabled_generatesProperMatcher() {
        Chunk<Boolean> chunk = new Chunks.IsJavascriptEnabled();
        assertThat(chunk).isInstanceOf(ElementaryChunk.class);

        final Matcher<View> cortadoMatcher = chunk.matcher(true);
        final Matcher<View> espressoMatcher = ViewMatchers.isJavascriptEnabled();

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void hasErrorText_withString_generatesProperMatcher() {
        Chunk<String> chunk = new Chunks.HasErrorText_String();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final String test = "test";
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.hasErrorText(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void hasErrorText_withMatcher_generatesProperMatcher() {
        Chunk<Matcher<String>> chunk = new Chunks.HasErrorText_Matcher();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<String> testMatcher = SimpleMatcher.instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        final Matcher<View> espressoMatcher = ViewMatchers.hasErrorText(testMatcher);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void withInputType_generatesProperMatcher() {
        Chunk<Integer> chunk = new Chunks.WithInputType();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final int test = 10;
        final Matcher<View> cortadoMatcher = chunk.matcher(test);
        final Matcher<View> espressoMatcher = ViewMatchers.withInputType(test);

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void matching_generatesProperMatcher() {
        Chunk<Matcher<View>> chunk = new Chunks.Matching();
        assertThat(chunk).isInstanceOf(CombinedChunk.class);

        final SimpleMatcher<View> testMatcher = SimpleMatcher.<View>instance();
        final Matcher<View> cortadoMatcher = chunk.matcher(testMatcher);
        //noinspection UnnecessaryLocalVariable
        final Matcher<View> espressoMatcher = testMatcher;

        Utils.assertThat(cortadoMatcher).isEqualTo(espressoMatcher);
    }
}
