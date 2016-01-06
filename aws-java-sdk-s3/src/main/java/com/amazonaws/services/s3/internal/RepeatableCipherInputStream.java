/*
 * Copyright 2013-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.FilterInputStream;
import java.io.InputStream;

import javax.crypto.CipherInputStream;

import com.amazonaws.services.s3.internal.crypto.CipherFactory;

/**
 * @deprecated this class is no longer used and will be removed in the future
 * <p>
 * Wraps an InputStream with a CipherInputStream to encrypt it, and handles
 * resets by attempting to reset on the original, unencrypted data InputStream,
 * and recreate an identical Cipher and identical CipherInputStream on the
 * original data.
 * <p>
 * It's repeatable if and only if the underlying unencryptedDataStream is
 * repeatable - if the underlying input stream is not repeatable and you're
 * going to buffer to make it repeatable anyways, it makes more sense to do
 * so after wrapping in this object, so we buffer the encrypted data and don't
 * have to bother re-encrypting on retry.
 * <p>
 * This stream <em>only</em> supports being marked before the first call to
 * {@code read} or {@code skip}, since it's not possible to rewind the
 * encryption state of a {@code CipherInputStream} to an arbitrary point. If
 * you call {@code mark} after calling {@code read} or {@code skip}, it will
 * throw an {@code UnsupportedOperationException}.
 */
@Deprecated
public class RepeatableCipherInputStream extends
        AbstractRepeatableCipherInputStream<CipherFactory> {
    /**
     * Constructs a new repeatable cipher input stream using the specified
     * InputStream as the source data, and the CipherFactory for building
     * Cipher objects.
     * 
     * @param input
     *            The original, unencrypted data stream. This stream should be
     *            markable/resetable in order for this class to work correctly.
     * @param cipherFactory
     *            The factory used for creating identical cipher objects when
     *            this stream is reset and a new CipherInputStream is needed.
     */
    public RepeatableCipherInputStream(final InputStream input,
                                       final CipherFactory cipherFactory) {

        super(input,
            newCipherInputStream(input, cipherFactory),
            cipherFactory);
    }

    @Override
    protected FilterInputStream createCipherInputStream(
            InputStream unencryptedDataStream, CipherFactory cipherFactory) {
        return newCipherInputStream(unencryptedDataStream, cipherFactory);
    }
    
    private static FilterInputStream newCipherInputStream(
            InputStream unencryptedDataStream, CipherFactory cipherFactory) {
        return new CipherInputStream(unencryptedDataStream,
                cipherFactory.createCipher());
    }
}
