/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: Class that defines a syntax error
 */

package Project1;

class SyntaxError extends Exception
{
    // Constructor that creates a syntax error object given the line number and error

    public SyntaxError(int line, String description) {
        super("Syntax Error on Line: " + line + " " + description);
    }
}