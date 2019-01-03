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

/**
 * A specific kind of {@link CipherLiteInputStream} that supports partial
 * mark-and-reset in the sense that, if the underlying input stream supports
 * mark-and-reset, this input stream can then be marked at and get reset back to
 * the very beginning of the stream (but not anywhere else).
 */
public final class RenewableCipherLiteInputStream extends CipherLiteInputStream {
    private boolean hasBeenAccessed;

    public RenewableCipherLiteInputStream(InputStream is, CipherLite cipherLite) {
        super(is, cipherLite);
    }

    public RenewableCipherLiteInputStream(InputStream is, CipherLite c,
            int buffsize) {
        super(is, c, buffsize);
    }

    public RenewableCipherLiteInputStream(InputStream is, CipherLite c,
            int buffsize, boolean multipart, boolean lastMultiPart) {
        super(is, c, buffsize, multipart, lastMultiPart);
    }

    protected RenewableCipherLiteInputStream(InputStream is) {
        super(is);
    }

    /**
     * Mark and reset is currently only partially supported, in the sense that,
     * if the underlying input stream supports mark-and-reset, this input stream
     * can then be marked at and get reset back to the very beginning of the
     * stream (but not anywhere else).
     */
    @Override
    public boolean markSupported() {
        abortIfNeeded();
        return in.markSupported();
    }

    /**
     * Mark and reset is currently only partially supported, in the sense that,
     * if the underlying input stream supports mark-and-reset, this input stream
     * can then be marked at and get reset back to the very beginning of the
     * stream (but not anywhere else).
     * 
     * @throws UnsupportedOperationException
     *             if mark is called after this stream has been accessed.
     */
    @Override
    public void mark(final int readlimit) {
        abortIfNeeded();
        if (hasBeenAccessed) {
            throw new UnsupportedOperationException(
                    "Marking is only supported before your first call to "
                            + "read or skip.");
        }
        in.mark(readlimit);
    }

    /**
     * Resets back to the very beginning of the stream.
     * <p>
     * Mark and reset is currently only partially supported, in the sense that,
     * if the underlying input stream supports mark-and-reset, this input stream
     * can then be marked at and get reset back to the very beginning of the
     * stream (but not anywhere else).
     */
    @Override
    public void reset() throws IOException {
        abortIfNeeded();
        in.reset();
        renewCipherLite();
        resetInternal();
        hasBeenAccessed = false;
    }

    @Override
    public int read() throws IOException {
        hasBeenAccessed = true;
        return super.read();
    }

    @Override
    public int read(final byte[] b) throws IOException {
        hasBeenAccessed = true;
        return super.read(b);
    }

    @Override
    public int read(final byte[] b, final int off, final int len)
            throws IOException {
        hasBeenAccessed = true;
        return super.read(b, off, len);
    }

    @Override
    public long skip(final long n) throws IOException {
        hasBeenAccessed = true;
        return super.skip(n);
    }
}
