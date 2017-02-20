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

import static cortado.Chunks.AssignableFrom;
import static cortado.Chunks.ClassName;
import static cortado.Chunks.HasContentDescription;
import static cortado.Chunks.HasDescendant;
import static cortado.Chunks.HasErrorText_Matcher;
import static cortado.Chunks.HasErrorText_String;
import static cortado.Chunks.HasFocus;
import static cortado.Chunks.HasImeAction_Integer;
import static cortado.Chunks.HasImeAction_Matcher;
import static cortado.Chunks.HasLinks;
import static cortado.Chunks.HasSibling;
import static cortado.Chunks.IsChecked;
import static cortado.Chunks.IsClickable;
import static cortado.Chunks.IsCompletelyDisplayed;
import static cortado.Chunks.IsDescendantOfA;
import static cortado.Chunks.IsDisplayed;
import static cortado.Chunks.IsDisplayingAtLeast;
import static cortado.Chunks.IsEnabled;
import static cortado.Chunks.IsFocusable;
import static cortado.Chunks.IsJavascriptEnabled;
import static cortado.Chunks.IsNotChecked;
import static cortado.Chunks.IsRoot;
import static cortado.Chunks.IsSelected;
import static cortado.Chunks.SupportsInputMethods;
import static cortado.Chunks.WithChild;
import static cortado.Chunks.WithContentDescription_Matcher;
import static cortado.Chunks.WithContentDescription_Resource;
import static cortado.Chunks.WithContentDescription_String;
import static cortado.Chunks.WithEffectiveVisibility;
import static cortado.Chunks.WithHint_Matcher;
import static cortado.Chunks.WithHint_Resource;
import static cortado.Chunks.WithHint_String;
import static cortado.Chunks.WithId_Matcher;
import static cortado.Chunks.WithId_Resource;
import static cortado.Chunks.WithInputType;
import static cortado.Chunks.WithParent;
import static cortado.Chunks.WithResourceName_Matcher;
import static cortado.Chunks.WithResourceName_String;
import static cortado.Chunks.WithSpinnerText_Matcher;
import static cortado.Chunks.WithSpinnerText_Resource;
import static cortado.Chunks.WithSpinnerText_String;
import static cortado.Chunks.WithTagKey;
import static cortado.Chunks.WithTagKey_Matcher;
import static cortado.Chunks.WithTagValue;
import static cortado.Chunks.WithText_Matcher;
import static cortado.Chunks.WithText_Resource;
import static cortado.Chunks.WithText_String;

public final class Cortado {

    @VisibleForTesting AssignableFrom assignableFrom = new AssignableFrom();
    @VisibleForTesting ClassName className = new ClassName();
    @VisibleForTesting IsDisplayed isDisplayed = new IsDisplayed();
    @VisibleForTesting IsCompletelyDisplayed isCompletelyDisplayed = new IsCompletelyDisplayed();
    @VisibleForTesting IsDisplayingAtLeast isDisplayingAtLeast = new IsDisplayingAtLeast();
    @VisibleForTesting IsEnabled isEnabled = new IsEnabled();
    @VisibleForTesting IsFocusable isFocusable = new IsFocusable();
    @VisibleForTesting HasFocus hasFocus = new HasFocus();
    @VisibleForTesting IsSelected isSelected = new IsSelected();
    @VisibleForTesting HasSibling hasSibling = new HasSibling();
    @VisibleForTesting WithContentDescription_Resource withContentDescriptionResource = new WithContentDescription_Resource();
    @VisibleForTesting WithContentDescription_String withContentDescriptionString = new WithContentDescription_String();
    @VisibleForTesting WithContentDescription_Matcher withContentDescriptionMatcher = new WithContentDescription_Matcher();
    @VisibleForTesting WithId_Resource withIdResource = new WithId_Resource();
    @VisibleForTesting WithId_Matcher withIdMatcher = new WithId_Matcher();
    @VisibleForTesting WithResourceName_String withResourceNameString = new WithResourceName_String();
    @VisibleForTesting WithResourceName_Matcher withResourceNameMatcher = new WithResourceName_Matcher();
    @VisibleForTesting WithTagKey withTagKey = new WithTagKey();
    @VisibleForTesting WithTagKey_Matcher withTagKeyMatcher = new WithTagKey_Matcher();
    @VisibleForTesting WithTagValue withTagValue = new WithTagValue();
    @VisibleForTesting WithText_String withTextString = new WithText_String();
    @VisibleForTesting WithText_Matcher withTextMatcher = new WithText_Matcher();
    @VisibleForTesting WithText_Resource withTextResource = new WithText_Resource();
    @VisibleForTesting WithHint_String withHintString = new WithHint_String();
    @VisibleForTesting WithHint_Matcher withHintMatcher = new WithHint_Matcher();
    @VisibleForTesting WithHint_Resource withHintResource = new WithHint_Resource();
    @VisibleForTesting IsChecked isChecked = new IsChecked();
    @VisibleForTesting IsNotChecked isNotChecked = new IsNotChecked();
    @VisibleForTesting HasContentDescription hasContentDescription = new HasContentDescription();
    @VisibleForTesting HasDescendant hasDescendant = new HasDescendant();
    @VisibleForTesting IsClickable isClickable = new IsClickable();
    @VisibleForTesting IsDescendantOfA isDescendantOfA = new IsDescendantOfA();
    @VisibleForTesting WithEffectiveVisibility withEffectiveVisibility = new WithEffectiveVisibility();
    @VisibleForTesting WithParent withParent = new WithParent();
    @VisibleForTesting WithChild withChild = new WithChild();
    @VisibleForTesting IsRoot isRoot = new IsRoot();
    @VisibleForTesting SupportsInputMethods supportsInputMethods = new SupportsInputMethods();
    @VisibleForTesting HasImeAction_Integer hasImeActionInteger = new HasImeAction_Integer();
    @VisibleForTesting HasImeAction_Matcher hasImeActionMatcher = new HasImeAction_Matcher();
    @VisibleForTesting HasLinks hasLinks = new HasLinks();
    @VisibleForTesting WithSpinnerText_Resource withSpinnerTextResource = new WithSpinnerText_Resource();
    @VisibleForTesting WithSpinnerText_Matcher withSpinnerTextMatcher = new WithSpinnerText_Matcher();
    @VisibleForTesting WithSpinnerText_String withSpinnerTextString = new WithSpinnerText_String();
    @VisibleForTesting IsJavascriptEnabled isJavascriptEnabled = new IsJavascriptEnabled();
    @VisibleForTesting HasErrorText_Matcher hasErrorTextMatcher = new HasErrorText_Matcher();
    @VisibleForTesting HasErrorText_String hasErrorTextString = new HasErrorText_String();
    @VisibleForTesting WithInputType withInputType = new WithInputType();
    @VisibleForTesting Chunks.Matching matching = new Chunks.Matching();

    private Linker linker = Linker.REGULAR;

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

    @NonNull
    synchronized org.hamcrest.Matcher<View> get() {
        if (cached == null) {
            List<org.hamcrest.Matcher<? super View>> matchers = new ArrayList<>();

            assignableFrom.applyIfNeeded(matchers);
            className.applyIfNeeded(matchers);
            isDisplayed.applyIfNeeded(matchers);
            isCompletelyDisplayed.applyIfNeeded(matchers);
            isDisplayingAtLeast.applyIfNeeded(matchers);
            isEnabled.applyIfNeeded(matchers);
            isFocusable.applyIfNeeded(matchers);
            hasFocus.applyIfNeeded(matchers);
            isSelected.applyIfNeeded(matchers);
            hasSibling.applyIfNeeded(matchers);
            withContentDescriptionResource.applyIfNeeded(matchers);
            withContentDescriptionString.applyIfNeeded(matchers);
            withContentDescriptionMatcher.applyIfNeeded(matchers);
            withIdResource.applyIfNeeded(matchers);
            withIdMatcher.applyIfNeeded(matchers);
            withResourceNameString.applyIfNeeded(matchers);
            withResourceNameMatcher.applyIfNeeded(matchers);
            withTagKey.applyIfNeeded(matchers);
            withTagKeyMatcher.applyIfNeeded(matchers);
            withTagValue.applyIfNeeded(matchers);
            withTextString.applyIfNeeded(matchers);
            withTextMatcher.applyIfNeeded(matchers);
            withTextResource.applyIfNeeded(matchers);
            withHintString.applyIfNeeded(matchers);
            withHintMatcher.applyIfNeeded(matchers);
            withHintResource.applyIfNeeded(matchers);
            isChecked.applyIfNeeded(matchers);
            isNotChecked.applyIfNeeded(matchers);
            hasContentDescription.applyIfNeeded(matchers);
            hasDescendant.applyIfNeeded(matchers);
            isClickable.applyIfNeeded(matchers);
            isDescendantOfA.applyIfNeeded(matchers);
            withEffectiveVisibility.applyIfNeeded(matchers);
            withParent.applyIfNeeded(matchers);
            withChild.applyIfNeeded(matchers);
            isRoot.applyIfNeeded(matchers);
            supportsInputMethods.applyIfNeeded(matchers);
            hasImeActionInteger.applyIfNeeded(matchers);
            hasImeActionMatcher.applyIfNeeded(matchers);
            hasLinks.applyIfNeeded(matchers);
            withSpinnerTextResource.applyIfNeeded(matchers);
            withSpinnerTextMatcher.applyIfNeeded(matchers);
            withSpinnerTextString.applyIfNeeded(matchers);
            isJavascriptEnabled.applyIfNeeded(matchers);
            hasErrorTextMatcher.applyIfNeeded(matchers);
            hasErrorTextString.applyIfNeeded(matchers);
            withInputType.applyIfNeeded(matchers);
            matching.applyIfNeeded(matchers);

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
        assignableFrom.store(clazz);
    }

    void withClassName(org.hamcrest.Matcher<String> classNameMatcher) {
        clearCached();
        className.store(classNameMatcher);
    }

    void isDisplayed() {
        clearCached();
        isDisplayed.store(true);
    }

    void isCompletelyDisplayed() {
        clearCached();
        isCompletelyDisplayed.store(true);
    }

    void isDisplayingAtLeast(int areaPercentage) {
        clearCached();
        isDisplayingAtLeast.store(areaPercentage);
    }

    void isEnabled() {
        clearCached();
        isEnabled.store(true);
    }

    void isFocusable() {
        clearCached();
        isFocusable.store(true);
    }

    void hasFocus() {
        clearCached();
        hasFocus.store(true);
    }

    void isSelected() {
        clearCached();
        isSelected.store(true);
    }

    void hasSibling(org.hamcrest.Matcher<View> siblingMatcher) {
        clearCached();
        hasSibling.store(siblingMatcher);
    }

    void hasSibling(Matcher siblingMatcher) {
        hasSibling((org.hamcrest.Matcher<View>) siblingMatcher);
    }

    void withContentDescription(@StringRes int resourceId) {
        clearCached();
        withContentDescriptionResource.store(resourceId);
    }

    void withContentDescription(String text) {
        clearCached();
        withContentDescriptionString.store(text);
    }

    void withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher) {
        clearCached();
        withContentDescriptionMatcher.store(charSequenceMatcher);
    }

    void withId(@IdRes int id) {
        clearCached();
        withIdResource.store(id);
    }

    void withId(org.hamcrest.Matcher<Integer> integerMatcher) {
        clearCached();
        withIdMatcher.store(integerMatcher);
    }

    void withResourceName(String name) {
        clearCached();
        withResourceNameString.store(name);
    }

    void withResourceName(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        withResourceNameMatcher.store(stringMatcher);
    }

    void withTagKey(int key) {
        clearCached();
        withTagKey.store(key);
    }

    void withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher) {
        clearCached();
        withTagKeyMatcher.store(new Chunks.TagKeyArgs(key, objectMatcher));
    }

    void withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher) {
        clearCached();
        withTagValue.store(tagValueMatcher);
    }

    void withText(String text) {
        clearCached();
        withTextString.store(text);
    }

    void withText(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        withTextMatcher.store(stringMatcher);
    }

    void withText(@StringRes int resourceId) {
        clearCached();
        withTextResource.store(resourceId);
    }

    void withHint(String hintText) {
        clearCached();
        withHintString.store(hintText);
    }

    void withHint(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        withHintMatcher.store(stringMatcher);
    }

    void withHint(@StringRes int resourceId) {
        clearCached();
        withHintResource.store(resourceId);
    }

    void isChecked() {
        clearCached();
        isChecked.store(true);
    }

    void isNotChecked() {
        clearCached();
        isNotChecked.store(true);
    }

    void hasContentDescription() {
        clearCached();
        hasContentDescription.store(true);
    }

    void hasDescendant(org.hamcrest.Matcher<View> descendantMatcher) {
        clearCached();
        hasDescendant.store(descendantMatcher);
    }

    void hasDescendant(Matcher descendantMatcher) {
        hasDescendant((org.hamcrest.Matcher<View>) descendantMatcher);
    }

    void isClickable() {
        clearCached();
        isClickable.store(true);
    }

    void isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher) {
        clearCached();
        isDescendantOfA.store(ancestorMatcher);
    }

    void isDescendantOfA(Matcher ancestorMatcher) {
        isDescendantOfA((org.hamcrest.Matcher<View>) ancestorMatcher);
    }

    void withEffectiveVisibility(ViewMatchers.Visibility visibility) {
        clearCached();
        withEffectiveVisibility.store(visibility);
    }

    void withParent(org.hamcrest.Matcher<View> parentMatcher) {
        clearCached();
        withParent.store(parentMatcher);
    }

    void withParent(Matcher parentMatcher) {
        withParent((org.hamcrest.Matcher<View>) parentMatcher);
    }

    void withChild(org.hamcrest.Matcher<View> childMatcher) {
        clearCached();
        withChild.store(childMatcher);
    }

    void withChild(Matcher childMatcher) {
        withChild((org.hamcrest.Matcher<View>) childMatcher);
    }

    void isRoot() {
        clearCached();
        isRoot.store(true);
    }

    void supportsInputMethods() {
        clearCached();
        supportsInputMethods.store(true);
    }

    void hasImeAction(int imeAction) {
        clearCached();
        hasImeActionInteger.store(imeAction);
    }

    void hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher) {
        clearCached();
        hasImeActionMatcher.store(imeActionMatcher);
    }

    void hasLinks() {
        clearCached();
        hasLinks.store(true);
    }

    void withSpinnerText(@StringRes int resourceId) {
        clearCached();
        withSpinnerTextResource.store(resourceId);
    }

    void withSpinnerText(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        withSpinnerTextMatcher.store(stringMatcher);
    }

    void withSpinnerText(String text) {
        clearCached();
        withSpinnerTextString.store(text);
    }

    void isJavascriptEnabled() {
        clearCached();
        isJavascriptEnabled.store(true);
    }

    void hasErrorText(org.hamcrest.Matcher<String> stringMatcher) {
        clearCached();
        hasErrorTextMatcher.store(stringMatcher);
    }

    void hasErrorText(String expectedError) {
        clearCached();
        hasErrorTextString.store(expectedError);
    }

    void withInputType(int inputType) {
        clearCached();
        withInputType.store(inputType);
    }

    void matching(org.hamcrest.Matcher<View> matcher){
        clearCached();
        matching.store(matcher);
    }

    void matching(Matcher matcher){
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
            }

            public final class ViewInteraction extends NotCompletable<Cortado.Or.ViewInteraction> {

                private ViewInteraction() {
                    super(Cortado.this);
                }

                @Override
                Cortado.Or.ViewInteraction returned() {
                    return new Cortado.Or().new ViewInteraction();
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
            }

            public final class ViewInteraction extends NotCompletable<Cortado.And.ViewInteraction> {

                private ViewInteraction() {
                    super(Cortado.this);
                }

                @Override
                Cortado.And.ViewInteraction returned() {
                    return new Cortado.And().new ViewInteraction();
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

            public Unfinished.And.ViewInteraction or() {
                return new Unfinished().new And().new ViewInteraction();
            }
        }
    }
}
