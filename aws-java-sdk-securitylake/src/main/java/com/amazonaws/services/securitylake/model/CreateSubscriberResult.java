/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriberResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers in the
     * Identity and Access Management (IAM) User Guide</a>. .
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     */
    private String s3BucketArn;
    /**
     * <p>
     * The ARN for the Amazon Simple Notification Service.
     * </p>
     */
    private String snsArn;
    /**
     * <p>
     * The <code>subscriptionId</code> created by the <code>CreateSubscriber</code> API call.
     * </p>
     */
    private String subscriptionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers in the
     * Identity and Access Management (IAM) User Guide</a>. .
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about
     *        ARNs and how to use them in policies, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers in the
     *        Identity and Access Management (IAM) User Guide</a>. .
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers in the
     * Identity and Access Management (IAM) User Guide</a>. .
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about
     *         ARNs and how to use them in policies, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers in the
     *         Identity and Access Management (IAM) User Guide</a>. .
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers in the
     * Identity and Access Management (IAM) User Guide</a>. .
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about
     *        ARNs and how to use them in policies, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers in the
     *        Identity and Access Management (IAM) User Guide</a>. .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     * 
     * @param s3BucketArn
     *        The ARN for the Amazon S3 bucket.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     * 
     * @return The ARN for the Amazon S3 bucket.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     * 
     * @param s3BucketArn
     *        The ARN for the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberResult withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * <p>
     * The ARN for the Amazon Simple Notification Service.
     * </p>
     * 
     * @param snsArn
     *        The ARN for the Amazon Simple Notification Service.
     */

    public void setSnsArn(String snsArn) {
        this.snsArn = snsArn;
    }

    /**
     * <p>
     * The ARN for the Amazon Simple Notification Service.
     * </p>
     * 
     * @return The ARN for the Amazon Simple Notification Service.
     */

    public String getSnsArn() {
        return this.snsArn;
    }

    /**
     * <p>
     * The ARN for the Amazon Simple Notification Service.
     * </p>
     * 
     * @param snsArn
     *        The ARN for the Amazon Simple Notification Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberResult withSnsArn(String snsArn) {
        setSnsArn(snsArn);
        return this;
    }

    /**
     * <p>
     * The <code>subscriptionId</code> created by the <code>CreateSubscriber</code> API call.
     * </p>
     * 
     * @param subscriptionId
     *        The <code>subscriptionId</code> created by the <code>CreateSubscriber</code> API call.
     */

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * <p>
     * The <code>subscriptionId</code> created by the <code>CreateSubscriber</code> API call.
     * </p>
     * 
     * @return The <code>subscriptionId</code> created by the <code>CreateSubscriber</code> API call.
     */

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * <p>
     * The <code>subscriptionId</code> created by the <code>CreateSubscriber</code> API call.
     * </p>
     * 
     * @param subscriptionId
     *        The <code>subscriptionId</code> created by the <code>CreateSubscriber</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberResult withSubscriptionId(String subscriptionId) {
        setSubscriptionId(subscriptionId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getSnsArn() != null)
            sb.append("SnsArn: ").append(getSnsArn()).append(",");
        if (getSubscriptionId() != null)
            sb.append("SubscriptionId: ").append(getSubscriptionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubscriberResult == false)
            return false;
        CreateSubscriberResult other = (CreateSubscriberResult) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getSnsArn() == null ^ this.getSnsArn() == null)
            return false;
        if (other.getSnsArn() != null && other.getSnsArn().equals(this.getSnsArn()) == false)
            return false;
        if (other.getSubscriptionId() == null ^ this.getSubscriptionId() == null)
            return false;
        if (other.getSubscriptionId() != null && other.getSubscriptionId().equals(this.getSubscriptionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getSnsArn() == null) ? 0 : getSnsArn().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionId() == null) ? 0 : getSubscriptionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriberResult clone() {
        try {
            return (CreateSubscriberResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
