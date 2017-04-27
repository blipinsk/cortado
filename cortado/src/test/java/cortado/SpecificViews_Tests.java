package cortado;


import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.common.truth.Truth;

import org.junit.Test;
import org.junit.runner.RunWith;

import internal.OrderedJUnit4TestRunner;

import static internal.ClassNameAssertion.assertThat;


@RunWith(OrderedJUnit4TestRunner.class)
public class SpecificViews_Tests {

    //Matcher
    @Test
    public void textView_returns_sameClass_as_view() {
        //given
        Object view = Cortado.view();

        //when
        Object textView = Cortado.textView();

        //then
        assertThat(textView).isOfTheSameClassAs(view);
    }

    @Test
    public void editText_returns_sameClass_as_view() {
        //given
        Object view = Cortado.view();

        //when
        Object editText = Cortado.editText();

        //then
        assertThat(editText).isOfTheSameClassAs(view);
    }

    @Test
    public void button_returns_sameClass_as_view() {
        //given
        Object view = Cortado.view();

        //when
        Object button = Cortado.button();

        //then
        assertThat(button).isOfTheSameClassAs(view);
    }

    @Test
    public void imageView_returns_sameClass_as_view() {
        //given
        Object view = Cortado.view();

        //when
        Object imageView = Cortado.imageView();

        //then
        assertThat(imageView).isOfTheSameClassAs(view);
    }

    @Test
    public void imageButton_returns_sameClass_as_view() {
        //given
        Object view = Cortado.view();

        //when
        Object imageButton = Cortado.imageButton();

        //then
        assertThat(imageButton).isOfTheSameClassAs(view);
    }

    @Test
    public void view_doesNotSet_assignableFromClass_field() {
        //given

        //when
        cortado.Start.Matcher view = Cortado.view();

        //then
        Truth.assertThat(view.getCortado().assignableFromClass).isNull();
    }

    @Test
    public void textView_assignableFromClass_properly() {
        //given

        //when
        cortado.Start.Matcher textView = Cortado.textView();

        //then
        Truth.assertThat(textView.getCortado().assignableFromClass).isEqualTo(TextView.class);
    }

    @Test
    public void editText_assignableFromClass_properly() {
        //given

        //when
        cortado.Start.Matcher editText = Cortado.editText();

        //then
        Truth.assertThat(editText.getCortado().assignableFromClass).isEqualTo(EditText.class);
    }

    public void button_assignableFromClass_properly() {
        //given

        //when
        cortado.Start.Matcher button = Cortado.button();

        //then
        Truth.assertThat(button.getCortado().assignableFromClass).isEqualTo(Button.class);
    }

    @Test
    public void imageView_assignableFromClass_properly() {
        //given

        //when
        cortado.Start.Matcher imageView = Cortado.imageView();

        //then
        Truth.assertThat(imageView.getCortado().assignableFromClass).isEqualTo(ImageView.class);
    }

    @Test
    public void imageButton_assignableFromClass_properly() {
        //given

        //when
        cortado.Start.Matcher imageButton = Cortado.imageButton();

        //then
        Truth.assertThat(imageButton.getCortado().assignableFromClass).isEqualTo(ImageButton.class);
    }

    //ViewInteraction
    @Test
    public void onTextView_returns_sameClass_as_onView() {
        //given
        Object onView = Cortado.onView();

        //when
        Object onTextView = Cortado.onTextView();

        //then
        assertThat(onTextView).isOfTheSameClassAs(onView);
    }

    @Test
    public void onEditText_returns_sameClass_as_onView() {
        //given
        Object onView = Cortado.onView();

        //when
        Object onEditText = Cortado.onEditText();

        //then
        assertThat(onEditText).isOfTheSameClassAs(onView);
    }

    @Test
    public void onButton_returns_sameClass_as_onView() {
        //given
        Object onView = Cortado.onView();

        //when
        Object onButton = Cortado.onButton();

        //then
        assertThat(onButton).isOfTheSameClassAs(onView);
    }

    @Test
    public void onImageView_returns_sameClass_as_onView() {
        //given
        Object onView = Cortado.onView();

        //when
        Object onImageView = Cortado.onImageView();

        //then
        assertThat(onImageView).isOfTheSameClassAs(onView);
    }

    @Test
    public void onImageButton_returns_sameClass_as_onView() {
        //given
        Object onView = Cortado.onView();

        //when
        Object onImageButton = Cortado.onImageButton();

        //then
        assertThat(onImageButton).isOfTheSameClassAs(onView);
    }

    @Test
    public void onView_doesNotSet_assignableFromClass_field() {
        //given

        //when
        cortado.Start.ViewInteraction onView = Cortado.onView();

        //then
        Truth.assertThat(onView.getCortado().assignableFromClass).isNull();
    }

    @Test
    public void onTextView_assignableFromClass_properly() {
        //given

        //when
        cortado.Start.ViewInteraction onTextView = Cortado.onTextView();

        //then
        Truth.assertThat(onTextView.getCortado().assignableFromClass).isEqualTo(TextView.class);
    }

    @Test
    public void onEditText_assignableFromClass_properly() {
        //given

        //when
        cortado.Start.ViewInteraction onEditText = Cortado.onEditText();

        //then
        Truth.assertThat(onEditText.getCortado().assignableFromClass).isEqualTo(EditText.class);
    }

    public void onButton_assignableFromClass_properly() {
        //given

        //when
        cortado.Start.ViewInteraction onButton = Cortado.onButton();

        //then
        Truth.assertThat(onButton.getCortado().assignableFromClass).isEqualTo(Button.class);
    }

    @Test
    public void onImageView_assignableFromClass_properly() {
        //given

        //when
        cortado.Start.ViewInteraction onImageView = Cortado.onImageView();

        //then
        Truth.assertThat(onImageView.getCortado().assignableFromClass).isEqualTo(ImageView.class);
    }

    @Test
    public void onImageButton_assignableFromClass_properly() {
        //given

        //when
        cortado.Start.ViewInteraction onImageButton = Cortado.onImageButton();

        //then
        Truth.assertThat(onImageButton.getCortado().assignableFromClass).isEqualTo(ImageButton.class);
    }
}
