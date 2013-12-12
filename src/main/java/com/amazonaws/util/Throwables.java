package com.amazonaws.util;

import org.apache.commons.logging.LogFactory;

/**
 * Utility for use with errors or exceptions.
 */
public enum Throwables {
    ;
    /**
     * Returns the root cause of the given throwable, or null if the given
     * throwable is null. If the root cause is over 1000 level deep, the
     * original throwable will be returned defensively as this is heuristically
     * considered a circular reference, however unlikely.
     */
    public static Throwable getRootCause(Throwable orig) {
        if (orig == null)
            return orig;
        Throwable t = orig;
        // defend against (malicious?) circularity
        for (int i=0; i < 1000; i++) {
            Throwable cause = t.getCause();
            if (cause == null)
                return t;
            t = cause;
        }
        // Too bad.  Return the original exception.
        LogFactory.getLog(Throwables.class).debug(
            "Possible circular reference detected on " + orig.getClass()
                    + ": [" + orig + "]");
        return orig;
    }
}
