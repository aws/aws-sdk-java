/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.transfer;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.client.builder.ExecutorFactory;
import com.amazonaws.internal.SdkFunction;
import com.amazonaws.regions.DefaultAwsRegionProviderChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.transfer.internal.TransferManagerUtils;

import java.util.concurrent.ExecutorService;

/**
 * Fluent builder for {@link TransferManager}. Use of the builder is preferred over constructors in
 * the TransferManager class.
 *
 * Note that if no {@link AmazonS3} is provided via {@link #withS3Client(AmazonS3)}} or {@link #setS3Client(AmazonS3)}
 * a default client will be created using {@link DefaultAwsRegionProviderChain} and {@link DefaultAWSCredentialsProviderChain}.
 **/
@NotThreadSafe
public final class TransferManagerBuilder {

    private static final SdkFunction<TransferManagerParams, TransferManager> DEFAULT_TRANSFER_MANAGER_FACTORY = new SdkFunction<TransferManagerParams, TransferManager>() {
        @Override
        public TransferManager apply(TransferManagerParams params) {
            return new TransferManager(params);
        }
    };

    private final SdkFunction<TransferManagerParams, TransferManager> transferManagerFactory;

    private AmazonS3 s3Client;

    private ExecutorFactory executorFactory;

    private Boolean shutDownThreadPools;

    private Long minimumUploadPartSize;

    private Long multipartUploadThreshold;

    private Long multipartCopyThreshold;

    private Long multipartCopyPartSize;

    private Boolean disableParallelDownloads;

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static TransferManagerBuilder standard() {
        return new TransferManagerBuilder();
    }

    /**
     * @return Default TransferManager with default configuration. Uses {@link
     * AmazonS3ClientBuilder} to create a default {@link AmazonS3} client implementation.
     */
    public static TransferManager defaultTransferManager() {
        return standard().build();
    }

    private TransferManagerBuilder() {
        this(DEFAULT_TRANSFER_MANAGER_FACTORY);
    }

    @SdkTestInternalApi
    TransferManagerBuilder(
            SdkFunction<TransferManagerParams, TransferManager> transferManagerFactory) {
        this.transferManagerFactory = transferManagerFactory;
    }

    /**
     * @return The low level client currently configured in the builder.
     */
    public final AmazonS3 getS3Client() {
        return s3Client;
    }

    /**
     * Sets the low level client used to make the service calls to Amazon S3. If no
     * client is specified, a default client will be created using {@link DefaultAwsRegionProviderChain}
     * and {@link DefaultAWSCredentialsProviderChain}.
     *
     * @param s3Client Client implementation to use
     */
    public final void setS3Client(AmazonS3 s3Client) {
        this.s3Client = s3Client;
    }

    /**
     * Sets the low level client used to make the service calls to Amazon S3. If no
     * client is specified, a default client will be created using {@link DefaultAwsRegionProviderChain}
     * and {@link DefaultAWSCredentialsProviderChain}.
     *
     * @param s3Client Client implementation to use
     * @return This object for method chaining.
     */
    public final TransferManagerBuilder withS3Client(AmazonS3 s3Client) {
        setS3Client(s3Client);
        return this;
    }

    private AmazonS3 resolveS3Client() {
        return s3Client == null ? AmazonS3ClientBuilder.defaultClient() : s3Client;
    }

    /**
     * @return The {@link ExecutorFactory} currently configured in the builder.
     */
    public final ExecutorFactory getExecutorFactory() {
        return executorFactory;
    }

    /**
     * Sets a new {@link ExecutorFactory} for the builder. The factory is invoked for each transfer
     * manager created through the builder.
     *
     * @param executorFactory New executor factory to use.
     */
    public final void setExecutorFactory(ExecutorFactory executorFactory) {
        this.executorFactory = executorFactory;
    }

    /**
     * Sets a new {@link ExecutorFactory} for the builder. The factory is invoked for each transfer
     * manager created through the builder.
     *
     * @param executorFactory New executor factory to use.
     * @return This object for method chaining.
     */
    public final TransferManagerBuilder withExecutorFactory(ExecutorFactory executorFactory) {
        setExecutorFactory(executorFactory);
        return this;
    }

    private ExecutorService resolveExecutorService() {
        return executorFactory == null ? TransferManagerUtils.createDefaultExecutorService() :
                executorFactory.newExecutor();
    }

    /**
     * @return Current configured option on how thread pools should be managed when transfer manager
     * is shut down.
     */
    public final Boolean isShutDownThreadPools() {
        return shutDownThreadPools;
    }

    /**
     * By default, when the transfer manager is shut down, the underlying {@link ExecutorService} is
     * also shut down. For cases where the same thread pool is reused across different workloads you
     * can set this option to false to disable that behavior.
     *
     * @param shutDownThreadPools True to shut down thread pools on transfer manager shutdown, false
     *                            otherwise.
     */
    public final void setShutDownThreadPools(Boolean shutDownThreadPools) {
        this.shutDownThreadPools = shutDownThreadPools;
    }

    /**
     * By default, when the transfer manager is shut down, the underlying {@link ExecutorService} is
     * also shut down. For cases where the same thread pool is reused across different workloads you
     * can set this option to false to disable that behavior.
     *
     * @param shutDownThreadPools True to shut down thread pools on transfer manager shutdown, false
     *                            otherwise.
     * @return This object for method chaining.
     */
    public final TransferManagerBuilder withShutDownThreadPools(Boolean shutDownThreadPools) {
        setShutDownThreadPools(shutDownThreadPools);
        return this;
    }

    private Boolean resolveShutDownThreadPools() {
        return shutDownThreadPools == null ? Boolean.TRUE : shutDownThreadPools;
    }

    /**
     * @return The minimum upload part size currently configured in the builder.
     */
    public final Long getMinimumUploadPartSize() {
        return minimumUploadPartSize;
    }

    /**
     * Sets the minimum part size for upload parts. Decreasing the minimum part size will cause
     * multipart uploads to be split into a larger number of smaller parts. Setting this value too
     * low can have a negative effect on transfer speeds since it will cause extra latency and
     * network communication for each part.
     *
     * @param minimumUploadPartSize New minimum threshold for upload part size
     */
    public final void setMinimumUploadPartSize(Long minimumUploadPartSize) {
        this.minimumUploadPartSize = minimumUploadPartSize;
    }

    /**
     * Sets the minimum part size for upload parts. Decreasing the minimum part size will cause
     * multipart uploads to be split into a larger number of smaller parts. Setting this value too
     * low can have a negative effect on transfer speeds since it will cause extra latency and
     * network communication for each part.
     *
     * @param minimumUploadPartSize New minimum threshold for upload part size
     * @return This object for method chaining.
     */
    public final TransferManagerBuilder withMinimumUploadPartSize(Long minimumUploadPartSize) {
        setMinimumUploadPartSize(minimumUploadPartSize);
        return this;
    }

    /**
     * @return The multipart upload threshold currently configured in the builder.
     */
    public final Long getMultipartUploadThreshold() {
        return multipartUploadThreshold;
    }

    /**
     * Sets the size threshold, in bytes, for when to use multipart uploads. Uploads over this size
     * will automatically use a multipart upload strategy, while uploads smaller than this threshold
     * will use a single connection to upload the whole object.
     *
     * <p>Multipart uploads are easier to recover from and also potentially faster than single part
     * uploads, especially when the upload parts can be uploaded in parallel as with files. Because
     * there is additional network communication, small uploads are still recommended to use a
     * single connection for the upload.</p>
     *
     * @param multipartUploadThreshold Threshold in which multipart uploads will be performed.
     */
    public final void setMultipartUploadThreshold(Long multipartUploadThreshold) {
        this.multipartUploadThreshold = multipartUploadThreshold;
    }

    /**
     * Sets the size threshold, in bytes, for when to use multipart uploads. Uploads over this size
     * will automatically use a multipart upload strategy, while uploads smaller than this threshold
     * will use a single connection to upload the whole object.
     *
     * <p>Multipart uploads are easier to recover from and also potentially faster than single part
     * uploads, especially when the upload parts can be uploaded in parallel as with files. Because
     * there is additional network communication, small uploads are still recommended to use a
     * single connection for the upload.</p>
     *
     * @param multipartUploadThreshold Threshold in which multipart uploads will be performed.
     * @return This object for method chaining.
     */
    public final TransferManagerBuilder withMultipartUploadThreshold(
            Long multipartUploadThreshold) {
        setMultipartUploadThreshold(multipartUploadThreshold);
        return this;
    }

    /**
     * @return The multipart copy threshold currently configured in the builder.
     */
    public final Long getMultipartCopyThreshold() {
        return multipartCopyThreshold;
    }

    /**
     * Sets the size threshold, in bytes, for when to use multi-part copy. Copy requests for objects
     * over this size will automatically use a multi-part copy strategy, while copy requests for
     * objects smaller than this threshold will use a single connection to copy the whole object.
     *
     * @param multipartCopyThreshold Threshold in which multipart copies will be performed.
     */
    public final void setMultipartCopyThreshold(Long multipartCopyThreshold) {
        this.multipartCopyThreshold = multipartCopyThreshold;
    }

    /**
     * Sets the size threshold, in bytes, for when to use multi-part copy. Copy requests for objects
     * over this size will automatically use a multi-part copy strategy, while copy requests for
     * objects smaller than this threshold will use a single connection to copy the whole object.
     *
     * @param multipartCopyThreshold Threshold in which multipart copies will be performed.
     * @return This object for method chaining.
     */
    public final TransferManagerBuilder withMultipartCopyThreshold(Long multipartCopyThreshold) {
        setMultipartCopyThreshold(multipartCopyThreshold);
        return this;
    }

    /**
     * @return The multipart copy part size currently configured in the builder.
     */
    public final Long getMultipartCopyPartSize() {
        return multipartCopyPartSize;
    }

    /**
     * Sets the minimum size in bytes of each part when a multi-part copy operation is carried out.
     * Decreasing the minimum part size will cause a large number of copy part requests being
     * initiated.
     *
     * @param multipartCopyPartSize New minimum threshold for copy part size
     */
    public final void setMultipartCopyPartSize(Long multipartCopyPartSize) {
        this.multipartCopyPartSize = multipartCopyPartSize;
    }

    /**
     * Sets the minimum size in bytes of each part when a multi-part copy operation is carried out.
     * Decreasing the minimum part size will cause a large number of copy part requests being
     * initiated.
     *
     * @param multipartCopyPartSize New minimum threshold for copy part size
     * @return This object for method chaining.
     */
    public final TransferManagerBuilder withMultipartCopyPartSize(Long multipartCopyPartSize) {
        setMultipartCopyPartSize(multipartCopyPartSize);
        return this;
    }

    /**
     * Returns if the parallel downloads are disabled or not. By default, the value is set to false.
     *
     * <p>
     * TransferManager automatically detects and downloads a multipart object
     * in parallel. Setting this option to true will disable parallel downloads.
     * </p>
     * <p>
     * During parallel downloads, each part is downloaded to a temporary file, gets merged
     * into the final destination file and will be deleted. These temporary files uses disk space temporarily.
     * Disable parallel downloads if your system do not have enough space to store these files during download.
     * </p>
     * <p>
     * Disabling parallel downloads might reduce performance for large files.
     * </p>
     *
     * @return true if parallel downloads are disabled, otherwise false.
     */
    public Boolean isDisableParallelDownloads() {
        return disableParallelDownloads;
    }

    /**
     * Sets the option to disable parallel downloads. By default, the value is set to false.
     *
     * <p>
     * TransferManager automatically detects and downloads a multipart object
     * in parallel. Setting this option to true will disable parallel downloads.
     * </p>
     * <p>
     * During parallel downloads, each part is downloaded to a temporary file, gets merged
     * into the final destination file and will be deleted. These temporary files uses disk space temporarily.
     * Disable parallel downloads if your system do not have enough space to store these files during download.
     * </p>
     * <p>
     * Disabling parallel downloads might reduce performance for large files.
     * </p>
     *
     * @param disableParallelDownloads boolean value to disable parallel downloads.
     */
    public void setDisableParallelDownloads(Boolean disableParallelDownloads) {
        this.disableParallelDownloads = disableParallelDownloads;
    }

    /**
     * Sets the option to disable parallel downloads. By default, the value is set to false.
     *
     * <p>
     * TransferManager automatically detects and downloads a multipart object
     * in parallel. Setting this option to true will disable parallel downloads.
     * </p>
     * <p>
     * During parallel downloads, each part is downloaded to a temporary file, gets merged
     * into the final destination file and will be deleted. These temporary files uses disk space temporarily.
     * Disable parallel downloads if your system do not have enough space to store these files during download.
     * </p>
     * <p>
     * Disabling parallel downloads might reduce performance for large files.
     * </p>
     *
     * @param disableParallelDownloads boolean value to disable parallel downloads.
     * @return this object for method changing
     */
    public TransferManagerBuilder withDisableParallelDownloads(Boolean disableParallelDownloads) {
        setDisableParallelDownloads(disableParallelDownloads);
        return this;
    }

    /**
     * Disables parallel downloads, see {@link #setDisableParallelDownloads(Boolean)}
     * <p>
     * Disabling parallel downloads might reduce performance for large files.
     * </p>
     *
     * @return This object for method chaining
     */
    public TransferManagerBuilder disableParallelDownloads() {
        return withDisableParallelDownloads(Boolean.TRUE);
    }

    private TransferManagerConfiguration resolveConfiguration() {
        TransferManagerConfiguration configuration = new TransferManagerConfiguration();
        if (this.minimumUploadPartSize != null) {
            configuration.setMinimumUploadPartSize(minimumUploadPartSize);
        }
        if (this.multipartCopyPartSize != null) {
            configuration.setMultipartCopyPartSize(multipartCopyPartSize);
        }
        if (this.multipartCopyThreshold != null) {
            configuration.setMultipartCopyThreshold(multipartCopyThreshold);
        }
        if (this.multipartUploadThreshold != null) {
            configuration.setMultipartUploadThreshold(multipartUploadThreshold);
        }

        if (this.disableParallelDownloads != null) {
            configuration.setDisableParallelDownloads(disableParallelDownloads);
        }
        return configuration;
    }

    TransferManagerParams getParams() {
        return new TransferManagerParams().withS3Client(resolveS3Client())
                .withExecutorService(resolveExecutorService())
                .withShutDownThreadPools(resolveShutDownThreadPools())
                .withTransferManagerConfiguration(resolveConfiguration());
    }

    /**
     * Construct a TransferManager with the default ExecutorService.
     *
     * @return TransferManager with configured AmazonS3 client.
     */
    public final TransferManager build() {
        return transferManagerFactory.apply(getParams());
    }

}
