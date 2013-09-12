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

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

import com.amazonaws.services.s3.internal.crypto.CipherFactory;

/**
 * Wraps an InputStream with a CipherInputStream to encrypt it, and handles
 * resets by attempting to reset on the original, unencrypted data InputStream,
 * and recreate an identical Cipher and identical CipherInputStream on the
 * original data.
 */
public class RepeatableCipherInputStream extends AbstractRepeatableInputStream {
    private CipherFactory cipherFactory;
    private InputStream unencryptedDataStream;

    
    /**
     * Constructs a new repeatable cipher input stream using the specified
     * InputStream as the source data, and the CipherFactory for building Cipher
     * objects.
     * 
     * @param input
     *            The original, unencrypted data stream. This stream should be
     *            markable/resetable in order for this class to work correctly.
     * @param cipherFactory
     *            The factory used for creating identical cipher objects when
     *            this stream is reset and a new CipherInputStream is needed.
     */
    public RepeatableCipherInputStream(InputStream input, CipherFactory cipherFactory) {
        super(createCipherInputStream(input, cipherFactory));
        this.unencryptedDataStream = input;
        this.cipherFactory = cipherFactory;

        // Mark the beginning of the data stream so we can reset back to it
        unencryptedDataStream.mark(-1);
    }

    private static CipherInputStream createCipherInputStream(InputStream input, CipherFactory cipherFactory) {
        Cipher cipher = cipherFactory.createCipher();
        return new CipherInputStream(input, cipher);
    }

    @Override
    protected void reopenWrappedStream() throws IOException {
		// We don't need to call in.close() here, since what
		// CipherInputStream.close() does is merely call close() of the
		// underlying stream (which is the same object as the
		// unencryptedDataStream).
		// So this actually means we SHOULD NOT call in.close(), since we still
		// need the unencryptedDataStream to be available for reset.
        unencryptedDataStream.reset();
        in = createCipherInputStream(unencryptedDataStream, cipherFactory);
    }

}