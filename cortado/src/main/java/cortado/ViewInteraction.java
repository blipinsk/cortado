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

import android.net.Uri;
import android.support.annotation.VisibleForTesting;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.action.EspressoKey;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.view.View;

import javax.annotation.Nonnull;

public class ViewInteraction implements Interactable {

    private final Cortado cortado;

    ViewInteraction(Cortado cortado) {
        this.cortado = cortado;
    }

    @VisibleForTesting
    Cortado getCortado() {
        return cortado;
    }

    @Override
    public android.support.test.espresso.ViewInteraction perform(ViewAction... viewActions) {
        return cortado.perform(viewActions);
    }

    @Override
    public android.support.test.espresso.ViewInteraction check(ViewAssertion viewAssert) {
        return cortado.check(viewAssert);
    }

    @Override
    public Check check() {
        return new Check() {
            @Override
            public android.support.test.espresso.ViewInteraction matches(cortado.Matcher matcher) {
                return matches((org.hamcrest.Matcher<View>) matcher);
            }

            @Override
            public android.support.test.espresso.ViewInteraction matches(org.hamcrest.Matcher<View> matcher) {
                return check(ViewAssertions.matches(matcher));
            }

            @Override
            public android.support.test.espresso.ViewInteraction doesNotExist() {
                return check(ViewAssertions.doesNotExist());
            }

            @Override
            public android.support.test.espresso.ViewInteraction selectedDescendantsMatch(Matcher selector, Matcher matcher) {
                return selectedDescendantsMatch((org.hamcrest.Matcher<View>) selector, (org.hamcrest.Matcher<View>) matcher);
            }

            @Override
            public android.support.test.espresso.ViewInteraction selectedDescendantsMatch(org.hamcrest.Matcher<View> selector, org.hamcrest.Matcher<View> matcher) {
                return check(ViewAssertions.selectedDescendantsMatch(selector, matcher));
            }
        };
    }

    @Override
    public Perform perform() {
        return new Perform() {
            @Override
            public android.support.test.espresso.ViewInteraction action(ViewAction viewAction) {
                return perform(viewAction);
            }

            @Override
            public android.support.test.espresso.ViewInteraction actionWithAssertions(ViewAction viewAction) {
                return action(ViewActions.actionWithAssertions(viewAction));
            }

            @Override
            public android.support.test.espresso.ViewInteraction clearText() {
                return action(ViewActions.clearText());
            }

            @Override
            public android.support.test.espresso.ViewInteraction click() {
                return action(ViewActions.click());
            }

            @Override
            public android.support.test.espresso.ViewInteraction click(ViewAction rollbackAction) {
                return action(ViewActions.click(rollbackAction));
            }

            @Override
            public android.support.test.espresso.ViewInteraction swipeLeft() {
                return action(ViewActions.swipeLeft());
            }

            @Override
            public android.support.test.espresso.ViewInteraction swipeRight() {
                return action(ViewActions.swipeRight());
            }

            @Override
            public android.support.test.espresso.ViewInteraction swipeDown() {
                return action(ViewActions.swipeDown());
            }

            @Override
            public android.support.test.espresso.ViewInteraction swipeUp() {
                return action(ViewActions.swipeUp());
            }

            @Override
            public android.support.test.espresso.ViewInteraction closeSoftKeyboard() {
                return action(ViewActions.closeSoftKeyboard());
            }

            @Override
            public android.support.test.espresso.ViewInteraction pressImeActionButton() {
                return action(ViewActions.pressImeActionButton());
            }

            @Override
            public android.support.test.espresso.ViewInteraction pressBack() {
                return action(ViewActions.pressBack());
            }

            @Override
            public android.support.test.espresso.ViewInteraction pressMenuKey() {
                return action(ViewActions.pressMenuKey());
            }

            @Override
            public android.support.test.espresso.ViewInteraction pressKey(int keyCode) {
                return action(ViewActions.pressKey(keyCode));
            }

            @Override
            public android.support.test.espresso.ViewInteraction pressKey(EspressoKey key) {
                return action(ViewActions.pressKey(key));
            }

            @Override
            public android.support.test.espresso.ViewInteraction doubleClick() {
                return action(ViewActions.doubleClick());
            }

            @Override
            public android.support.test.espresso.ViewInteraction longClick() {
                return action(ViewActions.longClick());
            }

            @Override
            public android.support.test.espresso.ViewInteraction scrollTo() {
                return action(ViewActions.scrollTo());
            }

            @Override
            public android.support.test.espresso.ViewInteraction typeTextIntoFocusedView(String stringToBeTyped) {
                return action(ViewActions.typeTextIntoFocusedView(stringToBeTyped));
            }

            @Override
            public android.support.test.espresso.ViewInteraction typeText(String stringToBeTyped) {
                return action(ViewActions.typeText(stringToBeTyped));
            }

            @Override
            public android.support.test.espresso.ViewInteraction replaceText(@Nonnull String stringToBeSet) {
                return action(ViewActions.replaceText(stringToBeSet));
            }

            @Override
            public android.support.test.espresso.ViewInteraction openLinkWithText(String linkText) {
                return action(ViewActions.openLinkWithText(linkText));
            }

            @Override
            public android.support.test.espresso.ViewInteraction openLinkWithText(org.hamcrest.Matcher<String> linkTextMatcher) {
                return action(ViewActions.openLinkWithText(linkTextMatcher));
            }

            @Override
            public android.support.test.espresso.ViewInteraction openLinkWithUri(String uri) {
                return action(ViewActions.openLinkWithUri(uri));
            }

            @Override
            public android.support.test.espresso.ViewInteraction openLinkWithUri(org.hamcrest.Matcher<Uri> uriMatcher) {
                return action(ViewActions.openLinkWithUri(uriMatcher));
            }

            @Override
            public android.support.test.espresso.ViewInteraction openLink(org.hamcrest.Matcher<String> linkTextMatcher, org.hamcrest.Matcher<Uri> uriMatcher) {
                return action(ViewActions.openLink(linkTextMatcher, uriMatcher));
            }
        };
    }
}