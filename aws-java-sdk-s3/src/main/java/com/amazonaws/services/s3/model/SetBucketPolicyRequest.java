/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.Serializable;

/**
 * Sets the policy associated with the specified bucket. Only the owner of
 * the bucket can set a bucket policy. If a policy already exists for the
 * specified bucket, the new policy replaces the existing policy.
 * </p>
 * <p>
 * Bucket policies provide access control management at the bucket level for
 * both the bucket resource and contained object resources. Only one policy
 * can be specified per-bucket.
 * </p>
 * <p>
 * See the <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/">
 * Amazon S3 developer guide</a> for more information on forming bucket
 * polices.
 * </p>
 *
 * @see AmazonS3#setBucketPolicy(SetBucketPolicyRequest)
 */
public class SetBucketPolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /** The name of the Amazon S3 bucket whose policy is being set. */
    private String bucketName;

    /** The policy to apply to the specified bucket. */
    private String policyText;

    /** Whether or not this request can remove requester access to the specified bucket */
    private Boolean confirmRemoveSelfBucketAccess;

    /**
     * Creates a new request object, ready to be executed to set an Amazon S3
     * bucket's policy.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose policy is being set.
     * @param policyText
     *            The policy to apply to the specified bucket.
     */
    public SetBucketPolicyRequest(String bucketName, String policyText) {
        this.bucketName = bucketName;
        this.policyText = policyText;
    }

    /**
     * Returns the name of the Amazon S3 bucket whose policy is being set.
     *
     * @return The name of the Amazon S3 bucket whose policy is being set.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket whose policy is being set.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose policy is being set.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket whose policy is being set, and
     * returns the updated request object so that additional method calls can be
     * chained together.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose policy is being set.
     *
     * @return The updated request object so that additional method calls can be
     *         chained together.
     */
    public SetBucketPolicyRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the policy to apply to the specified bucket.
     *
     * @return The policy to apply to the specified bucket.
     */
    public String getPolicyText() {
        return policyText;
    }

    /**
     * Sets the policy to apply to the specified bucket.
     *
     * @param policyText
     *            The policy to apply to the specified bucket.
     */
    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }

    /**
     * Sets the policy to apply to the specified bucket, and returns the updated
     * request object so that additional method calls can be chained together.
     *
     * @param policyText
     *            The policy to apply to the specified bucket.
     *
     * @return The updated request object, so that additional method calls can
     *         be chained together.
     */
    public SetBucketPolicyRequest withPolicyText(String policyText) {
        setPolicyText(policyText);
        return this;
    }

    /**
     * @return The current value of confirmRemoveSelfBucketAccess.
     */
    public Boolean getConfirmRemoveSelfBucketAccess() {
        return confirmRemoveSelfBucketAccess;
    }

    /**
     * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in the future.
     *
     * @param confirmRemoveSelfBucketAccess New value for confirmRemoveSelfBucketAccess.
     */
    public void setConfirmRemoveSelfBucketAccess(Boolean confirmRemoveSelfBucketAccess) {
        this.confirmRemoveSelfBucketAccess = confirmRemoveSelfBucketAccess;
    }

    /**
     * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in the future.
     *
     * @param confirmRemoveSelfBucketAccess New value for confirmRemoveSelfBucketAccess.
     * @return This object for method chaining.
     */
    public SetBucketPolicyRequest withConfirmRemoveSelfBucketAccess(Boolean confirmRemoveSelfBucketAccess) {
        setConfirmRemoveSelfBucketAccess(confirmRemoveSelfBucketAccess);
        return this;
    }
}
