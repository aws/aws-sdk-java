/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Codec internal utilities
 * 
 * @author Hanson Char
 */
public enum CodecUtils {
    ;
    /**
     * Transforms the given string into the given destination byte array
     * truncating each character into a byte and skipping carriage returns and
     * line feeds if any.
     * <p>
     * dmurray: "It so happens that we're currently only calling this method
     * with src.length == dest.length, in which case it works, but we could
     * theoretically get away with passing a smaller dest if we knew ahead of
     * time that src contained some number of spaces. In that case it looks like
     * this implementation would truncate the result."
     * <p>
     * hchar:
     * "Yes, but the truncation is the intentional behavior of this internal 
     * routine in that case."
     * 
     * @param singleOctets
     *            non-null string containing only single octet characters
     * @param dest
     *            destination byte array
     * 
     * @return the actual length of the destination byte array holding data
     * @throws IllegalArgumentException
     *             if the input string contains any multi-octet character
     */
    static int sanitize(final String singleOctets, byte[] dest) {
        final int capacity = dest.length;
        final char[] src = singleOctets.toCharArray();
        int limit=0;

        for (int i=0; i < capacity; i++) {
            final char c = src[i];
            
            if (c == '\r' || c == '\n' || c == ' ')
                continue;
            if (c > Byte.MAX_VALUE)
                throw new IllegalArgumentException("Invalid character found at position " + i + " for " + singleOctets);
            dest[limit++] = (byte)c;
        }
        return limit;
    }
    
    /**
     * Returns a byte array representing the given string,
     * truncating each character into a byte directly.
     * 
     * @throws IllegalArgumentException if the input string contains any multi-octet character
     */
    public static byte[] toBytesDirect(final String singleOctets) {
        final char[] src = singleOctets.toCharArray();
        final byte[] dest = new byte[src.length];
        
        for (int i=0; i < dest.length; i++) {
            final char c = src[i];
            
            if (c > Byte.MAX_VALUE)
                throw new IllegalArgumentException("Invalid character found at position " + i + " for " + singleOctets);
            dest[i] = (byte)c;
        }
        return dest;
    }

    /**
     * Returns a string representing the given byte array,
     * treating each byte as a single octet character.
     */
    public static String toStringDirect(final byte[] bytes) {
        final char[] dest = new char[bytes.length];
        int i=0;
        
        for (byte b: bytes)
            dest[i++] = (char)b;
        
        return new String(dest);
    }
    
    /** 
     * Sanity check the last decoded position is a possible value.
     * 
     * @throws IllegalArgumentException if the given decoded position is
     * not a possible value produced via the respective encoding 
     */
    static void sanityCheckLastPos(int pos, int mask) {
        if ((pos & mask) != 0) {
            throw new IllegalArgumentException
                ("Invalid last non-pad character detected");
        }
    }
}