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

public interface Matching<T> {

    T isAssignableFrom(Class<? extends View> clazz);

    T withClassName(org.hamcrest.Matcher<String> classNameMatcher);

    T isDisplayed();

    T isCompletelyDisplayed();

    T isDisplayingAtLeast(int areaPercentage);

    T isEnabled();

    T isFocusable();

    T hasFocus();

    T isSelected();

    T hasSibling(org.hamcrest.Matcher<View> siblingMatcher);

    T hasSibling(Matcher siblingMatcher);

    T withContentDescription(@StringRes int resourceId);

    T withContentDescription(String text);

    T withContentDescription(org.hamcrest.Matcher<? extends CharSequence> charSequenceMatcher);

    T withId(@IdRes int id);

    T withId(org.hamcrest.Matcher<Integer> integerMatcher);

    T withResourceName(String name);

    T withResourceName(org.hamcrest.Matcher<String> stringMatcher);

    T withTagKey(int key);

    T withTagKey(int key, org.hamcrest.Matcher<Object> objectMatcher);

    T withTagValue(org.hamcrest.Matcher<Object> tagValueMatcher);

    T withText(String text);

    T withText(org.hamcrest.Matcher<String> stringMatcher);

    T withText(@StringRes int resourceId);

    T withHint(String hintText);

    T withHint(org.hamcrest.Matcher<String> stringMatcher);

    T withHint(@StringRes int resourceId);

    T isChecked();

    T isNotChecked();

    T hasContentDescription();

    T hasDescendant(org.hamcrest.Matcher<View> descendantMatcher);

    T hasDescendant(Matcher descendantMatcher);

    T isClickable();

    T isDescendantOfA(org.hamcrest.Matcher<View> ancestorMatcher);

    T isDescendantOfA(Matcher ancestorMatcher);

    T withEffectiveVisibility(ViewMatchers.Visibility visibility);

    T withParent(org.hamcrest.Matcher<View> parentMatcher);

    T withParent(Matcher parentMatcher);

    T withChild(org.hamcrest.Matcher<View> childMatcher);

    T withChild(Matcher childMatcher);

    T isRoot();

    T supportsInputMethods();

    T hasImeAction(int imeAction);

    T hasImeAction(org.hamcrest.Matcher<Integer> imeActionMatcher);

    T hasLinks();

    T withSpinnerText(@StringRes int resourceId);

    T withSpinnerText(org.hamcrest.Matcher<String> stringMatcher);

    T withSpinnerText(String text);

    T isJavascriptEnabled();

    T hasErrorText(org.hamcrest.Matcher<String> stringMatcher);

    T hasErrorText(String expectedError);

    T withInputType(int inputType);

    T matching(org.hamcrest.Matcher<View> matcher);

    T matching(Matcher matcher);
}
