Version 1.2.0 *(2017-04-27)*
----------------------------

View-specific equivalents of `view()` and `onView()` added:
 * `textView()` and `onTextView()` for `android.widget.TextView`
 * `editText()` and `onEditText()` for `android.widget.EditText`
 * `button()` and `onButton()` for `android.widget.Button`
 * `imageView()` and `onImageView()` for `android.widget.ImageView`
 * `imageButton()` and `onImageButton()` for `android.widget.ImageButton`

Version 1.1.0 *(2017-03-15)*
----------------------------

* Negating conditions inline (`not()` method)
* `And`, `Or` and `Not` interfaces added
* Maintaining the order of method calls
* IDE suggestions corrected
* `Cortado.Start`, `Cortado.Start.Matcher`, `Cortado.Start.ViewInteraction`, `Cortado.Unfinished`, 
  `Cortado.Unfinished.Or`, `Cortado.Unfinished.And`, `Cortado.Unfinished.Or.Matcher`,
  `Cortado.Unfinished.Or.ViewInteraction`, `Cortado.Unfinished.And.Matcher`, `Cortado.Unfinished.And.ViewInteraction`
   marked as `@Deprecated` (corresponding classes have been created in the main package - `cortado`)

Version 1.0.1 *(2017-02-20)*
----------------------------

* `Cortado.And.ViewInteraction` method name corrected

Version 1.0.0 *(2017-02-20)*
----------------------------

Initial release.
