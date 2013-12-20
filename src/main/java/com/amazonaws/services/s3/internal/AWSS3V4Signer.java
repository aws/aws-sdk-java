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
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.auth.AwsChunkedEncodingInputStream;
import com.amazonaws.auth.Presigner;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.util.BinaryUtils;

/**
 * AWS4 signer implementation for AWS S3
 */
public class AWSS3V4Signer extends AWS4Signer implements Presigner {
	
    /** We use the logger for AmazonS3Client to */
    private static Log clientLog = LogFactory.getLog(AmazonS3Client.class);

    /**
     * Don't double-url-encode path elements; S3 expects path elements to be
     * encoded only once in the canonical URI.
     */
    public AWSS3V4Signer() {
        super(false);
    }

    /**
     * Sign the URL using V4, it will compute the signature and add it to the
     * query string as value of parameter 'X-Amz-Signature'.
     */
    public void presignRequest(Request<?> request, AWSCredentials credentials, Date expiration) {

        addHostHeader(request);

        // annonymous credentials, don't sign
        if (credentials instanceof AnonymousAWSCredentials) {
            return;
        }

        AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);
        if (sanitizedCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(request, (AWSSessionCredentials) sanitizedCredentials);
        }

        Date date = getDateFromRequest(request);

        String scope = getScope(request, date);

        String signingCredentials = sanitizedCredentials.getAWSAccessKeyId() + "/" + scope;
        String expirationInSeconds = Long.toString((expiration.getTime() - System.currentTimeMillis()) / 1000L);

        // Add the important parameters for v4 signing
        Date now = new Date();
        request.addParameter("X-Amz-Algorithm", "AWS4-HMAC-SHA256");
        request.addParameter("X-Amz-Date", getDateTimeStamp(now));
        request.addParameter("X-Amz-SignedHeaders", "Host");
        request.addParameter("X-Amz-Expires", expirationInSeconds);
        request.addParameter("X-Amz-Credential", signingCredentials);

        String contentSha256 = "UNSIGNED-PAYLOAD";

        HeaderSigningResult headerSigningResult = computeSignature(request, date, ALGORITHM, contentSha256, sanitizedCredentials);
        request.addParameter("X-Amz-Signature", BinaryUtils.toHex(headerSigningResult.getSignature()));

    }

    /**
     * Whether the S3 sigv4 signer is using an explicit region name override.
     */
    public boolean isUsingRegionOverride() {
    	return regionName != null;
    }
    
	/**
	 * If necessary, creates a chunk-encoding wrapper on the request payload.
	 */
	@Override
	protected void processRequestPayload(Request<?> request, HeaderSigningResult headerSigningResult) {
		if (useChunkEncoding(request)) {
        	InputStream payloadStream = request.getContent();
            String dateTime = headerSigningResult.getDateTime();
        	String keyPath = headerSigningResult.getScope();
        	byte[] kSigning = headerSigningResult.getKSigning();
        	String signature = BinaryUtils.toHex(headerSigningResult.getSignature());
    		AwsChunkedEncodingInputStream chunkEncodededStream = new AwsChunkedEncodingInputStream(payloadStream, kSigning, dateTime, keyPath, signature, this);
    		request.setContent(chunkEncodededStream);
		}
	}

	/**
	 * Returns the pre-defined header value and set other necessary headers
	 * if the request needs to be chunk-encoded. Otherwise calls the superclass
	 * method which calculates the hash of the whole content for signing.
	 */
	@Override
	protected String calculateContentHash(Request<?> request) {
		// To be consistent with other service clients using sig-v4,
		// we just set the header as "required", and AWS4Signer.sign() will be notified
		// to pick up the header value returned by this method.
		request.addHeader("x-amz-content-sha256", "required");
		if (useChunkEncoding(request)) {
			String contentSha256 = "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";
			long originalContentLength;
	    	if (request.getHeaders().containsKey(Headers.CONTENT_LENGTH)) {
	        	originalContentLength = Long.parseLong(request.getHeaders().get(Headers.CONTENT_LENGTH));
	    	}
	    	else {
	    		/**
	    		 * "Content-Length" header could be missing if the caller is uploading a stream
	    		 * without setting Content-Length in ObjectMetadata.
	    		 * Before using sigv4, we rely on HttpClient to add this header by using BufferedHttpEntity
	    		 * when creating the HttpRequest object. But now, we need this information immediately
	    		 * for the signing process, so we have to cache the stream here.
	    		 */
	    		try {
					originalContentLength = getContentLength(request);
				} catch (IOException e) {
					throw new AmazonClientException("Cannot get the content-lenght of the request content.", e);
				}
	    	}
	    	request.addHeader("x-amz-decoded-content-length", Long.toString(originalContentLength));
	    	// Make sure "Content-Length" header is not empty so that HttpClient won't cache the stream again to recover Content-Length
    		request.addHeader(Headers.CONTENT_LENGTH, Long.toString(AwsChunkedEncodingInputStream.calculateStreamContentLength(originalContentLength)));
			return contentSha256;
		}
		else
			return super.calculateContentHash(request);
	}

    /**
     * Determine whether to use aws-chunked for signing
     */
	private static boolean useChunkEncoding(Request<?> request) {
    	// Whether to use chunked encoding for signing the request
    	boolean chunkedEncodingEnabled = false;
    	if (request.getOriginalRequest() instanceof PutObjectRequest
    			|| request.getOriginalRequest() instanceof UploadPartRequest ) {
    		chunkedEncodingEnabled = true;
    	}
    	return chunkedEncodingEnabled;
	}
	
	/**
	 * Read the content of the request to get the length of the stream.
	 * This method will wrap the stream by RepeatableInputStream if it is 
	 * not mark-supported.
	 */
	private static long getContentLength(Request<?> request) throws IOException {
		InputStream content = request.getContent();
		if ( !content.markSupported() ) {
			int streamBufferSize = Constants.getStreamBufferSize();
            content = new RepeatableInputStream(content, streamBufferSize);
            request.setContent(content);
		}
		
		long contentLength = 0;
		byte[] tmp = new byte[4096];
		int read;
		try {
			content.mark(-1);
			while ( (read = content.read(tmp)) != -1 ) {
				contentLength += read;
			}
			content.reset();
		} finally {
			content.close();
		}
		
		return contentLength;
	}
}
