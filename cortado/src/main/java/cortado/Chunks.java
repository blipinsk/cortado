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

import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;

import org.hamcrest.Matcher;


final class Chunks {

    // Suppress default constructor for noninstantiability
    private Chunks() {
        throw new AssertionError();
    }

    static final class AssignableFrom extends CombinedChunk<Class<? extends View>> {
        @Override
        public Matcher<View> matcher(Class<? extends View> chunkValue) {
            return ViewMatchers.isAssignableFrom(chunkValue);
        }
    }

    static final class ClassName extends CombinedChunk<Matcher<String>> {

        @Override
        public Matcher<View> matcher(Matcher<String> chunkValue) {
            return ViewMatchers.withClassName(chunkValue);
        }
    }

    static final class IsDisplayed extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.isDisplayed();
        }
    }

    static final class IsCompletelyDisplayed extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.isCompletelyDisplayed();
        }
    }

    static final class IsDisplayingAtLeast extends CombinedChunk<Integer> {
        @Override
        public Matcher<View> matcher(Integer chunkValue) {
            return ViewMatchers.isDisplayingAtLeast(chunkValue);
        }
    }

    static final class IsEnabled extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.isEnabled();
        }
    }

    static final class IsFocusable extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.isFocusable();
        }
    }

    static final class HasFocus extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.hasFocus();
        }
    }

    static final class IsSelected extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.isSelected();
        }
    }

    static final class HasSibling extends CombinedChunk<Matcher<View>> {
        @Override
        public Matcher<View> matcher(Matcher<View> chunkValue) {
            return ViewMatchers.hasSibling(chunkValue);
        }
    }

    static final class WithContentDescription_Resource extends CombinedChunk<Integer> {
        @Override
        public Matcher<View> matcher(Integer chunkValue) {
            return ViewMatchers.withContentDescription(chunkValue);
        }
    }

    static final class WithContentDescription_String extends CombinedChunk<String> {
        @Override
        public Matcher<View> matcher(String chunkValue) {
            return ViewMatchers.withContentDescription(chunkValue);
        }
    }

    static final class WithContentDescription_Matcher extends CombinedChunk<Matcher<? extends CharSequence>> {
        @Override
        public Matcher<View> matcher(Matcher<? extends CharSequence> chunkValue) {
            return ViewMatchers.withContentDescription(chunkValue);
        }
    }

    static final class WithId_Resource extends CombinedChunk<Integer> {
        @Override
        public Matcher<View> matcher(Integer chunkValue) {
            return ViewMatchers.withId(chunkValue);
        }
    }

    static final class WithId_Matcher extends CombinedChunk<Matcher<Integer>> {
        @Override
        public Matcher<View> matcher(Matcher<Integer> chunkValue) {
            return ViewMatchers.withId(chunkValue);
        }
    }

    static final class WithResourceName_String extends CombinedChunk<String> {
        @Override
        public Matcher<View> matcher(String chunkValue) {
            return ViewMatchers.withResourceName(chunkValue);
        }
    }

    static final class WithResourceName_Matcher extends CombinedChunk<Matcher<String>> {
        @Override
        public Matcher<View> matcher(Matcher<String> chunkValue) {
            return ViewMatchers.withResourceName(chunkValue);
        }
    }

    static final class WithTagKey extends CombinedChunk<Integer> {
        @Override
        public Matcher<View> matcher(Integer chunkValue) {
            return ViewMatchers.withTagKey(chunkValue);
        }
    }

    static final class WithTagKey_Matcher extends CombinedChunk<TagKeyArgs> {

        @Override
        public Matcher<View> matcher(TagKeyArgs chunkValue) {
            return ViewMatchers.withTagKey(chunkValue.key, chunkValue.matcher);
        }
    }

    static final class WithTagValue extends CombinedChunk<Matcher<Object>> {
        @Override
        public Matcher<View> matcher(Matcher<Object> chunkValue) {
            return ViewMatchers.withTagValue(chunkValue);
        }
    }

    static final class WithText_String extends CombinedChunk<String> {
        @Override
        public Matcher<View> matcher(String chunkValue) {
            return ViewMatchers.withText(chunkValue);
        }
    }

    static final class WithText_Matcher extends CombinedChunk<Matcher<String>> {
        @Override
        public Matcher<View> matcher(Matcher<String> chunkValue) {
            return ViewMatchers.withText(chunkValue);
        }
    }

    static final class WithText_Resource extends CombinedChunk<Integer> {
        @Override
        public Matcher<View> matcher(Integer chunkValue) {
            return ViewMatchers.withText(chunkValue);
        }
    }

    static final class WithHint_String extends CombinedChunk<String> {
        @Override
        public Matcher<View> matcher(String chunkValue) {
            return ViewMatchers.withHint(chunkValue);
        }
    }

    static final class WithHint_Matcher extends CombinedChunk<Matcher<String>> {
        @Override
        public Matcher<View> matcher(Matcher<String> chunkValue) {
            return ViewMatchers.withHint(chunkValue);
        }
    }

    static final class WithHint_Resource extends CombinedChunk<Integer> {
        @Override
        public Matcher<View> matcher(Integer chunkValue) {
            return ViewMatchers.withHint(chunkValue);
        }
    }

    static final class IsChecked extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.isChecked();
        }
    }

    static final class IsNotChecked extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.isNotChecked();
        }
    }

    static final class HasContentDescription extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.hasContentDescription();
        }
    }

    static final class HasDescendant extends CombinedChunk<Matcher<View>> {
        @Override
        public Matcher<View> matcher(Matcher<View> chunkValue) {
            return ViewMatchers.hasDescendant(chunkValue);
        }
    }

    static final class IsClickable extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.isClickable();
        }
    }

    static final class IsDescendantOfA extends CombinedChunk<Matcher<View>> {
        @Override
        public Matcher<View> matcher(Matcher<View> chunkValue) {
            return ViewMatchers.isDescendantOfA(chunkValue);
        }
    }

    static final class WithEffectiveVisibility extends CombinedChunk<ViewMatchers.Visibility> {
        @Override
        public Matcher<View> matcher(ViewMatchers.Visibility chunkValue) {
            return ViewMatchers.withEffectiveVisibility(chunkValue);
        }
    }

    static final class WithParent extends CombinedChunk<Matcher<View>> {
        @Override
        public Matcher<View> matcher(Matcher<View> chunkValue) {
            return ViewMatchers.withParent(chunkValue);
        }
    }

    static final class WithChild extends CombinedChunk<Matcher<View>> {
        @Override
        public Matcher<View> matcher(Matcher<View> chunkValue) {
            return ViewMatchers.withChild(chunkValue);
        }
    }

    static final class IsRoot extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.isRoot();
        }
    }

    static final class SupportsInputMethods extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.supportsInputMethods();
        }
    }

    static final class HasImeAction_Integer extends CombinedChunk<Integer> {
        @Override
        public Matcher<View> matcher(Integer chunkValue) {
            return ViewMatchers.hasImeAction(chunkValue);
        }
    }

    static final class HasImeAction_Matcher extends CombinedChunk<Matcher<Integer>> {
        @Override
        public Matcher<View> matcher(Matcher<Integer> chunkValue) {
            return ViewMatchers.hasImeAction(chunkValue);
        }
    }

    static final class HasLinks extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.hasLinks();
        }
    }

    static final class WithSpinnerText_Resource extends CombinedChunk<Integer> {
        @Override
        public Matcher<View> matcher(Integer chunkValue) {
            return ViewMatchers.withSpinnerText(chunkValue);
        }
    }

    static final class WithSpinnerText_Matcher extends CombinedChunk<Matcher<String>> {
        @Override
        public Matcher<View> matcher(Matcher<String> chunkValue) {
            return ViewMatchers.withSpinnerText(chunkValue);
        }
    }

    static final class WithSpinnerText_String extends CombinedChunk<String> {
        @Override
        public Matcher<View> matcher(String chunkValue) {
            return ViewMatchers.withSpinnerText(chunkValue);
        }
    }

    static final class IsJavascriptEnabled extends ElementaryChunk<Boolean> {
        @Override
        public Matcher<View> matcher(Boolean chunkValue) {
            return ViewMatchers.isJavascriptEnabled();
        }
    }

    static final class HasErrorText_Matcher extends CombinedChunk<Matcher<String>> {
        @Override
        public Matcher<View> matcher(Matcher<String> chunkValue) {
            return ViewMatchers.hasErrorText(chunkValue);
        }
    }

    static final class HasErrorText_String extends CombinedChunk<String> {
        @Override
        public Matcher<View> matcher(String chunkValue) {
            return ViewMatchers.hasErrorText(chunkValue);
        }
    }

    static final class WithInputType extends CombinedChunk<Integer> {
        @Override
        public Matcher<View> matcher(Integer chunkValue) {
            return ViewMatchers.withInputType(chunkValue);
        }
    }

    static final class Matching extends CombinedChunk<Matcher<View>> {
        @Override
        public Matcher<View> matcher(Matcher<View> chunkValue) {
            return chunkValue;
        }
    }

    static final class TagKeyArgs {
        public int key;
        public org.hamcrest.Matcher<Object> matcher;

        public TagKeyArgs(int key, Matcher<Object> matcher) {
            this.key = key;
            this.matcher = matcher;
        }
    }
}
