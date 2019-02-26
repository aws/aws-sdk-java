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

import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

import static java.lang.String.format;

final class Prelude {
    static final int LENGTH = 8;
    static final int LENGTH_WITH_CRC = LENGTH + 4;

    private final int totalLength;
    private final long headersLength;

    private Prelude(int totalLength, long headersLength) {
        this.totalLength = totalLength;
        this.headersLength = headersLength;
    }

    static Prelude decode(ByteBuffer buf) {
        buf = buf.duplicate();

        long computedPreludeCrc = computePreludeCrc(buf);

        long totalLength = intToUnsignedLong(buf.getInt());
        long headersLength = intToUnsignedLong(buf.getInt());
        long wirePreludeCrc = intToUnsignedLong(buf.getInt());
        if (computedPreludeCrc != wirePreludeCrc) {
            throw new IllegalArgumentException(format("Prelude checksum failure: expected 0x%x, computed 0x%x",
                wirePreludeCrc, computedPreludeCrc));
        }

        if (headersLength < 0 || headersLength > 131072) {
            throw new IllegalArgumentException("Illegal headers_length value: " + headersLength);
        }

        long payloadLength = (totalLength - headersLength) - Message.MESSAGE_OVERHEAD;
        if (payloadLength < 0 || payloadLength > 16777216) {
            throw new IllegalArgumentException("Illegal payload size: " + payloadLength);
        }

        return new Prelude(toIntExact(totalLength), headersLength);
    }

    private static long intToUnsignedLong(int i) {
        return ((long) i) & 0xffffffffL;
    }

    private static int toIntExact(long value) {
        if ((int) value != value) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) value;
    }

    private static long computePreludeCrc(ByteBuffer buf) {
        byte[] prelude = new byte[Prelude.LENGTH];
        buf.duplicate().get(prelude);

        Checksum crc = new CRC32();
        crc.update(prelude, 0, prelude.length);
        return crc.getValue();
    }

    int getTotalLength() {
        return totalLength;
    }

    long getHeadersLength() {
        return headersLength;
    }
}
