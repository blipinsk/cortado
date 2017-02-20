package cortado;

import org.junit.Test;
import org.junit.runner.RunWith;

import cortado.internal.OrderedJUnit4TestRunner;

import static com.google.common.truth.Truth.assertThat;

@RunWith(OrderedJUnit4TestRunner.class)
public class Cortado_Tests {

    // view
    @Test
    public void view_doesNotImplementMatcher_implementsMatching(){
        final Cortado.Start.Matcher matcher = Cortado.view();
        assertThat(matcher).isNotInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isInstanceOf(Matching.class);
    }

    @Test
    public void view_withSingleCondition_implementsMatcher_doesNotImplementMatching(){
        final Cortado.OrAnd.Matcher matcher = Cortado.view().withText("test");
        assertThat(matcher).isInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isNotInstanceOf(Matching.class);
    }

    @Test
    public void view_withCondition_thenAnd_doesNotImplementMatcher_implementsMatching(){
        final Cortado.Unfinished.And.Matcher matcher = Cortado.view().withText("test").and();
        assertThat(matcher).isNotInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isInstanceOf(Matching.class);
    }

    @Test
    public void view_withCondition_thenAnd_thenCondition_implementsMatcher_doesNotImplementMatching(){
        final Cortado.And.Matcher matcher = Cortado.view().withText("test").and().withHint("test");
        assertThat(matcher).isInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isNotInstanceOf(Matching.class);
    }

    @Test
    public void view_withCondition_thenOr_doesNotImplementMatcher_implementsMatching(){
        final Cortado.Unfinished.Or.Matcher matcher = Cortado.view().withText("test").or();
        assertThat(matcher).isNotInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isInstanceOf(Matching.class);
    }

    @Test
    public void view_withCondition_thenOr_thenCondition_implementsMatcher_doesNotImplementMatching(){
        final Cortado.Or.Matcher matcher = Cortado.view().withText("test").or().withHint("test");
        assertThat(matcher).isInstanceOf(org.hamcrest.Matcher.class);
        assertThat(matcher).isNotInstanceOf(Matching.class);
    }

    // onView
    @Test
    public void onView_doesNotImplementInteractable_implementsMatching(){
        final Cortado.Start.ViewInteraction interaction = Cortado.onView();
        assertThat(interaction).isNotInstanceOf(Interactable.class);
        assertThat(interaction).isInstanceOf(Matching.class);
    }

    @Test
    public void onView_withSingleCondition_implementsInteractable_doesNotImplementMatching(){
        final Cortado.OrAnd.ViewInteraction interaction = Cortado.onView().withText("test");
        assertThat(interaction).isInstanceOf(Interactable.class);
        assertThat(interaction).isNotInstanceOf(Matching.class);
    }

    @Test
    public void onView_withCondition_thenAnd_doesNotImplementInteractable_implementsMatching(){
        final Cortado.Unfinished.And.ViewInteraction interaction = Cortado.onView().withText("test").and();
        assertThat(interaction).isNotInstanceOf(Interactable.class);
        assertThat(interaction).isInstanceOf(Matching.class);
    }

    @Test
    public void onView_withCondition_thenAnd_thenCondition_implementsInteractable_doesNotImplementMatching(){
        final Cortado.And.ViewInteraction interaction = Cortado.onView().withText("test").and().withHint("test");
        assertThat(interaction).isInstanceOf(Interactable.class);
        assertThat(interaction).isNotInstanceOf(Matching.class);
    }

    @Test
    public void onView_withCondition_thenOr_doesNotImplementInteractable_implementsMatching(){
        final Cortado.Unfinished.Or.ViewInteraction interaction = Cortado.onView().withText("test").or();
        assertThat(interaction).isNotInstanceOf(Interactable.class);
        assertThat(interaction).isInstanceOf(Matching.class);
    }

    @Test
    public void onView_withCondition_thenOr_thenCondition_implementsInteractable_doesNotImplementMatching(){
        final Cortado.Or.ViewInteraction interaction = Cortado.onView().withText("test").or().withHint("test");
        assertThat(interaction).isInstanceOf(Interactable.class);
        assertThat(interaction).isNotInstanceOf(Matching.class);
    }
}
