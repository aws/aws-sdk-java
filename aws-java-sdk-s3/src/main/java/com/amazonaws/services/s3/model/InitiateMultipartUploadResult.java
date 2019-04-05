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
package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.SSEResultBase;

import java.io.Serializable;
import java.util.Date;

/**
 * Contains the results of initiating a multipart upload, particularly the
 * unique ID of the new multipart upload.
 *
 * @see AmazonS3#initiateMultipartUpload(InitiateMultipartUploadRequest)
 */
public class InitiateMultipartUploadResult extends SSEResultBase
        implements S3RequesterChargedResult, Serializable {

    /** The name of the bucket in which the new multipart upload was initiated */
    private String bucketName;

    /** The object key for which the multipart upload was initiated */
    private String key;

    /** The unique ID of the new multipart upload */
    private String uploadId;

    /** Date when multipart upload will become eligible for abort operation by lifecycle. */
    private Date abortDate;

    /** Id of the lifecycle rule that makes a multipart upload eligible for abort operation. */
    private String abortRuleId;

    /**
     * Indicate if the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterCharged;

    /**
     * Returns the name of the bucket in which the new multipart upload was
     * initiated.
     *
     * @return The name of the bucket in which the new multipart upload was
     *         initiated.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket in which the new multipart upload was
     * initiated.
     *
     * @param bucketName
     *            The name of the bucket in which the new multipart upload was
     *            initiated.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Returns the object key for which the multipart upload was initiated.
     *
     * @return The object key for which the multipart upload was initiated.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the object key for which the multipart upload was initiated.
     *
     * @param key
     *            The object key for which the multipart upload was initiated.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Returns the initiated multipart upload ID.
     *
     * @return the initiated multipart upload ID.
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the initiated multipart upload ID.
     *
     * @param uploadId
     *            The initiated multipart upload ID.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * Date when multipart upload will become eligible for abort operation by lifecycle.
     *
     * @return The date when the upload will be eligible for abort.
     */
    public Date getAbortDate() {
        return abortDate;
    }

    /**
     * Date when multipart upload will become eligible for abort operation by lifecycle.
     *
     * @param abortDate
     *         The date when the upload will be eligible for abort.
     */
    public void setAbortDate(Date abortDate) {
        this.abortDate = abortDate;
    }

    /**
     * Id of the lifecycle rule that makes a multipart upload eligible for abort operation.
     *
     * @return Rule ID
     */
    public String getAbortRuleId() {
        return abortRuleId;
    }

    /**
     * Id of the lifecycle rule that makes a multipart upload eligible for abort operation.
     *
     * @param abortRuleId Rule ID
     */
    public void setAbortRuleId(String abortRuleId) {
        this.abortRuleId = abortRuleId;
    }

    @Override
    public boolean isRequesterCharged() {
        return isRequesterCharged;
    }

    @Override
    public void setRequesterCharged(boolean isRequesterCharged) {
        this.isRequesterCharged = isRequesterCharged;
    }

}
