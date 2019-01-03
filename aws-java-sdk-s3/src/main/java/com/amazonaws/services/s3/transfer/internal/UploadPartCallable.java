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
package com.amazonaws.services.s3.transfer.internal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

import com.amazonaws.SdkClientException;
import com.amazonaws.internal.SdkThreadLocalsRegistry;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.BinaryUtils;

public class UploadPartCallable implements Callable<PartETag> {
    private static final int MAX_SKIPS = 100;
    private static final ThreadLocal<MessageDigest> MD5_DIGEST;
    static {
        MD5_DIGEST = SdkThreadLocalsRegistry.register(new ThreadLocal<MessageDigest>() {
            @Override
            protected MessageDigest initialValue() {
                try {
                    return MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException e) {
                    throw new SdkClientException("Unable to get a digest instance for MD5!", e);
                }
            }
        });
    }
    private final AmazonS3 s3;
    private final UploadPartRequest request;
    private final boolean calculateMd5;

    public UploadPartCallable(AmazonS3 s3, UploadPartRequest request) {
        this(s3, request, false);
    }

    public UploadPartCallable(AmazonS3 s3, UploadPartRequest request, boolean calculateMd5) {
        this.s3 = s3;
        this.request = request;
        this.calculateMd5 = calculateMd5;
    }

    public PartETag call() throws Exception {
        if (calculateMd5) {
            request.withMD5Digest(computedMd5());
        }
        PartETag partETag = s3.uploadPart(request).getPartETag();
        return partETag;
    }


    private String computedMd5() {
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(request.getFile());
            skipBytes(fileStream, request.getFileOffset());
            return BinaryUtils.toBase64(computeMd5Bytes(fileStream, request.getPartSize()));
        } catch (IOException e) {
            throw new SdkClientException(e);
        } finally {
            if (fileStream != null) {
                try {
                    fileStream.close();
                } catch (IOException ignored) {
                }
            }
        }
    }

    private static byte[] computeMd5Bytes(InputStream is, long remaining) throws IOException {
        byte readBuff[] = new byte[4096];
        MessageDigest digest = MD5_DIGEST.get();
        digest.reset();
        int read;
        while (remaining > 0 && (read = is.read(readBuff)) != -1) {
            int updateLen = (int) Math.min(remaining, read);
            digest.update(readBuff, 0, updateLen);
            remaining -= updateLen;
        }
        return digest.digest();
    }

    private void skipBytes(FileInputStream fs, long n) throws IOException {
        long skippedSoFar = 0;
        for (int skips = 0; skips < MAX_SKIPS && skippedSoFar < n; ++skips) {
            skippedSoFar += fs.skip(n - skippedSoFar);
        }
        if (skippedSoFar != n) {
            throw new SdkClientException(String.format("Unable to skip to offset %d in file %s after %d attempts",
                    n, request.getFile().getAbsolutePath(), MAX_SKIPS));
        }
    }
}
