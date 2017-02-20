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
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.EspressoKey;
import android.view.View;

import javax.annotation.Nonnull;

public interface Interactable {
    ViewInteraction perform(final ViewAction... viewActions);

    ViewInteraction check(final ViewAssertion viewAssert);

    Check check();

    Perform perform();

    interface Check {
        ViewInteraction matches(Matcher matcher);

        ViewInteraction matches(org.hamcrest.Matcher<View> matcher);

        ViewInteraction doesNotExist();

        ViewInteraction selectedDescendantsMatch(Matcher selector, Matcher matcher);

        ViewInteraction selectedDescendantsMatch(org.hamcrest.Matcher<View> selector, org.hamcrest.Matcher<View> matcher);
    }

    interface Perform {
        ViewInteraction action(ViewAction viewActions);

        ViewInteraction actionWithAssertions(final ViewAction viewAction);

        ViewInteraction clearText();

        ViewInteraction click();

        ViewInteraction click(ViewAction rollbackAction);

        ViewInteraction swipeLeft();

        ViewInteraction swipeRight();

        ViewInteraction swipeDown();

        ViewInteraction swipeUp();

        ViewInteraction closeSoftKeyboard();

        ViewInteraction pressImeActionButton();

        ViewInteraction pressBack();

        ViewInteraction pressMenuKey();

        ViewInteraction pressKey(int keyCode);

        ViewInteraction pressKey(EspressoKey key);

        ViewInteraction doubleClick();

        ViewInteraction longClick();

        ViewInteraction scrollTo();

        ViewInteraction typeTextIntoFocusedView(String stringToBeTyped);

        ViewInteraction typeText(String stringToBeTyped);

        ViewInteraction replaceText(@Nonnull String stringToBeSet);

        ViewInteraction openLinkWithText(String linkText);

        ViewInteraction openLinkWithText(org.hamcrest.Matcher<String> linkTextMatcher);

        ViewInteraction openLinkWithUri(String uri);

        ViewInteraction openLinkWithUri(org.hamcrest.Matcher<Uri> uriMatcher);

        ViewInteraction openLink(org.hamcrest.Matcher<String> linkTextMatcher, org.hamcrest.Matcher<Uri> uriMatcher);
    }
}