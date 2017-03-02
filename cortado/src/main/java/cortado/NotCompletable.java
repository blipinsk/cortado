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
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;

public abstract class NotCompletable<T> implements Matching<T> {

    private final Cortado cortado;

    NotCompletable(Cortado cortado) {
        this.cortado = cortado;
    }

    abstract T returned();

    @Override
    public final T isAssignableFrom(Class<? extends View> clazz) {
        cortado.isAssignableFrom(clazz);
        return returned();
    }

    @Override
    public final T withClassName(org.hamcrest.Matcher<String> classNameMatcher) {
        cortado.withClassName(classNameMatcher);
        return returned();
    }

    @Override
    public final T isDisplayed() {
        cortado.isDisplayed();
        return returned();
    }

    @Override
    public final T isCompletelyDisplayed() {
        cortado.isCompletelyDisplayed();
        return returned();
    }

    @Override
    public final T isDisplayingAtLeast(int areaPercentage) {
        cortado.isDisplayingAtLeast(areaPercentage);
        return returned();
    }

    @Override
    public final T isEnabled() {
        cortado.isEnabled();
        return returned();
    }

    @Override
    public final T isFocusable() {
        cortado.isFocusable();
        return returned();
    }

    @Override
    public final T hasFocus() {
        cortado.hasFocus();
        return returned();
    }

    @Override
    public final T isSelected() {
        cortado.isSelected();
        return returned();
    }

    @Override
    public final T hasSibling(org.hamcrest.Matcher<View> siblingMatcher) {
        cortado.hasSibling(siblingMatcher);
        return returned();
    }

    @Override
    public final T hasSibling(Matcher siblingMatcher) {
        cortado.hasSibling(siblingMatcher);
        return returned();
    }

    @Override
    public final T withContentDescription(@StringRes int resourceId) {
        cortado.withContentDescription(resourceId);
        return returned();
    }

    @Override
    public final T withContentDescription(String text) {
        cortado.withContentDescription(text);
        return returned();
    }

    @Override
    public final T withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher) {
        cortado.withContentDescription(charSequenceMatcher);
        return returned();
    }

    @Override
    public final T withId(@IdRes int id) {
        cortado.withId(id);
        return returned();
    }

    @Override
    public final T withId(org.hamcrest.Matcher<Integer> integerMatcher) {
        cortado.withId(integerMatcher);
        return returned();
    }

    @Override
    public final T withResourceName(String name) {
        cortado.withResourceName(name);
        return returned();
    }

    @Override
    public final T withResourceName(org.hamcrest.Matcher<String> stringMatcher) {
        cortado.withResourceName(stringMatcher);
        return returned();
    }

    @Override
    public final T withTagKey(int key) {
        cortado.withTagKey(key);
        return returned();
    }

    @Override
    public final T withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher) {
        cortado.withTagKey(key, objectMatcher);
        return returned();
    }

    @Override
    public final T withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher) {
        cortado.withTagValue(tagValueMatcher);
        return returned();
    }

    @Override
    public final T withText(String text) {
        cortado.withText(text);
        return returned();
    }

    @Override
    public final T withText(org.hamcrest.Matcher<String> stringMatcher) {
        cortado.withText(stringMatcher);
        return returned();
    }

    @Override
    public final T withText(@StringRes int resourceId) {
        cortado.withText(resourceId);
        return returned();
    }

    @Override
    public final T withHint(String hintText) {
        cortado.withHint(hintText);
        return returned();
    }

    @Override
    public final T withHint(org.hamcrest.Matcher<String> stringMatcher) {
        cortado.withHint(stringMatcher);
        return returned();
    }

    @Override
    public final T withHint(@StringRes int resourceId) {
        cortado.withHint(resourceId);
        return returned();
    }

    @Override
    public final T isChecked() {
        cortado.isChecked();
        return returned();
    }

    @Override
    public final T isNotChecked() {
        cortado.isNotChecked();
        return returned();
    }

    @Override
    public final T hasContentDescription() {
        cortado.hasContentDescription();
        return returned();
    }

    @Override
    public final T hasDescendant(org.hamcrest.Matcher<View> descendantMatcher) {
        cortado.hasDescendant(descendantMatcher);
        return returned();
    }

    @Override
    public final T hasDescendant(Matcher descendantMatcher) {
        cortado.hasDescendant(descendantMatcher);
        return returned();
    }

    @Override
    public final T isClickable() {
        cortado.isClickable();
        return returned();
    }

    @Override
    public final T isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher) {
        cortado.isDescendantOfA(ancestorMatcher);
        return returned();
    }

    @Override
    public final T isDescendantOfA(Matcher ancestorMatcher) {
        cortado.isDescendantOfA(ancestorMatcher);
        return returned();
    }

    @Override
    public final T withEffectiveVisibility(ViewMatchers.Visibility visibility) {
        cortado.withEffectiveVisibility(visibility);
        return returned();
    }

    @Override
    public final T withParent(org.hamcrest.Matcher<View> parentMatcher) {
        cortado.withParent(parentMatcher);
        return returned();
    }

    @Override
    public final T withParent(Matcher parentMatcher) {
        cortado.withParent(parentMatcher);
        return returned();
    }

    @Override
    public final T withChild(org.hamcrest.Matcher<View> childMatcher) {
        cortado.withChild(childMatcher);
        return returned();
    }

    @Override
    public final T withChild(Matcher childMatcher) {
        cortado.withChild(childMatcher);
        return returned();
    }

    @Override
    public final T isRoot() {
        cortado.isRoot();
        return returned();
    }

    @Override
    public final T supportsInputMethods() {
        cortado.supportsInputMethods();
        return returned();
    }

    @Override
    public final T hasImeAction(int imeAction) {
        cortado.hasImeAction(imeAction);
        return returned();
    }

    @Override
    public final T hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher) {
        cortado.hasImeAction(imeActionMatcher);
        return returned();
    }

    @Override
    public final T hasLinks() {
        cortado.hasLinks();
        return returned();
    }

    @Override
    public final T withSpinnerText(@StringRes int resourceId) {
        cortado.withSpinnerText(resourceId);
        return returned();
    }

    @Override
    public final T withSpinnerText(org.hamcrest.Matcher<String> stringMatcher) {
        cortado.withSpinnerText(stringMatcher);
        return returned();
    }

    @Override
    public final T withSpinnerText(String text) {
        cortado.withSpinnerText(text);
        return returned();
    }

    @Override
    public final T isJavascriptEnabled() {
        cortado.isJavascriptEnabled();
        return returned();
    }

    @Override
    public final T hasErrorText(org.hamcrest.Matcher<String> stringMatcher) {
        cortado.hasErrorText(stringMatcher);
        return returned();
    }

    @Override
    public final T hasErrorText(String expectedError) {
        cortado.hasErrorText(expectedError);
        return returned();
    }

    @Override
    public final T withInputType(int inputType) {
        cortado.withInputType(inputType);
        return returned();
    }

    @Override
    public final T matching(org.hamcrest.Matcher<View> matcher) {
        cortado.matching(matcher);
        return returned();
    }

    @Override
    public final T matching(Matcher matcher) {
        cortado.matching(matcher);
        return returned();
    }
}