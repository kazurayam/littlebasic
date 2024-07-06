package org.littlebasic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * The command line.
 */
public class LittleBasicCli {

    public static void main(String[] args) {
        InputStream in = null;
        Interpreter interpreter = null;
        try {
            if (args.length == 0) {
                System.out.println("Usage: littlebasic <progamfile>.bas");
                System.exit(-1);
            }
            in = new FileInputStream(args[0]);
            interpreter = new Interpreter(System.in, System.out, System.err);
            interpreter.run(in);
            interpreter.clear();

        } catch (IOException e) {
            System.out.println("Error running program: " + e.getMessage());
            System.exit(-1);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the input stream");
                    System.exit(-2);
                }
            }
            if (interpreter != null) {
                interpreter.clear();
            }
        }
    }

}