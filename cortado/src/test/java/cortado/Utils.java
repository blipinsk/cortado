package cortado;

import cortado.internal.RecordingDescription;

import static com.google.common.truth.Truth.assertWithMessage;

/**
 * Created by Bartosz Lipinski
 * 18.02.2017
 */
public final class Utils {
    // Suppress default constructor for noninstantiability
    private Utils() {
        throw new AssertionError();
    }

    public static final AssertCortadoMatcher assertThat(org.hamcrest.Matcher cortadoMatcher) {
        return new AssertCortadoMatcher(cortadoMatcher);
    }

    public final static class AssertCortadoMatcher {

        private final org.hamcrest.Matcher cortadoMatcher;

        private AssertCortadoMatcher(org.hamcrest.Matcher cortadoMatcher) {
            this.cortadoMatcher = cortadoMatcher;
        }

        public final void isEqualTo(org.hamcrest.Matcher espressoMatcher) {
            RecordingDescription cortadoDescription = new RecordingDescription();
            RecordingDescription espressoDescription = new RecordingDescription();

            cortadoMatcher.describeTo(cortadoDescription);
            espressoMatcher.describeTo(espressoDescription);

            assertWithMessage("Cortado matcher is not equal to Espresso matcher. The descriptions")
                    .that(cortadoDescription.toString()).isEqualTo(espressoDescription.toString());
        }

        public final void isNotEqualTo(org.hamcrest.Matcher espressoMatcher) {
            RecordingDescription cortadoDescription = new RecordingDescription();
            RecordingDescription espressoDescription = new RecordingDescription();

            cortadoMatcher.describeTo(cortadoDescription);
            espressoMatcher.describeTo(espressoDescription);

            assertWithMessage("Cortado matcher is equal to Espresso matcher. The descriptions")
                    .that(cortadoDescription.toString()).isNotEqualTo(espressoDescription.toString());
        }
    }

}
