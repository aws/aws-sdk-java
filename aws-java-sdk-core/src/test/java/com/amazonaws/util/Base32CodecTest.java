/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author hchar
 */
public class Base32CodecTest 
{
    // The last character 'L' before the padding characters is not possible
    // in this b32 encoded string.
    // Thanks to srikamur on providing this test string.
    private static final String INVALID_B32_STRING = "C5CYMIHWQUUZMKUGZHGEOSJSQDE4L===";
    private static final String VALID_B32_STRING = "C5CYMIHWQUUZMKUGZHGEOSJSQDE4K===";
    private static final String VALID_B32_STRING2 = "C5CYMIHWQUUZMKUGZHGEOSJSQDE4LAAA";
    
    @Test(expected=IllegalArgumentException.class)
    public void testInvalidLastChar() {
        Base32.decode(INVALID_B32_STRING);
    }
    
//    @Test
//    public void testInvalidB32AgainstCommons() {
//        org.apache.commons.codec.binary.Base32 commonsB32 = new org.apache.commons.codec.binary.Base32(0);
//        // Commons B32 Decoder would blindly decode the invalid B32 string! 
//        byte[] decoded = commonsB32.decode("QDE4L===");
//        String encoded = commonsB32.encodeToString(decoded);
//        Assert.assertEquals("QDE4K===", encoded);
//    }

    @Test
    public void testInvalidB32AgainstBitPedia() {
        // http://bitcollider.cvs.sourceforge.net/bitcollider/jbitcollider/plugins/org.bitpedia.collider.core/src/org/bitpedia/util/Base32.java?view=markup
        byte[] decoded = org.bitpedia.util.Base32.decode(INVALID_B32_STRING);
        // Also blindly decode the invalid B32 string but into different binary value 
        String encoded = org.bitpedia.util.Base32.encode(decoded);
        Assert.assertEquals(VALID_B32_STRING2, encoded);
    }

    @Test
    public void testValidLastChar() {
        byte[] decoded = Base32.decode(VALID_B32_STRING);
        String encoded = Base32.encodeAsString(decoded);
        Assert.assertEquals(VALID_B32_STRING, encoded);
    }

    @Test
    public void testValidLastChar2() {
        byte[] decoded = Base32.decode(VALID_B32_STRING2);
        String encoded = Base32.encodeAsString(decoded);
        Assert.assertEquals(VALID_B32_STRING2, encoded);
    }
    
    @Test
    public void test20bytes() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String data = "foobafoobafoobafooba";
        String b32encoded = Base32.encodeAsString(data.getBytes("UTF-8"));
        Assert.assertEquals("MZXW6YTBMZXW6YTBMZXW6YTBMZXW6YTB", b32encoded);
        {
            byte[] decoded = Base32.decode(b32encoded);
            Assert.assertEquals(data, new String(decoded, "UTF-8"));
        }
        {   // test decoding case insensitivity
            byte[] decoded = Base32.decode(b32encoded.toLowerCase());
            Assert.assertEquals(data, new String(decoded, "UTF-8"));
        }
    }
    
    @Test
    public void testVectorsPerRfc4648() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String[] testVectors = {
                "",
                "f",
                "fo",
                "foo",
                "foob",
                "fooba",
                "foobar",
        };
        String[] expected = {
                "",
                "MY======",
                "MZXQ====",
                "MZXW6===",
                "MZXW6YQ=",
                "MZXW6YTB",
                "MZXW6YTBOI======",
        };
        
        for (int i=0; i < testVectors.length; i++) {
            String data = testVectors[i];
            byte[] source = data.getBytes("UTF-8");
            String b32encoded = Base32.encodeAsString(data.getBytes("UTF-8"));
            Assert.assertEquals(expected[i], b32encoded);
            byte[] b32 = b32encoded.getBytes("UTF-8");
            
            byte[] decoded = Base32.decode(b32);
            Assert.assertTrue(Arrays.equals(source, decoded));
        }
    }
    
    @Test
    public void testCodecConsistency() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] decoded = null;         

        for (int h=0; h < 1000; h++) {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(UUID.randomUUID().toString().getBytes("UTF-8"));
            String b32Encoded = Base32.encodeAsString(digest);
            {
                decoded = Base32.decode(b32Encoded);
                Assert.assertTrue(Arrays.equals(decoded, digest));
            }
            {   // test decoding case insensitivity
                decoded = Base32.decode(b32Encoded.toLowerCase());
                Assert.assertTrue(Arrays.equals(decoded, digest));
            }
        }
    }

    @Test
    public void testImpossibleCases() {
        final String[] INVALIDLY_ENCODED = {
            "MC======",
            "MZXE====",
            "MZXWB===",
            "MZXW6YB=",
            "MZXW6YTBOC======",
        };
        for (String s: INVALIDLY_ENCODED) {
            try {
                Base32.decode(s);
                Assert.fail();
            } catch(IllegalArgumentException ex) {
                // expected
            }
        }
    }
}
