package cortado.internal;

import org.hamcrest.Description;
import org.hamcrest.SelfDescribing;

/**
 * Created by Bartosz Lipinski
 * 19.02.2017
 */

public class RecordingDescription implements Description {

    public StringBuilder sb = new StringBuilder();

    @Override
    public String toString() {
        return sb.toString();
    }

    private void append(String text) {
        sb.append(text);
        sb.append(" ");
    }

    @Override
    public Description appendText(String text) {
        append(text);
        return this;
    }

    @Override
    public Description appendDescriptionOf(SelfDescribing value) {
        value.describeTo(this);
        return this;
    }

    @Override
    public Description appendValue(Object value) {
        append(value.toString());
        return this;
    }

    @Override
    public <T> Description appendValueList(String start, String separator, String end, T... values) {
        append(start);
        for (int i = 0; i < values.length; i++) {
            if (i != 0) {
                append(separator);
            }
            append(values[i].toString());
        }
        append(end);
        return this;
    }

    @Override
    public <T> Description appendValueList(String start, String separator, String end, Iterable<T> values) {
        append(start);
        boolean first = true;
        for (T value : values) {
            if (!first) {
                append(separator);
            } else {
                first = false;
            }
            append(value.toString());
        }
        append(end);
        return this;
    }

    @Override
    public Description appendList(String start, String separator, String end, Iterable<? extends SelfDescribing> values) {
        append(start);
        boolean first = true;
        for (SelfDescribing selfDescribing : values) {
            if (!first) {
                append(separator);
            } else {
                first = false;
            }
            selfDescribing.describeTo(this);
        }
        append(end);
        return this;
    }
}
