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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation marking a method that is introduced just so IDE can better suggest it.
 * It should mark the simplest overridden method possible, without any custom implementation of
 * the child class. Just a <code>super</code> method call.
 *
 * @IdeSuggestion
 * @Override
 * public final void testMethod(int a){
 *     super.testMethod(int a);
 * }
 *
 * Without that simple implementation, method would be lower on the suggestion list and the name
 * of it wouldn't be bold.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@interface IdeSuggestion {
}