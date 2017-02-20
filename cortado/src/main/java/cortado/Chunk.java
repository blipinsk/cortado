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

import android.view.View;

import org.hamcrest.Matcher;

import java.util.List;

abstract class Chunk<T> {

    abstract void store(T chunkValue);

    protected abstract Matcher<View> matcher(T chunkValue);

    protected abstract boolean isPresent();

    protected abstract void apply(List<Matcher<? super View>> matchers);

    void applyIfNeeded(List<Matcher<? super View>> matchers) {
        if (isPresent()) {
            apply(matchers);
        }
    }
}
