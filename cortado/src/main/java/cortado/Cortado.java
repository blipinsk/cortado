/*
 * Copyright 2017 Bartosz Lipinski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cortado;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.VisibleForTesting;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;

import org.hamcrest.Matchers;

import java.util.ArrayList;
import java.util.List;

public final class Cortado {

    @VisibleForTesting
    List<org.hamcrest.Matcher<? super View>> matchers = new ArrayList<>();
    @VisibleForTesting
    Linker linker = Linker.REGULAR;
    @VisibleForTesting
    boolean negateNextMatcher = false;
    @Nullable
    private org.hamcrest.Matcher<? super View> cached;

    private Cortado() {
    }

    public static cortado.Start.ViewInteraction onView() {
        return new cortado.Start(new Cortado()).new ViewInteraction();
    }

    public static cortado.Start.Matcher view() {
        return new cortado.Start(new Cortado()).new Matcher();
    }

    private synchronized void clearCached() {
        cached = null;
    }

    final void negateNextMatcher() {
        negateNextMatcher = true;
    }

    @VisibleForTesting
    final void addMatcher(org.hamcrest.Matcher<View> matcher) {
        if (negateNextMatcher) {
            negateNextMatcher = false;
            matcher = Matchers.not(matcher);
        }
        matchers.add(matcher);
    }

    @NonNull
    final synchronized org.hamcrest.Matcher<View> get() {
        if (cached == null) {
            cached = linker.link(matchers);
        }
        //noinspection unchecked
        return (org.hamcrest.Matcher<View>) cached;
    }

    @NonNull
    final ViewInteraction perform(final ViewAction... viewActions) {
        return Espresso.onView(get()).perform(viewActions);
    }

    @NonNull
    final ViewInteraction check(final ViewAssertion viewAssert) {
        return Espresso.onView(get()).check(viewAssert);
    }

    private final void and() {
        clearCached();
        linker = Linker.AND;
    }

    private final void or() {
        clearCached();
        linker = Linker.OR;
    }

    final void isAssignableFrom(Class<? extends View> clazz) {
        clearCached();
        addMatcher(ViewMatchers.isAssignableFrom(clazz));
    }

    final void withClassName(org.hamcrest.Matcher<String> classNameMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withClassName(classNameMatcher));
    }

    final void isDisplayed() {
        clearCached();
        addMatcher(ViewMatchers.isDisplayed());
    }

    final void isCompletelyDisplayed() {
        clearCached();
        addMatcher(ViewMatchers.isCompletelyDisplayed());
    }

    final void isDisplayingAtLeast(int areaPercentage) {
        clearCached();
        addMatcher(ViewMatchers.isDisplayingAtLeast(areaPercentage));
    }

    final void isEnabled() {
        clearCached();
        addMatcher(ViewMatchers.isEnabled());
    }

    final void isFocusable() {
        clearCached();
        addMatcher(ViewMatchers.isFocusable());
    }

    final void hasFocus() {
        clearCached();
        addMatcher(ViewMatchers.hasFocus());
    }

    final void isSelected() {
        clearCached();
        addMatcher(ViewMatchers.isSelected());
    }

    final void hasSibling(org.hamcrest.Matcher<View> siblingMatcher) {
        clearCached();
        addMatcher(ViewMatchers.hasSibling(siblingMatcher));
    }

    final void hasSibling(Matcher siblingMatcher) {
        hasSibling((org.hamcrest.Matcher<View>) siblingMatcher);
    }

    final void withContentDescription(@StringRes int resourceId) {
        clearCached();
        addMatcher(ViewMatchers.withContentDescription(resourceId));
    }

    final void withContentDescription(String text) {
        clearCached();
        addMatcher(ViewMatchers.withContentDescription(text));
    }

    final void withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withContentDescription(charSequenceMatcher));
    }

    final void withId(@IdRes int id) {
        clearCached();
        addMatcher(ViewMatchers.withId(id));
    }

    final void withId(org.hamcrest.Matcher<Integer> integerMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withId(integerMatcher));
    }

    final void withResourceName(String name) {
        clearCached();
        addMatcher(ViewMatchers.withResourceName(name));
    }

    final void withResourceName(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withResourceName(stringMatcher));
    }

    final void withTagKey(int key) {
        clearCached();
        addMatcher(ViewMatchers.withTagKey(key));
    }

    final void withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withTagKey(key, objectMatcher));
    }

    final void withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withTagValue(tagValueMatcher));
    }

    final void withText(String text) {
        clearCached();
        addMatcher(ViewMatchers.withText(text));
    }

    final void withText(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withText(stringMatcher));
    }

    final void withText(@StringRes int resourceId) {
        clearCached();
        addMatcher(ViewMatchers.withText(resourceId));
    }

    final void withHint(String hintText) {
        clearCached();
        addMatcher(ViewMatchers.withHint(hintText));
    }

    final void withHint(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withHint(stringMatcher));
    }

    final void withHint(@StringRes int resourceId) {
        clearCached();
        addMatcher(ViewMatchers.withHint(resourceId));
    }

    final void isChecked() {
        clearCached();
        addMatcher(ViewMatchers.isChecked());
    }

    final void isNotChecked() {
        clearCached();
        addMatcher(ViewMatchers.isNotChecked());
    }

    final void hasContentDescription() {
        clearCached();
        addMatcher(ViewMatchers.hasContentDescription());
    }

    final void hasDescendant(org.hamcrest.Matcher<View> descendantMatcher) {
        clearCached();
        addMatcher(ViewMatchers.hasDescendant(descendantMatcher));
    }

    final void hasDescendant(Matcher descendantMatcher) {
        hasDescendant((org.hamcrest.Matcher<View>) descendantMatcher);
    }

    final void isClickable() {
        clearCached();
        addMatcher(ViewMatchers.isClickable());
    }

    final void isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher) {
        clearCached();
        addMatcher(ViewMatchers.isDescendantOfA(ancestorMatcher));
    }

    final void isDescendantOfA(Matcher ancestorMatcher) {
        isDescendantOfA((org.hamcrest.Matcher<View>) ancestorMatcher);
    }

    final void withEffectiveVisibility(ViewMatchers.Visibility visibility) {
        clearCached();
        addMatcher(ViewMatchers.withEffectiveVisibility(visibility));
    }

    final void withParent(org.hamcrest.Matcher<View> parentMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withParent(parentMatcher));
    }

    final void withParent(Matcher parentMatcher) {
        withParent((org.hamcrest.Matcher<View>) parentMatcher);
    }

    final void withChild(org.hamcrest.Matcher<View> childMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withChild(childMatcher));
    }

    final void withChild(Matcher childMatcher) {
        withChild((org.hamcrest.Matcher<View>) childMatcher);
    }

    final void isRoot() {
        clearCached();
        addMatcher(ViewMatchers.isRoot());
    }

    final void supportsInputMethods() {
        clearCached();
        addMatcher(ViewMatchers.supportsInputMethods());
    }

    final void hasImeAction(int imeAction) {
        clearCached();
        addMatcher(ViewMatchers.hasImeAction(imeAction));
    }

    final void hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher) {
        clearCached();
        addMatcher(ViewMatchers.hasImeAction(imeActionMatcher));
    }

    final void hasLinks() {
        clearCached();
        addMatcher(ViewMatchers.hasLinks());
    }

    final void withSpinnerText(@StringRes int resourceId) {
        clearCached();
        addMatcher(ViewMatchers.withSpinnerText(resourceId));
    }

    final void withSpinnerText(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withSpinnerText(stringMatcher));
    }

    final void withSpinnerText(String text) {
        clearCached();
        addMatcher(ViewMatchers.withSpinnerText(text));
    }

    final void isJavascriptEnabled() {
        clearCached();
        addMatcher(ViewMatchers.isJavascriptEnabled());
    }

    final void hasErrorText(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        addMatcher(ViewMatchers.hasErrorText(stringMatcher));
    }

    final void hasErrorText(String expectedError) {
        clearCached();
        addMatcher(ViewMatchers.hasErrorText(expectedError));
    }

    final void withInputType(int inputType) {
        clearCached();
        addMatcher(ViewMatchers.withInputType(inputType));
    }

    final void matching(org.hamcrest.Matcher<View> matcher) {
        clearCached();
        addMatcher(matcher);
    }

    final void matching(Matcher matcher) {
        matching((org.hamcrest.Matcher<View>) matcher);
    }

    @Deprecated
    public final class Start {

        private Start() {
        }

        @Deprecated
        public final class Matcher extends NotCompletable<OrAnd.Matcher> {

            Matcher() {
                super(Cortado.this);
            }

            @Override
            final OrAnd.Matcher returned() {
                return new OrAnd().new Matcher();
            }

            @VisibleForTesting
            final Cortado getCortado() {
                return Cortado.this;
            }
        }

        @Deprecated
        public final class ViewInteraction extends NotCompletable<OrAnd.ViewInteraction> {

            ViewInteraction() {
                super(Cortado.this);
            }

            @Override
            final OrAnd.ViewInteraction returned() {
                return new OrAnd().new ViewInteraction();
            }

            @VisibleForTesting
            final Cortado getCortado() {
                return Cortado.this;
            }
        }
    }

    @Deprecated
    public final class Unfinished {

        private Unfinished() {
        }

        @Deprecated
        public final class Or {

            private Or() {
            }

            @Deprecated
            public final class Matcher extends NotCompletable<Cortado.Or.Matcher> {

                private Matcher() {
                    super(Cortado.this);
                }

                @Override
                final Cortado.Or.Matcher returned() {
                    return new Cortado.Or().new Matcher();
                }

                @VisibleForTesting
                final Cortado getCortado() {
                    return Cortado.this;
                }
            }

            @Deprecated
            public final class ViewInteraction
                    extends NotCompletable<Cortado.Or.ViewInteraction> {

                private ViewInteraction() {
                    super(Cortado.this);
                }

                @Override
                final Cortado.Or.ViewInteraction returned() {
                    return new Cortado.Or().new ViewInteraction();
                }

                @VisibleForTesting
                final Cortado getCortado() {
                    return Cortado.this;
                }
            }
        }

        @Deprecated
        public final class And {

            private And() {
            }

            @Deprecated
            public final class Matcher extends NotCompletable<Cortado.And.Matcher> {

                private Matcher() {
                    super(Cortado.this);
                }

                @Override
                final Cortado.And.Matcher returned() {
                    return new Cortado.And().new Matcher();
                }

                @VisibleForTesting
                final Cortado getCortado() {
                    return Cortado.this;
                }
            }

            @Deprecated
            public final class ViewInteraction
                    extends NotCompletable<Cortado.And.ViewInteraction> {

                private ViewInteraction() {
                    super(Cortado.this);
                }

                @Override
                final Cortado.And.ViewInteraction returned() {
                    return new Cortado.And().new ViewInteraction();
                }

                @VisibleForTesting
                final Cortado getCortado() {
                    return Cortado.this;
                }
            }
        }
    }

    public final class OrAnd {

        OrAnd() {
        }

        public final class Matcher extends cortado.Matcher implements
                cortado.Or<cortado.Unfinished.Or.Matcher>,
                cortado.And<cortado.Unfinished.And.Matcher> {

            Matcher() {
                super(Cortado.this);
            }

            @Override
            public final cortado.Unfinished.Or.Matcher or() {
                Cortado.this.or();
                return new cortado.Unfinished(Cortado.this).new Or().new Matcher();
            }

            @Override
            public final cortado.Unfinished.And.Matcher and() {
                Cortado.this.and();
                return new cortado.Unfinished(Cortado.this).new And().new Matcher();
            }
        }

        public final class ViewInteraction extends cortado.ViewInteraction implements
                cortado.Or<cortado.Unfinished.Or.ViewInteraction>,
                cortado.And<cortado.Unfinished.And.ViewInteraction> {

            ViewInteraction() {
                super(Cortado.this);
            }

            @Override
            public final cortado.Unfinished.Or.ViewInteraction or() {
                Cortado.this.or();
                return new cortado.Unfinished(Cortado.this).new Or().new ViewInteraction();
            }

            @Override
            public final cortado.Unfinished.And.ViewInteraction and() {
                Cortado.this.and();
                return new cortado.Unfinished(Cortado.this).new And().new ViewInteraction();
            }
        }
    }

    public final class Or {

        Or() {
        }

        public final class Matcher extends cortado.Matcher
                implements cortado.Or<cortado.Unfinished.Or.Matcher> {

            Matcher() {
                super(Cortado.this);
            }

            @Override
            public final cortado.Unfinished.Or.Matcher or() {
                return new cortado.Unfinished(Cortado.this).new Or().new Matcher();
            }
        }

        public final class ViewInteraction extends cortado.ViewInteraction
                implements cortado.Or<cortado.Unfinished.Or.ViewInteraction> {

            ViewInteraction() {
                super(Cortado.this);
            }

            @Override
            public final cortado.Unfinished.Or.ViewInteraction or() {
                return new cortado.Unfinished(Cortado.this).new Or().new ViewInteraction();
            }
        }
    }

    public final class And {

        And() {
        }

        public final class Matcher extends cortado.Matcher
                implements cortado.And<cortado.Unfinished.And.Matcher> {

            Matcher() {
                super(Cortado.this);
            }

            @Override
            public final cortado.Unfinished.And.Matcher and() {
                return new cortado.Unfinished(Cortado.this).new And().new Matcher();
            }
        }

        public final class ViewInteraction extends cortado.ViewInteraction
                implements cortado.And<cortado.Unfinished.And.ViewInteraction> {

            ViewInteraction() {
                super(Cortado.this);
            }

            @Override
            public final cortado.Unfinished.And.ViewInteraction and() {
                return new cortado.Unfinished(Cortado.this).new And().new ViewInteraction();
            }
        }
    }
}
