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
 * The ListPartsResponse contains all the information about the ListParts
 * method.
 */
public class PartListing {

    /**
     * The name of the bucket containing the listed parts, as specified in the
     * original request.
     */
    private String bucketName;

    /**
     * The key value specified in the original request used to identify which
     * multipart upload contains the parts to list.
     */
    private String key;

    /**
     * The upload ID value specified in the original request used to identify
     * which multipart upload contains the parts to list.
     */
    private String uploadId;

    /**
     * The optional max parts value specified in the original request to limit
     * how many parts are listed.
     */
    private Integer maxParts;

    /**
     * The optional part number marker specified in the original request to
     * specify where in the results to begin listing parts.
     */
    private Integer partNumberMarker;

    /** The user who owns the associated multipart upload. */
    private Owner owner;

    /** The initiator of the associated multipart upload. */
    private Owner initiator;

    /** The class of storage used for the parts in the associated multipart upload. */
    private String storageClass;

    /**
     * Indicates if the listing is truncated, and additional requests need to be
     * made to get more results.
     */
    private boolean isTruncated;

    /**
     * If this listing is truncated, this is the part number marker that should
     * be used in the next request to get the next page of results.
     */
    private Integer nextPartNumberMarker;

    /** The list of parts described in this part listing. */
    private List<PartSummary> parts;


    /**
     * Returns the name of the bucket containing the listed parts, as specified
     * in the original request.
     *
     * @return the name of the bucket containing the listed parts, as specified
     *         in the original request.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the listed parts, as specified in
     * the original request.
     *
     * @param bucketName
     *            the name of the bucket containing the listed parts, as
     *            specified in the original request.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Returns the key value specified in the original request used to identify
     * which multipart upload contains the parts to list.
     *
     * @return the key value specified in the original request used to identify
     *         which multipart upload contains the parts to list.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key value specified in the original request used to identify
     * which multipart upload contains the parts to list.
     *
     * @param key
     *            the key value specified in the original request used to
     *            identify which multipart upload contains the parts to list.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Returns the upload ID value specified in the original request used to
     * identify which multipart upload contains the parts to list.
     *
     * @return the upload ID value specified in the original request used to
     *         identify which multipart upload contains the parts to list.
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the upload ID value specified in the original request used to
     * identify which multipart upload contains the parts to list.
     *
     * @param uploadId
     *            the upload ID value specified in the original request used to
     *            identify which multipart upload contains the parts to list.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * Returns details on the user who owns the associated multipart
     * upload.
     *
     * @return details on the user who owns the associated multipart
     *         upload.
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the user who owns the associated multipart upload.
     *
     * @param owner
     *            the user who owns the associated multipart upload.
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Returns details on the user who initiated the associated multipart
     * upload.
     *
     * @return details on the user who initiated the associated multipart
     *         upload.
     */
    public Owner getInitiator() {
        return initiator;
    }

    /**
     * Sets the user who initiated the associated multipart upload.
     *
     * @param owner
     *            the user who initiated the associated multipart upload.
     */
    public void setInitiator(Owner initiator) {
        this.initiator = initiator;
    }

    /**
     * Returns the class of storage used for the parts in the associated
     * multipart upload.
     *
     * @return The class of storage used for the parts in the associated
     *         multipart upload.
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * Sets the class of storage used for the parts in the associated multipart
     * upload.
     *
     * @param storageClass
     *            The class of storage used for the parts in the associated
     *            multipart upload.
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * Returns the optional part number marker specified in the original request
     * to specify where in the results to begin listing parts.
     *
     * @return the optional part number marker specified in the original request
     *         to specify where in the results to begin listing parts.
     */
    public Integer getPartNumberMarker() {
        return partNumberMarker;
    }

    /**
     * Sets the optional part number marker specified in the original request to
     * specify where in the results to begin listing parts.
     *
     * @param partNumberMarker
     *            the optional part number marker specified in the original
     *            request to specify where in the results to begin listing
     *            parts.
     */
    public void setPartNumberMarker(int partNumberMarker) {
        this.partNumberMarker = partNumberMarker;
    }

    /**
     * Returns the next part number marker. If this listing is truncated, this
     * is the part number marker that should be used in the next request to get
     * the next page of results.
     *
     * @return The next part number marker, to be used for pagination if this
     *         part listing is truncated.
     */
    public Integer getNextPartNumberMarker() {
        return nextPartNumberMarker;
    }

    /**
     * Sets the next part number marker. If this listing is truncated, this is
     * the part number marker that should be used in the next request to get the
     * next page of results.
     *
     * @param nextPartNumberMarker
     *            The next part number marker.
     */
    public void setNextPartNumberMarker(int nextPartNumberMarker) {
        this.nextPartNumberMarker = nextPartNumberMarker;
    }

    /**
     * Returns the optional max parts value specified in the original request to
     * limit how many parts are listed.
     *
     * @return The optional max parts value specified in the original request to
     *         limit how many parts are listed.
     */
    public Integer getMaxParts() {
        return maxParts;
    }

    /**
     * Sets the optional max parts value specified in the original request to
     * limit how many parts are listed.
     *
     * @param maxParts
     *            The optional max parts value specified in the original request
     *            to limit how many parts are listed.
     */
    public void setMaxParts(int maxParts) {
        this.maxParts = maxParts;
    }

    /**
     * Returns whether or not this listing is truncated, and additional requests
     * need to be made to get more results.
     *
     * @return whether or not this listing is truncated, and additional requests
     *         need to be made to get more results.
     */
    public boolean isTruncated() {
        return isTruncated;
    }

    /**
     * Sets whether or not this listing is truncated, and additional requests
     * need to be made to get more results.
     *
     * @param isTruncated
     *            whether or not this listing is truncated, and additional
     *            requests need to be made to get more results.
     */
    public void setTruncated(boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * Returns the list of parts described in this part listing.
     *
     * @return The list of parts described in this part listing.
     */
    public List<PartSummary> getParts() {
        if (parts == null) parts = new ArrayList<PartSummary>();
        return parts;
    }

    /**
     * Sets the list of parts described in this part listing.
     *
     * @param parts
     *            The list of parts described in this part listing.
     */
    public void setParts(List<PartSummary> parts) {
        this.parts = parts;
    }

}
