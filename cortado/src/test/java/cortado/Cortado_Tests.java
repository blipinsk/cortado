package cortado;

import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;

import org.hamcrest.*;
import org.hamcrest.Matcher;
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
    public void view_and_setsProperLinker() {
        Cortado.OrAnd.Matcher beforeAnd = Cortado.view().withText("test");
        assertThat(beforeAnd.getCortado().linker).isEqualTo(Linker.REGULAR);
        Unfinished.And.Matcher afterAnd = beforeAnd.and();
        assertThat(afterAnd.getCortado().linker).isEqualTo(Linker.AND);
    }

    @Test
    public void view_or_setsProperLinker() {
        Cortado.OrAnd.Matcher beforeOr = Cortado.view().withText("test");
        assertThat(beforeOr.getCortado().linker).isEqualTo(Linker.REGULAR);
        Unfinished.Or.Matcher afterOr = beforeOr.or();
        assertThat(afterOr.getCortado().linker).isEqualTo(Linker.OR);
    }

    @Test
    public void onView_and_setsProperLinker() {
        Cortado.OrAnd.ViewInteraction beforeAnd = Cortado.onView().withText("test");
        assertThat(beforeAnd.getCortado().linker).isEqualTo(Linker.REGULAR);
        Unfinished.And.ViewInteraction afterAnd = beforeAnd.and();
        assertThat(afterAnd.getCortado().linker).isEqualTo(Linker.AND);
    }

    @Test
    public void onView_or_setsProperLinker() {
        Cortado.OrAnd.ViewInteraction beforeOr = Cortado.onView().withText("test");
        assertThat(beforeOr.getCortado().linker).isEqualTo(Linker.REGULAR);
        Unfinished.Or.ViewInteraction afterOr = beforeOr.or();
        assertThat(afterOr.getCortado().linker).isEqualTo(Linker.OR);
    }

    // negated constructors
    @Test
    public void negated_start_matcher_constructor_setsCortadoFlag() {
        Start.Matcher view = Cortado.view();
        assertThat(view.getCortado().negateNextMatcher).isFalse();
        Negated.Start.Matcher not = view.not();
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    @Test
    public void negated_start_viewInteraction_constructor_setsCortadoFlag() {
        Start.ViewInteraction viewInteraction = Cortado.onView();
        assertThat(viewInteraction.getCortado().negateNextMatcher).isFalse();
        Negated.Start.ViewInteraction not = viewInteraction.not();
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    @Test
    public void negated_unfinished_or_matcher_constructor_setsCortadoFlag() {
        Start.Matcher view = Cortado.view();
        assertThat(view.getCortado().negateNextMatcher).isFalse();
        Cortado.OrAnd.Matcher orAndMatcher = view.withText("test");
        assertThat(orAndMatcher.getCortado().negateNextMatcher).isFalse();
        Negated.Unfinished.Or.Matcher not = orAndMatcher.or().not();
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    @Test
    public void negated_unfinished_or_viewInteraction_constructor_setsCortadoFlag() {
        Start.ViewInteraction viewInteraction = Cortado.onView();
        assertThat(viewInteraction.getCortado().negateNextMatcher).isFalse();
        Cortado.OrAnd.ViewInteraction orAndViewInteraction = viewInteraction.withText("test");
        assertThat(orAndViewInteraction.getCortado().negateNextMatcher).isFalse();
        Negated.Unfinished.Or.ViewInteraction not = orAndViewInteraction.or().not();
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    @Test
    public void negated_unfinished_and_matcher_constructor_setsCortadoFlag() {
        Start.Matcher view = Cortado.view();
        assertThat(view.getCortado().negateNextMatcher).isFalse();
        Cortado.OrAnd.Matcher orAndMatcher = view.withText("test");
        assertThat(orAndMatcher.getCortado().negateNextMatcher).isFalse();
        Negated.Unfinished.And.Matcher not = orAndMatcher.and().not();
        assertThat(not.getCortado().negateNextMatcher).isTrue();
    }

    @Test
    public void negated_unfinished_and_viewInteraction_constructor_setsCortadoFlag() {
        Start.ViewInteraction viewInteraction = Cortado.onView();
        assertThat(viewInteraction.getCortado().negateNextMatcher).isFalse();
        Cortado.OrAnd.ViewInteraction orAndViewInteraction = viewInteraction.withText("test");
        assertThat(orAndViewInteraction.getCortado().negateNextMatcher).isFalse();
        Negated.Unfinished.And.ViewInteraction not = orAndViewInteraction.and().not();
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

}
