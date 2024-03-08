package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {

        @Test
        void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {

            // setup lines
            StringParser sp = new StringParser();
            String inputString = "Hello!World";
            String separator = "\\!";
            ArrayList<String> output = sp.splitString(inputString, separator);
            assertEquals(2, output.size());
        }

        @Test
        void splitString_nullString_exceptException() throws NullPointerException{
            StringParser sp = new StringParser();
            String inputString = null;
            String separator = "\\|";

            assertThrows(InvalidStringInputException.class,
                    () -> { sp.splitString(inputString, separator);
            });

        }

}