package cortado;

import android.view.View;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import cortado.internal.Order;
import cortado.internal.OrderedJUnit4TestRunner;
import cortado.internal.SimpleWrappingViewMatcher;
import cortado.internal.TestValue;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Bartosz Lipinski
 * 18.02.2017
 */
@RunWith(OrderedJUnit4TestRunner.class)
public class CombinedChunk_Tests {

    private CombinedChunk<TestValue> chunk;

    @Before
    public void prepare() {
        chunk = new CombinedChunk<TestValue>() {
            @Override
            public Matcher<View> matcher(TestValue chunkValue) {
                return new SimpleWrappingViewMatcher<>(chunkValue);
            }
        };
    }

    @Test
    @Order(1)
    public void combinedChunk_afterStore_hasPresentValue() {
        assertThat(chunk.isPresent()).isFalse();
        chunk.store(TestValue.ONE);
        assertThat(chunk.isPresent()).isTrue();
        chunk.store(TestValue.TWO);
        assertThat(chunk.isPresent()).isTrue();
    }

    @Test
    @Order(2)
    public void combinedChunk_afterSingle_store_appliesProperMatcher() {
        chunk.store(TestValue.ONE);
        List<Matcher<? super View>> list = new ArrayList<>();
        chunk.apply(list);
        assertThat(list.size()).isEqualTo(1);
        assertThat(list.get(0).matches(TestValue.ONE)).isTrue();
        assertThat(list.get(0).matches(TestValue.TWO)).isFalse();
    }

    @Test
    @Order(3)
    public void combinedChunk_afterMultiple_store_appliesProperMatcher() {
        chunk.store(TestValue.ONE);
        chunk.store(TestValue.TWO);
        List<Matcher<? super View>> list = new ArrayList<>();
        chunk.apply(list);
        assertThat(list.size()).isEqualTo(2);

        assertThat(list.get(0).matches(TestValue.ONE)).isTrue();
        assertThat(list.get(0).matches(TestValue.TWO)).isFalse();

        assertThat(list.get(1).matches(TestValue.TWO)).isTrue();
        assertThat(list.get(1).matches(TestValue.ONE)).isFalse();
    }
}
