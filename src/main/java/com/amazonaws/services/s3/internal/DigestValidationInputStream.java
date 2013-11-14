/*
 * Copyright 2013-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.security.MessageDigest;
import java.util.Arrays;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkDigestInputStream;

/**
 * Input stream extends MD5DigestValidationInputStream, when you finish reading the stream, it
 * will validate whether the computed digest equals the one from the server
 * side.
 */
public class DigestValidationInputStream extends SdkDigestInputStream {

    private byte[] expectedHash;

    //Flag do we don't validate twice.  See validateMD5Digest()
    private boolean digestValidated = false;

    public DigestValidationInputStream(InputStream in, MessageDigest digest, byte[] serverSideHash) {
        super(in, digest);
        this.expectedHash = serverSideHash;
    }

    /**
     * @see java.io.InputStream#read()
     */
    @Override
    public int read() throws IOException {
        int ch = super.read();
        if (ch == -1) {
            validateMD5Digest();
        }
        return ch;
    }

    /**
     * @see java.io.InputStream#read(byte[], int, int)
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        if (result == -1) {
            validateMD5Digest();
        }
        return result;
    }

    public byte[] getMD5Checksum() {
        return digest.digest();
    }

    private void validateMD5Digest() {
        /*
         * Some InputStream readers (e.g., java.util.Properties) read more than
         * once at the end of the stream. This class validates the digest once
         * -1 has been read so we must not validate twice.
         */
        if (expectedHash != null && !digestValidated ) {
            digestValidated = true;
            if (!Arrays.equals(digest.digest(), expectedHash)) {
                throw new AmazonClientException("Unable to verify integrity of data download.  "
                        + "Client calculated content hash didn't match hash calculated by Amazon S3.  "
                        + "The data may be corrupt.");
            }
        }
    }

}
