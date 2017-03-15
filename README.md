![Image](/img/1100x330.png)


Android Espresso made more fluent :coffee:

**Check out my [blog](https://medium.com/@blipinsk) :squirrel: or say *hi* on [Twitter](https://twitter.com/blipinsk).**

--------
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Cortado-green.svg?style=true)](https://android-arsenal.com/details/1/5355) [![Android Weekly](https://img.shields.io/badge/Android%20Weekly-%23246-blue.svg)](http://androidweekly.net/issues/issue-246)

Overview
--------
Cortado provides a layer of abstraction above Espresso, so it's a bit easier to use.

**Remember: It is Google Espresso underneath.** You can still mess up your tests the same way you would when using pure Espresso. Cortado just gives you a bit nicer way to communicate with Espresso.

Espresso vs. Cortado
====================

1. Get a `Matcher` for `clickable` views with `R.id.text` and with text NOT "Example"

  Framework | Code example
  --- | ---
  Espresso | `Matchers.allOf(withId(R.id.text), isClickable(), Matchers.not(withText("Example")));`
  Cortado | `Cortado.view().withId(R.id.text).and().isClickable().and().not().withText("Example");`

2. Get a `Matcher` for views that have text `example` or have parent `FrameLayout`

  Framework | Code example
  --- | ---
  Espresso | `Matchers.anyOf(withText("example"), withParent(isAssignableFrom(FrameLayout.class)));`
  Cortado | `Cortado.view().withText("example").or().withParent(isAssignableFrom(FrameLayout.class));`

3. Click on a `View` with `R.id.button`

  Framework | Code example
  --- | ---
  Espresso | `Espresso.onView(withId(R.id.button)).perform(ViewActions.click());`
  Cortado | `Cortado.onView().withId(R.id.button).perform().click();`

4. Check if a `View` with text `example` is visible

  Framework | Code example
  --- | ---
  Espresso | `Espresso.onView(withText("example")).check(ViewAssertions.matches(isDisplayed()));`
  Cortado | `Cortado.onView().withText("example").check().matches(isDisplayed());`

5. Replace a text on `enabled` view with `R.id.edit`

  Framework | Code example
  --- | ---
  Espresso | `Espresso.onView(Matchers.allOf(withId(R.id.edit),isEnabled())).perform(ViewActions.replaceText("changed"));`
  Cortado | `Cortado.onView().withId(R.id.edit).and().isEnabled().perform().replaceText("changed");`

Features
========

1. Creating an instance of `org.hamcrest.Matcher<View>`
    
    ```java
    org.hamcrest.Matcher<View> matcher = Cortado.view().withId(R.id.example);
    ```
    
2. Creating an instance of `android.support.test.espresso.ViewInteraction`
    
    ```java
    ViewInteraction viewInteraction = Cortado.onView().withId(R.id.example).perform(click());
    ```

3. Fluently creating `Matchers.allOf(...)`

    ```java
    Cortado.view().withId(R.id.example).and().withText("example").and().isClickable();
    ```
    
4. Fluently creating `Matchers.anyOf(...)`

    ```java
    Cortado.view().withId(R.id.example).or().withText("example").or().isClickable();
    ```

5. Fluently negating conditions

    ```java
    Cortado.view().not().withId(R.id.example).and().withText("example").and().not().isClickable();
    ```
    
6. Fluently performing single action (on `ViewInteraction`)

    ```java
    Cortado.onView().withId(R.id.example).perform().click();
    ```
    
7. Fluently checking matches (on `ViewInteraction`)

    ```java
    Cortado.onView().withId(R.id.example).check().matches(Cortado.view().withText("example"));
    ```

Compatibility
-------------

I wanted the api of Cortado to be compatible with Espresso as much as possible. That's why you can do stuff like that:

```java
Espresso.onView(Cortado.view().withId(R.id.example).and().withText("Example")).perform(click());
```

Including In Your Project
-------------------------

```groovy
dependencies {
    androidTestCompile 'com.bartoszlipinski:cortado:1.1.0'
}
```

Developed by
============
 * Bartosz Lipiński

License
=======

    Copyright 2017 Bartosz Lipiński

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
