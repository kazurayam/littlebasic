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
            new TestOutputOrganizer.Builder(InterpreterTest.class)
                    .subOutputDirectory(InterpreterTest.class)
                    .build();

    @Test
    public void simplestCase() throws IOException {
        Path bas = too.getProjectDirectory()
                .resolve("src/test/fixtures/RunGCD.bas");
        assertTrue(Files.exists(bas));
        InputStream inputBas = newInputStream(bas);
        Path methodOutputDir = too.cleanMethodOutputDirectory("simplestCase");
        OutputStream stdout = newOutputStream(
                methodOutputDir.resolve("stdout"));
        OutputStream stderr = newOutputStream(
                methodOutputDir.resolve("stderr"));
        InputStream stdin = newInputStream(bas);   // ?

        Interpreter interpreter = new Interpreter(stdin, stdout, stderr);
        Value value = interpreter.run(inputBas);
    }
}
