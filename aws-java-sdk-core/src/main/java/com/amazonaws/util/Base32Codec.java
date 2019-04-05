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
 * A Base 32 codec implementation.
 * 
 * @author Hanson Char
 */
class Base32Codec extends AbstractBase32Codec {
    private static final int OFFSET_OF_2 = '2' - 26;
    
    private static class LazyHolder {
        private static final byte[] DECODED = decodeTable();
        
        private static byte[] decodeTable() {
            final byte[] dest = new byte['z'+1];
            
            for (int i=0; i <= 'z'; i++) 
            {
                if (i >= 'A' && i <= 'Z')
                    dest[i] = (byte)(i - 'A');
                else if (i >= '2' && i <= '7')
                    dest[i] = (byte)(i - OFFSET_OF_2);
                else if (i >= 'a' && i <= 'z')
                    dest[i] = (byte)(i - 'a');
                else 
                    dest[i] = -1;
            }
            return dest;
        }
    }

    private static byte[] alphabets() {
        // Base 32 alphabet as defined at http://www.ietf.org/rfc/rfc4648.txt
        return CodecUtils.toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
    }

    Base32Codec() {
        super(alphabets());
    }
    
    @Override
    protected int pos(byte in) {
        int pos = LazyHolder.DECODED[in];
        
        if (pos > -1)
            return pos;
        throw new IllegalArgumentException("Invalid base 32 character: \'" + (char)in + "\'");
    }
}
