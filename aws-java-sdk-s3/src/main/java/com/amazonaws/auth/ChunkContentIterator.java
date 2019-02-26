/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

class ChunkContentIterator {

    private final byte[] signedChunk;
    private int pos;

    public ChunkContentIterator(byte[] signedChunk) {
        this.signedChunk = signedChunk;
    }

    public boolean hasNext() {
        return pos < signedChunk.length;
    }

    public int read(byte[] output, int offset, int length) {
        if (length == 0)
            return 0;
        if ( !hasNext() )
            return -1;
        int remaingBytesNum = signedChunk.length - pos;
        int bytesToRead = Math.min(remaingBytesNum, length);
        System.arraycopy(signedChunk, pos, output, offset, bytesToRead);
        pos += bytesToRead;
        return bytesToRead;
    }
}
