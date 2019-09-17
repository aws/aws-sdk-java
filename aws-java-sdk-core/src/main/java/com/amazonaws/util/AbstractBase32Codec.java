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
import static com.amazonaws.util.CodecUtils.sanityCheckLastPos;

/**
 * Common base class for Base 32 like codec implementation.
 * 
 * @author Hanson Char
 */
abstract class AbstractBase32Codec implements Codec {
    private static final int MASK_2BITS = (1 << 2) - 1;
    private static final int MASK_3BITS = (1 << 3) - 1;
    private static final int MASK_4BITS = (1 << 4) - 1;
    private static final int MASK_5BITS = (1 << 5) - 1;
    // Base 32 alphabet as defined at http://www.ietf.org/rfc/rfc4648.txt
    private static final byte PAD = '=';
    
    private final byte[] alphabets;

    protected AbstractBase32Codec(byte[] alphabets) {
        this.alphabets = alphabets;
    }

    @Override
    public final byte[] encode(byte[] src) {
        final int num5bytes = src.length / 5;
        final int remainder = src.length % 5;
        
        if (remainder == 0)
        {
            byte[] dest = new byte[num5bytes * 8];
    
            for (int s=0,d=0; s < src.length; s+=5, d+=8)
                encode5bytes(src, s, dest, d);
            return dest;
        }
        
        byte[] dest = new byte[(num5bytes+1) * 8];
        int s=0, d=0;
        
        for (; s < src.length-remainder; s+=5, d+=8)
            encode5bytes(src, s, dest, d);
        
        switch(remainder) {
            case 1:
                encode1byte(src, s, dest, d);
                break;
            case 2:
                encode2bytes(src, s, dest, d);
                break;
            case 3:
                encode3bytes(src, s, dest, d);
                break;
            case 4:
                encode4bytes(src, s, dest, d);
                break;
            default:
                throw new IllegalStateException();
        }
        return dest;
    }
    
    private final void encode5bytes(byte[] src, int s, byte[] dest, int d) {
        // operator precedence in descending order: >>> or <<, &, |
        byte p;
        dest[d++] = (byte)alphabets[(p=src[s++]) >>> 3 & MASK_5BITS];                         // 5 
        dest[d++] = (byte)alphabets[(p & MASK_3BITS) << 2 | (p=src[s++]) >>> 6 & MASK_2BITS]; // 3 2
        dest[d++] = (byte)alphabets[p >>> 1 & MASK_5BITS];                                    //   5
        dest[d++] = (byte)alphabets[(p & 1) << 4 | (p=src[s++]) >>> 4 & MASK_4BITS];          //   1 4
        dest[d++] = (byte)alphabets[(p & MASK_4BITS) << 1 | (p=src[s++]) >>> 7 & 1];          //     4 1
        dest[d++] = (byte)alphabets[p >>> 2 & MASK_5BITS];                                    //       5
        dest[d++] = (byte)alphabets[(p & MASK_2BITS) << 3 | (p=src[s]) >>> 5 & MASK_3BITS];   //       2 3
        dest[d] = (byte)alphabets[p & MASK_5BITS];                                            //         5
        return;
    }
    
    private final void encode4bytes(byte[] src, int s, byte[] dest, int d) {
        // operator precedence in descending order: >>> or <<, &, |
        byte p;
        dest[d++] = (byte)alphabets[(p=src[s++]) >>> 3 & MASK_5BITS];                         // 5 
        dest[d++] = (byte)alphabets[(p & MASK_3BITS) << 2 | (p=src[s++]) >>> 6 & MASK_2BITS]; // 3 2
        dest[d++] = (byte)alphabets[p >>> 1 & MASK_5BITS];                                    //   5
        dest[d++] = (byte)alphabets[(p & 1) << 4 | (p=src[s++]) >>> 4 & MASK_4BITS];          //   1 4
        dest[d++] = (byte)alphabets[(p & MASK_4BITS) << 1 | (p=src[s]) >>> 7 & 1];            //     4 1
        dest[d++] = (byte)alphabets[p >>> 2 & MASK_5BITS];                                    //       5
        dest[d++] = (byte)alphabets[(p & MASK_2BITS) << 3];                                   //       2
        dest[d] = PAD;
        return;
    }
    
    private final void encode3bytes(byte[] src, int s, byte[] dest, int d) {
        // operator precedence in descending order: >>> or <<, &, |
        byte p;
        dest[d++] = (byte)alphabets[(p=src[s++]) >>> 3 & MASK_5BITS];                         // 5 
        dest[d++] = (byte)alphabets[(p & MASK_3BITS) << 2 | (p=src[s++]) >>> 6 & MASK_2BITS]; // 3 2
        dest[d++] = (byte)alphabets[p >>> 1 & MASK_5BITS];                                    //   5
        dest[d++] = (byte)alphabets[(p & 1) << 4 | (p=src[s]) >>> 4 & MASK_4BITS];            //   1 4
        dest[d++] = (byte)alphabets[(p & MASK_4BITS) << 1];                                   //     4
        
        for (int i=0; i < 3; i++)
            dest[d++] = PAD;                                                                       
        return;
    }
    
    private final void encode2bytes(byte[] src, int s, byte[] dest, int d) {
        // operator precedence in descending order: >>> or <<, &, |
        byte p;
        dest[d++] = (byte)alphabets[(p=src[s++]) >>> 3 & MASK_5BITS];                         // 5 
        dest[d++] = (byte)alphabets[(p & MASK_3BITS) << 2 | (p=src[s]) >>> 6 & MASK_2BITS];   // 3 2
        dest[d++] = (byte)alphabets[p >>> 1 & MASK_5BITS];                                    //   5
        dest[d++] = (byte)alphabets[(p & 1) << 4];                                            //   1
        
        for (int i=0; i < 4; i++)
            dest[d++] = PAD;                                                                       
        return;
    }
    
    private final void encode1byte(byte[] src, int s, byte[] dest, int d) {
        // operator precedence in descending order: >>> or <<, &, |
        byte p;
        dest[d++] = (byte)alphabets[(p=src[s]) >>> 3 & MASK_5BITS];                            // 5 
        dest[d++] = (byte)alphabets[(p & MASK_3BITS) << 2];                                    // 3
        
        for (int i=0; i < 6; i++)
            dest[d++] = PAD;                                                                       
        return;
    }
    
    private final void decode5bytes(byte[] src, int s, byte[] dest, int d) {
        int p=0;
        // operator precedence in descending order: >>> or <<, &, |
        dest[d++] = (byte)
                    (
                        pos(src[s++]) << 3
                        | (p=pos(src[s++])) >>> 2 & MASK_3BITS
                    )
                    ;                                               // 5 3
        dest[d++] = (byte)
                    (
                        (p & MASK_2BITS) << 6
                        | pos(src[s++]) << 1 
                        | (p=pos(src[s++])) >>> 4 & 1
                    )
                    ;                                               //   2 5 1
        dest[d++] = (byte)
                    (
                        (p & MASK_4BITS) << 4 
                        | (p=pos(src[s++])) >>> 1 & MASK_4BITS
                    )
                    ;                                               //       4 4
        dest[d++] = (byte)
                    (
                        (p & 1) << 7
                        | pos(src[s++]) << 2
                        | (p=pos(src[s++])) >>> 3 & MASK_2BITS
                    )
                    ;                                               //         1 5 2
        dest[d]   = (byte)
                    (
                        (p & MASK_3BITS) << 5 
                        | pos(src[s])
                    );                                              //             3 5
        return;
    }
    
    /**
     * @param n the number of final quantum in bytes to decode into.  Ranges from 1 to 4, inclusive.
     */
    private final void decode1to4bytes(int n, byte[] src, int s, byte[] dest, int d) {
        int p=0;
        // operator precedence in descending order: >>> or <<, &, |
        dest[d++] = (byte)
                    (
                        pos(src[s++]) << 3
                        | (p=pos(src[s++])) >>> 2 & MASK_3BITS
                    )
                    ;                                               // 5 3
        if (n == 1) {
            sanityCheckLastPos(p, MASK_2BITS);
            return;
        }
        
        dest[d++] = (byte)
                    (
                        (p & MASK_2BITS) << 6
                        | (pos(src[s++])) << 1 
                        | (p=pos(src[s++])) >>> 4 & 1
                    )
                    ;                                               //   2 5 1
        if (n == 2) {
            sanityCheckLastPos(p, MASK_4BITS);
            return;
        }
        
        dest[d++] = (byte)
                    (
                        (p & MASK_4BITS) << 4 
                        | (p=pos(src[s++])) >>> 1 & MASK_4BITS
                    )
                    ;                                               //       4 4
        if (n == 3) {
            sanityCheckLastPos(p, 1);
            return;
        }
        
        dest[d]   = (byte)
                    (
                        (p & 1) << 7
                        | pos(src[s++]) << 2
                        | (p=pos(src[s])) >>> 3 & MASK_2BITS
                    )
                    ;                                               //         1 5 2
        sanityCheckLastPos(p, MASK_3BITS);
        return;
    }
    
    @Override
    public final byte[] decode(byte[] src, final int length) 
    {
        if (length % 8 != 0)
            throw new IllegalArgumentException
            ("Input is expected to be encoded in multiple of 8 bytes but found: " + length);

        int pads=0;
        int last = length-1;
        
        // max possible padding in b32 encoding is 6
        for (; pads < 6 && last > -1; last--, pads++) {
            if (src[last] != PAD)
                break;
        }
        
        final int fq; // final quantum in unit of bytes
        
        switch(pads) {
            case 0:
                fq=5;
                break; // final quantum of encoding input is an integral multiple of 40 bits
            case 1:
                fq=4;
                break; // final quantum of encoding input is exactly 32 bits
            case 3:
                fq=3;
                break; // final quantum of encoding input is exactly 24 bits
            case 4:
                fq=2;
                break; // final quantum of encoding input is exactly 16 bits
            case 6:
                fq=1;
                break; // final quantum of encoding input is exactly 8 bits
            default:
                throw new IllegalArgumentException("Invalid number of paddings " + pads);
        }
        final byte[] dest = new byte[length / 8 * 5 - (5-fq)]; 
        int s=0, d=0;
        
        // % has a higher precedence than - than <
        for (; d < dest.length - fq%5; s+=8,d+=5)
            decode5bytes(src, s, dest, d);

        if (fq < 5)
            decode1to4bytes(fq, src, s, dest, d);
        return dest;
    }
    
    protected abstract int pos(byte in);
}
