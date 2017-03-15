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
package internal;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderedJUnit4TestRunner extends BlockJUnit4ClassRunner {
    public OrderedJUnit4TestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    protected List<FrameworkMethod> computeTestMethods() {
        final List<FrameworkMethod> unordered = super.computeTestMethods();
        List<FrameworkMethod> otherMethods = new ArrayList<>(unordered);
        List<FrameworkMethod> orderedMethods = new ArrayList<>();
        // extracting methods annotated ofRes Order
        for (int i = 0; i < otherMethods.size(); i++) {
            FrameworkMethod frameworkMethod = otherMethods.get(i);
            Order order = frameworkMethod.getAnnotation(Order.class);
            if (order != null) {
                orderedMethods.add(frameworkMethod);
                otherMethods.remove(i--);
            }
        }
        // sorting ordered methods
        Collections.sort(orderedMethods, new Comparator<FrameworkMethod>() {
            @Override
            public int compare(FrameworkMethod f1, FrameworkMethod f2) {
                return f1.getAnnotation(Order.class).value() -
                        f2.getAnnotation(Order.class).value();
            }
        });
        // appending other methods to ordered methods
        orderedMethods.addAll(otherMethods);
        return Collections.unmodifiableList(orderedMethods);
    }
}
