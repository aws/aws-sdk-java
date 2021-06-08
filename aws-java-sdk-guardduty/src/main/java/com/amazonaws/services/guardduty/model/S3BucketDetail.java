/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/S3BucketDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes whether the bucket is a source or destination bucket.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The date and time the bucket was created at.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The owner of the S3 bucket.
     * </p>
     */
    private Owner owner;
    /**
     * <p>
     * All tags attached to the S3 bucket
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Describes the server side encryption method used in the S3 bucket.
     * </p>
     */
    private DefaultServerSideEncryption defaultServerSideEncryption;
    /**
     * <p>
     * Describes the public access policies that apply to the S3 bucket.
     * </p>
     */
    private PublicAccess publicAccess;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the S3 bucket.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the S3 bucket.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param name
     *        The name of the S3 bucket.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @return The name of the S3 bucket.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param name
     *        The name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes whether the bucket is a source or destination bucket.
     * </p>
     * 
     * @param type
     *        Describes whether the bucket is a source or destination bucket.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Describes whether the bucket is a source or destination bucket.
     * </p>
     * 
     * @return Describes whether the bucket is a source or destination bucket.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Describes whether the bucket is a source or destination bucket.
     * </p>
     * 
     * @param type
     *        Describes whether the bucket is a source or destination bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The date and time the bucket was created at.
     * </p>
     * 
     * @param createdAt
     *        The date and time the bucket was created at.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the bucket was created at.
     * </p>
     * 
     * @return The date and time the bucket was created at.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the bucket was created at.
     * </p>
     * 
     * @param createdAt
     *        The date and time the bucket was created at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDetail withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The owner of the S3 bucket.
     * </p>
     * 
     * @param owner
     *        The owner of the S3 bucket.
     */

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the S3 bucket.
     * </p>
     * 
     * @return The owner of the S3 bucket.
     */

    public Owner getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the S3 bucket.
     * </p>
     * 
     * @param owner
     *        The owner of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDetail withOwner(Owner owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * All tags attached to the S3 bucket
     * </p>
     * 
     * @return All tags attached to the S3 bucket
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * All tags attached to the S3 bucket
     * </p>
     * 
     * @param tags
     *        All tags attached to the S3 bucket
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
     * All tags attached to the S3 bucket
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        All tags attached to the S3 bucket
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDetail withTags(Tag... tags) {
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
     * All tags attached to the S3 bucket
     * </p>
     * 
     * @param tags
     *        All tags attached to the S3 bucket
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDetail withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Describes the server side encryption method used in the S3 bucket.
     * </p>
     * 
     * @param defaultServerSideEncryption
     *        Describes the server side encryption method used in the S3 bucket.
     */

    public void setDefaultServerSideEncryption(DefaultServerSideEncryption defaultServerSideEncryption) {
        this.defaultServerSideEncryption = defaultServerSideEncryption;
    }

    /**
     * <p>
     * Describes the server side encryption method used in the S3 bucket.
     * </p>
     * 
     * @return Describes the server side encryption method used in the S3 bucket.
     */

    public DefaultServerSideEncryption getDefaultServerSideEncryption() {
        return this.defaultServerSideEncryption;
    }

    /**
     * <p>
     * Describes the server side encryption method used in the S3 bucket.
     * </p>
     * 
     * @param defaultServerSideEncryption
     *        Describes the server side encryption method used in the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDetail withDefaultServerSideEncryption(DefaultServerSideEncryption defaultServerSideEncryption) {
        setDefaultServerSideEncryption(defaultServerSideEncryption);
        return this;
    }

    /**
     * <p>
     * Describes the public access policies that apply to the S3 bucket.
     * </p>
     * 
     * @param publicAccess
     *        Describes the public access policies that apply to the S3 bucket.
     */

    public void setPublicAccess(PublicAccess publicAccess) {
        this.publicAccess = publicAccess;
    }

    /**
     * <p>
     * Describes the public access policies that apply to the S3 bucket.
     * </p>
     * 
     * @return Describes the public access policies that apply to the S3 bucket.
     */

    public PublicAccess getPublicAccess() {
        return this.publicAccess;
    }

    /**
     * <p>
     * Describes the public access policies that apply to the S3 bucket.
     * </p>
     * 
     * @param publicAccess
     *        Describes the public access policies that apply to the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDetail withPublicAccess(PublicAccess publicAccess) {
        setPublicAccess(publicAccess);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDefaultServerSideEncryption() != null)
            sb.append("DefaultServerSideEncryption: ").append(getDefaultServerSideEncryption()).append(",");
        if (getPublicAccess() != null)
            sb.append("PublicAccess: ").append(getPublicAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketDetail == false)
            return false;
        S3BucketDetail other = (S3BucketDetail) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDefaultServerSideEncryption() == null ^ this.getDefaultServerSideEncryption() == null)
            return false;
        if (other.getDefaultServerSideEncryption() != null && other.getDefaultServerSideEncryption().equals(this.getDefaultServerSideEncryption()) == false)
            return false;
        if (other.getPublicAccess() == null ^ this.getPublicAccess() == null)
            return false;
        if (other.getPublicAccess() != null && other.getPublicAccess().equals(this.getPublicAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDefaultServerSideEncryption() == null) ? 0 : getDefaultServerSideEncryption().hashCode());
        hashCode = prime * hashCode + ((getPublicAccess() == null) ? 0 : getPublicAccess().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketDetail clone() {
        try {
            return (S3BucketDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.S3BucketDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
