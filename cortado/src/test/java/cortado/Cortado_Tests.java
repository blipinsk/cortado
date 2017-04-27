package cortado;

import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

import internal.Order;
import internal.OrderedJUnit4TestRunner;
import internal.Utils;

import static com.google.common.truth.Truth.assertThat;

@RunWith(OrderedJUnit4TestRunner.class)
public class Cortado_Tests {

    // view
    @Order(1)
    @Test
    public void view_doesNotImplementMatcher_implementsMatching() {
        final Start.Matcher matcher = Cortado.view();
        assertThat(matcher).isNotInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isInstanceOf(Matching.class);
    }

    @Order(2)
    @Test
    public void view_withNot_doesNotImplementMatcher_implementsMatching() {
        final Negated.Start.Matcher matcher = Cortado.view().not();
        assertThat(matcher).isNotInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isInstanceOf(Matching.class);
    }

    @Order(3)
    @Test
    public void view_withSingleCondition_implementsMatcher_doesNotImplementMatching() {
        final Cortado.OrAnd.Matcher matcher = Cortado.view().withText("test");
        assertThat(matcher).isInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isNotInstanceOf(Matching.class);
    }

    @Order(4)
    @Test
    public void view_withCondition_thenAnd_doesNotImplementMatcher_implementsMatching() {
        final Unfinished.And.Matcher matcher = Cortado.view().withText("test").and();
        assertThat(matcher).isNotInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isInstanceOf(Matching.class);
    }

    @Order(5)
    @Test
    public void view_withCondition_thenAnd_thenNot_doesNotImplementMatcher_implementsMatching() {
        final Negated.Unfinished.And.Matcher matcher = Cortado.view().withText("test").and().not();
        assertThat(matcher).isNotInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isInstanceOf(Matching.class);
    }

    @Order(6)
    @Test
    public void view_withCondition_thenAnd_thenCondition_implementsMatcher_doesNotImplementMatching() {
        final Cortado.And.Matcher matcher = Cortado.view().withText("test").and().withHint("test");
        assertThat(matcher).isInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isNotInstanceOf(Matching.class);
    }

    @Order(7)
    @Test
    public void view_withCondition_thenAnd_thenNot_thenCondition_implementsMatcher_doesNotImplementMatching() {
        final Cortado.And.Matcher matcher = Cortado.view().withText("test").and().not().withHint("test");
        assertThat(matcher).isInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isNotInstanceOf(Matching.class);
    }

    @Order(8)
    @Test
    public void view_withCondition_thenOr_doesNotImplementMatcher_implementsMatching() {
        final Unfinished.Or.Matcher matcher = Cortado.view().withText("test").or();
        assertThat(matcher).isNotInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isInstanceOf(Matching.class);
    }

    @Order(9)
    @Test
    public void view_withCondition_thenOr_thenNot_doesNotImplementMatcher_implementsMatching() {
        final Negated.Unfinished.Or.Matcher matcher = Cortado.view().withText("test").or().not();
        assertThat(matcher).isNotInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isInstanceOf(Matching.class);
    }

    @Order(10)
    @Test
    public void view_withCondition_thenOr_thenCondition_implementsMatcher_doesNotImplementMatching() {
        final Cortado.Or.Matcher matcher = Cortado.view().withText("test").or().withHint("test");
        assertThat(matcher).isInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isNotInstanceOf(Matching.class);
    }

    @Order(11)
    @Test
    public void view_withCondition_thenOr_thenNot_thenCondition_implementsMatcher_doesNotImplementMatching() {
        final Cortado.Or.Matcher matcher = Cortado.view().withText("test").or().not().withHint("test");
        assertThat(matcher).isInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isNotInstanceOf(Matching.class);
    }

    // onView
    @Order(12)
    @Test
    public void onView_doesNotImplementInteractable_implementsMatching() {
        final Start.ViewInteraction interaction = Cortado.onView();
        assertThat(interaction).isNotInstanceOf(Interactable.class);
        assertThat(interaction).isInstanceOf(Matching.class);
    }

    @Order(13)
    @Test
    public void onView_thenNot_doesNotImplementInteractable_implementsMatching() {
        final Negated.Start.ViewInteraction interaction = Cortado.onView().not();
        assertThat(interaction).isNotInstanceOf(Interactable.class);
        assertThat(interaction).isInstanceOf(Matching.class);
    }

    @Order(14)
    @Test
    public void onView_withSingleCondition_implementsInteractable_doesNotImplementMatching() {
        final Cortado.OrAnd.ViewInteraction interaction = Cortado.onView().withText("test");
        assertThat(interaction).isInstanceOf(Interactable.class);
        assertThat(interaction).isNotInstanceOf(Matching.class);
    }

    @Order(15)
    @Test
    public void onView_withCondition_thenAnd_doesNotImplementInteractable_implementsMatching() {
        final Unfinished.And.ViewInteraction interaction = Cortado.onView().withText("test").and();
        assertThat(interaction).isNotInstanceOf(Interactable.class);
        assertThat(interaction).isInstanceOf(Matching.class);
    }

    @Order(16)
    @Test
    public void onView_withCondition_thenAnd_thenNot_doesNotImplementInteractable_implementsMatching() {
        final Negated.Unfinished.And.ViewInteraction interaction = Cortado.onView().withText("test").and().not();
        assertThat(interaction).isNotInstanceOf(Interactable.class);
        assertThat(interaction).isInstanceOf(Matching.class);
    }

    @Order(17)
    @Test
    public void onView_withCondition_thenAnd_thenCondition_implementsInteractable_doesNotImplementMatching() {
        final Cortado.And.ViewInteraction interaction = Cortado.onView().withText("test").and().withHint("test");
        assertThat(interaction).isInstanceOf(Interactable.class);
        assertThat(interaction).isNotInstanceOf(Matching.class);
    }

    @Order(18)
    @Test
    public void onView_withCondition_thenAnd_thenNot_thenCondition_implementsInteractable_doesNotImplementMatching() {
        final Cortado.And.ViewInteraction interaction = Cortado.onView().withText("test").and().not().withHint("test");
        assertThat(interaction).isInstanceOf(Interactable.class);
        assertThat(interaction).isNotInstanceOf(Matching.class);
    }

    @Order(19)
    @Test
    public void onView_withCondition_thenOr_doesNotImplementInteractable_implementsMatching() {
        final Unfinished.Or.ViewInteraction interaction = Cortado.onView().withText("test").or();
        assertThat(interaction).isNotInstanceOf(Interactable.class);
        assertThat(interaction).isInstanceOf(Matching.class);
    }

    @Order(20)
    @Test
    public void onView_withCondition_thenOr_thenNot_doesNotImplementInteractable_implementsMatching() {
        final Negated.Unfinished.Or.ViewInteraction interaction = Cortado.onView().withText("test").or().not();
        assertThat(interaction).isNotInstanceOf(Interactable.class);
        assertThat(interaction).isInstanceOf(Matching.class);
    }

    @Order(21)
    @Test
    public void onView_withCondition_thenOr_thenCondition_implementsInteractable_doesNotImplementMatching() {
        final Cortado.Or.ViewInteraction interaction = Cortado.onView().withText("test").or().withHint("test");
        assertThat(interaction).isInstanceOf(Interactable.class);
        assertThat(interaction).isNotInstanceOf(Matching.class);
    }

    @Order(21)
    @Test
    public void onView_withCondition_thenOr_thenNot_thenCondition_implementsInteractable_doesNotImplementMatching() {
        final Cortado.Or.ViewInteraction interaction = Cortado.onView().withText("test").or().not().withHint("test");
        assertThat(interaction).isInstanceOf(Interactable.class);
        assertThat(interaction).isNotInstanceOf(Matching.class);
    }

    // setting linkers
    @Test
    public void view_hasProperLinker_initially() {
        //given
        Start.Matcher view = Cortado.view();

        //when
        Cortado.OrAnd.Matcher beforeAnd = view.withText("test");

        //then
        assertThat(beforeAnd.getCortado().linker).isEqualTo(Linker.REGULAR);
    }

    @Test
    public void view_and_setsProperLinker() {
        //given
        Cortado.OrAnd.Matcher beforeAnd = Cortado.view().withText("test");

        //when
        Unfinished.And.Matcher afterAnd = beforeAnd.and();

        //then
        assertThat(afterAnd.getCortado().linker).isEqualTo(Linker.AND);
    }

    @Test
    public void view_or_setsProperLinker() {
        //given
        Cortado.OrAnd.Matcher beforeOr = Cortado.view().withText("test");

        //when
        Unfinished.Or.Matcher afterOr = beforeOr.or();

        //then
        assertThat(afterOr.getCortado().linker).isEqualTo(Linker.OR);
    }

    @Test
    public void onView_hasProperLinker_initially() {
        //given
        Start.ViewInteraction viewInteraction = Cortado.onView();

        //when
        Cortado.OrAnd.ViewInteraction beforeAnd = viewInteraction.withText("test");

        //then
        assertThat(beforeAnd.getCortado().linker).isEqualTo(Linker.REGULAR);
    }

    @Test
    public void onView_and_setsProperLinker() {
        //given
        Cortado.OrAnd.ViewInteraction beforeAnd = Cortado.onView().withText("test");

        //when
        Unfinished.And.ViewInteraction afterAnd = beforeAnd.and();

        //then
        assertThat(afterAnd.getCortado().linker).isEqualTo(Linker.AND);
    }

    @Test
    public void onView_or_setsProperLinker() {
        //given
        Cortado.OrAnd.ViewInteraction beforeOr = Cortado.onView().withText("test");

        //when
        Unfinished.Or.ViewInteraction afterOr = beforeOr.or();

        //then
        assertThat(afterOr.getCortado().linker).isEqualTo(Linker.OR);
    }

    // negated constructors
    @Test
    public void view_hasProperNegatedFlag_initially() {
        //given
        //when
        Start.Matcher view = Cortado.view();

        //then
        assertThat(view.getCortado().negateNextMatcher).isFalse();
    }

    @Test
    public void view_not_setsNegatedFlag() {
        //given
        Start.Matcher view = Cortado.view();

        //when
        Negated.Start.Matcher not = view.not();

        //then
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    @Test
    public void view_withCondition_hasProperNegatedFlag() {
        //given
        //when
        Cortado.OrAnd.Matcher matcher = Cortado.view().withText("test");

        //then
        assertThat(matcher.getCortado().negateNextMatcher).isFalse();
    }

    @Test
    public void view_withCondition_or_not_setsNegatedFlag() {
        //given
        Cortado.OrAnd.Matcher matcher = Cortado.view().withText("test");

        //when
        Negated.Unfinished.Or.Matcher not = matcher.or().not();

        //then
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    @Test
    public void view_withCondition_and_not_setsNegatedFlag() {
        //given
        Cortado.OrAnd.Matcher matcher = Cortado.view().withText("test");

        //when
        Negated.Unfinished.And.Matcher not = matcher.and().not();

        //then
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    @Test
    public void onView_hasProperNegatedFlag_initially() {
        //given
        //when
        Start.ViewInteraction viewInteraction = Cortado.onView();

        //then
        assertThat(viewInteraction.getCortado().negateNextMatcher).isFalse();
    }

    @Test
    public void onView_not_setsNegatedFlag() {
        //given
        Start.ViewInteraction viewInteraction = Cortado.onView();

        //when
        Negated.Start.ViewInteraction not = viewInteraction.not();

        //then
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    @Test
    public void onView_withCondition_hasProperNegatedFlag() {
        //given
        //when
        Cortado.OrAnd.ViewInteraction viewInteraction = Cortado.onView().withText("test");

        //then
        assertThat(viewInteraction.getCortado().negateNextMatcher).isFalse();
    }


    @Test
    public void onView_withCondition_or_not_setsNegatedFlag() {
        //given
        Cortado.OrAnd.ViewInteraction viewInteraction = Cortado.onView().withText("test");

        //when
        Negated.Unfinished.Or.ViewInteraction not = viewInteraction.or().not();

        //then
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    @Test
    public void onView_withCondition_and_not_setsNegatedFlag() {
        //given
        Cortado.OrAnd.ViewInteraction viewInteraction = Cortado.onView().withText("test");

        //when
        Negated.Unfinished.And.ViewInteraction not = viewInteraction.and().not();

        //then
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    // addMatcher working with negateNextWatcher
    @Test
    public void addMatcher_doesNotNegateMatcher_when_negateNextMatcher_isFalse() {
        final Start.Matcher matcher = Cortado.view();
        final Cortado cortado = matcher.getCortado();
        assertThat(cortado.matchers).hasSize(0);
        assertThat(cortado.negateNextMatcher).isFalse();
        // no matchers added, negateNextMatcher is false

        org.hamcrest.Matcher<View> viewMatcher = ViewMatchers.withText("test");
        org.hamcrest.Matcher<View> negatedViewMatcher = Matchers.not(viewMatcher);

        cortado.negateNextMatcher = false;

        cortado.addMatcher(viewMatcher);
        assertThat(cortado.matchers).hasSize(1);
        // one matcher added

        assertThat(cortado.negateNextMatcher).isFalse();
        // negateNextMatcher is still false

        final Matcher<? super View> addedMatcher = cortado.matchers.get(0);
        Utils.assertThat(addedMatcher).isEqualTo(viewMatcher);
        Utils.assertThat(addedMatcher).isNotEqualTo(negatedViewMatcher);
    }

    @Test
    public void addMatcher_negatesMatcher_when_negateNextMatcher_isTrue() {
        final Start.Matcher matcher = Cortado.view();
        final Cortado cortado = matcher.getCortado();
        assertThat(cortado.matchers).hasSize(0);
        assertThat(cortado.negateNextMatcher).isFalse();
        // no matchers added, negateNextMatcher is false

        org.hamcrest.Matcher<View> viewMatcher = ViewMatchers.withText("test");
        org.hamcrest.Matcher<View> negatedViewMatcher = Matchers.not(viewMatcher);

        cortado.negateNextMatcher = true;

        cortado.addMatcher(viewMatcher);
        assertThat(cortado.matchers).hasSize(1);
        // one matcher added

        assertThat(cortado.negateNextMatcher).isFalse();
        // negateNextMatcher is back to false

        final Matcher<? super View> addedMatcher = cortado.matchers.get(0);
        Utils.assertThat(addedMatcher).isNotEqualTo(viewMatcher);
        Utils.assertThat(addedMatcher).isEqualTo(negatedViewMatcher);
    }

    // assignableFromClass
    @Test
    public void view_returnsProperMatcher() {
        //given
        final Cortado.OrAnd.Matcher matcher = Cortado.view().withText("test");
        final Matcher<? super View> espressoMatcher = matcher.getCortado().matchers.get(0);

        //when

        //then
        Utils.assertThat(matcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void textView_returnsProperMatcher() {
        //given
        final Cortado.OrAnd.Matcher matcher = Cortado.textView().withText("test");
        final Matcher<View> expectedEspressoMatcher = Matchers.allOf(
                ViewMatchers.isAssignableFrom(TextView.class),
                matcher.getCortado().matchers.get(0));

        //when

        //then
        Utils.assertThat(matcher).isEqualTo(expectedEspressoMatcher);
    }

    @Test
    public void editText_returnsProperMatcher() {
        //given
        final Cortado.OrAnd.Matcher matcher = Cortado.editText().withText("test");
        final Matcher<View> expectedEspressoMatcher = Matchers.allOf(
                ViewMatchers.isAssignableFrom(EditText.class),
                matcher.getCortado().matchers.get(0));

        //when

        //then
        Utils.assertThat(matcher).isEqualTo(expectedEspressoMatcher);
    }

    @Test
    public void button_returnsProperMatcher() {
        //given
        final Cortado.OrAnd.Matcher matcher = Cortado.button().withText("test");
        final Matcher<View> expectedEspressoMatcher = Matchers.allOf(
                ViewMatchers.isAssignableFrom(Button.class),
                matcher.getCortado().matchers.get(0));

        //when

        //then
        Utils.assertThat(matcher).isEqualTo(expectedEspressoMatcher);
    }

    @Test
    public void imageView_returnsProperMatcher() {
        //given
        final Cortado.OrAnd.Matcher matcher = Cortado.imageView().withText("test");
        final Matcher<View> expectedEspressoMatcher = Matchers.allOf(
                ViewMatchers.isAssignableFrom(ImageView.class),
                matcher.getCortado().matchers.get(0));

        //when

        //then
        Utils.assertThat(matcher).isEqualTo(expectedEspressoMatcher);
    }

    @Test
    public void imageButton_returnsProperMatcher() {
        //given
        final Cortado.OrAnd.Matcher matcher = Cortado.imageButton().withText("test");
        final Matcher<View> expectedEspressoMatcher = Matchers.allOf(
                ViewMatchers.isAssignableFrom(ImageButton.class),
                matcher.getCortado().matchers.get(0));

        //when

        //then
        Utils.assertThat(matcher).isEqualTo(expectedEspressoMatcher);
    }

    @Test
    public void onView_returnsProperViewInteraction() {
        //given
        final Cortado.OrAnd.ViewInteraction viewInteraction = Cortado.onView().withText("test");
        final Matcher<? super View> espressoMatcher = viewInteraction.getCortado().matchers.get(0);

        //when
        final Matcher<View> rawMatcher = viewInteraction.getCortado().get();

        //then
        Utils.assertThat(rawMatcher).isEqualTo(espressoMatcher);
    }

    @Test
    public void onTextView_returnsProperViewInteraction() {
        //given
        final Cortado.OrAnd.ViewInteraction viewInteraction = Cortado.onTextView().withText("test");
        final Matcher<View> expectedEspressoMatcher = Matchers.allOf(
                ViewMatchers.isAssignableFrom(TextView.class),
                viewInteraction.getCortado().matchers.get(0));

        //when
        final Matcher<View> rawMatcher = viewInteraction.getCortado().get();

        //then
        Utils.assertThat(rawMatcher).isEqualTo(expectedEspressoMatcher);
    }

    @Test
    public void onEditText_returnsProperViewInteraction() {
        //given
        final Cortado.OrAnd.ViewInteraction viewInteraction = Cortado.onEditText().withText("test");
        final Matcher<View> expectedEspressoMatcher = Matchers.allOf(
                ViewMatchers.isAssignableFrom(EditText.class),
                viewInteraction.getCortado().matchers.get(0));

        //when
        final Matcher<View> rawMatcher = viewInteraction.getCortado().get();

        //then
        Utils.assertThat(rawMatcher).isEqualTo(expectedEspressoMatcher);
    }

    @Test
    public void onButton_returnsProperViewInteraction() {
        //given
        final Cortado.OrAnd.ViewInteraction viewInteraction = Cortado.onButton().withText("test");
        final Matcher<View> expectedEspressoMatcher = Matchers.allOf(
                ViewMatchers.isAssignableFrom(Button.class),
                viewInteraction.getCortado().matchers.get(0));

        //when
        final Matcher<View> rawMatcher = viewInteraction.getCortado().get();

        //then
        Utils.assertThat(rawMatcher).isEqualTo(expectedEspressoMatcher);
    }

    @Test
    public void onImageView_returnsProperViewInteraction() {
        //given
        final Cortado.OrAnd.ViewInteraction viewInteraction = Cortado.onImageView().withText("test");
        final Matcher<View> expectedEspressoMatcher = Matchers.allOf(
                ViewMatchers.isAssignableFrom(ImageView.class),
                viewInteraction.getCortado().matchers.get(0));

        //when
        final Matcher<View> rawMatcher = viewInteraction.getCortado().get();

        //then
        Utils.assertThat(rawMatcher).isEqualTo(expectedEspressoMatcher);
    }

    @Test
    public void onImageButton_returnsProperViewInteraction() {
        //given
        final Cortado.OrAnd.ViewInteraction viewInteraction = Cortado.onImageButton().withText("test");
        final Matcher<View> expectedEspressoMatcher = Matchers.allOf(
                ViewMatchers.isAssignableFrom(ImageButton.class),
                viewInteraction.getCortado().matchers.get(0));

        //when
        final Matcher<View> rawMatcher = viewInteraction.getCortado().get();

        //then
        Utils.assertThat(rawMatcher).isEqualTo(expectedEspressoMatcher);
    }
}
