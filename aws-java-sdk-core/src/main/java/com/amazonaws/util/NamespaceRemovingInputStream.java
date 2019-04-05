/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.internal.SdkFilterInputStream;

/**
 * FilterInputStream implementation that wraps an InputStream containing an XML
 * document, and removes the XML namespace attribute from the XML document.
 */
class NamespaceRemovingInputStream extends SdkFilterInputStream {

    /** look ahead buffer */
    private byte[] lookAheadData = new byte[200];

    /** Set to true once the namespace has been removed */
    private boolean hasRemovedNamespace = false;

    /**
     * Constructs a new NamespaceRemovingInputStream wrapping the specified
     * InputStream.
     *
     * @param in
     *            The InputStream containing an XML document whose XML namespace
     *            is to be removed.
     */
    public NamespaceRemovingInputStream(InputStream in) {
        // Wrap our input stream in a buffered input stream to ensure
        // that it support mark/reset
        super(new BufferedInputStream(in));
    }

    /* (non-Javadoc)
     * @see java.io.FilterInputStream#read()
     */
    @Override
    public int read() throws IOException {
        abortIfNeeded();
        int b = in.read();
        if (b == 'x' && !hasRemovedNamespace) {
            lookAheadData[0] = (byte)b;
            in.mark(lookAheadData.length);
            int bytesRead = in.read(lookAheadData, 1, lookAheadData.length - 1);
            in.reset();

            String string = new String(lookAheadData, 0, bytesRead + 1, StringUtils.UTF8);

            int numberCharsMatched = matchXmlNamespaceAttribute(string);
            if (numberCharsMatched > 0) {
                for (int i = 0; i < numberCharsMatched - 1; i++) {
                    in.read();
                }
                b = in.read();
                hasRemovedNamespace = true;
            }
        }

        return b;
    }

    /* (non-Javadoc)
     * @see java.io.FilterInputStream#read(byte[], int, int)
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        for (int i = 0; i < len; i++) {
            int j = this.read();
            if (j == -1) {
                if (i == 0) return -1;
                return i;
            }

            b[i + off] = (byte)j;
        }

        return len;
    }

    /* (non-Javadoc)
     * @see java.io.FilterInputStream#read(byte[])
     */
    @Override
    public int read(byte[] b) throws IOException {
        return this.read(b, 0, b.length);
    }

    /**
     * Checks if the string starts with a complete XML namespace attribute, and
     * if so, returns the number of characters that match.
     *
     * @param s
     *            The string to check for an XML namespace definition.
     *
     * @return -1 if no XML namespace definition was found, otherwise the length
     *         of the identified XML namespace definition.
     */
    private int matchXmlNamespaceAttribute(String s) {
        /*
         * The regex we're simulating is: "xmlns\\s*=\\s*\".+?\".*"
         */
        StringPrefixSlicer stringSlicer = new StringPrefixSlicer(s);
        if (stringSlicer.removePrefix("xmlns") == false) return -1;

        stringSlicer.removeRepeatingPrefix(" ");
        if (stringSlicer.removePrefix("=") == false) return -1;
        stringSlicer.removeRepeatingPrefix(" ");

        if (stringSlicer.removePrefix("\"") == false) return -1;
        if (stringSlicer.removePrefixEndingWith("\"") == false) return -1;

        return s.length() - stringSlicer.getString().length();
    }

    /**
     * Utility class to help test and remove specified prefixes from a string.
     */
    private static final class StringPrefixSlicer {
        private String s;

        public StringPrefixSlicer(String s) {
            this.s = s;
        }

        /**
         * @return The remaining String (minus any prefixes that have been
         *         removed).
         */
        public String getString() {
            return s;
        }

        public boolean removePrefix(String prefix) {
            if (s.startsWith(prefix) == false) return false;
            s = s.substring(prefix.length());
            return true;
        }

        public boolean removeRepeatingPrefix(String prefix) {
            if (s.startsWith(prefix) == false) return false;

            while (s.startsWith(prefix)) {
                s = s.substring(prefix.length());
            }
            return true;
        }

        public boolean removePrefixEndingWith(String marker) {
            int i = s.indexOf(marker);
            if (i < 0) return false;
            s = s.substring(i + marker.length());
            return true;
        }
    }

}
