package com.github.secondbase.core;

import java.io.IOException;

/**
 * Exception wrapper for SecondBase exceptions.
 */
public class SecondBaseException extends Throwable {
    public SecondBaseException(final String s, final IOException e) {
        super(s, e);
    }

    public SecondBaseException(final String s) {
        super(s);
    }
}
