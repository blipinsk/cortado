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

import android.support.annotation.VisibleForTesting;
import android.view.View;

import org.hamcrest.Description;

public class Matcher implements org.hamcrest.Matcher<View> {

    private final Cortado cortado;

    Matcher(Cortado cortado) {
        this.cortado = cortado;
    }

    @VisibleForTesting
    Cortado getCortado(){
        return cortado;
    }

    @Override
    public final boolean matches(Object item) {
        return cortado.get().matches(item);
    }

    @Override
    public final void describeMismatch(Object item, Description mismatchDescription) {
        cortado.get().describeMismatch(item, mismatchDescription);
    }

    @Override
    @Deprecated
    public final void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
        cortado.get()._dont_implement_Matcher___instead_extend_BaseMatcher_();
    }

    @Override
    public final void describeTo(Description description) {
        cortado.get().describeTo(description);
    }
}
