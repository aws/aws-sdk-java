/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an S3 bucket that a finding applies to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/S3Bucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Bucket implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The type of server-side encryption that's used by default to encrypt objects in the bucket.
     * </p>
     */
    private ServerSideEncryption defaultServerSideEncryption;
    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The display name and account identifier for the user who owns the bucket.
     * </p>
     */
    private S3BucketOwner owner;
    /**
     * <p>
     * The permissions settings that determine whether the bucket is publicly accessible.
     * </p>
     */
    private BucketPublicAccess publicAccess;
    /**
     * <p>
     * The tags that are associated with the bucket.
     * </p>
     */
    private java.util.List<KeyValuePair> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the bucket.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bucket.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Bucket withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Bucket withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The type of server-side encryption that's used by default to encrypt objects in the bucket.
     * </p>
     * 
     * @param defaultServerSideEncryption
     *        The type of server-side encryption that's used by default to encrypt objects in the bucket.
     */

    public void setDefaultServerSideEncryption(ServerSideEncryption defaultServerSideEncryption) {
        this.defaultServerSideEncryption = defaultServerSideEncryption;
    }

    /**
     * <p>
     * The type of server-side encryption that's used by default to encrypt objects in the bucket.
     * </p>
     * 
     * @return The type of server-side encryption that's used by default to encrypt objects in the bucket.
     */

    public ServerSideEncryption getDefaultServerSideEncryption() {
        return this.defaultServerSideEncryption;
    }

    /**
     * <p>
     * The type of server-side encryption that's used by default to encrypt objects in the bucket.
     * </p>
     * 
     * @param defaultServerSideEncryption
     *        The type of server-side encryption that's used by default to encrypt objects in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Bucket withDefaultServerSideEncryption(ServerSideEncryption defaultServerSideEncryption) {
        setDefaultServerSideEncryption(defaultServerSideEncryption);
        return this;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param name
     *        The name of the bucket.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @return The name of the bucket.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param name
     *        The name of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Bucket withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The display name and account identifier for the user who owns the bucket.
     * </p>
     * 
     * @param owner
     *        The display name and account identifier for the user who owns the bucket.
     */

    public void setOwner(S3BucketOwner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The display name and account identifier for the user who owns the bucket.
     * </p>
     * 
     * @return The display name and account identifier for the user who owns the bucket.
     */

    public S3BucketOwner getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The display name and account identifier for the user who owns the bucket.
     * </p>
     * 
     * @param owner
     *        The display name and account identifier for the user who owns the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Bucket withOwner(S3BucketOwner owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The permissions settings that determine whether the bucket is publicly accessible.
     * </p>
     * 
     * @param publicAccess
     *        The permissions settings that determine whether the bucket is publicly accessible.
     */

    public void setPublicAccess(BucketPublicAccess publicAccess) {
        this.publicAccess = publicAccess;
    }

    /**
     * <p>
     * The permissions settings that determine whether the bucket is publicly accessible.
     * </p>
     * 
     * @return The permissions settings that determine whether the bucket is publicly accessible.
     */

    public BucketPublicAccess getPublicAccess() {
        return this.publicAccess;
    }

    /**
     * <p>
     * The permissions settings that determine whether the bucket is publicly accessible.
     * </p>
     * 
     * @param publicAccess
     *        The permissions settings that determine whether the bucket is publicly accessible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Bucket withPublicAccess(BucketPublicAccess publicAccess) {
        setPublicAccess(publicAccess);
        return this;
    }

    /**
     * <p>
     * The tags that are associated with the bucket.
     * </p>
     * 
     * @return The tags that are associated with the bucket.
     */

    public java.util.List<KeyValuePair> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that are associated with the bucket.
     * </p>
     * 
     * @param tags
     *        The tags that are associated with the bucket.
     */

    public void setTags(java.util.Collection<KeyValuePair> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<KeyValuePair>(tags);
    }

    /**
     * <p>
     * The tags that are associated with the bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags that are associated with the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Bucket withTags(KeyValuePair... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<KeyValuePair>(tags.length));
        }
        for (KeyValuePair ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags that are associated with the bucket.
     * </p>
     * 
     * @param tags
     *        The tags that are associated with the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Bucket withTags(java.util.Collection<KeyValuePair> tags) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDefaultServerSideEncryption() != null)
            sb.append("DefaultServerSideEncryption: ").append(getDefaultServerSideEncryption()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getPublicAccess() != null)
            sb.append("PublicAccess: ").append(getPublicAccess()).append(",");
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

        if (obj instanceof S3Bucket == false)
            return false;
        S3Bucket other = (S3Bucket) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDefaultServerSideEncryption() == null ^ this.getDefaultServerSideEncryption() == null)
            return false;
        if (other.getDefaultServerSideEncryption() != null && other.getDefaultServerSideEncryption().equals(this.getDefaultServerSideEncryption()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getPublicAccess() == null ^ this.getPublicAccess() == null)
            return false;
        if (other.getPublicAccess() != null && other.getPublicAccess().equals(this.getPublicAccess()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDefaultServerSideEncryption() == null) ? 0 : getDefaultServerSideEncryption().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getPublicAccess() == null) ? 0 : getPublicAccess().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public S3Bucket clone() {
        try {
            return (S3Bucket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3BucketMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
