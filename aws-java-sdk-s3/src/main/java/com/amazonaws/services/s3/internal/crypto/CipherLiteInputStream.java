/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

import com.amazonaws.internal.SdkFilterInputStream;

/**
 * @author Hanson Char
 * 
 * @see CipherLite
 * @see GCMCipherLite
 */
public class CipherLiteInputStream extends SdkFilterInputStream {
    private static final int MAX_RETRY = 1000;
    private static final int DEFAULT_IN_BUFFER_SIZE = 512;
    private CipherLite cipherLite;
    /**
     * True if this input stream is currently involved in a multipart uploads;
     * false otherwise. For multipart uploads, the doFinal method if the
     * underlying cipher has to be triggered via the read methods rather than
     * the close method, since we cann't tell if closing the input stream is due
     * to a recoverable error (in which case the cipher's doFinal method should
     * never be called) or normal completion (where the cipher's doFinal method
     * would need to be called if it was not a multipart upload).
     */
    private final boolean multipart;
    /**
     * True if this is the last part of a multipart upload; false otherwise.
     */
    private final boolean lastMultiPart;
    private boolean eof;
    private byte[] bufin;
    private byte[] bufout;
    private int curr_pos;
    private int max_pos;

    public CipherLiteInputStream(InputStream is, CipherLite cipherLite) {
        this(is, cipherLite, DEFAULT_IN_BUFFER_SIZE, false, false);
    }

    public CipherLiteInputStream(InputStream is, CipherLite c, int buffsize) {
        this(is, c, buffsize, false, false);
    }

    public CipherLiteInputStream(InputStream is, CipherLite c, int buffsize,
            boolean multipart, boolean lastMultiPart) {
        super(is);
        if (lastMultiPart && !multipart)
            throw new IllegalArgumentException("lastMultiPart can only be true if multipart is true");
        this.multipart = multipart;
        this.lastMultiPart = lastMultiPart;
        this.cipherLite = c;
        if (buffsize <= 0 || (buffsize % DEFAULT_IN_BUFFER_SIZE) != 0) {
            throw new IllegalArgumentException("buffsize (" + buffsize
                    + ") must be a positive multiple of "
                    + DEFAULT_IN_BUFFER_SIZE);
        }
        this.bufin = new byte[buffsize];
    }

    protected CipherLiteInputStream(InputStream is) {
        this(is, CipherLite.Null, DEFAULT_IN_BUFFER_SIZE, false, false);
    }

    @Override public int read() throws IOException {
        if (curr_pos >= max_pos) {
            if (eof)
                return -1;
            int count = 0;
            int len;
            do { 
                if (count > MAX_RETRY)
                    throw new IOException("exceeded maximum number of attempts to read next chunk of data");
                len = nextChunk();
                count++;
            } while (len == 0);

            if (len == -1)
                return -1;
        }
        return ((int) bufout[curr_pos++] & 0xFF);
    };


    @Override public int read(byte b[]) throws IOException {
        return read(b, 0, b.length);
    }

    @Override
    public int read(byte buf[], int off, int target_len) throws IOException {
        if (curr_pos >= max_pos) {
            // all buffered data has been read, let's get some more
            if (eof)
                return -1;
            int count=0;
            int len;
            do {
                if (count > MAX_RETRY)
                    throw new IOException("exceeded maximum number of attempts to read next chunk of data");
                len = nextChunk();
                count++;
            } while (len == 0);

            if (len == -1)
                return -1;
        }
        if (target_len <= 0)
            return 0;
        int len = max_pos - curr_pos;
        if (target_len < len)
            len = target_len;
        // if buf == null, will throw NPE as intended per javadoc
        System.arraycopy(bufout, curr_pos, buf, off, len);
        curr_pos += len;
        return len;
    }

    /**
     * {@inheritDoc}
     * <p>
     * Note: This implementation will only skip up to the end of the buffered
     * data, potentially skipping 0 bytes.
     */
    @Override public long skip(long n) throws IOException {
        abortIfNeeded();
        int available = max_pos - curr_pos;
        if (n > available)
            n = available;
        if (n < 0)
            return 0;
        curr_pos += n;
        return n;
    }

    @Override public int available() {
        abortIfNeeded();
        return max_pos - curr_pos; 
    }

    @Override public void close() throws IOException {
        in.close();
        // For multipart upload the doFinal has to be triggered via the read
        // methods, since we cann't tell if the close is due to error or normal
        // completion.
        if (!multipart) {
            if (!S3CryptoScheme.isAesGcm(cipherLite.getCipherAlgorithm())) {
                try {
                    // simulate the RI: throw away the unprocessed data
                    cipherLite.doFinal();
                } catch (BadPaddingException ex) {
                } catch (IllegalBlockSizeException ex) {
                }
            }
        }
        curr_pos = max_pos = 0;
        abortIfNeeded();
    }

    @Override
    public boolean markSupported() {
        abortIfNeeded();
        return in.markSupported() && cipherLite.markSupported();
    }

    @Override
    public void mark(int readlimit) {
        abortIfNeeded();
        in.mark(readlimit);
        cipherLite.mark();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Subclassing this method would need to take care in keeping all internal
     * states consistent.  REF: TT0036173414, ISSUE-JAVA-547.
     */
    @Override
    public void reset() throws IOException {
        abortIfNeeded();
        in.reset();
        cipherLite.reset();
        resetInternal();
    }

    final void resetInternal() {
        curr_pos = max_pos = 0;
        eof = false;
    }

    /**
     * Reads and process the next chunk of data into memory.
     * 
     * @return the length of the data chunk read and processed, or -1 if end of
     *         stream.
     * @throws IOException
     *             if there is an IO exception from the underlying input stream
     * 
     * @throws SecurityException
     *             if there is authentication failure
     */
    private int nextChunk() throws IOException {
        abortIfNeeded();
        if (eof)
            return -1;
        bufout = null;
        int len = in.read(bufin);
        if (len == -1) {
            eof = true;
            // Skip doFinal if it's a multi-part upload but not the last part 
            if (!multipart || lastMultiPart) {
                try {
                    bufout = cipherLite.doFinal();
                    if (bufout == null) {
                        // bufout can be null, for example, when it was the
                        // javax.crypto.NullCipher 
                        return -1;
                    }
                    curr_pos = 0;
                    return max_pos = bufout.length;
                } catch (IllegalBlockSizeException ignore) {
                    // like the RI
                } catch (BadPaddingException e) {
                    if (S3CryptoScheme.isAesGcm(cipherLite.getCipherAlgorithm()))
                        throw new SecurityException(e);
                }
            }
            return -1;
        }
        bufout = cipherLite.update(bufin, 0, len);
        curr_pos = 0;
        return max_pos = (bufout == null ? 0 : bufout.length);
    }

    void renewCipherLite() {
        cipherLite = cipherLite.recreate();
    }
}
