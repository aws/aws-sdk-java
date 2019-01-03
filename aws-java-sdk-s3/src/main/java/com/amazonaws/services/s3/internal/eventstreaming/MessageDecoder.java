/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.ArrayList;
import java.util.List;

public final class MessageDecoder {
    private ByteBuffer buf;

    public MessageDecoder() {
        this.buf = ByteBuffer.allocate(128 * 1024);
    }

    public boolean hasPendingContent() {
        return buf.position() != 0;
    }

    public List<Message> feed(byte[] bytes) {
        return feed(bytes, 0, bytes.length);
    }

    public List<Message> feed(byte[] bytes, int offset, int length) {
        buf.put(bytes, offset, length);
        ByteBuffer readView = (ByteBuffer) buf.duplicate().flip();
        int bytesConsumed = 0;

        List<Message> result = new ArrayList<Message>();
        while (readView.remaining() >= 15) {
            int totalMessageLength = Utils.toIntExact(Prelude.decode(readView.duplicate()).getTotalLength());

            if (readView.remaining() >= totalMessageLength) {
                Message decoded = Message.decode(readView);
                result.add(decoded);
                bytesConsumed += totalMessageLength;
            } else {
                break;
            }
        }

        if (bytesConsumed > 0) {
            buf.flip();
            buf.position(buf.position() + bytesConsumed);
            buf.compact();
        }

        return result;
    }
}
