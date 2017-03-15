package different_package;

import java.lang.reflect.Modifier;

import static com.google.common.truth.Truth.assertWithMessage;

/**
 * Created by Bartosz Lipinski
 * 15.03.2017
 */
public class Availability {

    // Suppress default constructor for noninstantiability
    private Availability() {
        throw new AssertionError();
    }

    public static void assertVisible(Object object, String methodName, Class<?>... parameterTypes) {
        assertVisible(object.getClass(), methodName, parameterTypes);
    }

    public static void assertVisible(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        try {
            final int modifiers = clazz.getDeclaredMethod(methodName, parameterTypes).getModifiers();
            if ((modifiers & Modifier.STATIC) != Modifier.STATIC) { //checking final only for non-static methods
                assertWithMessage(
                        "Method \"%s\" has incorrect Modifiers. Modifier.FINAL is expected.",
                        methodName)
                        .that(modifiers & Modifier.FINAL).isEqualTo(Modifier.FINAL);
            }
            assertWithMessage(
                    "Method is NOT visible! Method \"%s\" has incorrect Modifiers. Modifier.PUBLIC is expected.",
                    methodName)
                    .that(modifiers & Modifier.PUBLIC).isEqualTo(Modifier.PUBLIC);
        } catch (NoSuchMethodException e) {
            assertWithMessage("No such method %s", e.getMessage()).fail();
        }
    }

    public static void assertNotVisible(Object object, String methodName) {
        assertNotVisible(object.getClass(), methodName);
    }

    public static void assertNotVisible(Class<?> clazz, String methodName) {
        try {
            final int modifiers = clazz.getDeclaredMethod(methodName).getModifiers();
            assertWithMessage(
                    "Method \"%s\" has incorrect Modifiers. Modifier.FINAL is expected.",
                    methodName)
                    .that(modifiers & Modifier.FINAL).isEqualTo(Modifier.FINAL);
            assertWithMessage(
                    "Method IS visible! Method \"%s\" has incorrect Modifiers. Modifier.PUBLIC is NOT expected.",
                    methodName)
                    .that(modifiers & Modifier.PUBLIC).isNotEqualTo(Modifier.PUBLIC);
        } catch (NoSuchMethodException e) {
            assertWithMessage("No such method").fail();
        }
    }
}
