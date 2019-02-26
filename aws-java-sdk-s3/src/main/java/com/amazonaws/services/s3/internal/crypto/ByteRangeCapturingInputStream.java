/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.internal.SdkFilterInputStream;

/**
 * FilterInputStream that captures a range of bytes from a wrapped input stream.
 */
public class ByteRangeCapturingInputStream extends SdkFilterInputStream {
	private final long startingPosition;
	private final long endingPosition;

	private long streamPosition;
	private int blockPosition = 0;
	private final byte[] block;

	private long markedStreamPosition;
	private int markedBlockPosition;

	public ByteRangeCapturingInputStream(InputStream in, long startingPosition, long endingPosition) {
		super(in);

		if (startingPosition >= endingPosition) {
			throw new IllegalArgumentException("Invalid byte range specified: the starting position must be less than the ending position");
		}

		this.startingPosition = startingPosition;
		this.endingPosition = endingPosition;
		int blockSize = (int)(endingPosition - startingPosition);
		block = new byte[blockSize];
	}

	public byte[] getBlock() {
		return block;
	}

	@Override
	public int read() throws IOException {
		int data = super.read();
		if (data == -1) return -1;

		if (streamPosition >= startingPosition && streamPosition <= endingPosition) {
			block[blockPosition++] = (byte)data;
		}

		streamPosition++;
		return data;
	}

	@Override
	public synchronized void mark(int readlimit) {
		super.mark(readlimit);
		if (markSupported()) {
			markedStreamPosition = streamPosition;
			markedBlockPosition = blockPosition;
		}
	}

	@Override
	public synchronized void reset() throws IOException {
		super.reset();
		if (markSupported()) {
			streamPosition = markedStreamPosition;
			blockPosition = markedBlockPosition;
		}
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int bytesRead = super.read(b, off, len);
		if (bytesRead == -1) return -1;

		if (streamPosition + bytesRead >= startingPosition && streamPosition <= endingPosition) {
			for (int i = 0; i < bytesRead; i++) {
				if (streamPosition + i >= startingPosition && streamPosition + i < endingPosition) {
					block[blockPosition++] = b[off + i];
				}
			}
		}

		streamPosition += bytesRead;
		return bytesRead;
	}
}
