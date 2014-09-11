/*
 * Copyright 2013-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.ResetException;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AwsChunkedEncodingInputStream;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.BinaryUtils;

/**
 * AWS4 signer implementation for AWS S3
 */
public class AWSS3V4Signer extends AWS4Signer {
    private static final String CONTENT_SHA_256 = "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";

    /**
     * Don't double-url-encode path elements; S3 expects path elements to be
     * encoded only once in the canonical URI.
     */
    public AWSS3V4Signer() {
        super(false);
    }

    /**
     * If necessary, creates a chunk-encoding wrapper on the request payload.
     */
    @Override
    protected void processRequestPayload(Request<?> request,
            HeaderSigningResult headerSigningResult) {
        if (useChunkEncoding(request)) {
            InputStream payloadStream = request.getContent();
            String dateTime = headerSigningResult.getDateTime();
            String keyPath = headerSigningResult.getScope();
            byte[] kSigning = headerSigningResult.getKSigning();
            String signature = BinaryUtils.toHex(headerSigningResult
                    .getSignature());
            AwsChunkedEncodingInputStream chunkEncodededStream = new AwsChunkedEncodingInputStream(
                    payloadStream, kSigning, dateTime, keyPath, signature, this);
            request.setContent(chunkEncodededStream);
        }
    }

    @Override
    protected String calculateContentHashPresign(Request<?> request){
        return "UNSIGNED-PAYLOAD";
    }

    /**
     * Returns the pre-defined header value and set other necessary headers if
     * the request needs to be chunk-encoded. Otherwise calls the superclass
     * method which calculates the hash of the whole content for signing.
     */
    @Override
    protected String calculateContentHash(Request<?> request) {
        // To be consistent with other service clients using sig-v4,
        // we just set the header as "required", and AWS4Signer.sign() will be
        // notified to pick up the header value returned by this method.
        request.addHeader("x-amz-content-sha256", "required");
        if (useChunkEncoding(request)) {
            final String contentLength =
                request.getHeaders().get(Headers.CONTENT_LENGTH);
            final long originalContentLength;
            if (contentLength != null) {
                originalContentLength = Long.parseLong(contentLength);
            } else {
                /**
                 * "Content-Length" header could be missing if the caller is
                 * uploading a stream without setting Content-Length in
                 * ObjectMetadata. Before using sigv4, we rely on HttpClient to
                 * add this header by using BufferedHttpEntity when creating the
                 * HttpRequest object. But now, we need this information
                 * immediately for the signing process, so we have to cache the
                 * stream here.
                 */
                try {
                    originalContentLength = getContentLength(request);
                } catch (IOException e) {
                    throw new AmazonClientException(
                            "Cannot get the content-length of the request content.",
                            e);
                }
            }
            request.addHeader("x-amz-decoded-content-length",
                    Long.toString(originalContentLength));
            // Make sure "Content-Length" header is not empty so that HttpClient
            // won't cache the stream again to recover Content-Length
            request.addHeader(
                    Headers.CONTENT_LENGTH,
                    Long.toString(AwsChunkedEncodingInputStream
                            .calculateStreamContentLength(originalContentLength)));
            return CONTENT_SHA_256;
        }
        return super.calculateContentHash(request);
    }

    /**
     * Determine whether to use aws-chunked for signing
     */
    private static boolean useChunkEncoding(Request<?> request) {
        // Whether to use chunked encoding for signing the request
        boolean chunkedEncodingEnabled = false;
        if (request.getOriginalRequest() instanceof PutObjectRequest
                || request.getOriginalRequest() instanceof UploadPartRequest) {
            chunkedEncodingEnabled = true;
        }
        return chunkedEncodingEnabled;
    }

    /**
     * Read the content of the request to get the length of the stream. This
     * method will wrap the stream by SdkBufferedInputStream if it is not
     * mark-supported.
     */
    static long getContentLength(Request<?> request) throws IOException {
        final InputStream content = request.getContent();
        if (!content.markSupported())
            throw new IllegalStateException("Bug: request input stream must have been made mark-and-resettable at this point");
        AmazonWebServiceRequest awsreq = request.getOriginalRequest();
        final int readLimit = awsreq.getReadLimit();
        long contentLength = 0;
        byte[] tmp = new byte[4096];
        int read;
        content.mark(readLimit);
        while ((read = content.read(tmp)) != -1) {
            contentLength += read;
            if (contentLength > readLimit) {
                // Fail fast since the following reset won't work anyway
                // due to limited buffer size
                throw new ResetException(
                    "Content length exceeded the reset buffer limit of "
                    + readLimit);
            }
        }
        try {
            content.reset();
        } catch(IOException ex) {
            throw new ResetException("Failed to reset the input stream", ex);
        }
        return contentLength;
    }
}
