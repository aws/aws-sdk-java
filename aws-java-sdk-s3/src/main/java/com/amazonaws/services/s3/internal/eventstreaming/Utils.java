/*
 * Copyright 2017-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.eventstreaming;

import com.amazonaws.util.StringUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

final class Utils {
    private Utils() {}

    static int toIntExact(long headersLength) {
        if ((int) headersLength != headersLength) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) headersLength;
    }

    static long toUnsignedLong(int x) {
        return ((long) x) & 0xffffffffL;
    }

    static String readShortString(ByteBuffer buf) {
        int length = buf.get() & 0xFF;
        checkStringBounds(length, 255);
        byte[] bytes = new byte[length];
        buf.get(bytes);
        return new String(bytes, StringUtils.UTF8);
    }

    static String readString(ByteBuffer buf) {
        int length = buf.getShort() & 0xFFFF;
        checkStringBounds(length, 32767);
        byte[] bytes = new byte[length];
        buf.get(bytes);
        return new String(bytes, StringUtils.UTF8);
    }

    static byte[] readBytes(ByteBuffer buf) {
        int length = buf.getShort() & 0xFFFF;
        checkByteArrayBounds(length);
        byte[] bytes = new byte[length];
        buf.get(bytes);
        return bytes;
    }

    static void writeShortString(DataOutputStream dos, String string) throws IOException {
        byte[] bytes = string.getBytes(StringUtils.UTF8);
        checkStringBounds(bytes.length, 255);
        dos.writeByte(bytes.length);
        dos.write(bytes);
    }

    static void writeString(DataOutputStream dos, String string) throws IOException {
        byte[] bytes = string.getBytes(StringUtils.UTF8);
        checkStringBounds(bytes.length, 32767);
        writeBytes(dos, bytes);
    }

    static void writeBytes(DataOutputStream dos, byte[] bytes) throws IOException {
        checkByteArrayBounds(bytes.length);
        dos.writeShort((short) bytes.length);
        dos.write(bytes);
    }

    private static void checkByteArrayBounds(int length) {
        if (length == 0) {
            throw new IllegalArgumentException("Byte arrays may not be empty");
        }
        if (length > 32767) {
            throw new IllegalArgumentException("Illegal byte array length: " + length);
        }
    }

    private static void checkStringBounds(int length, int maxLength) {
        if (length == 0) {
            throw new IllegalArgumentException("Strings may not be empty");
        }
        if (length > maxLength) {
            throw new IllegalArgumentException("Illegal string length: " + length);
        }
    }
}
