package cortado;

import java.util.ArrayList;
import java.util.List;

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

    private static List<Chunk> buildChunksList(Cortado cortado) {
        List<Chunk> chunks = new ArrayList<>(47);
        chunks.add(cortado.assignableFrom);
        chunks.add(cortado.className);
        chunks.add(cortado.isDisplayed);
        chunks.add(cortado.isCompletelyDisplayed);
        chunks.add(cortado.isDisplayingAtLeast);
        chunks.add(cortado.isEnabled);
        chunks.add(cortado.isFocusable);
        chunks.add(cortado.hasFocus);
        chunks.add(cortado.isSelected);
        chunks.add(cortado.hasSibling);
        chunks.add(cortado.withContentDescriptionResource);
        chunks.add(cortado.withContentDescriptionString);
        chunks.add(cortado.withContentDescriptionMatcher);
        chunks.add(cortado.withIdResource);
        chunks.add(cortado.withIdMatcher);
        chunks.add(cortado.withResourceNameString);
        chunks.add(cortado.withResourceNameMatcher);
        chunks.add(cortado.withTagKey);
        chunks.add(cortado.withTagKeyMatcher);
        chunks.add(cortado.withTagValue);
        chunks.add(cortado.withTextString);
        chunks.add(cortado.withTextMatcher);
        chunks.add(cortado.withTextResource);
        chunks.add(cortado.withHintString);
        chunks.add(cortado.withHintMatcher);
        chunks.add(cortado.withHintResource);
        chunks.add(cortado.isChecked);
        chunks.add(cortado.isNotChecked);
        chunks.add(cortado.hasContentDescription);
        chunks.add(cortado.hasDescendant);
        chunks.add(cortado.isClickable);
        chunks.add(cortado.isDescendantOfA);
        chunks.add(cortado.withEffectiveVisibility);
        chunks.add(cortado.withParent);
        chunks.add(cortado.withChild);
        chunks.add(cortado.isRoot);
        chunks.add(cortado.supportsInputMethods);
        chunks.add(cortado.hasImeActionInteger);
        chunks.add(cortado.hasImeActionMatcher);
        chunks.add(cortado.hasLinks);
        chunks.add(cortado.withSpinnerTextResource);
        chunks.add(cortado.withSpinnerTextMatcher);
        chunks.add(cortado.withSpinnerTextString);
        chunks.add(cortado.isJavascriptEnabled);
        chunks.add(cortado.hasErrorTextMatcher);
        chunks.add(cortado.hasErrorTextString);
        chunks.add(cortado.withInputType);
        return chunks;
    }

    public static final AssertCortadoMatcher assertThat(org.hamcrest.Matcher cortadoMatcher) {
        return new AssertCortadoMatcher(cortadoMatcher);
    }

    public static final AssertCortado assertThat(Cortado cortado) {
        return new AssertCortado(cortado);
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

            assertWithMessage("Cortado matcher does not equal Espresso matcher. The descriptions")
                    .that(cortadoDescription.toString()).isEqualTo(espressoDescription.toString());
        }
    }

    public final static class AssertCortado {

        private final Cortado cortado;

        public AssertCortado(Cortado cortado) {
            this.cortado = cortado;
        }

        public final void hasNoChunksUsed() {
            final List<Chunk> chunks = buildChunksList(cortado);
            for (Chunk chunk : chunks) {
                assertWithMessage("At least one chunk has been used")
                        .that(chunk.isPresent()).isFalse();
            }
        }

        public final void hasOnlyOneChunkUsed(Chunk used) {
            final List<Chunk> chunks = buildChunksList(cortado);
            for (Chunk chunk : chunks) {
                if (chunk.equals(used)) {
                    assertWithMessage("The chunk that was supposed to be used, wasn't")
                            .that(chunk.isPresent()).isTrue();
                } else {
                    assertWithMessage("More than one chunk has been used")
                            .that(chunk.isPresent()).isFalse();
                }
            }
        }
    }
}
