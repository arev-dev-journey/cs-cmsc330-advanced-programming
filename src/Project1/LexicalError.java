/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: Class that defines a lexical error
 */

package Project1;

class LexicalError extends Exception {
    // Constructor that creates a lexical error object given the line number and error

    public LexicalError(int line, String description) {
        super("Lexical Error on Line: " + line + " " + description);
    }
}