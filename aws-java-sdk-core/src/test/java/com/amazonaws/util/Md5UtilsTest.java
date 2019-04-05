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

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class Md5UtilsTest {

    @Test
    public void testBytes() {
        byte[] md5 = Md5Utils.computeMD5Hash("Testing MD5".getBytes(StringUtils.UTF8));
        assertEquals("0b4f503b8eb7714ce12402406895cf68", StringUtils.lowerCase(Base16.encodeAsString(md5)));

        String b64 = Md5Utils.md5AsBase64("Testing MD5".getBytes(StringUtils.UTF8));
        assertEquals("C09QO463cUzhJAJAaJXPaA==", b64);
    }

    @Test
    public void testStream() throws IOException {
        byte[] md5 = Md5Utils.computeMD5Hash(new ByteArrayInputStream("Testing MD5".getBytes(StringUtils.UTF8)));
        assertEquals("0b4f503b8eb7714ce12402406895cf68", StringUtils.lowerCase(Base16.encodeAsString(md5)));

        String b64 = Md5Utils.md5AsBase64(new ByteArrayInputStream("Testing MD5".getBytes(StringUtils.UTF8)));
        assertEquals("C09QO463cUzhJAJAaJXPaA==", b64);
    }

    @Test
    public void testFile() throws Exception {
        File f = File.createTempFile("Md5UtilsTest-", "txt");
        f.deleteOnExit();
        FileUtils.writeStringToFile(f, "Testing MD5");
        byte[] md5 = Md5Utils.computeMD5Hash(f);
        assertEquals("0b4f503b8eb7714ce12402406895cf68", StringUtils.lowerCase(Base16.encodeAsString(md5)));

        String b64 = Md5Utils.md5AsBase64(f);
        assertEquals("C09QO463cUzhJAJAaJXPaA==", b64);
    }
}
