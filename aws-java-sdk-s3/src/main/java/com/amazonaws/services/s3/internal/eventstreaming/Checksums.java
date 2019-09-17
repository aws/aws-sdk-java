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
import java.util.zip.Checksum;

final class Checksums {
    private Checksums() {}

    static void update(Checksum checksum, ByteBuffer buffer) {
        if (buffer.hasArray()) {
            int pos = buffer.position();
            int off = buffer.arrayOffset();
            int limit = buffer.limit();
            int rem = limit - pos;
            checksum.update(buffer.array(), pos + off, rem);
            buffer.position(limit);
        } else {
            int length = buffer.remaining();
            byte[] b = new byte[length];
            buffer.get(b, 0, length);
            checksum.update(b, 0, length);
        }
    }
}
