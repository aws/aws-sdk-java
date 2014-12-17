/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

import com.amazonaws.services.s3.AmazonS3EncryptionClient;
import com.amazonaws.services.s3.UploadObjectObserver;
import com.amazonaws.services.s3.internal.MultiFileOutputStream;

/**
 * Used to request the client-side encryption and upload of a large S3 object
 * via pipelined parallel multi-part uploads.
 * 
 * @see AmazonS3EncryptionClient#uploadObject(UploadObjectRequest)
 */
public class UploadObjectRequest extends AbstractPutObjectRequest {
    static final int MIN_PART_SIZE = 5 << 20; // 5 MB
    
    /**
     * Part size (in bytes). Default is {@value #MIN_PART_SIZE}. This part size
     * will be used as a reference for the multi-part uploads but the physical
     * part size may vary.
     */
    private long partSize = MIN_PART_SIZE;
    /**
     * Optional configuration of a custom thread pool used for concurrent uploads.
     */
    private ExecutorService executorService;
    /**
     * Optional configuration of a custom mutli-file output stream used for 
     * generating multiple parts for ciphertext.
     */
    private MultiFileOutputStream multiFileOutputStream;
    /**
     * Optional configuration of an object observer for advanced customization.
     */
    private UploadObjectObserver uploadObjectObserver;

    /**
     * Limitation (in bytes) on temporary disk space consumption for this
     * request; must be at least twice the amount of the specified
     * {@link #partSize}. The default is {@value Long#MAX_VALUE}.
     */
    private long diskLimit = Long.MAX_VALUE;

    public UploadObjectRequest(String bucketName, String key, File file) {
        super(bucketName, key, file);
    }

    public UploadObjectRequest(String bucketName, String key,
            InputStream input, ObjectMetadata metadata) {
        super(bucketName, key, input, metadata);
    }

    /**
     * Returns a clone (as deep as possible) of this request object.
     */
    @Override
    public UploadObjectRequest clone() {
        ObjectMetadata metadata = getMetadata();
        UploadObjectRequest cloned =
            new UploadObjectRequest(
                    getBucketName(), 
                    getKey(),
                    getFile())
                .withPartSize(getPartSize())
                .withExecutorService(getExecutorService())
                .withAccessControlList(getAccessControlList())
                .withCannedAcl(getCannedAcl())
                .withInputStream(getInputStream())
                .withMetadata(metadata == null ? null : metadata.clone())
                .withStorageClass(getStorageClass())
                .withSSECustomerKey(getSSECustomerKey())
                ;
        return copyBaseTo(cloned);
    }

    /**
     * Returns the part-size used for muti-part upload for this request. This
     * part size will be used as a reference for the multi-part uploads but the
     * physical part size may vary.
     */
    public long getPartSize() {
        return partSize;
    }

    /**
     * Configured the part size for multi-part upload. Must be at least
     * {@link #MIN_PART_SIZE}. This part size will be used as a reference for
     * the multi-part uploads but the physical part size may vary.
     *
     * @return this object for method chaining purposes
     */
    public UploadObjectRequest withPartSize(long partSize) {
        if (partSize < MIN_PART_SIZE)
            throw new IllegalArgumentException("partSize must be at least "
                    + MIN_PART_SIZE);
        this.partSize = partSize;
        return this;
    }

    /**
     * Returns the maximum size (in bytes) of additional disk space that will be
     * consumed for this request; or {@link Long#MAX_VALUE} if there is no
     * limit.
     */
    public long getDiskLimit() {
        return diskLimit;
    }

    /**
     * Configured the maximum disk space (in bytes) that will be consumed for
     * this request. The maximum disk space must be at least twice the size of
     * {@link #partSize}.
     *
     * @return this object for method chaining purposes
     */
    public UploadObjectRequest withDiskLimit(long diskLimit) {
        this.diskLimit = diskLimit;
        return this;
    }

    /**
     * Returns a custom executor service for concurrent uploads; or null there
     * is no customization.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Configure a custom executor service for concurrent uploads.
     *
     * @return this object for method chaining purposes
     */
    public UploadObjectRequest withExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    /**
     * Returns a custom multi-file output stream; or null if the default is to
     * be used.
     */
    public MultiFileOutputStream getMultiFileOutputStream() {
        return multiFileOutputStream;
    }

    /**
     * Configure a custom multi-file output stream; or null if the default is
     * to be used.
     *
     * @return this object for method chaining purposes
     */
    public UploadObjectRequest withMultiFileOutputStream(
            MultiFileOutputStream multiFileOutputStream) {
        this.multiFileOutputStream = multiFileOutputStream;
        return this;
    }

    /**
     * Returns a custom upload-object observer; or null there is no
     * customization.
     */
    public UploadObjectObserver getUploadObjectObserver() {
        return uploadObjectObserver;
    }

    /**
     * Configure a custom upload-object observer; or null if the default is to
     * be used.
     *
     * @return this object for method chaining purposes
     */
    public UploadObjectRequest withUploadObjectObserver(
            UploadObjectObserver uploadObjectObserver) {
        this.uploadObjectObserver = uploadObjectObserver;
        return this;
    }
}
