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
import android.support.annotation.StringRes;
import android.support.annotation.VisibleForTesting;
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;

public final class Unfinished {

    private final Cortado cortado;

    Unfinished(Cortado cortado) {
        this.cortado = cortado;
    }

    public final class Or {

        Or() {
        }

        public final class Matcher extends NotCompletable<Cortado.Or.Matcher>
                implements Not<Negated.Unfinished.Or.Matcher> {

            Matcher() {
                super(cortado);
            }

            @Override
            final Cortado.Or.Matcher returned() {
                return cortado.new Or().new Matcher();
            }

            @VisibleForTesting
            final Cortado getCortado() {
                return cortado;
            }

            @Override
            public final Negated.Unfinished.Or.Matcher not() {
                return new Negated(cortado).new Unfinished().new Or().new Matcher();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isAssignableFrom(Class<? extends View> clazz) {
                return super.isAssignableFrom(clazz);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withClassName(org.hamcrest.Matcher<String> classNameMatcher) {
                return super.withClassName(classNameMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isDisplayed() {
                return super.isDisplayed();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isCompletelyDisplayed() {
                return super.isCompletelyDisplayed();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isDisplayingAtLeast(int areaPercentage) {
                return super.isDisplayingAtLeast(areaPercentage);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isEnabled() {
                return super.isEnabled();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isFocusable() {
                return super.isFocusable();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasFocus() {
                return super.hasFocus();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isSelected() {
                return super.isSelected();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasSibling(org.hamcrest.Matcher<View> siblingMatcher) {
                return super.hasSibling(siblingMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasSibling(cortado.Matcher siblingMatcher) {
                return super.hasSibling(siblingMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withContentDescription(@StringRes int resourceId) {
                return super.withContentDescription(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withContentDescription(String text) {
                return super.withContentDescription(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher) {
                return super.withContentDescription(charSequenceMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withId(@IdRes int id) {
                return super.withId(id);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withId(org.hamcrest.Matcher<Integer> integerMatcher) {
                return super.withId(integerMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withResourceName(String name) {
                return super.withResourceName(name);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withResourceName(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withResourceName(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withTagKey(int key) {
                return super.withTagKey(key);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher) {
                return super.withTagKey(key, objectMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher) {
                return super.withTagValue(tagValueMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withText(String text) {
                return super.withText(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withText(@StringRes int resourceId) {
                return super.withText(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withHint(String hintText) {
                return super.withHint(hintText);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withHint(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withHint(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withHint(@StringRes int resourceId) {
                return super.withHint(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isChecked() {
                return super.isChecked();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isNotChecked() {
                return super.isNotChecked();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasContentDescription() {
                return super.hasContentDescription();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasDescendant(org.hamcrest.Matcher<View> descendantMatcher) {
                return super.hasDescendant(descendantMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasDescendant(cortado.Matcher descendantMatcher) {
                return super.hasDescendant(descendantMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isClickable() {
                return super.isClickable();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher) {
                return super.isDescendantOfA(ancestorMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isDescendantOfA(cortado.Matcher ancestorMatcher) {
                return super.isDescendantOfA(ancestorMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withEffectiveVisibility(ViewMatchers.Visibility visibility) {
                return super.withEffectiveVisibility(visibility);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withParent(org.hamcrest.Matcher<View> parentMatcher) {
                return super.withParent(parentMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withParent(cortado.Matcher parentMatcher) {
                return super.withParent(parentMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withChild(org.hamcrest.Matcher<View> childMatcher) {
                return super.withChild(childMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withChild(cortado.Matcher childMatcher) {
                return super.withChild(childMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isRoot() {
                return super.isRoot();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher supportsInputMethods() {
                return super.supportsInputMethods();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasImeAction(int imeAction) {
                return super.hasImeAction(imeAction);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher) {
                return super.hasImeAction(imeActionMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasLinks() {
                return super.hasLinks();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withSpinnerText(@StringRes int resourceId) {
                return super.withSpinnerText(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withSpinnerText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withSpinnerText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withSpinnerText(String text) {
                return super.withSpinnerText(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher isJavascriptEnabled() {
                return super.isJavascriptEnabled();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasErrorText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.hasErrorText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher hasErrorText(String expectedError) {
                return super.hasErrorText(expectedError);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher withInputType(int inputType) {
                return super.withInputType(inputType);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher matching(org.hamcrest.Matcher<View> matcher) {
                return super.matching(matcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.Matcher matching(cortado.Matcher matcher) {
                return super.matching(matcher);
            }
        }

        public final class ViewInteraction extends NotCompletable<Cortado.Or.ViewInteraction>
                implements Not<Negated.Unfinished.Or.ViewInteraction> {

            ViewInteraction() {
                super(cortado);
            }

            @Override
            final Cortado.Or.ViewInteraction returned() {
                return cortado.new Or().new ViewInteraction();
            }

            @VisibleForTesting
            final Cortado getCortado() {
                return cortado;
            }

            @Override
            public final Negated.Unfinished.Or.ViewInteraction not() {
                return new Negated(cortado).new Unfinished().new Or().new ViewInteraction();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isAssignableFrom(Class<? extends View> clazz) {
                return super.isAssignableFrom(clazz);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withClassName(org.hamcrest.Matcher<String> classNameMatcher) {
                return super.withClassName(classNameMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isDisplayed() {
                return super.isDisplayed();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isCompletelyDisplayed() {
                return super.isCompletelyDisplayed();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isDisplayingAtLeast(int areaPercentage) {
                return super.isDisplayingAtLeast(areaPercentage);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isEnabled() {
                return super.isEnabled();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isFocusable() {
                return super.isFocusable();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasFocus() {
                return super.hasFocus();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isSelected() {
                return super.isSelected();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasSibling(org.hamcrest.Matcher<View> siblingMatcher) {
                return super.hasSibling(siblingMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasSibling(cortado.Matcher siblingMatcher) {
                return super.hasSibling(siblingMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withContentDescription(@StringRes int resourceId) {
                return super.withContentDescription(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withContentDescription(String text) {
                return super.withContentDescription(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher) {
                return super.withContentDescription(charSequenceMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withId(@IdRes int id) {
                return super.withId(id);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withId(org.hamcrest.Matcher<Integer> integerMatcher) {
                return super.withId(integerMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withResourceName(String name) {
                return super.withResourceName(name);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withResourceName(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withResourceName(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withTagKey(int key) {
                return super.withTagKey(key);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher) {
                return super.withTagKey(key, objectMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher) {
                return super.withTagValue(tagValueMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withText(String text) {
                return super.withText(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withText(@StringRes int resourceId) {
                return super.withText(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withHint(String hintText) {
                return super.withHint(hintText);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withHint(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withHint(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withHint(@StringRes int resourceId) {
                return super.withHint(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isChecked() {
                return super.isChecked();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isNotChecked() {
                return super.isNotChecked();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasContentDescription() {
                return super.hasContentDescription();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasDescendant(org.hamcrest.Matcher<View> descendantMatcher) {
                return super.hasDescendant(descendantMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasDescendant(cortado.Matcher descendantMatcher) {
                return super.hasDescendant(descendantMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isClickable() {
                return super.isClickable();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher) {
                return super.isDescendantOfA(ancestorMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isDescendantOfA(cortado.Matcher ancestorMatcher) {
                return super.isDescendantOfA(ancestorMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withEffectiveVisibility(ViewMatchers.Visibility visibility) {
                return super.withEffectiveVisibility(visibility);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withParent(org.hamcrest.Matcher<View> parentMatcher) {
                return super.withParent(parentMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withParent(cortado.Matcher parentMatcher) {
                return super.withParent(parentMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withChild(org.hamcrest.Matcher<View> childMatcher) {
                return super.withChild(childMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withChild(cortado.Matcher childMatcher) {
                return super.withChild(childMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isRoot() {
                return super.isRoot();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction supportsInputMethods() {
                return super.supportsInputMethods();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasImeAction(int imeAction) {
                return super.hasImeAction(imeAction);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher) {
                return super.hasImeAction(imeActionMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasLinks() {
                return super.hasLinks();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withSpinnerText(@StringRes int resourceId) {
                return super.withSpinnerText(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withSpinnerText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withSpinnerText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withSpinnerText(String text) {
                return super.withSpinnerText(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction isJavascriptEnabled() {
                return super.isJavascriptEnabled();
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasErrorText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.hasErrorText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction hasErrorText(String expectedError) {
                return super.hasErrorText(expectedError);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction withInputType(int inputType) {
                return super.withInputType(inputType);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction matching(org.hamcrest.Matcher<View> matcher) {
                return super.matching(matcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.Or.ViewInteraction matching(cortado.Matcher matcher) {
                return super.matching(matcher);
            }
        }
    }

    public final class And {

        And() {
        }

        public final class Matcher extends NotCompletable<Cortado.And.Matcher>
                implements Not<Negated.Unfinished.And.Matcher> {

            Matcher() {
                super(cortado);
            }

            @Override
            final Cortado.And.Matcher returned() {
                return cortado.new And().new Matcher();
            }

            @VisibleForTesting
            final Cortado getCortado() {
                return cortado;
            }

            @Override
            public final Negated.Unfinished.And.Matcher not() {
                return new Negated(cortado).new Unfinished().new And().new Matcher();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isAssignableFrom(Class<? extends View> clazz) {
                return super.isAssignableFrom(clazz);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withClassName(org.hamcrest.Matcher<String> classNameMatcher) {
                return super.withClassName(classNameMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isDisplayed() {
                return super.isDisplayed();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isCompletelyDisplayed() {
                return super.isCompletelyDisplayed();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isDisplayingAtLeast(int areaPercentage) {
                return super.isDisplayingAtLeast(areaPercentage);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isEnabled() {
                return super.isEnabled();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isFocusable() {
                return super.isFocusable();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasFocus() {
                return super.hasFocus();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isSelected() {
                return super.isSelected();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasSibling(org.hamcrest.Matcher<View> siblingMatcher) {
                return super.hasSibling(siblingMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasSibling(cortado.Matcher siblingMatcher) {
                return super.hasSibling(siblingMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withContentDescription(@StringRes int resourceId) {
                return super.withContentDescription(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withContentDescription(String text) {
                return super.withContentDescription(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher) {
                return super.withContentDescription(charSequenceMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withId(@IdRes int id) {
                return super.withId(id);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withId(org.hamcrest.Matcher<Integer> integerMatcher) {
                return super.withId(integerMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withResourceName(String name) {
                return super.withResourceName(name);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withResourceName(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withResourceName(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withTagKey(int key) {
                return super.withTagKey(key);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher) {
                return super.withTagKey(key, objectMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher) {
                return super.withTagValue(tagValueMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withText(String text) {
                return super.withText(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withText(@StringRes int resourceId) {
                return super.withText(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withHint(String hintText) {
                return super.withHint(hintText);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withHint(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withHint(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withHint(@StringRes int resourceId) {
                return super.withHint(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isChecked() {
                return super.isChecked();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isNotChecked() {
                return super.isNotChecked();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasContentDescription() {
                return super.hasContentDescription();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasDescendant(org.hamcrest.Matcher<View> descendantMatcher) {
                return super.hasDescendant(descendantMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasDescendant(cortado.Matcher descendantMatcher) {
                return super.hasDescendant(descendantMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isClickable() {
                return super.isClickable();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher) {
                return super.isDescendantOfA(ancestorMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isDescendantOfA(cortado.Matcher ancestorMatcher) {
                return super.isDescendantOfA(ancestorMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withEffectiveVisibility(ViewMatchers.Visibility visibility) {
                return super.withEffectiveVisibility(visibility);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withParent(org.hamcrest.Matcher<View> parentMatcher) {
                return super.withParent(parentMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withParent(cortado.Matcher parentMatcher) {
                return super.withParent(parentMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withChild(org.hamcrest.Matcher<View> childMatcher) {
                return super.withChild(childMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withChild(cortado.Matcher childMatcher) {
                return super.withChild(childMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isRoot() {
                return super.isRoot();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher supportsInputMethods() {
                return super.supportsInputMethods();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasImeAction(int imeAction) {
                return super.hasImeAction(imeAction);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher) {
                return super.hasImeAction(imeActionMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasLinks() {
                return super.hasLinks();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withSpinnerText(@StringRes int resourceId) {
                return super.withSpinnerText(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withSpinnerText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withSpinnerText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withSpinnerText(String text) {
                return super.withSpinnerText(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher isJavascriptEnabled() {
                return super.isJavascriptEnabled();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasErrorText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.hasErrorText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher hasErrorText(String expectedError) {
                return super.hasErrorText(expectedError);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher withInputType(int inputType) {
                return super.withInputType(inputType);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher matching(org.hamcrest.Matcher<View> matcher) {
                return super.matching(matcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.Matcher matching(cortado.Matcher matcher) {
                return super.matching(matcher);
            }
        }

        public final class ViewInteraction extends NotCompletable<Cortado.And.ViewInteraction>
                implements Not<Negated.Unfinished.And.ViewInteraction> {

            ViewInteraction() {
                super(cortado);
            }

            @Override
            final Cortado.And.ViewInteraction returned() {
                return cortado.new And().new ViewInteraction();
            }

            @VisibleForTesting
            final Cortado getCortado() {
                return cortado;
            }

            @Override
            public final Negated.Unfinished.And.ViewInteraction not() {
                return new Negated(cortado).new Unfinished().new And().new ViewInteraction();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isAssignableFrom(Class<? extends View> clazz) {
                return super.isAssignableFrom(clazz);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withClassName(org.hamcrest.Matcher<String> classNameMatcher) {
                return super.withClassName(classNameMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isDisplayed() {
                return super.isDisplayed();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isCompletelyDisplayed() {
                return super.isCompletelyDisplayed();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isDisplayingAtLeast(int areaPercentage) {
                return super.isDisplayingAtLeast(areaPercentage);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isEnabled() {
                return super.isEnabled();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isFocusable() {
                return super.isFocusable();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasFocus() {
                return super.hasFocus();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isSelected() {
                return super.isSelected();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasSibling(org.hamcrest.Matcher<View> siblingMatcher) {
                return super.hasSibling(siblingMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasSibling(cortado.Matcher siblingMatcher) {
                return super.hasSibling(siblingMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withContentDescription(@StringRes int resourceId) {
                return super.withContentDescription(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withContentDescription(String text) {
                return super.withContentDescription(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher) {
                return super.withContentDescription(charSequenceMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withId(@IdRes int id) {
                return super.withId(id);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withId(org.hamcrest.Matcher<Integer> integerMatcher) {
                return super.withId(integerMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withResourceName(String name) {
                return super.withResourceName(name);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withResourceName(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withResourceName(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withTagKey(int key) {
                return super.withTagKey(key);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher) {
                return super.withTagKey(key, objectMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher) {
                return super.withTagValue(tagValueMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withText(String text) {
                return super.withText(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withText(@StringRes int resourceId) {
                return super.withText(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withHint(String hintText) {
                return super.withHint(hintText);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withHint(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withHint(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withHint(@StringRes int resourceId) {
                return super.withHint(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isChecked() {
                return super.isChecked();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isNotChecked() {
                return super.isNotChecked();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasContentDescription() {
                return super.hasContentDescription();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasDescendant(org.hamcrest.Matcher<View> descendantMatcher) {
                return super.hasDescendant(descendantMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasDescendant(cortado.Matcher descendantMatcher) {
                return super.hasDescendant(descendantMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isClickable() {
                return super.isClickable();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher) {
                return super.isDescendantOfA(ancestorMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isDescendantOfA(cortado.Matcher ancestorMatcher) {
                return super.isDescendantOfA(ancestorMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withEffectiveVisibility(ViewMatchers.Visibility visibility) {
                return super.withEffectiveVisibility(visibility);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withParent(org.hamcrest.Matcher<View> parentMatcher) {
                return super.withParent(parentMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withParent(cortado.Matcher parentMatcher) {
                return super.withParent(parentMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withChild(org.hamcrest.Matcher<View> childMatcher) {
                return super.withChild(childMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withChild(cortado.Matcher childMatcher) {
                return super.withChild(childMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isRoot() {
                return super.isRoot();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction supportsInputMethods() {
                return super.supportsInputMethods();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasImeAction(int imeAction) {
                return super.hasImeAction(imeAction);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher) {
                return super.hasImeAction(imeActionMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasLinks() {
                return super.hasLinks();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withSpinnerText(@StringRes int resourceId) {
                return super.withSpinnerText(resourceId);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withSpinnerText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.withSpinnerText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withSpinnerText(String text) {
                return super.withSpinnerText(text);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction isJavascriptEnabled() {
                return super.isJavascriptEnabled();
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasErrorText(org.hamcrest.Matcher<String> stringMatcher) {
                return super.hasErrorText(stringMatcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction hasErrorText(String expectedError) {
                return super.hasErrorText(expectedError);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction withInputType(int inputType) {
                return super.withInputType(inputType);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction matching(org.hamcrest.Matcher<View> matcher) {
                return super.matching(matcher);
            }

            @IdeSuggestion
            @Override
            public final Cortado.And.ViewInteraction matching(cortado.Matcher matcher) {
                return super.matching(matcher);
            }
        }
    }
}
