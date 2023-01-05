/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;

/**
 * The AbortMultipartUploadRequest contains the parameters used for the
 * AbortMultipartUpload method.
 * <p>
 * Required Parameters: BucketName, Key, UploadId
 *
 * @see AmazonS3#abortMultipartUpload(AbortMultipartUploadRequest)
 */
public class AbortMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable, ExpectedBucketOwnerRequest {

    /**
     * The name of the bucket containing the multipart upload to abort
     *
     * <p>
     * When using this API with an access point, you must direct requests
     * to the access point hostname. The access point hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com.
     * </p>
     * <p>
     * When using this operation using an access point through the Amazon Web Services SDKs, you provide
     * the access point ARN in place of the bucket name. For more information about access point
     * ARNs, see <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html\">
     * Using access points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     */
    private String bucketName;

    /** The key of the multipart upload to abort */
    private String key;

    /** The ID of the multipart upload to abort */
    private String uploadId;

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    private String expectedBucketOwner;

    /**
     * Constructs a new request to abort a multipart upload.
     *
     * @param bucketName
     *            The name of the bucket containing the multipart upload to
     *            abort.
     * @param key
     *            The key of the multipart upload to abort.
     * @param uploadId
     *            The ID of the multipart upload to abort.
     */
    public AbortMultipartUploadRequest(String bucketName, String key, String uploadId) {
        this.bucketName = bucketName;
        this.key = key;
        this.uploadId = uploadId;
    }

    public String getExpectedBucketOwner() {
        return expectedBucketOwner;
    }

    public AbortMultipartUploadRequest withExpectedBucketOwner(String expectedBucketOwner) {
        this.expectedBucketOwner = expectedBucketOwner;
        return this;
    }

    public void setExpectedBucketOwner(String expectedBucketOwner) {
        withExpectedBucketOwner(expectedBucketOwner);
    }

    /**
     * <p>
     * The bucket name to which the upload was taking place.
     * </p>
     * <p>
     * When using this action with an access point, you must direct requests to the access point hostname. The access
     * point hostname takes the form <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com.
     * When using this action with an access point through the Amazon Web Services SDKs, you provide the access point
     * ARN in place of the bucket name. For more information about access point ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The
     * S3 on Outposts hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com. When using this
     * action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of
     * the bucket name. For more information about S3 on Outposts ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     *
     * @return The bucket name to which the upload was taking place. </p>
     *         <p>
     *         When using this action with an access point, you must direct requests to the access point hostname. The
     *         access point hostname takes the form
     *         <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *         action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in
     *         place of the bucket name. For more information about access point ARNs, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access
     *         points</a> in the <i>Amazon S3 User Guide</i>.
     *         </p>
     *         <p>
     *         When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts
     *         hostname. The S3 on Outposts hostname takes the form
     *         <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com. When
     *         using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts
     *         bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts</a>
     *         in the <i>Amazon S3 User Guide</i>.
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * Sets the name of the bucket containing the multipart upload to abort.
     */
    public void setBucketName(String value) {
        this.bucketName = value;
    }

    /**
     * <p>
     * The bucket name to which the upload was taking place.
     * </p>
     * <p>
     * When using this action with an access point, you must direct requests to the access point hostname. The
     * access point hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this action
     * with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the
     * bucket name. For more information about access point ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname.
     * The S3 on Outposts hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com. When using
     * this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in
     * place of the bucket name. For more information about S3 on Outposts ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     *
     * @param bucketName
     *        The bucket name to which the upload was taking place. </p>
     *        <p>
     *        When using this action with an access point, you must direct requests to the access point hostname.
     *        The access point hostname takes the form
     *        <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *        action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in
     *        place of the bucket name. For more information about access point ARNs, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access
     *        points</a> in the <i>Amazon S3 User Guide</i>.
     *        </p>
     *        <p>
     *        When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts
     *        hostname. The S3 on Outposts hostname takes the form
     *        <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com. When
     *        using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts
     *        bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on
     *        Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public AbortMultipartUploadRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Returns the key of the multipart upload to abort.
     *
     * @return The key of the multipart upload to abort.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key of the multipart upload to abort.
     *
     * @param key
     *            The key of the multipart upload to abort.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key of the multipart upload to abort and returns the updated
     * AbortMultipartUploadRequest object so that additional method calls can be
     * chained together.
     *
     * @param key
     *            The key of the multipart upload to abort.
     *
     * @return The updated AbortMultipartUploadRequest.
     */
    public AbortMultipartUploadRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns the ID of the upload to abort.
     *
     * @return the ID of the upload to abort.
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the ID of the upload to abort.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * Sets the ID of the multipart upload to abort, and returns this updated
     * AbortMultipartUploadRequest object so that additional method calls can be
     * chained together.
     *
     * @param uploadId
     *            The ID of the multipart upload to abort.
     *
     * @return The updated AbortMultipartUploadRequest object.
     */
    public AbortMultipartUploadRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
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
     * updated AbortMultipartUploadRequest object so that additional method calls can be
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
     * @return The updated AbortMultipartUploadRequest object.
     */
    public AbortMultipartUploadRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

}
