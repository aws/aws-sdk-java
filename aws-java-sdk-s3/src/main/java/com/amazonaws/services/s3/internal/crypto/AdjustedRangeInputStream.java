/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.crypto;

import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.util.IOUtils;

/**
 * Reads only a specific range of bytes from the underlying input stream.
 */
public class AdjustedRangeInputStream extends SdkInputStream {
    private InputStream decryptedContents;
    private long virtualAvailable;
    private boolean closed;

    /**
     * Creates a new DecryptedContentsInputStream object.
     *
     * @param objectContents
     *      The input stream containing the object contents retrieved from S3
     * @param rangeBeginning
     *      The position of the left-most byte desired by the user
     * @param rangeEnd
     *      The position of the right-most byte desired by the user
     * @throws IOException
     *      If there are errors skipping to the left-most byte desired by the user.
     */
    public AdjustedRangeInputStream(InputStream objectContents, long rangeBeginning, long rangeEnd) throws IOException {
        this.decryptedContents = objectContents;
        this.closed = false;
        initializeForRead(rangeBeginning, rangeEnd);
    }

    /**
     * Skip to the start location of the range of bytes desired by the user.
     */
    private void initializeForRead(long rangeBeginning, long rangeEnd) throws IOException {
        // To get to the left-most byte desired by a user, we must skip over the 16 bytes of the
        // preliminary cipher block, and then possibly skip a few more bytes into the next block
        // to where the the left-most byte is located.
        int numBytesToSkip;
        if(rangeBeginning < JceEncryptionConstants.SYMMETRIC_CIPHER_BLOCK_SIZE) {
            numBytesToSkip = (int)rangeBeginning;
        } else {
            int offsetIntoBlock = (int)(rangeBeginning % JceEncryptionConstants.SYMMETRIC_CIPHER_BLOCK_SIZE);
            numBytesToSkip = JceEncryptionConstants.SYMMETRIC_CIPHER_BLOCK_SIZE + offsetIntoBlock;
        }
        if(numBytesToSkip != 0) {
            // Skip to the left-most desired byte.  The read() method is used instead of the skip() method
            // since the skip() method will not block if the underlying input stream is waiting for more input.
            while(numBytesToSkip > 0) {
                this.decryptedContents.read();
                numBytesToSkip--;
            }
        }
        // The number of bytes the user may read is equal to the number of the bytes in the range.
        // Note that the range includes the endpoints.
        this.virtualAvailable = (rangeEnd - rangeBeginning) + 1;
    }

    /* (non-Javadoc)
     * @see java.io.InputStream#read()
     */
    @Override
    public int read() throws IOException {
        abortIfNeeded();
        int result;
        // If there are no more available bytes, mark that we are at the end of the stream.
        if (this.virtualAvailable <= 0) {
            result = -1;
        } else {
            // Otherwise, read a byte.
            result = this.decryptedContents.read();
        }

        // If we have not reached the end of the stream, decrement the number of available bytes.
        if (result != -1) {
            this.virtualAvailable--;
        } else {
            // If we are at the end of the stream, close it.
            this.virtualAvailable = 0;
            close();
        }

        return result;
    }

    /* (non-Javadoc)
     * @see java.io.InputStream#read(byte[], int, int)
     */
    @Override
    public int read(byte[] buffer, int offset, int length) throws IOException {
        abortIfNeeded();
        int numBytesRead;
        // If no more bytes are available, do not read any bytes into the buffer
        if(this.virtualAvailable <= 0) {
            numBytesRead = -1;
        } else {
            // If the desired read length is greater than the number of available bytes,
            // shorten the read length to the number of available bytes.
            if(length > this.virtualAvailable) {
                // If the number of available bytes is greater than the maximum value of a 32 bit int, then
                // read as many bytes as an int can.
                length = (this.virtualAvailable < Integer.MAX_VALUE) ? (int)this.virtualAvailable : Integer.MAX_VALUE;
            }
            // Read bytes into the buffer.
            numBytesRead = this.decryptedContents.read(buffer, offset, length);
        }
        // If we were able to read bytes, decrement the number of bytes available to be read.
        if(numBytesRead != -1) {
            this.virtualAvailable -= numBytesRead;
        } else {
            // If we've reached the end of the stream, close it
            this.virtualAvailable = 0;
            close();
        }
        return numBytesRead;
    }

    /* (non-Javadoc)
     * @see java.io.InputStream#available()
     */
    @Override
    public int available() throws IOException {
        abortIfNeeded();
        int available = this.decryptedContents.available();
        if(available < this.virtualAvailable) {
            return available;
        } else {
            // Limit the number of bytes available to the number
            // of bytes remaining in the range.
            return (int)this.virtualAvailable;
        }
    }

    /* (non-Javadoc)
     * @see java.io.InputStream#close()
     */
    @Override
    public void close() throws IOException {
        // If not already closed, then close the input stream.
        if(!this.closed) {
            this.closed = true;
            // if the user read to the end of the virtual stream, then drain
            // the wrapped stream so the HTTP client can keep this connection
            // alive if possible.
            // This should not have too much overhead since if we've reached the
            // end of the virtual stream, there should be at most 31 bytes left
            // (2 * JceEncryptionConstants.SYMMETRIC_CIPHER_BLOCK_SIZE - 1) in the
            // stream.
            // See: S3CryptoModuleBase#getCipherBlockUpperBound
             if (this.virtualAvailable == 0) {
                 IOUtils.drainInputStream(decryptedContents);
            }
            this.decryptedContents.close();
        }
        abortIfNeeded();
    }

    @Override
    protected InputStream getWrappedInputStream() {
        return decryptedContents;
    }
}
