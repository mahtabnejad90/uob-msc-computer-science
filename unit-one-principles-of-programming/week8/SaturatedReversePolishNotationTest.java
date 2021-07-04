package test.com.company.srpn;

import com.company.srpn.SaturatedReversePolishNotation;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class SaturatedReversePolishNotationTest {

    private SaturatedReversePolishNotation SaturatedReversePolishNotation;


    @Before
public void setup(){
        SaturatedReversePolishNotation = new SaturatedReversePolishNotation();
}

    private Integer parseStdOut(String stdOut){
        String standardOutput = stdOut.toString();
        String str = standardOutput.replaceAll("[^a-zA-Z0-9\\-]", "");
        return Integer.valueOf(str);
    }

    private boolean testIntegerInput(String input, Integer expected){
        ByteArrayOutputStream stdOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdOut));
        SaturatedReversePolishNotation.renderUserInput(input);
        System.setIn(new ByteArrayInputStream("InputStream".getBytes()));
        Integer result = parseStdOut(stdOut.toString());
        return result.equals(expected);
    }

    private boolean testStringInput(String input, String expected){
        ByteArrayOutputStream stdOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdOut));
        SaturatedReversePolishNotation.renderUserInput(input);
        System.setIn(new ByteArrayInputStream("InputStream".getBytes()));
        stdOut.toString();
        return stdOut.toString().equals(expected);
    }

    @Test
    public void testMinusCalculation() {
        assertTrue(testIntegerInput("2 4 - =", -2));
    }

    @Test
    public void testRandomNumberInput() {
        assertTrue(testStringInput("1", ""));
    }

    @Test
    public void stackUnderFlowOne() {
        assertFalse(testStringInput("2 -", "Stack underflow."));
    }

    @Test
    public void stackUnderFlowTwo() {
        assertFalse(testStringInput("1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1", "Stack underflow."));
    }

}
