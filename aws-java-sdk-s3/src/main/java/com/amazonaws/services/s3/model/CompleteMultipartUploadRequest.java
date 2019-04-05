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
import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;

/**
 * Container for the parameters of the CompleteMultipartUpload operation.
 * <p>
 * If you are performing a complete multipart upload for <a
 * href="http://aws.amazon.com/kms/">KMS</a>-encrypted objects, you need to
 * specify the correct region of the bucket on your client and configure AWS
 * Signature Version 4 for added security. For more information on how to do
 * this, see
 * http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify
 * -signature-version
 * </p>
 * <p>
 * Required Parameters: BucketName, Key, UploadId, PartETags
 *
 * @see AmazonS3#completeMultipartUpload(CompleteMultipartUploadRequest)
 */
public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /** The name of the bucket containing the multipart upload to complete */
    private String bucketName;

    /** The key of the multipart upload to complete */
    private String key;

    /** The ID of the multipart upload to complete */
    private String uploadId;

    /** The list of part numbers and ETags to use when completing the multipart upload */
    private List<PartETag> partETags = new ArrayList<PartETag>();

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    public CompleteMultipartUploadRequest() {}
    /**
     * Constructs a new request to complete a multipart upload.
     *
     * @param bucketName
     *            The name of the bucket containing the multipart upload to
     *            complete.
     * @param key
     *            The key of the multipart upload to complete.
     * @param uploadId
     *            The ID of the multipart upload to complete.
     * @param partETags
     *            The list of part numbers and ETags to use when completing the
     *            multipart upload.
     */
    public CompleteMultipartUploadRequest(String bucketName, String key, String uploadId, List<PartETag> partETags) {
        this.bucketName = bucketName;
        this.key = key;
        this.uploadId = uploadId;
        this.partETags = partETags;
    }


    /**
     * Returns the name of the bucket containing the multipart upload to
     * complete.
     *
     * @return The name of the bucket containing the multipart upload to
     *         complete.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the multipart upload to complete.
     *
     * @param bucketName
     *            The name of the bucket containing the multipart upload to
     *            complete.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket containing the multipart upload to complete,
     * and returns this updated CompleteMultipartUploadRequest so that
     * additional method calls can be chained together.
     *
     * @param bucketName
     *            The name of the bucket containing the multipart upload to
     *            complete.
     *
     * @return The updated CompleteMultipartUploadRequest.
     */
    public CompleteMultipartUploadRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Returns the key under which the multipart upload to complete is stored.
     *
     * @return The key under which the multipart upload to complete is stored.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key under which the multipart upload to complete is stored.
     *
     * @param key
     *            The key under which the multipart upload to complete is
     *            stored.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key under which the multipart upload to complete is stored, and
     * returns this updated CompleteMultipartUploadRequest object so that
     * additional method calls can be chained together.
     *
     * @param key
     *            The key under which the multipart upload to complete is
     *            stored.
     *
     * @return This updated CompleteMultipartUploadRequest object.
     */
    public CompleteMultipartUploadRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns the ID of the multipart upload to complete.
     *
     * @return The ID of the multipart upload to complete.
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the ID of the multipart upload to complete.
     *
     * @param uploadId
     *            The ID of the multipart upload to complete.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * Sets the ID of the multipart upload to complete, and returns this updated
     * CompleteMultipartUploadRequest object so that additional method calls can
     * be chained together.
     *
     * @param uploadId
     *            The ID of the multipart upload to complete.
     *
     * @return This updated CompleteMultipartUploadRequest object.
     */
    public CompleteMultipartUploadRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * Returns the list of part numbers and ETags that identify the individual
     * parts of the multipart upload to complete.
     *
     * @return The list of part numbers and ETags that identify the individual
     *         parts of the multipart upload to complete.
     */
    public List<PartETag> getPartETags() {
        return partETags;
    }

    /**
     * Sets the list of part numbers and ETags that identify the individual
     * parts of the multipart upload to complete.
     *
     * @param partETags
     *            The list of part numbers and ETags that identify the
     *            individual parts of the multipart upload to complete.
     */
    public void setPartETags(List<PartETag> partETags) {
        this.partETags = partETags;
    }

    /**
     * Sets the list of part numbers and ETags that identify the individual
     * parts of the multipart upload to complete, and returns this updated
     * CompleteMultipartUploadRequest object so that additional method calls can be chained.
     *
     * @param partETags
     *            The list of part numbers and ETags that identify the
     *            individual parts of the multipart upload to complete.
     *
     * @return This updated CompleteMultipartUploadRequest object.
     */
    public CompleteMultipartUploadRequest withPartETags(List<PartETag> partETags) {
        setPartETags(partETags);
        return this;
    }

    /**
     * Sets the list of part numbers and ETags that identify the individual
     * parts of the multipart upload to complete based on the specified results
     * from part uploads.
     *
     * @param uploadPartResults
     *            The list of results from the individual part uploads in the
     *            multipart upload to complete.
     *
     * @return This updated CompleteMultipartUploadRequest object.
     */
    public CompleteMultipartUploadRequest withPartETags(UploadPartResult... uploadPartResults) {
        for (UploadPartResult result : uploadPartResults) {
            this.partETags.add(new PartETag(result.getPartNumber(), result.getETag()));
        }
        return this;
    }

    /**
     * Sets the list of part numbers and ETags that identify the individual
     * parts of the multipart upload to complete based on the specified results
     * from part uploads.
     *
     * @param uploadPartResultsCollection
     *            The list of results from the individual part uploads in the
     *            multipart upload to complete.
     *
     * @return This updated CompleteMultipartUploadRequest object.
     */
    public CompleteMultipartUploadRequest withPartETags(Collection<UploadPartResult> uploadPartResultsCollection) {
        for (UploadPartResult result : uploadPartResultsCollection) {
            this.partETags.add(new PartETag(result.getPartNumber(), result.getETag()));
        }
        return this;
    }

    /**
     * Returns true if the user has enabled Requester Pays option when
     * conducting this operation from Requester Pays Bucket; else false.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket
     *
     * @return true if the user has enabled Requester Pays option for
     *         conducting this operation from Requester Pays Bucket.
     */
    public boolean isRequesterPays() {
        return isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket.
     *
     * @param isRequesterPays
     *            Enable Requester Pays option for the operation.
     */
    public void setRequesterPays(boolean isRequesterPays) {
        this.isRequesterPays = isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket. It returns this
     * updated CompleteMultipartUploadRequest object so that additional method calls can be
     * chained together.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket.
     *
     * @param isRequesterPays
     *            Enable Requester Pays option for the operation.
     *
     * @return The updated CompleteMultipartUploadRequest object.
     */
    public CompleteMultipartUploadRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

}
