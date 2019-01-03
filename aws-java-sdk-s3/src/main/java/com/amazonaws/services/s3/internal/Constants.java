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
package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.RequestClientOptions;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.SSEAlgorithm;

/**
 * Constants used by the AWS S3 Java client.
 */
public class Constants {

    /** Default hostname for the S3 service endpoint */
    public static final String S3_HOSTNAME = "s3.amazonaws.com";
    /** Hostname for the s3-external-1 service endpoint */
    public static final String S3_EXTERNAL_1_HOSTNAME = "s3-external-1.amazonaws.com";
    /** Service hostname for accessing accelerated S3 buckets */
    public static final String S3_ACCELERATE_HOSTNAME = "s3-accelerate.amazonaws.com";
    public static final String S3_ACCELERATE_DUALSTACK_HOSTNAME = "s3-accelerate.dualstack.amazonaws.com";

    /** Dualstack qualifier for S3 */
    public static final String S3_DUALSTACK_QUALIFIER = "dualstack";

    /** Service display name for Amazon S3 (not to be used in SigV4 signing) */
    public static final String S3_SERVICE_DISPLAY_NAME = "Amazon S3";

    /** Default encoding used for text data */
    public static final String DEFAULT_ENCODING = "UTF-8";

    /** URL encoding for s3 object keys */
    public static final String URL_ENCODING = "url";

    /** HMAC/SHA1 Algorithm per RFC 2104, used when signing S3 requests */
    public static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

    /** XML namespace URL used when sending S3 requests containing XML */
    public static final String XML_NAMESPACE = "http://s3.amazonaws.com/doc/2006-03-01/";

    /** Represents a null S3 version ID */
    public static final String NULL_VERSION_ID = "null";

    /**
     * HTTP status code indicating that preconditions failed and thus the
     * request failed.
     */
    public static final int FAILED_PRECONDITION_STATUS_CODE = 412;

    /** Kilobytes */
    public static final int KB = 1024;

    /** Megabytes */
    public static final int MB = 1024 * KB;

    /** Gigabytes */
    public static final long GB = 1024 * MB;

    /** The maximum allowed parts in a multipart upload. */
    public static final int MAXIMUM_UPLOAD_PARTS = 10000;

    /**
     * The default size of the buffer when uploading data from a stream. A
     * buffer of this size will be created and filled with the first bytes from
     * a stream being uploaded so that any transmit errors that occur in that
     * section of the data can be automatically retried without the caller's
     * intervention. Add 1 to get around an implementation quirk when used
     * against BufferedInputStream.
     */
    public static final int DEFAULT_STREAM_BUFFER_SIZE = RequestClientOptions.DEFAULT_STREAM_BUFFER_SIZE;

    /**
     * Returns the buffer size override if it is specified in the system property,
     * otherwise returns the default value.
     */
    @Deprecated
    public static int getStreamBufferSize() {
        int streamBufferSize = DEFAULT_STREAM_BUFFER_SIZE;
        String bufferSizeOverride =
            System.getProperty(SDKGlobalConfiguration.DEFAULT_S3_STREAM_BUFFER_SIZE);

        if (bufferSizeOverride != null) {
            try {
                streamBufferSize = Integer.parseInt(bufferSizeOverride);
            } catch (Exception e) {
                log.warn("Unable to parse buffer size override from value: " + bufferSizeOverride);
            }
        }
        return streamBufferSize;
    }

    /**
     * Returns the value of the system property
     * {@link SDKGlobalConfiguration#DEFAULT_S3_STREAM_BUFFER_SIZE} as an
     * Integer; or null if not set. This method exists for backward
     * compatibility reasons.
     */
    public static Integer getS3StreamBufferSize() {
        String s =
            System.getProperty(SDKGlobalConfiguration.DEFAULT_S3_STREAM_BUFFER_SIZE);
        if (s == null)
            return null;
        try {
            return Integer.valueOf(s);
        } catch (Exception e) {
            log.warn("Unable to parse buffer size override from value: " + s);
        }
        return null;
    }

    /** Shared logger for client events */
    private static Log log = LogFactory.getLog(AmazonS3Client.class);

    public static final int NO_SUCH_BUCKET_STATUS_CODE = 404;

    public static final int BUCKET_ACCESS_FORBIDDEN_STATUS_CODE = 403;

    public static final int BUCKET_REDIRECT_STATUS_CODE = 301;

    // Constant indicating the requester pays for data transfer cost for a bucket.
    public static final String REQUESTER_PAYS = "requester";

    public static final String SSE_AWS_KMS_ENCRYPTION_SCHEME =
            SSEAlgorithm.KMS.getAlgorithm();
}
