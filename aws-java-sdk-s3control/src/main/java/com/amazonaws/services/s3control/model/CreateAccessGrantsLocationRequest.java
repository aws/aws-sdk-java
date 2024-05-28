/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrantsLocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessGrantsLocationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The S3 path to the location that you are registering. The location scope can be the default S3 location
     * <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and
     * prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at the beginning
     * of an object key name used to organize the objects that you store in your S3 buckets. For example, object key
     * names that start with the <code>engineering/</code> prefix or object key names that start with the
     * <code>marketing/campaigns/</code> prefix.
     * </p>
     */
    private String locationScope;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for the registered location. S3 Access Grants assumes this role to
     * manage access to the registered location.
     * </p>
     */
    private String iAMRoleArn;
    /**
     * <p>
     * The Amazon Web Services resource tags that you are adding to the S3 Access Grants location. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that is making this request.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantsLocationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The S3 path to the location that you are registering. The location scope can be the default S3 location
     * <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and
     * prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at the beginning
     * of an object key name used to organize the objects that you store in your S3 buckets. For example, object key
     * names that start with the <code>engineering/</code> prefix or object key names that start with the
     * <code>marketing/campaigns/</code> prefix.
     * </p>
     * 
     * @param locationScope
     *        The S3 path to the location that you are registering. The location scope can be the default S3 location
     *        <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket
     *        and prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at
     *        the beginning of an object key name used to organize the objects that you store in your S3 buckets. For
     *        example, object key names that start with the <code>engineering/</code> prefix or object key names that
     *        start with the <code>marketing/campaigns/</code> prefix.
     */

    public void setLocationScope(String locationScope) {
        this.locationScope = locationScope;
    }

    /**
     * <p>
     * The S3 path to the location that you are registering. The location scope can be the default S3 location
     * <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and
     * prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at the beginning
     * of an object key name used to organize the objects that you store in your S3 buckets. For example, object key
     * names that start with the <code>engineering/</code> prefix or object key names that start with the
     * <code>marketing/campaigns/</code> prefix.
     * </p>
     * 
     * @return The S3 path to the location that you are registering. The location scope can be the default S3 location
     *         <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket
     *         and prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at
     *         the beginning of an object key name used to organize the objects that you store in your S3 buckets. For
     *         example, object key names that start with the <code>engineering/</code> prefix or object key names that
     *         start with the <code>marketing/campaigns/</code> prefix.
     */

    public String getLocationScope() {
        return this.locationScope;
    }

    /**
     * <p>
     * The S3 path to the location that you are registering. The location scope can be the default S3 location
     * <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and
     * prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at the beginning
     * of an object key name used to organize the objects that you store in your S3 buckets. For example, object key
     * names that start with the <code>engineering/</code> prefix or object key names that start with the
     * <code>marketing/campaigns/</code> prefix.
     * </p>
     * 
     * @param locationScope
     *        The S3 path to the location that you are registering. The location scope can be the default S3 location
     *        <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket
     *        and prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at
     *        the beginning of an object key name used to organize the objects that you store in your S3 buckets. For
     *        example, object key names that start with the <code>engineering/</code> prefix or object key names that
     *        start with the <code>marketing/campaigns/</code> prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantsLocationRequest withLocationScope(String locationScope) {
        setLocationScope(locationScope);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for the registered location. S3 Access Grants assumes this role to
     * manage access to the registered location.
     * </p>
     * 
     * @param iAMRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role for the registered location. S3 Access Grants assumes this
     *        role to manage access to the registered location.
     */

    public void setIAMRoleArn(String iAMRoleArn) {
        this.iAMRoleArn = iAMRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for the registered location. S3 Access Grants assumes this role to
     * manage access to the registered location.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role for the registered location. S3 Access Grants assumes this
     *         role to manage access to the registered location.
     */

    public String getIAMRoleArn() {
        return this.iAMRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role for the registered location. S3 Access Grants assumes this role to
     * manage access to the registered location.
     * </p>
     * 
     * @param iAMRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role for the registered location. S3 Access Grants assumes this
     *        role to manage access to the registered location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantsLocationRequest withIAMRoleArn(String iAMRoleArn) {
        setIAMRoleArn(iAMRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you are adding to the S3 Access Grants location. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources.
     * </p>
     * 
     * @return The Amazon Web Services resource tags that you are adding to the S3 Access Grants location. Each tag is a
     *         label consisting of a user-defined key and value. Tags can help you manage, identify, organize, search
     *         for, and filter resources.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you are adding to the S3 Access Grants location. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you are adding to the S3 Access Grants location. Each tag is a
     *        label consisting of a user-defined key and value. Tags can help you manage, identify, organize, search
     *        for, and filter resources.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you are adding to the S3 Access Grants location. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you are adding to the S3 Access Grants location. Each tag is a
     *        label consisting of a user-defined key and value. Tags can help you manage, identify, organize, search
     *        for, and filter resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantsLocationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you are adding to the S3 Access Grants location. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you are adding to the S3 Access Grants location. Each tag is a
     *        label consisting of a user-defined key and value. Tags can help you manage, identify, organize, search
     *        for, and filter resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantsLocationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getLocationScope() != null)
            sb.append("LocationScope: ").append(getLocationScope()).append(",");
        if (getIAMRoleArn() != null)
            sb.append("IAMRoleArn: ").append(getIAMRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessGrantsLocationRequest == false)
            return false;
        CreateAccessGrantsLocationRequest other = (CreateAccessGrantsLocationRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getLocationScope() == null ^ this.getLocationScope() == null)
            return false;
        if (other.getLocationScope() != null && other.getLocationScope().equals(this.getLocationScope()) == false)
            return false;
        if (other.getIAMRoleArn() == null ^ this.getIAMRoleArn() == null)
            return false;
        if (other.getIAMRoleArn() != null && other.getIAMRoleArn().equals(this.getIAMRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getLocationScope() == null) ? 0 : getLocationScope().hashCode());
        hashCode = prime * hashCode + ((getIAMRoleArn() == null) ? 0 : getIAMRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessGrantsLocationRequest clone() {
        return (CreateAccessGrantsLocationRequest) super.clone();
    }

}
