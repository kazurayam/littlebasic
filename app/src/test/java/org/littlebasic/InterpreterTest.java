package org.littlebasic;

import com.kazurayam.unittest.TestOutputOrganizer;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Files.newInputStream;
import static java.nio.file.Files.newOutputStream;
import static org.testng.Assert.assertTrue;

public class InterpreterTest {

    private static TestOutputOrganizer too =
            new TestOutputOrganizer.Builder(InterpreterTest.class).build();

    @Test
    public void simplestCase() throws IOException {
        Path bas = too.getProjectDirectory()
                .resolve("src/test/fixtures/RunGCD.bas");
        assertTrue(Files.exists(bas));
        InputStream inputBas = newInputStream(bas);
        Method thisMethod = Object.class.getEnclosingMethod();
        Path methodOutputDir = too.cleanMethodOutputDirectory(thisMethod);
        OutputStream stdout = newOutputStream(
                methodOutputDir.resolve("stdout"));
        OutputStream stderr = newOutputStream(
                methodOutputDir.resolve("stderr"));

        Interpreter interpreter = new Interpreter(null, stdout, stderr);
        Value value = interpreter.run(inputBas);
    }
}
