package cortado.internal;

import android.view.View;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

/**
 * Created by Bartosz Lipinski
 * 18.02.2017
 */
public class SimpleWrappingViewMatcher<T> extends BaseMatcher<View> {
    public T wrapped;

    public SimpleWrappingViewMatcher(T wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public boolean matches(Object item) {
        return item.equals(wrapped);
    }

    @Override
    public void describeTo(Description description) {
        // doesnt matter
    }
}