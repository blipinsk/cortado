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
import org.hamcrest.Matchers;

import java.util.List;

abstract class Linker {

    static final Linker REGULAR = new Linker() {
        @Override
        Matcher<? super View> link(List<Matcher<? super View>> matchers) {
            if (matchers.size() != 1) {
                throw new IllegalArgumentException("List of matchers must be exactly of size one.");
            }
            return matchers.get(0);
        }
    };
    static final Linker AND = new Linker() {
        @Override
        Matcher<? super View> link(List<Matcher<? super View>> matchers) {
            return Matchers.allOf(matchers);
        }
    };
    static final Linker OR = new Linker() {
        @Override
        Matcher<? super View> link(List<Matcher<? super View>> matchers) {
            return Matchers.anyOf(matchers);
        }
    };

    abstract Matcher<? super View> link(List<org.hamcrest.Matcher<? super View>> matchers);

}
