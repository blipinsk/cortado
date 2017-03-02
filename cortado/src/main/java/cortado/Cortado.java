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

import java.util.ArrayList;
import java.util.List;

public final class Cortado {

    @VisibleForTesting List<org.hamcrest.Matcher<? super View>> matchers = new ArrayList<>();
    @VisibleForTesting Linker linker = Linker.REGULAR;
    @Nullable
    private org.hamcrest.Matcher<? super View> cached;

    private Cortado() {
    }

    public static Start.ViewInteraction onView() {
        return new Cortado().new Start().new ViewInteraction();
    }

    public static Start.Matcher view() {
        return new Cortado().new Start().new Matcher();
    }

    private synchronized void clearCached() {
        cached = null;
    }

    private void addMatcher(org.hamcrest.Matcher<View> matcher) {
        matchers.add(matcher);
    }

    @NonNull
    synchronized org.hamcrest.Matcher<View> get() {
        if (cached == null) {
            cached = linker.link(matchers);
        }
        //noinspection unchecked
        return (org.hamcrest.Matcher<View>) cached;
    }

    @NonNull
    ViewInteraction perform(final ViewAction... viewActions) {
        return Espresso.onView(get()).perform(viewActions);
    }

    @NonNull
    ViewInteraction check(final ViewAssertion viewAssert) {
        return Espresso.onView(get()).check(viewAssert);
    }

    private void and() {
        clearCached();
        linker = Linker.AND;
    }

    private void or() {
        clearCached();
        linker = Linker.OR;
    }

    void isAssignableFrom(Class<? extends View> clazz) {
        clearCached();
        addMatcher(ViewMatchers.isAssignableFrom(clazz));
    }

    void withClassName(org.hamcrest.Matcher<String> classNameMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withClassName(classNameMatcher));
    }

    void isDisplayed() {
        clearCached();
        addMatcher(ViewMatchers.isDisplayed());
    }

    void isCompletelyDisplayed() {
        clearCached();
        addMatcher(ViewMatchers.isCompletelyDisplayed());
    }

    void isDisplayingAtLeast(int areaPercentage) {
        clearCached();
        addMatcher(ViewMatchers.isDisplayingAtLeast(areaPercentage));
    }

    void isEnabled() {
        clearCached();
        addMatcher(ViewMatchers.isEnabled());
    }

    void isFocusable() {
        clearCached();
        addMatcher(ViewMatchers.isFocusable());
    }

    void hasFocus() {
        clearCached();
        addMatcher(ViewMatchers.hasFocus());
    }

    void isSelected() {
        clearCached();
        addMatcher(ViewMatchers.isSelected());
    }

    void hasSibling(org.hamcrest.Matcher<View> siblingMatcher) {
        clearCached();
        addMatcher(ViewMatchers.hasSibling(siblingMatcher));
    }

    void hasSibling(Matcher siblingMatcher) {
        hasSibling((org.hamcrest.Matcher<View>) siblingMatcher);
    }

    void withContentDescription(@StringRes int resourceId) {
        clearCached();
        addMatcher(ViewMatchers.withContentDescription(resourceId));
    }

    void withContentDescription(String text) {
        clearCached();
        addMatcher(ViewMatchers.withContentDescription(text));
    }

    void withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withContentDescription(charSequenceMatcher));
    }

    void withId(@IdRes int id) {
        clearCached();
        addMatcher(ViewMatchers.withId(id));
    }

    void withId(org.hamcrest.Matcher<Integer> integerMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withId(integerMatcher));
    }

    void withResourceName(String name) {
        clearCached();
        addMatcher(ViewMatchers.withResourceName(name));
    }

    void withResourceName(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withResourceName(stringMatcher));
    }

    void withTagKey(int key) {
        clearCached();
        addMatcher(ViewMatchers.withTagKey(key));
    }

    void withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withTagKey(key, objectMatcher));
    }

    void withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withTagValue(tagValueMatcher));
    }

    void withText(String text) {
        clearCached();
        addMatcher(ViewMatchers.withText(text));
    }

    void withText(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withText(stringMatcher));
    }

    void withText(@StringRes int resourceId) {
        clearCached();
        addMatcher(ViewMatchers.withText(resourceId));
    }

    void withHint(String hintText) {
        clearCached();
        addMatcher(ViewMatchers.withHint(hintText));
    }

    void withHint(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withHint(stringMatcher));
    }

    void withHint(@StringRes int resourceId) {
        clearCached();
        addMatcher(ViewMatchers.withHint(resourceId));
    }

    void isChecked() {
        clearCached();
        addMatcher(ViewMatchers.isChecked());
    }

    void isNotChecked() {
        clearCached();
        addMatcher(ViewMatchers.isNotChecked());
    }

    void hasContentDescription() {
        clearCached();
        addMatcher(ViewMatchers.hasContentDescription());
    }

    void hasDescendant(org.hamcrest.Matcher<View> descendantMatcher) {
        clearCached();
        addMatcher(ViewMatchers.hasDescendant(descendantMatcher));
    }

    void hasDescendant(Matcher descendantMatcher) {
        hasDescendant((org.hamcrest.Matcher<View>) descendantMatcher);
    }

    void isClickable() {
        clearCached();
        addMatcher(ViewMatchers.isClickable());
    }

    void isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher) {
        clearCached();
        addMatcher(ViewMatchers.isDescendantOfA(ancestorMatcher));
    }

    void isDescendantOfA(Matcher ancestorMatcher) {
        isDescendantOfA((org.hamcrest.Matcher<View>) ancestorMatcher);
    }

    void withEffectiveVisibility(ViewMatchers.Visibility visibility) {
        clearCached();
        addMatcher(ViewMatchers.withEffectiveVisibility(visibility));
    }

    void withParent(org.hamcrest.Matcher<View> parentMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withParent(parentMatcher));
    }

    void withParent(Matcher parentMatcher) {
        withParent((org.hamcrest.Matcher<View>) parentMatcher);
    }

    void withChild(org.hamcrest.Matcher<View> childMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withChild(childMatcher));
    }

    void withChild(Matcher childMatcher) {
        withChild((org.hamcrest.Matcher<View>) childMatcher);
    }

    void isRoot() {
        clearCached();
        addMatcher(ViewMatchers.isRoot());
    }

    void supportsInputMethods() {
        clearCached();
        addMatcher(ViewMatchers.supportsInputMethods());
    }

    void hasImeAction(int imeAction) {
        clearCached();
        addMatcher(ViewMatchers.hasImeAction(imeAction));
    }

    void hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher) {
        clearCached();
        addMatcher(ViewMatchers.hasImeAction(imeActionMatcher));
    }

    void hasLinks() {
        clearCached();
        addMatcher(ViewMatchers.hasLinks());
    }

    void withSpinnerText(@StringRes int resourceId) {
        clearCached();
        addMatcher(ViewMatchers.withSpinnerText(resourceId));
    }

    void withSpinnerText(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        addMatcher(ViewMatchers.withSpinnerText(stringMatcher));
    }

    void withSpinnerText(String text) {
        clearCached();
        addMatcher(ViewMatchers.withSpinnerText(text));
    }

    void isJavascriptEnabled() {
        clearCached();
        addMatcher(ViewMatchers.isJavascriptEnabled());
    }

    void hasErrorText(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        addMatcher(ViewMatchers.hasErrorText(stringMatcher));
    }

    void hasErrorText(String expectedError) {
        clearCached();
        addMatcher(ViewMatchers.hasErrorText(expectedError));
    }

    void withInputType(int inputType) {
        clearCached();
        addMatcher(ViewMatchers.withInputType(inputType));
    }

    void matching(org.hamcrest.Matcher<View> matcher) {
        clearCached();
        addMatcher(matcher);
    }

    void matching(Matcher matcher) {
        matching((org.hamcrest.Matcher<View>) matcher);
    }

    public final class Start {

        private Start() {
        }

        public final class Matcher extends NotCompletable<OrAnd.Matcher> {

            Matcher() {
                super(Cortado.this);
            }

            @Override
            OrAnd.Matcher returned() {
                return new OrAnd().new Matcher();
            }

            @VisibleForTesting
            Cortado getCortado() {
                return Cortado.this;
            }
        }

        public final class ViewInteraction extends NotCompletable<OrAnd.ViewInteraction> {

            ViewInteraction() {
                super(Cortado.this);
            }

            @Override
            OrAnd.ViewInteraction returned() {
                return new OrAnd().new ViewInteraction();
            }

            @VisibleForTesting
            Cortado getCortado() {
                return Cortado.this;
            }
        }
    }

    public final class Unfinished {

        private Unfinished() {
        }

        public final class Or {

            private Or() {
            }

            public final class Matcher extends NotCompletable<Cortado.Or.Matcher> {

                private Matcher() {
                    super(Cortado.this);
                }

                @Override
                Cortado.Or.Matcher returned() {
                    return new Cortado.Or().new Matcher();
                }

                @VisibleForTesting
                Cortado getCortado() {
                    return Cortado.this;
                }
            }

            public final class ViewInteraction extends NotCompletable<Cortado.Or.ViewInteraction> {

                private ViewInteraction() {
                    super(Cortado.this);
                }

                @Override
                Cortado.Or.ViewInteraction returned() {
                    return new Cortado.Or().new ViewInteraction();
                }

                @VisibleForTesting
                Cortado getCortado() {
                    return Cortado.this;
                }
            }
        }

        public final class And {

            private And() {
            }

            public final class Matcher extends NotCompletable<Cortado.And.Matcher> {

                private Matcher() {
                    super(Cortado.this);
                }

                @Override
                Cortado.And.Matcher returned() {
                    return new Cortado.And().new Matcher();
                }

                @VisibleForTesting
                Cortado getCortado() {
                    return Cortado.this;
                }
            }

            public final class ViewInteraction extends NotCompletable<Cortado.And.ViewInteraction> {

                private ViewInteraction() {
                    super(Cortado.this);
                }

                @Override
                Cortado.And.ViewInteraction returned() {
                    return new Cortado.And().new ViewInteraction();
                }

                @VisibleForTesting
                Cortado getCortado() {
                    return Cortado.this;
                }
            }
        }
    }

    public final class OrAnd {

        OrAnd() {
        }

        public final class Matcher extends cortado.Matcher {

            Matcher() {
                super(Cortado.this);
            }

            public Unfinished.Or.Matcher or() {
                Cortado.this.or();
                return new Unfinished().new Or().new Matcher();
            }

            public Unfinished.And.Matcher and() {
                Cortado.this.and();
                return new Unfinished().new And().new Matcher();
            }
        }

        public final class ViewInteraction extends cortado.ViewInteraction {

            ViewInteraction() {
                super(Cortado.this);
            }

            public Unfinished.Or.ViewInteraction or() {
                Cortado.this.or();
                return new Unfinished().new Or().new ViewInteraction();
            }

            public Unfinished.And.ViewInteraction and() {
                Cortado.this.and();
                return new Unfinished().new And().new ViewInteraction();
            }
        }
    }

    public final class Or {

        private Or() {
        }

        public final class Matcher extends cortado.Matcher {

            private Matcher() {
                super(Cortado.this);
            }

            public Unfinished.Or.Matcher or() {
                return new Unfinished().new Or().new Matcher();
            }
        }

        public final class ViewInteraction extends cortado.ViewInteraction {

            private ViewInteraction() {
                super(Cortado.this);
            }

            public Unfinished.Or.ViewInteraction or() {
                return new Unfinished().new Or().new ViewInteraction();
            }
        }
    }

    public final class And {

        private And() {
        }

        public final class Matcher extends cortado.Matcher {

            private Matcher() {
                super(Cortado.this);
            }

            public Unfinished.And.Matcher and() {
                return new Unfinished().new And().new Matcher();
            }
        }

        public final class ViewInteraction extends cortado.ViewInteraction {

            private ViewInteraction() {
                super(Cortado.this);
            }

            public Unfinished.And.ViewInteraction and() {
                return new Unfinished().new And().new ViewInteraction();
            }
        }
    }
}
