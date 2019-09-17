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
 * A Base 32 codec API.
 * 
 * See http://www.ietf.org/rfc/rfc4648.txt
 * 
 * @author Hanson Char
 */
public enum Base32 {
    ;
    private static final Base32Codec codec = new Base32Codec();
    
    /**
     * Returns a base 32 encoded string of the given bytes.
     */
    public static String encodeAsString(byte ... bytes) {
        if (bytes == null)
            return null;
        return bytes.length == 0 ? "" : CodecUtils.toStringDirect(codec.encode(bytes)); 
    }
    
    /**
     * Returns a 32 encoded byte array of the given bytes.
     */
    public static byte[] encode(byte[] bytes) { return bytes == null || bytes.length == 0 ? bytes : codec.encode(bytes); }
    
    /** 
     * Decodes the given base 32 encoded string,
     * skipping carriage returns, line feeds and spaces as needed.
     */
    public static byte[] decode(String b32) {
        if (b32 == null)
            return null;
        if (b32.length() == 0)
            return new byte[0];
        byte[] buf = new byte[b32.length()];
        int len = CodecUtils.sanitize(b32, buf);
        return codec.decode(buf, len);
    }
    
    /** 
     * Decodes the given base 32 encoded bytes.
     */
    public static byte[] decode(byte[] b32) { return b32 == null || b32.length == 0 ? b32 :  codec.decode(b32, b32.length); }
}
