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
import java.io.IOException;
import java.util.zip.CRC32;

import org.junit.Test;

/**
 * Test CRC32ChecksumInputStream can calculate CRC32 checksum correctly.
 */
public class CRC32ChecksumInputStreamTest {

    private final String TEST_DARA = "Jason, Yifei, Zach";

    @Test
    public void testCRC32Checksum() throws IOException {
        CRC32 crc32 = new CRC32();
        crc32.update(TEST_DARA.getBytes());
        long expectedCRC32Checksum = crc32.getValue();
        CRC32ChecksumCalculatingInputStream crc32InputStream = new CRC32ChecksumCalculatingInputStream(new ByteArrayInputStream(TEST_DARA.getBytes()));
        while(crc32InputStream.read() != -1);
        assertEquals(expectedCRC32Checksum, crc32InputStream.getCRC32Checksum());
    }

}
