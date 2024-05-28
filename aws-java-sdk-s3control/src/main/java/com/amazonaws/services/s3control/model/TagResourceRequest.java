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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID that created the S3 resource that you're trying to add tags to or the
     * requester's account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 resource that you're trying to add tags to. The tagged resource can be
     * an S3 Storage Lens group or S3 Access Grants instance, registered location, or grant.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The Amazon Web Services resource tags that you want to add to the specified S3 resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Web Services account ID that created the S3 resource that you're trying to add tags to or the
     * requester's account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID that created the S3 resource that you're trying to add tags to or the
     *        requester's account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that created the S3 resource that you're trying to add tags to or the
     * requester's account ID.
     * </p>
     * 
     * @return The Amazon Web Services account ID that created the S3 resource that you're trying to add tags to or the
     *         requester's account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that created the S3 resource that you're trying to add tags to or the
     * requester's account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID that created the S3 resource that you're trying to add tags to or the
     *        requester's account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 resource that you're trying to add tags to. The tagged resource can be
     * an S3 Storage Lens group or S3 Access Grants instance, registered location, or grant.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the S3 resource that you're trying to add tags to. The tagged resource
     *        can be an S3 Storage Lens group or S3 Access Grants instance, registered location, or grant.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 resource that you're trying to add tags to. The tagged resource can be
     * an S3 Storage Lens group or S3 Access Grants instance, registered location, or grant.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the S3 resource that you're trying to add tags to. The tagged resource
     *         can be an S3 Storage Lens group or S3 Access Grants instance, registered location, or grant.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 resource that you're trying to add tags to. The tagged resource can be
     * an S3 Storage Lens group or S3 Access Grants instance, registered location, or grant.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the S3 resource that you're trying to add tags to. The tagged resource
     *        can be an S3 Storage Lens group or S3 Access Grants instance, registered location, or grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you want to add to the specified S3 resource.
     * </p>
     * 
     * @return The Amazon Web Services resource tags that you want to add to the specified S3 resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you want to add to the specified S3 resource.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you want to add to the specified S3 resource.
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
     * The Amazon Web Services resource tags that you want to add to the specified S3 resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you want to add to the specified S3 resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(Tag... tags) {
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
     * The Amazon Web Services resource tags that you want to add to the specified S3 resource.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you want to add to the specified S3 resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
