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
package cortado.internal;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class SimpleMatcher<T> extends BaseMatcher<T> {

    private static final SimpleMatcher<?> INSTANCE = new SimpleMatcher<>();

    @SuppressWarnings("unchecked")
    public static <T> SimpleMatcher<T> instance(){
        return (SimpleMatcher<T>) INSTANCE;
    }

    private SimpleMatcher() {
    }

    @Override
    public final boolean matches(Object item) {
        return false; // doesn't matter
    }

    @Override
    public final void describeTo(Description description) {
        // doesn't matter
    }
}