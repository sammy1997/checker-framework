package tests;

import java.io.File;
import java.util.List;
import org.checkerframework.framework.test.CheckerFrameworkPerDirectoryTest;
import org.junit.runners.Parameterized.Parameters;
import testlib.wholeprograminference.WholeProgramInferenceTestChecker;

/**
 * Tests whole-program type inference with the aid of .jaif files.
 *
 * <p>IMPORTANT: The errors captured in the tests located in tests/whole-program-inference/ are not
 * relevant. The meaning of this test class is to test if the generated .jaif files are similar to
 * the expected ones. The errors on .java files must be ignored.
 *
 * @author pbsf
 */
public class WholeProgramInferenceValidationTest extends CheckerFrameworkPerDirectoryTest {

    public WholeProgramInferenceValidationTest(List<File> testFiles) {
        super(testFiles, WholeProgramInferenceTestChecker.class, "value", "-Anomsgtext");
    }

    @Parameters
    public static String[] getTestDirs() {
        return new String[] {"whole-program-inference/annotated/"};
    }
}
