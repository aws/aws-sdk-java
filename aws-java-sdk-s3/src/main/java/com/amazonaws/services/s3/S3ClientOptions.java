/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3;

/**
 * S3 client configuration options such as the request access style.
 */
public class S3ClientOptions {

    /** The default setting for use of path-style access */
    public static final boolean DEFAULT_PATH_STYLE_ACCESS = false;

    /** The default setting for use of chunked encoding */
    public static final boolean DEFAULT_CHUNKED_ENCODING_DISABLED = false;

    /** Flag for use of path-style access */
    private boolean pathStyleAccess = DEFAULT_PATH_STYLE_ACCESS;

    /** Flag for user of chunked encoding */
    private boolean chunkedEncodingDisabled = DEFAULT_CHUNKED_ENCODING_DISABLED;

    public S3ClientOptions() {}

    public S3ClientOptions( S3ClientOptions other ) {
        this.pathStyleAccess = other.pathStyleAccess;
        this.chunkedEncodingDisabled = other.chunkedEncodingDisabled;
    }

    /**
     * <p>
     * Returns whether the client uses path-style access for all requests.
     * </p>
     * <p>
     * Amazon S3 supports virtual-hosted-style and path-style access in all
     * Regions. The path-style syntax, however, requires that you use the
     * region-specific endpoint when attempting to access a bucket.
     * </p>
     * <p>
     * The default behaviour is to detect which access style to use based on
     * the configured endpoint (an IP will result in path-style access) and
     * the bucket being accessed (some buckets are not valid DNS names).
     * Setting this flag will result in path-style access being used for all
     * requests.
     * </p>
     * @return True is the client should always use path-style access
     */
    public boolean isPathStyleAccess() {
        return pathStyleAccess;
    }

    /**
     * <p>
     * Configures the client to use path-style access for all requests.
     * </p>
     * <p>
     * Amazon S3 supports virtual-hosted-style and path-style access in all
     * Regions. The path-style syntax, however, requires that you use the
     * region-specific endpoint when attempting to access a bucket.
     * </p>
     * <p>
     * The default behaviour is to detect which access style to use based on
     * the configured endpoint (an IP will result in path-style access) and
     * the bucket being accessed (some buckets are not valid DNS names).
     * Setting this flag will result in path-style access being used for all
     * requests.
     * </p>
     * @param pathStyleAccess
     *            True to always use path-style access.
     */
    public void setPathStyleAccess(boolean pathStyleAccess) {
      this.pathStyleAccess = pathStyleAccess;
    }


    /**
     * <p>
     * Configures the client to use path-style access for all requests.
     * </p>
     * <p>
     * Amazon S3 supports virtual-hosted-style and path-style access in all
     * Regions. The path-style syntax, however, requires that you use the
     * region-specific endpoint when attempting to access a bucket.
     * </p>
     * <p>
     * The default behaviour is to detect which access style to use based on
     * the configured endpoint (an IP will result in path-style access) and
     * the bucket being accessed (some buckets are not valid DNS names).
     * Setting this flag will result in path-style access being used for all
     * requests.
     * </p>
     * @param pathStyleAccess
     *            True to always use path-style access.
     *
     * @return The updated S3ClientOptions object with the new path-style
     *         access setting.
     */
    public S3ClientOptions withPathStyleAccess(boolean pathStyleAccess) {
      setPathStyleAccess(pathStyleAccess);
      return this;
    }

    /**
     * <p>
     * Returns whether the client has chunked encoding disabled for all requests.
     * </p>
     * <p>
     * The default behavior is to enable chunked encoding automatically for PutObjectRequest and
     * UploadPartRequest. Setting this flag will result in disabling chunked encoding for all
     * requests.
     * </p>
     * <p>
     * <b>Note:</b> Enabling this option has performance implications since the checksum for the
     * payload will have to be pre-calculated before sending the data. If your payload is large this
     * will affect the overall time required to upload an object. Using this option is recommended
     * only if your endpoint does not implement chunked uploading.
     * </p>
     * 
     * @return True if chunked encoding is explicitly disabled for all requests
     */
    public boolean isChunkedEncodingDisabled() {
        return chunkedEncodingDisabled;
    }

    /**
     * <p>
     * Configures the client to disable chunked encoding for all requests.
     * </p>
     * <p>
     * The default behavior is to enable chunked encoding automatically for PutObjectRequest and
     * UploadPartRequest. Setting this flag will result in disabling chunked encoding for all
     * requests.
     * </p>
     * <p>
     * <b>Note:</b> Enabling this option has performance implications since the checksum for the
     * payload will have to be pre-calculated before sending the data. If your payload is large this
     * will affect the overall time required to upload an object. Using this option is recommended
     * only if your endpoint does not implement chunked uploading.
     * </p>
     * 
     * @param chunkedEncodingDisabled
     *            True to disable chunked encoding
     */
    public void setChunkedEncodingDisabled(boolean chunkedEncodingDisabled) {
        this.chunkedEncodingDisabled = chunkedEncodingDisabled;
    }

    /**
     * <p>
     * Configures the client to disable chunked encoding for all requests.
     * </p>
     * <p>
     * The default behavior is to enable chunked encoding automatically for PutObjectRequest and
     * UploadPartRequest. Setting this flag will result in disabling chunked encoding for all
     * requests.
     * </p>
     * <p>
     * <b>Note:</b> Enabling this option has performance implications since the checksum for the
     * payload will have to be pre-calculated before sending the data. If your payload is large this
     * will affect the overall time required to upload an object. Using this option is recommended
     * only if your endpoint does not implement chunked uploading.
     * </p>
     * 
     * @param chunkedEncodingDisabled
     *            True to disable chunked encoding
     */
    public S3ClientOptions withChunkedEncodingDisabled(boolean chunkedEncodingDisabled) {
        setChunkedEncodingDisabled(chunkedEncodingDisabled);
        return this;
    }

    /**
     * <p>
     * Configures the client to disable chunked encoding for all requests.
     * </p>
     * <p>
     * The default behavior is to enable chunked encoding automatically for PutObjectRequest and
     * UploadPartRequest. Setting this flag will result in disabling chunked encoding for all
     * requests.
     * </p>
     * <p>
     * <b>Note:</b> Enabling this option has performance implications since the checksum for the
     * payload will have to be pre-calculated before sending the data. If your payload is large this
     * will affect the overall time required to upload an object. Using this option is recommended
     * only if your endpoint does not implement chunked uploading.
     * </p>
     * 
     * @return The updated S3ClientOptions object with chunked encoding disabled setting.
     * @deprecated Use {@link withChunkedEncodingDisabled(boolean)} instead
     */
    public S3ClientOptions disableChunkedEncoding() {
        return withChunkedEncodingDisabled(true);
    }

}