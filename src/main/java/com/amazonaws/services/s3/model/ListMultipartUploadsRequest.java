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
 * Container for the parameters of the ListMultipartUploads operation.
 * <p>
 * Required Parameters: BucketName
 *
 * @see AmazonS3#listMultipartUploads(ListMultipartUploadsRequest)
 */
public class ListMultipartUploadsRequest extends AmazonWebServiceRequest {

    /** The name of the bucket containing the uploads to list. */
    private String bucketName;

    /** The optional maximum number of uploads to return. */
    private Integer maxUploads;

    /**
     * The optional key marker indicating where in the results to begin listing.
     * <p>
     * Together with the upload ID marker, specifies the multipart upload after
     * which listing should begin.
     * <p>
     * If the upload ID marker is not specified, only the keys lexicographically
     * greater than the specified key-marker will be included in the list.
     * <p>
     * If the upload ID marker is specified, any multipart uploads for a key
     * equal to the key-marker may also be included, provided those multipart
     * uploads have upload IDs lexicographically greater than the specified
     * marker.
     */
    private String keyMarker;

    /**
     * The optional upload ID marker indicating where in the results to begin
     * listing.
     * <p>
     * Together with the key marker, specifies the multipart upload after which
     * listing should begin. If no key marker is specified, the upload ID marker
     * is ignored. Otherwise, any multipart uploads for a key equal to the key
     * marker may be included in the list only if they have an upload ID
     * lexicographically greater than the specified marker.
     */
    private String uploadIdMarker;


    /**
     * Constructs a new ListMultipartUploadsRequest to list the multipart
     * uploads from the specified bucket.
     *
     * @param bucketName
     *            The name of the bucket containing the uploads to list.
     */
    public ListMultipartUploadsRequest(String bucketName) {
        this.bucketName = bucketName;
    }


    /**
     * Returns the name of the bucket containing the uploads to list.
     *
     * @return The name of the bucket containing the uploads to list.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the multipart uploads to list.
     *
     * @param bucketName
     *            The name of the bucket containing the uploads to list.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets The name of the bucket containing the uploads to list, and returns
     * this updated ListMultipartUploadsRequest object so that additional method
     * calls can be chained together.
     *
     * @param bucketName
     *            The name of the bucket containing the uploads to list.
     *
     * @return This updated ListMultipartUploadsRequest object.
     */
    public ListMultipartUploadsRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Returns the optional maximum number of uploads to return, or null if no
     * maximum number of uploads has been set for this request.
     *
     * @return The optional maximum number of uploads to return.
     */
    public Integer getMaxUploads() {
        return maxUploads;
    }

    /**
     * Sets the optional maximum number of uploads to return.
     *
     * @param maxUploads
     *            The maximum number of uploads to return.
     */
    public void setMaxUploads(Integer maxUploads) {
        this.maxUploads = maxUploads;
    }

    /**
     * Sets the optional maximum number of uploads to return and returns this
     * updated ListMultipartUploadsRequest object so that additional method
     * calls can be chained together.
     *
     * @param maxUploads
     *            The optional maximum number of uploads to return.
     *
     * @return This updated ListMultipartUploadsRequest object.
     */
    public ListMultipartUploadsRequest withMaxUploads(int maxUploads) {
        this.maxUploads = maxUploads;
        return this;
    }

    /**
     * Returns the optional key marker indicating where in the results to begin
     * listing.
     * <p>
     * Together with the upload ID marker, specifies the multipart upload after
     * which listing should begin.
     * <p>
     * If the upload ID marker is not specified, only the keys lexicographically
     * greater than the specified key-marker will be included in the list.
     * <p>
     * If the upload ID marker is specified, any multipart uploads for a key
     * equal to the key-marker may also be included, provided those multipart
     * uploads have upload IDs lexicographically greater than the specified
     * marker.
     *
     * @return The optional key marker indicating where in the results to begin
     *         listing.
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    /**
     * Sets the optional key marker indicating where in the results to begin
     * listing.
     * <p>
     * Together with the upload ID marker, specifies the multipart upload after
     * which listing should begin.
     * <p>
     * If the upload ID marker is not specified, only the keys lexicographically
     * greater than the specified key-marker will be included in the list.
     * <p>
     * If the upload ID marker is specified, any multipart uploads for a key
     * equal to the key-marker may also be included, provided those multipart
     * uploads have upload IDs lexicographically greater than the specified
     * marker.
     *
     * @param keyMarker
     *            The optional key marker indicating where in the results to
     *            begin listing.
     */
    public void setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
    }

    /**
     * Sets the KeyMarker property for this request.
     *
     * @param keyMarker
     *            The value that KeyMarker is set to
     * @return the request with the KeyMarker set
     */
    public ListMultipartUploadsRequest withKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }

    /**
     * Returns the optional upload ID marker indicating where in the results to
     * begin listing.
     * <p>
     * Together with the key marker, specifies the multipart upload after which
     * listing should begin. If no key marker is specified, the upload ID marker
     * is ignored. Otherwise, any multipart uploads for a key equal to the key
     * marker may be included in the list only if they have an upload ID
     * lexicographically greater than the specified marker.
     *
     * @return The optional upload ID marker indicating where in the results to
     *         begin listing.
     */
    public String getUploadIdMarker() {
        return uploadIdMarker;
    }

    /**
     * Sets the optional upload ID marker indicating where in the results to
     * begin listing.
     * <p>
     * Together with the key marker, specifies the multipart upload after which
     * listing should begin. If no key marker is specified, the upload ID marker
     * is ignored. Otherwise, any multipart uploads for a key equal to the key
     * marker may be included in the list only if they have an upload ID
     * lexicographically greater than the specified marker.
     *
     * @param uploadIdMarker
     *            The optional upload ID marker indicating where in the results
     *            to begin listing.
     */
    public void setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
    }

    /**
     * Sets the optional upload ID marker indicating where in the results to
     * begin listing and returns this updated ListMultipartUploadsRequest object
     * so that additional methods can be chained together.
     * <p>
     * Together with the key marker, specifies the multipart upload after which
     * listing should begin. If no key marker is specified, the upload ID marker
     * is ignored. Otherwise, any multipart uploads for a key equal to the key
     * marker may be included in the list only if they have an upload ID
     * lexicographically greater than the specified marker.
     *
     * @param uploadIdMarker
     *            The optional upload ID marker indicating where in the results
     *            to begin listing.
     *
     * @return This updated ListMultipartUploadsRequest object.
     */
    public ListMultipartUploadsRequest withUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
        return this;
    }

}
