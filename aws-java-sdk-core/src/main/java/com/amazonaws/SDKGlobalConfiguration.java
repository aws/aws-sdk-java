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
package com.amazonaws;

/**
 * SDKGlobalConfiguration is to configure any global settings
 */
public class SDKGlobalConfiguration {
    /////////////////////// System Properties ///////////////////////

    /**
     * Disable validation of server certificates when using the HTTPS protocol. This should ONLY be
     * used to do quick smoke tests against endpoints which don't yet have valid certificates; it
     * should NEVER be used in production. This property is meant to be used as a flag (i.e.
     * -Dcom.amazonaws.sdk.disableCertChecking) rather then taking a value
     * (-Dcom.amazonaws.sdk.disableCertChecking=true). This property is treated as false by default
     * (i.e. check certificates by default)
     */
    public static final String DISABLE_CERT_CHECKING_SYSTEM_PROPERTY =
        "com.amazonaws.sdk.disableCertChecking";

    /**
     * System property used when starting up the JVM to enable the default
     * metrics collected by the AWS SDK, which uploads the derived statistics
     * to Amazon CloudWatch.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics
     * </pre>
     */
    public static final String DEFAULT_METRICS_SYSTEM_PROPERTY =
        "com.amazonaws.sdk.enableDefaultMetrics";

    /** System property name for the AWS access key ID */
    public static final String ACCESS_KEY_SYSTEM_PROPERTY = "aws.accessKeyId";

    /** System property name for the AWS secret key */
    public  static final String SECRET_KEY_SYSTEM_PROPERTY = "aws.secretKey";

    /**
     * System property name for the AWS session token
     */
    public static final String SESSION_TOKEN_SYSTEM_PROPERTY = "aws.sessionToken";

    /**
     * System property for the AWS region to use when creating clients.
     * See {@link com.amazonaws.regions.DefaultAwsRegionProviderChain}.
     */
    public static final String AWS_REGION_SYSTEM_PROPERTY = "aws.region";

    /**
     * System property for overriding the Amazon EC2 Instance Metadata Service
     * endpoint.
     */
    public static final String EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY =
        "com.amazonaws.sdk.ec2MetadataServiceEndpointOverride";

    /**
     * System property for enabling retry throttling.
     * <p>
     * Retry throttling is a feature which intelligently throttles retry attempts when a
     * large percentage of requests are failing and retries are unsuccessful, particularly
     * in scenarios of degraded service health.  In these situations the client will drain its
     * internal retry capacity and slowly roll off from retry attempts until requests begin
     * to succeed again.  At that point the retry capacity pool will begin to refill and
     * retries will once again be permitted
     * </p>
     * <p>
     * In situations where retries have been throttled this feature will effectively result in
     * fail-fast behavior from the client.  Because retries are circumvented exceptions will
     * be immediately returned to the caller if the initial request is unsuccessful.  This
     * will result in a greater number of exceptions being returned up front but prevents
     * requests being tied up attempting subsequent retries which are also likely to fail.
     * </p>
     */
    public static final String RETRY_THROTTLING_SYSTEM_PROPERTY =
            "com.amazonaws.sdk.enableThrottledRetry";

    /**
     * Path to an override file for the region metadata loaded by the SDK
     * that maps service/region pairs to endpoints and vice versa.
     */
    public static final String REGIONS_FILE_OVERRIDE_SYSTEM_PROPERTY =
        "com.amazonaws.regions.RegionUtils.fileOverride";

    /**
     * By default, the SDK will attempt to download an up-to-date set of
     * region metadata from Amazon CloudFront when first required. This allows
     * you to look up information about new regions and services without having
     * to download a new version of the SDK every time.
     * <p>
     * If the SDK cannot download region metadata from Amazon CloudFront, it
     * will fall back to loading the region metadata bundled with the SDK when
     * it was released, which may be out of date.
     * <p>
     * Setting this system property to anything other than {@code null} will
     * <i>disable</i> this remote fetching, and will <i>only</i> load region
     * metadata that was bundled with the SDK. This gives you control over
     * when new region metadata will be picked up by your application, and
     * isolates you from potential issues if your application depends on being
     * able to load metadata about a region which is not included in your
     * version of the SDK and therefore may not be available in the event of
     * network outages.
     */
    public static final String DISABLE_REMOTE_REGIONS_FILE_SYSTEM_PROPERTY =
        "com.amazonaws.regions.RegionUtils.disableRemote";

    /**
     * By default, the AmazonS3Client will continue to use the legacy
     * S3Signer to authenticate requests it makes to S3 in regions that
     * support the older protocol. Setting this property to anything other
     * than null will cause the client to upgrade to Signature Version 4
     * whenever it has been configured with an explicit region (which is a
     * required parameter for Signature Version 4). The client will continue
     * to use the older signature protocol when not configured with a region
     * to avoid breaking existing applications.
     * <p>
     * Signature Version 4 is more secure than the legacy S3Signer, but
     * requires calculating a SHA-256 hash of the entire request body which
     * can be expensive for large upload requests.
     */
    @Deprecated
    public static final String ENABLE_S3_SIGV4_SYSTEM_PROPERTY =
        "com.amazonaws.services.s3.enableV4";

    /**
     * Like {@link #ENABLE_S3_SIGV4_SYSTEM_PROPERTY}, but causes the client to
     * always use Signature Version 4, assuming a region of
     * &quot;us-east-1&quot; if no explicit region has been configured. This
     * guarantees that the more secure authentication protocol will be used,
     * but will cause authentication failures in code that accesses buckets in
     * regions other than US Standard without explicitly configuring a region.
     */
    @Deprecated
    public static final String ENFORCE_S3_SIGV4_SYSTEM_PROPERTY =
        "com.amazonaws.services.s3.enforceV4";

    /**
     * By default, the S3 client constructor does not set a region.
     * <p>
     * If the client is not configured with an explicit region, bucket operations
     * (eg. {@code listObjects}) will attempt to determine the bucket's region the first
     * time that bucket is seen. This may result in a cross-region call.
     * <p>
     * Setting this system property to anything other than {@code null} or
     * {@code false} will <i>disable</i> this implicit fixed-region invocation,
     * and any attempt to use a regionless client will fail with an IllegalStateException.
     * This allows SDK users to force all S3 clients to be created with a region defined,
     * so that calls to unintended regions are avoided.
     * <p>
     * Note: Even with this option enabled, SDK users can still create clients not
     * attached to fixed regions using specific opt-in methods on the S3 client builder.
     * For instance, the {@code enableGlobalBucketAccess} option explicitly allows
     * creation of a client that will automatically identify the location of a bucket via
     * a call to a single, fixed region.
     */
    public static final String DISABLE_S3_IMPLICIT_GLOBAL_CLIENTS_SYSTEM_PROPERTY =
            "com.amazonaws.services.s3.disableImplicitGlobalClients";

    /**
     * Overrides the client default {@link ClientConfiguration} to use
     * configuration with values tailored towards clients operating in the
     * same AWS region as the service endpoint they call.  Timeouts in
     * in-region optimized configurations are generally set much lower than
     * the client standard configuration.
     */
    public static final String ENABLE_IN_REGION_OPTIMIZED_MODE =
            "com.amazonaws.sdk.enableInRegionOptimizedMode";

    /**
     * @deprecated with {@link AmazonWebServiceRequest#getRequestClientOptions()}
     * and {@link RequestClientOptions#setReadLimit(int)}.
     * <p>
     * The default size of the buffer when uploading data from a stream. A
     * buffer of this size will be created and filled with the first bytes from
     * a stream being uploaded so that any transmit errors that occur in that
     * section of the data can be automatically retried without the caller's
     * intervention.
     * <p>
     * If not set, the default value of 128 KB will be used.
     */
    @Deprecated
    public static final String DEFAULT_S3_STREAM_BUFFER_SIZE =
        "com.amazonaws.sdk.s3.defaultStreamBufferSize";

    /**
     * @deprecated by {@link #DEFAULT_METRICS_SYSTEM_PROPERTY}.
     *
     * Internal system property to enable timing info collection.
     */
    @Deprecated
    public static final String PROFILING_SYSTEM_PROPERTY =
        "com.amazonaws.sdk.enableRuntimeProfiling";

    /**
     * The default port used by client side monitoring.
     */
    public static final int DEFAULT_AWS_CSM_PORT = 31000;

    /**
     * The default client Id used by client side monitoring.
     */
    public static final String DEFAULT_AWS_CSM_CLIENT_ID = "";

    /**
     * System property to enable/disable client side monitoring.
     */
    public static final String AWS_CSM_ENABLED_SYSTEM_PROPERTY = "com.amazonaws.sdk.csm.enabled";

    /**
     * System property to set the port of the out of process client side
     * monitoring agent.
     */
    public static final String AWS_CSM_PORT_SYSTEM_PROPERTY = "com.amazonaws.sdk.csm.port";

    /**
     * System property to set the client ID to use for client side monitoring
     * events.
     */
    public static final String AWS_CSM_CLIENT_ID_SYSTEM_PROPERTY = "com.amazonaws.sdk.csm.clientId";

    /////////////////////// Environment Variables ///////////////////////
    /** Environment variable name for the AWS access key ID */
    public static final String ACCESS_KEY_ENV_VAR = "AWS_ACCESS_KEY_ID";

    /** Alternate environment variable name for the AWS access key ID */
    public static final String ALTERNATE_ACCESS_KEY_ENV_VAR = "AWS_ACCESS_KEY";

    /** Environment variable name for the AWS secret key */
    public static final String SECRET_KEY_ENV_VAR = "AWS_SECRET_KEY";

    /** Alternate environment variable name for the AWS secret key */
    public static final String ALTERNATE_SECRET_KEY_ENV_VAR = "AWS_SECRET_ACCESS_KEY";

    /** Environment variable name for the AWS session token */
    public static final String AWS_SESSION_TOKEN_ENV_VAR = "AWS_SESSION_TOKEN";

    /**
     * Environment variable containing region used to configure clients.
     */
    public static final String AWS_REGION_ENV_VAR = "AWS_REGION";

    /**
     * Environment variable to set an alternate path to the shared config file (default path is
     * ~/.aws/config).
     */
    public static final String AWS_CONFIG_FILE_ENV_VAR = "AWS_CONFIG_FILE";

    /**
     * Environment variable to disable CBOR protocol. This forces the request
     * to be sent over the wire as a AWS JSON.
     */
    public static final String AWS_CBOR_DISABLE_ENV_VAR = "AWS_CBOR_DISABLE";

    /**
     * System property to disable CBOR protocol. This forces the request to be sent over the wire
     * as a AWS JSON
     */
    public static final String AWS_CBOR_DISABLE_SYSTEM_PROPERTY = "com.amazonaws.sdk.disableCbor";

    /**
     * Environment variable to disable Ion binary protocol. This forces the request
     * to be sent over the wire as Ion text.
     */
    public static final String AWS_ION_BINARY_DISABLE_ENV_VAR = "AWS_ION_BINARY_DISABLE";

    /**
     * System property to disable Ion binary protocol. This forces the request to be sent over the wire
     * as Ion text
     */
    public static final String AWS_ION_BINARY_DISABLE_SYSTEM_PROPERTY = "com.amazonaws.sdk.disableIonBinary";

    /**
     * Environment variable to disable loading credentials or regions from EC2 Metadata instance service.
     */
    public static final String AWS_EC2_METADATA_DISABLED_ENV_VAR = "AWS_EC2_METADATA_DISABLED";

    /**
     * System property to disable loading credentials or regions from EC2 Metadata instance service.
     */
    public static final String AWS_EC2_METADATA_DISABLED_SYSTEM_PROPERTY = "com.amazonaws.sdk.disableEc2Metadata";

    /*
     * Environment variable to enable/disable client side monitoring.
     */
    public static final String AWS_CSM_ENABLED_ENV_VAR = "AWS_CSM_ENABLED";

    /**
     * Environment varaible to set the port of the out of process client side
     * monitoring agent.
     */
    public static final String AWS_CSM_PORT_ENV_VAR = "AWS_CSM_PORT";

    /**
     * Environment variable to set the client ID to use for client side
     * monitoring events.
     */
    public static final String AWS_CSM_CLIENT_ID_ENV_VAR = "AWS_CSM_CLIENT_ID";

    /**
     * @deprecated by {@link SDKGlobalTime#setGlobalTimeOffset(int)}
     */
    @Deprecated
    public  static void setGlobalTimeOffset(int timeOffset) {
        SDKGlobalTime.setGlobalTimeOffset(timeOffset);
    }

    /**
     * @deprecated by {@link SDKGlobalTime#getGlobalTimeOffset()}
     */
    @Deprecated
    public static int getGlobalTimeOffset() {
        return SDKGlobalTime.getGlobalTimeOffset();
    }

    public static boolean isInRegionOptimizedModeEnabled() {
        return isPropertyEnabled(System.getProperty(ENABLE_IN_REGION_OPTIMIZED_MODE));
    }

    public static boolean isCertCheckingDisabled() {
        return isPropertyEnabled(System.getProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY));
    }

    public static boolean isCborDisabled() {
        return isPropertyEnabled(System.getProperty(AWS_CBOR_DISABLE_SYSTEM_PROPERTY)) ||
                isPropertyEnabled(System.getenv(AWS_CBOR_DISABLE_ENV_VAR));
    }

    public static boolean isIonBinaryDisabled() {
        return isPropertyEnabled(System.getProperty(AWS_ION_BINARY_DISABLE_SYSTEM_PROPERTY)) ||
                isPropertyEnabled(System.getenv(AWS_ION_BINARY_DISABLE_ENV_VAR));
    }

    public static boolean isEc2MetadataDisabled() {
        return isPropertyTrue(System.getProperty(AWS_EC2_METADATA_DISABLED_SYSTEM_PROPERTY)) ||
               isPropertyTrue(System.getenv(AWS_EC2_METADATA_DISABLED_ENV_VAR));
    }

    private static boolean isPropertyEnabled(final String property) {
        if (property == null || property.equalsIgnoreCase("false")) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isPropertyTrue(final String property) {
        if (property != null && property.equalsIgnoreCase("true")) {
            return true;
        }
        return false;
    }
}
