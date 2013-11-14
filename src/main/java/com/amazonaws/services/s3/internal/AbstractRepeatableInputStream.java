/*
 * Copyright 2013-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.internal.SdkFilterInputStream;

/**
 * Abstract base class for input stream wrappers that add support for
 * mark/resetting streams that don't natively support it. Implementations must
 * provide their own support for reopening streams and rereading to the last
 * marked position.
 */
public abstract class AbstractRepeatableInputStream extends SdkFilterInputStream {

    private static final Log log = LogFactory.getLog(AbstractRepeatableInputStream.class);

    private long bytesReadPastMarkPoint = 0;
    private long markPoint = 0;

    protected AbstractRepeatableInputStream(InputStream in) {
        super(in);
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public synchronized void mark(int readlimit) {
        this.markPoint += bytesReadPastMarkPoint;
        this.bytesReadPastMarkPoint = 0;
        if (log.isDebugEnabled()) {
            log.debug("Input stream marked at " + this.markPoint + " bytes");
        }
    }

    protected abstract void reopenWrappedStream() throws IOException;

    @Override
    public synchronized void reset() throws IOException {
        reopenWrappedStream();

        long skipped = 0;
        long toSkip = markPoint;
        while (toSkip > 0) {
            skipped = skip(toSkip);
            toSkip -= skipped;
        }

        if (log.isDebugEnabled()) {
            log.debug("Reseting to mark point " + markPoint
                    + " after returning " + bytesReadPastMarkPoint + " bytes");
        }

        this.bytesReadPastMarkPoint = 0;
    }

    @Override
    public int read() throws IOException {
        int byteRead = super.read();
        if (byteRead != -1) {
            bytesReadPastMarkPoint++;
            return byteRead;
        } else {
            return -1;
        }
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int count = super.read(b, off, len);
        bytesReadPastMarkPoint += count;
        return count;
    }

    @Override
    public long skip(long n) throws IOException {
        long skipped = super.skip(n);
        bytesReadPastMarkPoint += skipped;
        return skipped;
    }

}
