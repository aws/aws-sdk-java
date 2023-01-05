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
 * Request object for the parameters to delete the tags for an object.
 */
public class DeleteObjectTaggingRequest extends AmazonWebServiceRequest implements Serializable, ExpectedBucketOwnerRequest {
    private String bucketName;
    private String key;
    private String versionId;
    private String expectedBucketOwner;


    /**
     * Constructs an instance of this object.
     *
     * @param bucketName
     *            The bucket name.
     * @param key
     *            The object key.
     */
    public DeleteObjectTaggingRequest(String bucketName, String key) {
        this.bucketName = bucketName;
        this.key = key;
    }

    public String getExpectedBucketOwner() {
        return expectedBucketOwner;
    }

    public DeleteObjectTaggingRequest withExpectedBucketOwner(String expectedBucketOwner) {
        this.expectedBucketOwner = expectedBucketOwner;
        return this;
    }

    public void setExpectedBucketOwner(String expectedBucketOwner) {
        withExpectedBucketOwner(expectedBucketOwner);
    }

    /**
     * <p>
     * The bucket name containing the objects from which to remove the tags.
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
     * @return The bucket name containing the objects from which to remove the tags. </p>
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
     * The bucket name containing the objects from which to remove the tags.
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
     *        The bucket name containing the objects from which to remove the tags. </p>
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
     * The bucket name containing the objects from which to remove the tags.
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
     *        The bucket name containing the objects from which to remove the tags. </p>
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
     *
     * @return This object for chaining.
     */
    public DeleteObjectTaggingRequest withBucketName(String bucketName) {
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
     * @param key
     *            The object key.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Set the object key.
     *
     * @param key
     *            The object key.
     *
     * @return This object for chaining.
     */
    public DeleteObjectTaggingRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * @return The version of the object whose tags are to be deleted.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Set version of the object whose tages are to be deleted.
     *
     * @param versionId The object version.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Set version of the object whose tages are to be deleted.
     *
     * @param versionId
     *            The object version.
     *
     * @return This object for chaining.
     */
    public DeleteObjectTaggingRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }
}
