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

import java.util.ArrayList;
import java.util.List;

/**
 * The ListMultipartUploadsResponse contains all the information about the
 * ListMultipartUploads method.
 */
public class MultipartUploadListing {

    /**
     * The name of the bucket containing the listed multipart uploads, as
     * specified in the original request.
     */
    private String bucketName;

    /**
     * The optional key marker specified in the original request to specify
     * where in the results to begin listing multipart uploads.
     */
    private String keyMarker;

    /**
     * The optional upload ID marker specified in the original request to
     * specify where in the results to begin listing multipart uploads.
     */
    private String uploadIdMarker;

    /**
     * The optional maximum number of uploads to be listed, as specified in the
     * original request.
     */
    private int maxUploads;

    /**
     * Indicates if the listing is truncated, and additional requests need to be
     * made to get more results.
     */
    private boolean isTruncated;

    /**
     * If this listing is truncated, this is the next key marker that should be
     * used in the next request to get the next page of results.
     */
    private String nextKeyMarker;

    /**
     * If this listing is truncated, this is the next upload ID marker that
     * should be used in the next request to get the next page of results.
     */
    private String nextUploadIdMarker;

    /** The list of multipart uploads. */
    private List<MultipartUpload> multipartUploads;


    /**
     * Returns the name of the bucket containing the listed multipart uploads,
     * as specified in the original request.
     *
     * @return The name of the bucket containing the listed multipart uploads,
     *         as specified in the original request.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the listed multipart uploads, as
     * specified in the original request.
     *
     * @param bucketName
     *            The name of the bucket containing the listed multipart
     *            uploads, as specified in the original request.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Returns the optional key marker specified in the original request to
     * specify where in the results to begin listing multipart uploads.
     *
     * @return The optional key marker specified in the original request to
     *         specify where in the results to begin listing multipart uploads.
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    /**
     * Sets the optional key marker specified in the original request to specify
     * where in the results to begin listing multipart uploads.
     *
     * @param keyMarker
     *            The optional key marker specified in the original request to
     *            specify where in the results to begin listing multipart
     *            uploads.
     */
    public void setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
    }

    /**
     * Returns the optional upload ID marker specified in the original request
     * to specify where in the results to begin listing multipart uploads.
     *
     * @return The optional upload ID marker specified in the original request
     *         to specify where in the results to begin listing multipart
     *         uploads.
     */
    public String getUploadIdMarker() {
        return uploadIdMarker;
    }

    /**
     * Sets the optional upload ID marker specified in the original request to
     * specify where in the results to begin listing multipart uploads.
     *
     * @param uploadIdMarker
     *            The optional upload ID marker specified in the original
     *            request to specify where in the results to begin listing
     *            multipart uploads.
     */
    public void setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
    }

    /**
     * Returns the next key marker that should be used in the next request to
     * get the next page of results. This value is only valid if
     * {@link #isTruncated()} indicates this listing is truncated.
     *
     * @return the next key marker that should be used in the next request to
     *         get the next page of results. This value is only valid if
     *         {@link #isTruncated()} indicates this listing is truncated.
     */
    public String getNextKeyMarker() {
        return nextKeyMarker;
    }

    /**
     * Sets the next key marker that should be used in the next request to get
     * the next page of results.
     *
     * @param nextKeyMarker
     *            the next key marker that should be used in the next request to
     *            get the next page of results.
     */
    public void setNextKeyMarker(String nextKeyMarker) {
        this.nextKeyMarker = nextKeyMarker;
    }

    /**
     * Returns the next upload ID marker that should be used in the next request
     * to get the next page of results. This value is only valid if
     * {@link #isTruncated()} indicates this listing is truncated.
     *
     * @return the next upload ID marker that should be used in the next request
     *         to get the next page of results.
     */
    public String getNextUploadIdMarker() {
        return nextUploadIdMarker;
    }

    /**
     * Sets the next upload ID marker that should be used in the next request to
     * get the next page of results.
     *
     * @param nextUploadIdMarker
     *            The next upload ID marker that should be used in the next
     *            request to get the next page of results.
     */
    public void setNextUploadIdMarker(String nextUploadIdMarker) {
        this.nextUploadIdMarker = nextUploadIdMarker;
    }

    /**
     * Returns the optional maximum number of uploads to be listed, as specified
     * in the original request.
     *
     * @return The optional maximum number of uploads to be listed, as specified
     *         in the original request.
     */
    public int getMaxUploads() {
        return maxUploads;
    }

    /**
     * Sets the optional maximum number of uploads to be listed, as specified in
     * the original request.
     *
     * @param maxUploads
     *            The optional maximum number of uploads to be listed, as
     *            specified in the original request.
     */
    public void setMaxUploads(int maxUploads) {
        this.maxUploads = maxUploads;
    }

    /**
     * Returns true if the listing is truncated, and additional requests need to
     * be made to get more results.
     *
     * @return true if the listing is truncated, and additional requests need to
     *         be made to get more results.
     */
    public boolean isTruncated() {
        return isTruncated;
    }

    /**
     * Sets whether this listing is truncated, and additional requests need to
     * be made to get more results.
     *
     * @param isTruncated
     *            true if the listing is truncated, and additional requests need
     *            to be made to get more results.
     */
    public void setTruncated(boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * Returns the list of multipart uploads.
     *
     * @return The list of multipart uploads.
     */
    public List<MultipartUpload> getMultipartUploads() {
        if (multipartUploads == null) multipartUploads = new ArrayList<MultipartUpload>();
        return multipartUploads;
    }

    /**
     * Sets the list of multipart uploads.
     *
     * @param multipartUploads
     *            The list of multipart uploads.
     */
    public void setMultipartUploads(List<MultipartUpload> multipartUploads) {
        this.multipartUploads = multipartUploads;
    }

}
