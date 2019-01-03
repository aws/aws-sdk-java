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
package com.amazonaws.services.s3;

import com.amazonaws.SdkClientException;

/**
 * S3 client configuration options such as the request access style.
 */
public class S3ClientOptions {

    /** The default setting for use of path-style access */
    public static final boolean DEFAULT_PATH_STYLE_ACCESS = false;
    /** The default setting for use of chunked encoding */
    public static final boolean DEFAULT_CHUNKED_ENCODING_DISABLED = false;
    /** The default setting for use of payload signing */
    public static final boolean DEFAULT_PAYLOAD_SIGNING_ENABLED = false;
    /** S3 accelerate is by default not enabled */
    public static final boolean DEFAULT_ACCELERATE_MODE_ENABLED = false;
    /** S3 dualstack endpoint is by default not enabled */
    public static final boolean DEFAULT_DUALSTACK_ENABLED = false;
    /** By default, clients should be created with a region. */
    public static final boolean DEFAULT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED = false;

    /*
     * TODO: make it final after we remove the deprecated setters.
     */
    private boolean pathStyleAccess;
    private boolean chunkedEncodingDisabled;
    private final boolean accelerateModeEnabled;
    private final boolean payloadSigningEnabled;
    private final boolean dualstackEnabled;
    private final boolean forceGlobalBucketAccessEnabled;

    /**
     * @return a new S3ClientOptions builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private boolean pathStyleAccess = DEFAULT_PATH_STYLE_ACCESS;
        /** Flag for user of chunked encoding */
        private boolean chunkedEncodingDisabled = DEFAULT_CHUNKED_ENCODING_DISABLED;
        private boolean accelerateModeEnabled = DEFAULT_ACCELERATE_MODE_ENABLED;
        private boolean payloadSigningEnabled = DEFAULT_PAYLOAD_SIGNING_ENABLED;
        private boolean dualstackEnabled = DEFAULT_DUALSTACK_ENABLED;
        private boolean forceGlobalBucketAccessEnabled = DEFAULT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED;

        private Builder() {}

        public S3ClientOptions build() {
            if (pathStyleAccess && accelerateModeEnabled) {
                throw new SdkClientException("Both accelerate mode and path style access are being enabled either through "
                                             + "S3ClientOptions or AmazonS3ClientBuilder. These options are mutually exclusive "
                                             + "and cannot be enabled together. Please disable one of them");
            }

            return new S3ClientOptions(pathStyleAccess, chunkedEncodingDisabled, accelerateModeEnabled,
                                       payloadSigningEnabled, dualstackEnabled, forceGlobalBucketAccessEnabled);
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
         *
         * @param pathStyleAccess
         *            True to always use path-style access.
         * @return this Builder instance that can be used for method chaining
         */
        public Builder setPathStyleAccess(boolean pathStyleAccess) {
            this.pathStyleAccess = pathStyleAccess;
            return this;
        }

        /**
         * <p>
         * Configures the client to use S3 accelerate endpoint for all requests.
         * </p>
         * <p>
         * A bucket by default cannot be accessed in accelerate mode. If you
         * wish to do so, you need to enable the accelerate configuration for
         * the bucket in advance.
         * </p>
         *
         * @see AmazonS3#setBucketAccelerateConfiguration(com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest)
         */
        public Builder setAccelerateModeEnabled(boolean accelerateModeEnabled) {
            this.accelerateModeEnabled = accelerateModeEnabled;
            return this;
        }

        /**
         * <p>
         * Configures the client to sign payloads in all situations.
         * </p>
         * <p>
         * Payload signing is optional when chunked encoding is not used and requests are made
         * against an HTTPS endpoint.  Under these conditions the client will by default
         * opt to not sign payloads to optimize performance.  If this flag is set to true the
         * client will instead always sign payloads.
         * </p>
         * <p>
         * <b>Note:</b> Payload signing can be expensive, particularly if transferring
         * large payloads in a single chunk.  Enabling this option will result in a performance
         * penalty.
         * </p>
         *
         * @param payloadSigningEnabled
         *            True to explicitly enable payload signing in all situations
         */
        public Builder setPayloadSigningEnabled(boolean payloadSigningEnabled) {
            this.payloadSigningEnabled = payloadSigningEnabled;
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
         * @return this Builder instance that can be used for method chaining
         */
        public Builder disableChunkedEncoding() {
            this.chunkedEncodingDisabled = true;
            return this;
        }

        /**
         * <p>
         * Configures the client to use the dualstack endpoint for a region
         * <p>
         * S3 supports dualstack endpoints which return both IPv6 and IPv4 values.
         * Use of these endpoints is optional.
         * </p>
         *
         * @return this Builder instance that can be used for method chaining
         */
        public Builder enableDualstack() {
            this.dualstackEnabled = true;
            return this;
        }

        /**
         * <p>
         * Force-enable global bucket access on the S3 client. Any bucket-related operations invoked against a client
         * with this option enabled will potentially be executed against other regions than the one configured in the
         * client in order to succeed.
         * </p>
         *
         * @see AmazonS3ClientBuilder#setForceGlobalBucketAccessEnabled(Boolean)
         * @return this Builder instance that can be used for method chaining
         */
        public Builder enableForceGlobalBucketAccess()
        {
            this.forceGlobalBucketAccessEnabled = true;
            return this;
        }
    }

    /**
     * @deprecated Use {@link S3ClientOptions#builder()} to build new
     *             S3ClientOptions instead.
     */
    @Deprecated
    public S3ClientOptions() {
        this.pathStyleAccess = DEFAULT_PATH_STYLE_ACCESS;
        this.chunkedEncodingDisabled = DEFAULT_CHUNKED_ENCODING_DISABLED;
        this.accelerateModeEnabled = DEFAULT_ACCELERATE_MODE_ENABLED;
        this.payloadSigningEnabled = DEFAULT_PAYLOAD_SIGNING_ENABLED;
        this.dualstackEnabled = DEFAULT_DUALSTACK_ENABLED;
        this.forceGlobalBucketAccessEnabled = DEFAULT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED;
    }

    /**
     * @deprecated Will be removed once S3ClientOptions is made an immutable
     *             class.
     */
    @Deprecated
    public S3ClientOptions( S3ClientOptions other ) {
        this.pathStyleAccess = other.pathStyleAccess;
        this.chunkedEncodingDisabled = other.chunkedEncodingDisabled;
        this.accelerateModeEnabled = other.accelerateModeEnabled;
        this.payloadSigningEnabled = other.payloadSigningEnabled;
        this.dualstackEnabled = other.dualstackEnabled;
        this.forceGlobalBucketAccessEnabled = other.forceGlobalBucketAccessEnabled;
    }

    private S3ClientOptions(boolean pathStyleAccess, boolean chunkedEncodingDisabled, boolean accelerateModeEnabled,
                            boolean payloadSigningEnabled, boolean dualstackEnabled, boolean forceGlobalBucketAccessEnabled) {
        this.pathStyleAccess = pathStyleAccess;
        this.chunkedEncodingDisabled = chunkedEncodingDisabled;
        this.accelerateModeEnabled = accelerateModeEnabled;
        this.payloadSigningEnabled = payloadSigningEnabled;
        this.dualstackEnabled = dualstackEnabled;
        this.forceGlobalBucketAccessEnabled = forceGlobalBucketAccessEnabled;
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
     * Returns whether the client has enabled accelerate mode for getting and putting objects.
     * </p>
     * <p>
     * The default behavior is to disable accelerate mode for any operations (GET, PUT, DELETE). You need to call
     * {@link com.amazonaws.services.s3.AmazonS3Client#setBucketAccelerateConfiguration(com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest)}
     * first to use this feature.
     * </p>
     *
     * @return True if accelerate mode is enabled.
     */
    public boolean isAccelerateModeEnabled() {
        return accelerateModeEnabled;
    }

    /**
     * <p>
     * Returns whether the client is configured to sign payloads in all situations.
     * </p>
     * <p>
     * Payload signing is optional when chunked encoding is not used and requests are made
     * against an HTTPS endpoint.  Under these conditions the client will by default
     * opt to not sign payloads to optimize performance.  If this flag is set to true the
     * client will instead always sign payloads.
     * </p>
     * <p>
     * <b>Note:</b> Payload signing can be expensive, particularly if transferring
     * large payloads in a single chunk.  Enabling this option will result in a performance
     * penalty.
     * </p>
     *
     * @return True if body signing is explicitly enabled for all requests
     */
    public boolean isPayloadSigningEnabled() {
        return payloadSigningEnabled;
    }

    /**
     * <p>
     * Returns whether the client is configured to use dualstack mode for
     * accessing S3.
     * </p>
     *
     * @return True if the client will use the dualstack mode
     */
    public boolean isDualstackEnabled() {
        return dualstackEnabled;
    }

    /**
     * <p>
     * Returns whether the client should be configured with global bucket access enabled.
     * </p>
     * @see Builder#enableForceGlobalBucketAccess()
     */
    public boolean isForceGlobalBucketAccessEnabled() {
        return this.forceGlobalBucketAccessEnabled;
    }

    /**
     * @deprecated Use {@link S3ClientOptions#builder()} to build new
     *             S3ClientOptions instead.
     */
    @Deprecated
    public void setPathStyleAccess(boolean pathStyleAccess) {
        this.pathStyleAccess = pathStyleAccess;
    }

    /**
     * @deprecated Use {@link S3ClientOptions#builder()} to build new
     *             S3ClientOptions instead.
     */
    @Deprecated
    public S3ClientOptions withPathStyleAccess(boolean pathStyleAccess) {
        setPathStyleAccess(pathStyleAccess);
        return this;
    }

    /**
     * @deprecated Use {@link S3ClientOptions#builder()} to build new
     *             S3ClientOptions instead.
     */
    @Deprecated
    public void setChunkedEncodingDisabled(boolean chunkedEncodingDisabled) {
        this.chunkedEncodingDisabled = chunkedEncodingDisabled;
    }

    /**
     * @deprecated Use {@link S3ClientOptions#builder()} to build new
     *             S3ClientOptions instead.
     */
    @Deprecated
    public S3ClientOptions withChunkedEncodingDisabled(boolean chunkedEncodingDisabled) {
        setChunkedEncodingDisabled(chunkedEncodingDisabled);
        return this;
    }

    /**
     * @deprecated Use {@link S3ClientOptions#builder()} to build new
     *             S3ClientOptions instead.
     */
    @Deprecated
    public S3ClientOptions disableChunkedEncoding() {
        return withChunkedEncodingDisabled(true);
    }
}
