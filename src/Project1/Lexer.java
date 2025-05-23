/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: This class provides the lexical analyzer for project 1
 */

package Project1;

import java.io.*;

class Lexer {

    private static final int KEYWORDS = 23;
    private StreamTokenizer tokenizer;
    private String punctuation = ",;.()";
    private Token[] punctuationTokens = {Token.COMMA, Token.SEMICOLON, Token.PERIOD, Token.LEFT_PAREN, Token.RIGHT_PAREN};

    // Constructor that creates a lexical analyzer object given the source file

    public Lexer(File file) throws FileNotFoundException {
        tokenizer = new StreamTokenizer(new FileReader(file));
        tokenizer.ordinaryChar('.');
        tokenizer.quoteChar('"');
    }

    // Returns the next token in the input stream

    public Token getNextToken() throws LexicalError, IOException {
        int token = tokenizer.nextToken();
        switch(token) {
            case StreamTokenizer.TT_NUMBER:
                return Token.NUMBER;
            case StreamTokenizer.TT_WORD:
                for(Token aToken : Token.values()) {
                    if(aToken.ordinal() == KEYWORDS) {
                        break;
                    }
                    if(aToken.name().replace("_", "").equals(tokenizer.sval.toUpperCase())) {
                        return aToken;
                    }
                }
                return Token.IDENTIFIER;
            case StreamTokenizer.TT_EOF:
                return Token.EOF;
            default:
                for(int i = 0; i < punctuation.length(); i++)
                    if(token == punctuation.charAt(i)) {
                        return punctuationTokens[i];
                    }
        }
        return Token.EOF;
    }

    // Returns the lexeme associated with the current token

    public String getLexeme() {
        return tokenizer.sval;
    }

    // Returns the numeric value of the current token for numeric tokens

    public int getNumber() {
        return (int) tokenizer.nval;
    }

    // Returns the current line of the input file

    public int getLineNo() {
        return tokenizer.lineno();
    }
}
