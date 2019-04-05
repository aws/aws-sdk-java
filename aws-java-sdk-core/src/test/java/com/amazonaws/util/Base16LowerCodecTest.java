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
public class Base16LowerCodecTest
{
    @Test
    public void testVectorsPerRfc4648()
        throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
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
                "66",
                "666f",
                "666f6f",
                "666f6f62",
                "666f6f6261",
                "666f6f626172",
        };
        for (int i=0; i < testVectors.length; i++) {
            String data = testVectors[i];
            byte[] source = data.getBytes("UTF-8");
            String b16encoded = Base16Lower.encodeAsString(data.getBytes("UTF-8"));
            Assert.assertEquals(expected[i], b16encoded);
            byte[] b16 = b16encoded.getBytes("UTF-8");

            byte[] decoded = Base16.decode(b16);
            Assert.assertTrue(Arrays.equals(source, decoded));
            decoded = Base16Lower.decode(b16);
            Assert.assertTrue(Arrays.equals(source, decoded));
        }
    }

    @Test
    public void testCodecConsistency()
        throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        byte[] decoded = null;

        for (int h=0; h < 1000; h++) {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(
                UUID.randomUUID().toString().getBytes("UTF-8")
            );
            String b16Encoded = Base16Lower.encodeAsString(digest);
            {
                decoded = Base16.decode(b16Encoded);
                Assert.assertTrue(Arrays.equals(decoded, digest));
                decoded = Base16Lower.decode(b16Encoded);
                Assert.assertTrue(Arrays.equals(decoded, digest));
            }
            {   // test decoding case insensitivity
                decoded = Base16.decode(b16Encoded.toLowerCase());
                Assert.assertTrue(Arrays.equals(decoded, digest));
                decoded = Base16Lower.decode(b16Encoded.toLowerCase());
                Assert.assertTrue(Arrays.equals(decoded, digest));
            }
        }
    }
}
