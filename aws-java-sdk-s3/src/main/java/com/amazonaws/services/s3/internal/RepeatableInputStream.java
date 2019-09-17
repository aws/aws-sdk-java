/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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
package com.amazonaws.services.s3.internal;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.internal.ResettableInputStream;
import com.amazonaws.internal.SdkBufferedInputStream;
import com.amazonaws.internal.SdkInputStream;

/**
 * @deprecated by {@link SdkBufferedInputStream}.
 * 
 * A repeatable input stream wrapper for any input stream. This input stream
 * relies on buffered data to repeat, and can therefore only be repeated when
 * less data has been read than this buffer can hold.
 * <p>
 * <b>Note:</b> Always use a {@link ResettableInputStream} instead of this
 * class if you are sourcing data from a file, as the file-based repeatable
 * input stream can be repeated without any limitations.
 */
@Deprecated
public class RepeatableInputStream extends SdkInputStream {
    private static final Log log = LogFactory.getLog(RepeatableInputStream.class);

    private InputStream is;
    private int bufferSize;
    private int bufferOffset;
    private long bytesReadPastMark;
    private byte[] buffer;
    private boolean hasWarnedBufferOverflow;

    /**
     * Creates a repeatable input stream based on another input stream.
     *
     * @param inputStream
     *            The input stream to wrap. The data read from the wrapped input
     *            stream is buffered as it is read, up to the buffer limit
     *            specified.
     * @param bufferSize
     *            The number of bytes buffered by this class.
     */
    public RepeatableInputStream(InputStream inputStream, int bufferSize) {
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream cannot be null");
        }

        this.is = inputStream;
        this.bufferSize = bufferSize;
        this.buffer = new byte[this.bufferSize];

        if (log.isDebugEnabled()) {
            log.debug("Underlying input stream will be repeatable up to "
                    + this.buffer.length + " bytes");
        }
    }

    /**
     * Resets the input stream to the beginning by pointing the buffer offset to
     * the beginning of the available data buffer.
     *
     * @throws IOException
     *             When the available buffer size has been exceeded, in which
     *             case the input stream data cannot be repeated.
     */
    public void reset() throws IOException {
        abortIfNeeded();
        if (bytesReadPastMark <= bufferSize) {
            if (log.isDebugEnabled()) {
                log.debug("Reset after reading " + bytesReadPastMark + " bytes.");
            }
            bufferOffset = 0;
        } else {
            throw new IOException(
                "Input stream cannot be reset as " + this.bytesReadPastMark
                + " bytes have been written, exceeding the available buffer size of " + this.bufferSize);
        }
    }

    /**
     * @see java.io.InputStream#markSupported()
     */
    public boolean markSupported() {
        return true;
    }

    /**
     * This method can only be used while less data has been read from the input
     * stream than fits into the buffer. The readLimit parameter is ignored
     * entirely.
     */
    public void mark(int readlimit) {
        abortIfNeeded();
        if (log.isDebugEnabled()) {
            log.debug("Input stream marked at " + bytesReadPastMark + " bytes");
        }
        if (bytesReadPastMark <= bufferSize && buffer != null) {
            /*
             * Clear buffer of already-read data to make more space. It's safe
             * to cast bytesReadPastMark to an int because it is known to be
             * less than bufferSize, which is an int.
             */
            byte[] newBuffer = new byte[this.bufferSize];
            System.arraycopy(buffer, bufferOffset, newBuffer, 0, (int)(bytesReadPastMark - bufferOffset));
            this.buffer = newBuffer;
            this.bytesReadPastMark -= bufferOffset;
            this.bufferOffset = 0;
        } else {
            // If mark is called after the buffer was already exceeded, create a new buffer.
            this.bufferOffset = 0;
            this.bytesReadPastMark = 0;
            this.buffer = new byte[this.bufferSize];
        }
    }

    /**
     * @see java.io.InputStream#available()
     */
    public int available() throws IOException {
        abortIfNeeded();
        return is.available();
    }

    /**
     * @see java.io.InputStream#close()
     */
    public void close() throws IOException {
        is.close();
        abortIfNeeded();
    }

    /**
     * @see java.io.InputStream#read(byte[], int, int)
     */
    public int read(byte[] out, int outOffset, int outLength) throws IOException {
        abortIfNeeded();
        // Check whether we already have buffered data.
        if (bufferOffset < bytesReadPastMark && buffer != null) {
            // Data is being repeated, so read from buffer instead of wrapped input stream.
            int bytesFromBuffer = outLength;
            if (bufferOffset + bytesFromBuffer > bytesReadPastMark) {
                bytesFromBuffer = (int) bytesReadPastMark - bufferOffset;
            }

            // Write to output.
            System.arraycopy(buffer, bufferOffset, out, outOffset, bytesFromBuffer);
            bufferOffset += bytesFromBuffer;
            return bytesFromBuffer;
        }

        // Read data from input stream.
        int count = is.read(out, outOffset, outLength);

        if (count <= 0) {
            return count;
        }

        // Fill the buffer with data, as long as we won't exceed its capacity.
        if (bytesReadPastMark + count <= bufferSize) {
            System.arraycopy(out, outOffset, buffer, (int) bytesReadPastMark, count);
            bufferOffset += count;
        } else {
            // We have exceeded the buffer capacity, after which point it is of no use. Free the memory.
            if (! hasWarnedBufferOverflow) {
                if (log.isDebugEnabled()) {
                    log.debug("Buffer size " + bufferSize + " has been exceeded and the input stream "
                            + "will not be repeatable until the next mark. Freeing buffer memory");
                }
                hasWarnedBufferOverflow = true;
            }

            buffer = null;
        }

        bytesReadPastMark += count;

        return count;
    }

    /**
     * @see java.io.InputStream#read()
     */
    public int read() throws IOException {
        abortIfNeeded();
        byte[] tmp = new byte[1];
        int count = read(tmp);
        if (count != -1) {
            int unsignedByte = (int) tmp[0] & 0xFF;
            return unsignedByte;
        } else {
            return count;
        }
    }

    @Override
    public InputStream getWrappedInputStream() {
        return is;
    }
}
