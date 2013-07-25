/*
 * Copyright 2011-2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.AmazonClientException;

/**
 * This class validates the Amazon S3 response for the content length as the
 * data is read from the input stream.
 * 
 */
public class ContentLengthValidationInputStream extends FilterInputStream {

	/** Expected Length of the stream as received from the HTTP response. */
	private long expectedLength;

	/** This variables holds the number of bytes read from the stream so far. */
	private int bytesRead;

	/**
	 * This variable holds the number of bytes read from the stream at the
	 * instance when mark method was called.
	 */
	private int mark;

	public ContentLengthValidationInputStream(InputStream in, long expectedLength) {
		super(in);
		this.expectedLength = expectedLength;
		this.bytesRead = 0;
		this.mark = 0;
	}

	/**
	 * Reads the next byte of data from the input stream. The value byte is
	 * returned as an int in the range 0 to 255. If no byte is available because
	 * the end of the stream has been reached, the value -1 is returned. If the
	 * result is not -1, then the number of bytes read is incremented by 1.
	 */
	@Override
	public int read() throws IOException {
		int result = super.read();
		if (result != -1) {
			bytesRead++;
		} else {
			validate();
		}
		return result;
	}

	/**
	 * Reads up to len bytes of data from the input stream into an array of
	 * bytes. An attempt is made to read as many as len bytes, but a smaller
	 * number may be read. The number of bytes actually read is returned as an
	 * integer. If the result is not -1, the the number of bytes read is
	 * incremented by the result of the read operation.
	 */

	@Override
	public int read(byte[] arg0, int off, int len) throws IOException {

		int result = super.read(arg0, off, len);
		if (result != -1) {
			bytesRead += result;
		} else {
			validate();
		}
		return result;
	}

	/**
	 * Skips over and discards n bytes of data from this input stream. Returns
	 * the number of bytes skipped from this stream. If the result is not -1,
	 * then the number of bytes is incremented by the total number of bytes
	 * skipped.
	 */
	@Override
	public long skip(long n) throws IOException {
		long result = super.skip(n);
		if (result != -1) {
			bytesRead += result;
		}
		return result;
	}

	/**
	 * Marks the current position in this input stream. A subsequent call to the
	 * reset method repositions this stream at the last marked position so that
	 * subsequent reads re-read the same bytes.
	 * 
	 * The readlimit arguments tells this input stream to allow that many bytes
	 * to be read before the mark position gets invalidated.
	 * 
	 * The number of bytes read from this stream at this instance is noted so
	 * that on subsequent calls to reset, the bytesRead can be reset to this
	 * value if mark is success.
	 */
	@Override
	public synchronized void mark(int readlimit) {
		super.mark(readlimit);
		mark = bytesRead;

	}

	/**
	 * Repositions this stream to the position at the time the mark method was
	 * last called on this input stream if and only if mark is supported by the
	 * input stream.
	 * 
	 * Resets the bytesRead parameter to the mark value.
	 * 
	 */
	@Override
	public synchronized void reset() throws IOException {
		super.reset();
		if (super.markSupported())
			bytesRead = mark;

	}

	/**
	 * Checks if the total number of bytes read from the stream equals the
	 * expected length provided. Throws an AmazonClientException if the values
	 * don't match.
	 */
	private void validate() {

		if (expectedLength != bytesRead) {
			throw new AmazonClientException(
					"Unable to verify integrity of data download.  "
							+ "Client calculated content length didn't match content length received from Amazon S3.  "
							+ "The data may be corrupt.");
		}

	}

}
