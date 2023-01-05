/*
 * Copyright 2016-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

/**
 * Request object for the parameters to get the tags for an object.
 */
public class GetObjectTaggingRequest extends AmazonWebServiceRequest implements Serializable, ExpectedBucketOwnerRequest {
    private String bucketName;
    private String key;
    private String versionId;
    private String expectedBucketOwner;
    private boolean isRequesterPays;

    /**
     * Construct an instance of this object.
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
     *
     * @param bucketName
     *            The name of the bucket or access point ARN.
     * @param key
     *            The object key.
     * @param versionId
     *            The version of the object.
     */
    public GetObjectTaggingRequest(String bucketName, String key, String versionId) {
        this.bucketName = bucketName;
        this.key = key;
        this.versionId = versionId;
    }

    /**
     * Construct an instance of this object.
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
     *
     * @param bucketName
     *            The name of the bucket or access point ARN.
     * @param key
     *            The object key.
     */
    public GetObjectTaggingRequest(String bucketName, String key) {
        this(bucketName, key, null);
    }

    public String getExpectedBucketOwner() {
        return expectedBucketOwner;
    }

    public GetObjectTaggingRequest withExpectedBucketOwner(String expectedBucketOwner) {
        this.expectedBucketOwner = expectedBucketOwner;
        return this;
    }

    public void setExpectedBucketOwner(String expectedBucketOwner) {
        withExpectedBucketOwner(expectedBucketOwner);
    }

    /**
     * <p>
     * The bucket name containing the object for which to get the tagging information.
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
     * @return The bucket name containing the object for which to get the tagging information. </p>
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
        return bucketName;
    }

    /**
     * <p>
     * The bucket name containing the object for which to get the tagging information.
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
     *        The bucket name containing the object for which to get the tagging information. </p>
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
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The bucket name containing the object for which to get the tagging information.
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
     *        The bucket name containing the object for which to get the tagging information. </p>
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
    public GetObjectTaggingRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * @return The object key.
     */
    public String getKey() {
        return key;
    }

    /**
     * Set the object key.
     *
     * @param key The object key.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Set the object key.
     *
     * @param key The object key.
     *
     * @return This object for chaining.
     */
    public GetObjectTaggingRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * @return The version of the object.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Set object version.
     *
     * @param versionId The object version.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Set object version.
     *
     * @param versionId The object version.
     *
     * @return This object for chaining.
     */
    public GetObjectTaggingRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * Returns whether the requester knows that they will be charged for the request.
     *
     * @return true if the user has enabled Requester Pays option for
     *         conducting this operation from Requester Pays Bucket.
     */
    public boolean isRequesterPays() {
        return isRequesterPays;
    }

    /**
     * Confirms whether the requester knows that they will be charged for the request. Bucket owners need not specify this
     * parameter in their requests.
     *
     * @param isRequesterPays if Requester Pays option is enabled for the operation.
     */
    public void setRequesterPays(boolean isRequesterPays) {
        this.isRequesterPays = isRequesterPays;
    }

    /**
     * Confirms whether the requester knows that they will be charged for the request. Bucket owners need not specify this
     * parameter in their requests.
     *
     * @param isRequesterPays if Requester Pays option is enabled for the operation.
     *
     * @return The updated GetObjectTaggingRequest object.
     */
    public GetObjectTaggingRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }
}
