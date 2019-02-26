/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
public class UploadObjectRequest extends AbstractPutObjectRequest implements
        MaterialsDescriptionProvider, Serializable {
	private static final long serialVersionUID = 1L;

	static final int MIN_PART_SIZE = 5 << 20; // 5 MB

    /**
     * Optional metadata to be included in each upload part requests.
     */
    private ObjectMetadata uploadPartMetadata;
    /**
     * description of encryption materials to be used with this request.
     */
    private Map<String, String> materialsDescription;
    /**
     * Part size (in bytes). Default is {@value #MIN_PART_SIZE}. This part size
     * will be used as a reference for the multi-part uploads but the physical
     * part size may vary.
     */
    private long partSize = MIN_PART_SIZE;
    /**
     * Optional configuration of a custom thread pool used for concurrent uploads.
     */
    private transient ExecutorService executorService;
    /**
     * Optional configuration of a custom mutli-file output stream used for
     * generating multiple parts for ciphertext.
     */
    private transient MultiFileOutputStream multiFileOutputStream;
    /**
     * Optional configuration of an object observer for advanced customization.
     */
    private transient UploadObjectObserver uploadObjectObserver;

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

    @Override
    public Map<String, String> getMaterialsDescription() {
        return materialsDescription;
    }

    /**
     * Sets the materials description for the encryption materials to be used
     * with the current request.
     *
     * @param materialsDescription
     *            the materialsDescription to set
     */
    public void setMaterialsDescription(Map<String, String> materialsDescription) {
        this.materialsDescription = materialsDescription == null
            ? null
            : Collections.unmodifiableMap(
                new HashMap<String, String>(materialsDescription));
    }

    /**
     * Fluent API for {@link #setMaterialsDescription(Map)}.
     */
    public UploadObjectRequest withMaterialsDescription(
            Map<String, String> materialsDescription) {
        setMaterialsDescription(materialsDescription);
        return this;
    }

    /**
     * Gets the optional metadata to be included in each UploadPart request.
     */
    public ObjectMetadata getUploadPartMetadata() {
        return uploadPartMetadata;
    }

    /**
     * Sets the optional metadata to be included in each UploadPart request.
     */
    public void setUploadPartMetadata(ObjectMetadata partUploadMetadata) {
        this.uploadPartMetadata = partUploadMetadata;
    }

    /**
     * Fluent API for {@link #setUploadPartMetadata(ObjectMetadata)}.
     */
    public <T extends UploadObjectRequest> T withUploadPartMetadata(
            ObjectMetadata partUploadMetadata) {
        setUploadPartMetadata(partUploadMetadata);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Returns a clone (as deep as possible) of this request object.
     */
    @Override
    public UploadObjectRequest clone() {
        final UploadObjectRequest cloned = (UploadObjectRequest) super.clone();
        super.copyPutObjectBaseTo(cloned);
        final Map<String, String> materialsDescription = getMaterialsDescription();
        final ObjectMetadata uploadPartMetadata = getUploadPartMetadata();
        return cloned
                .withMaterialsDescription(materialsDescription == null
                    ? null
                    : new HashMap<String, String>(materialsDescription))
                .withDiskLimit(getDiskLimit())
                .withExecutorService(getExecutorService())
                .withMultiFileOutputStream(getMultiFileOutputStream())
                .withPartSize(getPartSize())
                .withUploadObjectObserver(getUploadObjectObserver())
                .withUploadPartMetadata(uploadPartMetadata == null
                    ? null : uploadPartMetadata.clone())
                ;
    }
}
