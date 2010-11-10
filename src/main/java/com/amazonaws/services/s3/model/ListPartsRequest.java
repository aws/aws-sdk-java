/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;

/**
 * Container for the the parameters of the ListParts operation.
 * <p>
 * Required Parameters: BucketName, Key, UploadId
 *
 * @see AmazonS3#listParts(ListPartsRequest)
 */
public class ListPartsRequest extends AmazonWebServiceRequest {

    /**
     * The name of the bucket containing the multipart upload whose parts are
     * being listed.
     */
    private String bucketName;

    /** The key of the associated multipart upload whose parts are being listed. */
    private String key;

    /** The ID of the multipart upload whose parts are being listed. */
    private String uploadId;

    /** The optional maximum number of parts to be returned in the part listing. */
    private Integer maxParts;

    /** The optional part number marker indicating where in the results to being listing parts. */
    private Integer partNumberMarker;


    /**
     * Constructs a new ListPartsRequest from the required parameters bucket
     * name, key and upload ID.
     *
     * @param bucketName
     *            The name of the bucket containing the parts to list.
     * @param key
     *            The key of the associated multipart upload whose parts are
     *            being listed.
     * @param uploadId
     *            The ID of the multipart upload whose parts are being listed.
     */
    public ListPartsRequest(String bucketName, String key, String uploadId) {
        this.bucketName = bucketName;
        this.key = key;
        this.uploadId = uploadId;
    }


    /**
     * Returns the name of the bucket containing the multipart upload whose
     * parts are being listed.
     *
     * @return The name of the bucket containing the multipart upload whose
     *         parts are being listed.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the multipart upload whose parts
     * are being listed.
     *
     * @param bucketName
     *            The name of the bucket containing the multipart upload whose
     *            parts are being listed.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the BucketName property for this request.
     *
     * @param bucketName
     *            The value that BucketName is set to
     * @return the request with the BucketName set
     */
    public ListPartsRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Returns the key of the associated multipart upload whose parts are being
     * listed.
     *
     * @return The key of the associated multipart upload whose parts are being
     *         listed.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key of the associated multipart upload whose parts are being
     * listed.
     *
     * @param key
     *            The key of the associated multipart upload whose parts are
     *            being listed.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key of the associated multipart upload whose parts are being
     * listed, and returns this updated ListPartsRequest object so that
     * additional method calls can be chained together.
     *
     * @param key
     *            The key of the associated multipart upload whose parts are
     *            being listed.
     *
     * @return This updated ListPartsRequest object.
     */
    public ListPartsRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns the ID of the multipart upload whose parts are being listed.
     *
     * @return The ID of the multipart upload whose parts are being listed.
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the ID of the multipart upload whose parts are being listed.
     *
     * @param uploadId
     *            The ID of the multipart upload whose parts are being listed.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * Sets the ID of the multipart upload whose parts are being listed, and
     * returns this updated ListPartsRequest object so that additional method
     * calls can be chained together.
     *
     * @param uploadId
     *            The ID of the multipart upload whose parts are being listed.
     *
     * @return This updated ListPartsRequest object.
     */
    public ListPartsRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * Returns the optional maximum number of parts to be returned in the part
     * listing.
     *
     * @return The optional maximum number of parts to be returned in the part
     *         listing.
     */
    public Integer getMaxParts() {
        return maxParts;
    }

    /**
     * Sets the optional maximum number of parts to be returned in the part
     * listing.
     *
     * @param maxParts
     *            The optional maximum number of parts to be returned in the
     *            part listing.
     */
    public void setMaxParts(int maxParts) {
        this.maxParts = maxParts;
    }

    /**
     * Sets the optional maximum number of parts to be returned in the part
     * listing and returns this updated ListPartsRequest objects so that
     * additional method calls can be chained together.
     *
     * @param maxParts
     *            The optional maximum number of parts to be returned in the
     *            part listing.
     *
     * @return This updated ListPartsRequest object.
     */
    public ListPartsRequest withMaxParts(int maxParts) {
        this.maxParts = maxParts;
        return this;
    }

    /**
     * Returns the optional part number marker indicating where in the results
     * to being listing parts.
     *
     * @return The optional part number marker indicating where in the results
     *         to being listing parts.
     */
    public Integer getPartNumberMarker() {
        return partNumberMarker;
    }

    /**
     * Sets the optional part number marker indicating where in the results to
     * being listing parts.
     *
     * @param partNumberMarker
     *            The optional part number marker indicating where in the
     *            results to being listing parts.
     */
    public void setPartNumberMarker(Integer partNumberMarker) {
        this.partNumberMarker = partNumberMarker;
    }

    /**
     * Sets the optional part number marker indicating where in the results to
     * being listing parts, and returns this updated ListPartsRequest object so
     * that additional method calls can be chained together.
     *
     * @param partNumberMarker
     *            The optional part number marker indicating where in the
     *            results to being listing parts.
     *
     * @return This updated ListPartsRequest object.
     */
    public ListPartsRequest withPartNumberMarker(Integer partNumberMarker) {
        this.partNumberMarker = partNumberMarker;
        return this;
    }

}
