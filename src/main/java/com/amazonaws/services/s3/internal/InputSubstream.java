/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.internal.SdkFilterInputStream;

/**
 * Filtered input stream implementation that exposes a range of an input stream
 * as a new input stream.
 */
public final class InputSubstream extends SdkFilterInputStream {
	private long currentPosition;
	private final long requestedOffset;
	private final long requestedLength;
	private final boolean closeSourceStream;
	private long markedPosition = 0;

	/**
	 * Constructs a new InputSubstream so that when callers start reading from
	 * this stream they'll start at the specified offset in the real stream and
	 * after they've read the specified length, this stream will look empty.
	 * 
	 * @param in
	 *            The input stream to wrap.
	 * @param offset
	 *            The offset, in bytes, into the specified input stream at which
	 *            to start reading data.
	 * @param length
	 *            The length, in bytes, of the specified input stream to return
	 *            through this stream.
	 * @param closeSourceStream
	 *            True if the wrapped InputStream should be closed when this
	 *            InputSubstream is closed.
	 */
    public InputSubstream(InputStream in, long offset, long length, boolean closeSourceStream) {
    	super(in);
    	
    	this.currentPosition = 0;
    	this.requestedLength = length;
    	this.requestedOffset = offset;
    	this.closeSourceStream = closeSourceStream;
    }

    @Override
    public int read() throws IOException {
        byte[] b = new byte[1];
        int bytesRead = read(b, 0, 1);

        if (bytesRead == -1) return bytesRead;
        return b[0];
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        while (currentPosition < requestedOffset) {
            long skippedBytes = super.skip(requestedOffset - currentPosition);
            currentPosition += skippedBytes;
        }

        long bytesRemaining = (requestedLength + requestedOffset) - currentPosition;
		if (bytesRemaining <= 0) return -1;

        len = (int) Math.min(len, bytesRemaining);
        int bytesRead = super.read(b, off, len);
        currentPosition += bytesRead;

        return bytesRead;
    }

	@Override
	public synchronized void mark(int readlimit) {
		markedPosition = currentPosition;
		super.mark(readlimit);
	}

	@Override
	public synchronized void reset() throws IOException {
		currentPosition = markedPosition;
		super.reset();
	}

	@Override
	public void close() throws IOException {
		// Only close the wrapped input stream if we're at the end of
		// the wrapped stream.  We don't want to close the wrapped input
		// stream just because we've reached the end of one subsection.
		if (closeSourceStream) super.close();
	}

	@Override
    public int available() throws IOException {
		long bytesRemaining;
		if (currentPosition < requestedOffset) bytesRemaining = requestedLength;
		else bytesRemaining = (requestedLength + requestedOffset) - currentPosition;

		return (int)Math.min(bytesRemaining, super.available());
    }
}
