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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the S3 object that a finding applies to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/S3Object" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Object implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket that contains the object.
     * </p>
     */
    private String bucketArn;
    /**
     * <p>
     * The entity tag (ETag) that identifies the affected version of the object. If the object was overwritten or
     * changed after Amazon Macie produced the finding, this value might be different from the current ETag for the
     * object.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * The file name extension of the object. If the object doesn't have a file name extension, this value is "".
     * </p>
     */
    private String extension;
    /**
     * <p>
     * The full key (name) that's assigned to the object.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the object was last modified.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The path to the object, including the full key (name).
     * </p>
     */
    private String path;
    /**
     * <p>
     * Specifies whether the object is publicly accessible due to the combination of permissions settings that apply to
     * the object.
     * </p>
     */
    private Boolean publicAccess;
    /**
     * <p>
     * The type of server-side encryption that's used to encrypt the object.
     * </p>
     */
    private ServerSideEncryption serverSideEncryption;
    /**
     * <p>
     * The total storage size, in bytes, of the object.
     * </p>
     */
    private Long size;
    /**
     * <p>
     * The storage class of the object.
     * </p>
     */
    private String storageClass;
    /**
     * <p>
     * The tags that are associated with the object.
     * </p>
     */
    private java.util.List<KeyValuePair> tags;
    /**
     * <p>
     * The identifier for the affected version of the object.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket that contains the object.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of the bucket that contains the object.
     */

    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket that contains the object.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bucket that contains the object.
     */

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket that contains the object.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of the bucket that contains the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * <p>
     * The entity tag (ETag) that identifies the affected version of the object. If the object was overwritten or
     * changed after Amazon Macie produced the finding, this value might be different from the current ETag for the
     * object.
     * </p>
     * 
     * @param eTag
     *        The entity tag (ETag) that identifies the affected version of the object. If the object was overwritten or
     *        changed after Amazon Macie produced the finding, this value might be different from the current ETag for
     *        the object.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The entity tag (ETag) that identifies the affected version of the object. If the object was overwritten or
     * changed after Amazon Macie produced the finding, this value might be different from the current ETag for the
     * object.
     * </p>
     * 
     * @return The entity tag (ETag) that identifies the affected version of the object. If the object was overwritten
     *         or changed after Amazon Macie produced the finding, this value might be different from the current ETag
     *         for the object.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The entity tag (ETag) that identifies the affected version of the object. If the object was overwritten or
     * changed after Amazon Macie produced the finding, this value might be different from the current ETag for the
     * object.
     * </p>
     * 
     * @param eTag
     *        The entity tag (ETag) that identifies the affected version of the object. If the object was overwritten or
     *        changed after Amazon Macie produced the finding, this value might be different from the current ETag for
     *        the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * The file name extension of the object. If the object doesn't have a file name extension, this value is "".
     * </p>
     * 
     * @param extension
     *        The file name extension of the object. If the object doesn't have a file name extension, this value is "".
     */

    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * <p>
     * The file name extension of the object. If the object doesn't have a file name extension, this value is "".
     * </p>
     * 
     * @return The file name extension of the object. If the object doesn't have a file name extension, this value is
     *         "".
     */

    public String getExtension() {
        return this.extension;
    }

    /**
     * <p>
     * The file name extension of the object. If the object doesn't have a file name extension, this value is "".
     * </p>
     * 
     * @param extension
     *        The file name extension of the object. If the object doesn't have a file name extension, this value is "".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withExtension(String extension) {
        setExtension(extension);
        return this;
    }

    /**
     * <p>
     * The full key (name) that's assigned to the object.
     * </p>
     * 
     * @param key
     *        The full key (name) that's assigned to the object.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The full key (name) that's assigned to the object.
     * </p>
     * 
     * @return The full key (name) that's assigned to the object.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The full key (name) that's assigned to the object.
     * </p>
     * 
     * @param key
     *        The full key (name) that's assigned to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the object was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time, in UTC and extended ISO 8601 format, when the object was last modified.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the object was last modified.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the object was last modified.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the object was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time, in UTC and extended ISO 8601 format, when the object was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The path to the object, including the full key (name).
     * </p>
     * 
     * @param path
     *        The path to the object, including the full key (name).
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the object, including the full key (name).
     * </p>
     * 
     * @return The path to the object, including the full key (name).
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the object, including the full key (name).
     * </p>
     * 
     * @param path
     *        The path to the object, including the full key (name).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Specifies whether the object is publicly accessible due to the combination of permissions settings that apply to
     * the object.
     * </p>
     * 
     * @param publicAccess
     *        Specifies whether the object is publicly accessible due to the combination of permissions settings that
     *        apply to the object.
     */

    public void setPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
    }

    /**
     * <p>
     * Specifies whether the object is publicly accessible due to the combination of permissions settings that apply to
     * the object.
     * </p>
     * 
     * @return Specifies whether the object is publicly accessible due to the combination of permissions settings that
     *         apply to the object.
     */

    public Boolean getPublicAccess() {
        return this.publicAccess;
    }

    /**
     * <p>
     * Specifies whether the object is publicly accessible due to the combination of permissions settings that apply to
     * the object.
     * </p>
     * 
     * @param publicAccess
     *        Specifies whether the object is publicly accessible due to the combination of permissions settings that
     *        apply to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withPublicAccess(Boolean publicAccess) {
        setPublicAccess(publicAccess);
        return this;
    }

    /**
     * <p>
     * Specifies whether the object is publicly accessible due to the combination of permissions settings that apply to
     * the object.
     * </p>
     * 
     * @return Specifies whether the object is publicly accessible due to the combination of permissions settings that
     *         apply to the object.
     */

    public Boolean isPublicAccess() {
        return this.publicAccess;
    }

    /**
     * <p>
     * The type of server-side encryption that's used to encrypt the object.
     * </p>
     * 
     * @param serverSideEncryption
     *        The type of server-side encryption that's used to encrypt the object.
     */

    public void setServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
    }

    /**
     * <p>
     * The type of server-side encryption that's used to encrypt the object.
     * </p>
     * 
     * @return The type of server-side encryption that's used to encrypt the object.
     */

    public ServerSideEncryption getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    /**
     * <p>
     * The type of server-side encryption that's used to encrypt the object.
     * </p>
     * 
     * @param serverSideEncryption
     *        The type of server-side encryption that's used to encrypt the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        setServerSideEncryption(serverSideEncryption);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the object.
     * </p>
     * 
     * @param size
     *        The total storage size, in bytes, of the object.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the object.
     * </p>
     * 
     * @return The total storage size, in bytes, of the object.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the object.
     * </p>
     * 
     * @param size
     *        The total storage size, in bytes, of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withSize(Long size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The storage class of the object.
     * </p>
     * 
     * @param storageClass
     *        The storage class of the object.
     * @see StorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class of the object.
     * </p>
     * 
     * @return The storage class of the object.
     * @see StorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The storage class of the object.
     * </p>
     * 
     * @param storageClass
     *        The storage class of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public S3Object withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * The storage class of the object.
     * </p>
     * 
     * @param storageClass
     *        The storage class of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public S3Object withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * The tags that are associated with the object.
     * </p>
     * 
     * @return The tags that are associated with the object.
     */

    public java.util.List<KeyValuePair> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that are associated with the object.
     * </p>
     * 
     * @param tags
     *        The tags that are associated with the object.
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
     * The tags that are associated with the object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags that are associated with the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withTags(KeyValuePair... tags) {
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
     * The tags that are associated with the object.
     * </p>
     * 
     * @param tags
     *        The tags that are associated with the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withTags(java.util.Collection<KeyValuePair> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The identifier for the affected version of the object.
     * </p>
     * 
     * @param versionId
     *        The identifier for the affected version of the object.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The identifier for the affected version of the object.
     * </p>
     * 
     * @return The identifier for the affected version of the object.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The identifier for the affected version of the object.
     * </p>
     * 
     * @param versionId
     *        The identifier for the affected version of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getBucketArn() != null)
            sb.append("BucketArn: ").append(getBucketArn()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getExtension() != null)
            sb.append("Extension: ").append(getExtension()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPublicAccess() != null)
            sb.append("PublicAccess: ").append(getPublicAccess()).append(",");
        if (getServerSideEncryption() != null)
            sb.append("ServerSideEncryption: ").append(getServerSideEncryption()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Object == false)
            return false;
        S3Object other = (S3Object) obj;
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getExtension() == null ^ this.getExtension() == null)
            return false;
        if (other.getExtension() != null && other.getExtension().equals(this.getExtension()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPublicAccess() == null ^ this.getPublicAccess() == null)
            return false;
        if (other.getPublicAccess() != null && other.getPublicAccess().equals(this.getPublicAccess()) == false)
            return false;
        if (other.getServerSideEncryption() == null ^ this.getServerSideEncryption() == null)
            return false;
        if (other.getServerSideEncryption() != null && other.getServerSideEncryption().equals(this.getServerSideEncryption()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getExtension() == null) ? 0 : getExtension().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPublicAccess() == null) ? 0 : getPublicAccess().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryption() == null) ? 0 : getServerSideEncryption().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public S3Object clone() {
        try {
            return (S3Object) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3ObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
