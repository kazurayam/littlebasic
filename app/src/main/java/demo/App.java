package demo;

import org.littlebasic.Interpreter;
import org.littlebasic.Value;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.newInputStream;

public class App {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            throw new IllegalArgumentException(
                    "Usage: java -jar app/build/libs/app.jar " +
                            "app/src/test/fixtures/runGCD.bas");
        }
        Path bas = Paths.get(args[0]);
        assert Files.exists(bas);
        InputStream basicCode = newInputStream(bas);

        // create the Interpreter instance
        Interpreter interpreter =
                new Interpreter(System.in, System.out, System.err);
        //
        Value value = interpreter.run(basicCode);
    }
}
