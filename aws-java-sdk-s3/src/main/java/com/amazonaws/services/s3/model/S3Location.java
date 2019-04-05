/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.List;

/**
 * Describes an S3 location that will receive the results of the restore request.
 */
public class S3Location implements Serializable, Cloneable {

    /**
     * The name of the bucket where the restore results will be placed.
     */
    private String bucketName;

    /**
     * The prefix that is prepended to the restore results for this request.
     */
    private String prefix;

    /**
     * Describes the server-side encryption that will be applied to the restore results.
     */
    private Encryption encryption;

    /**
     * The canned ACL to apply to the restore results.
     */
    private String cannedACL;

    /**
     * A list of grants that control access to the staged results.
     */
    private AccessControlList accessControlList;

    /**
     * The tag-set that is applied to the restore results.
     */
    private ObjectTagging tagging;

    /**
     * A list of metadata to store with the restore results in S3.
     */
    private List<MetadataEntry> userMetadata;

    /**
     * The class of storage used to store the restore results.
     */
    private String storageClass;

    /**
     * @return The name of the bucket where the restore results will be placed.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the bucketName
     *
     * @param bucketName The new bucketName value.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket where the restore results will be placed.
     *
     * @param bucketName The new bucketName value.
     * @return This object for method chaining.
     */
    public S3Location withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * @return The prefix that is prepended to the restore results for this request.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the prefix
     *
     * @param prefix The new prefix value.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Sets the prefix that is prepended to the restore results for this request.
     *
     * @param prefix The new prefix value.
     * @return This object for method chaining.
     */
    public S3Location withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * @return The server-side encryption.
     */
    public Encryption getEncryption() {
        return encryption;
    }

    /**
     * Sets the encryption
     *
     * @param encryption The new encryption value.
     */
    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * Sets the server-side encryption
     *
     * @param encryption The new encryption value.
     * @return This object for method chaining.
     */
    public S3Location withEncryption(Encryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * @return The canned ACL to apply to the restore results.
     */
    public String getCannedACL() {
        return cannedACL;
    }

    /**
     * Sets the cannedACL
     *
     * @param cannedACL The new cannedACL value.
     */
    public void setCannedACL(String cannedACL) {
        this.cannedACL = cannedACL;
    }

    /**
     * Sets the canned ACL to apply to the restore results.
     *
     * @param cannedACL The new cannedACL value.
     * @return This object for method chaining.
     */
    public S3Location withCannedACL(String cannedACL) {
        setCannedACL(cannedACL);
        return this;
    }

    /**
     * Sets the canned ACL to apply to the restore results.
     *
     * @param cannedACL The new cannedACL value.
     * @return This object for method chaining.
     */
    public S3Location withCannedACL(CannedAccessControlList cannedACL) {
        setCannedACL(cannedACL == null ? null : cannedACL.toString());
        return this;
    }

    /**
     * @return The list of grants that control access to the staged results.
     */
    public AccessControlList getAccessControlList() {
        return accessControlList;
    }

    /**
     * Sets the accessControlList
     *
     * @param accessControlList The new accessControlList value.
     */
    public void setAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
    }

    /**
     * Sets the list of grants that control access to the staged results.
     *
     * @param accessControlList The new accessControlList value.
     * @return This object for method chaining.
     */
    public S3Location withAccessControlList(AccessControlList accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * @return The tag-set that is applied to the restore results.
     */
    public ObjectTagging getTagging() {
        return tagging;
    }

    /**
     * Sets the tagging
     *
     * @param tagging The new tagging value.
     */
    public void setTagging(ObjectTagging tagging) {
        this.tagging = tagging;
    }

    /**
     * Sets the tag-set that is applied to the restore results.
     *
     * @param tagging The new tagging value.
     * @return This object for method chaining.
     */
    public S3Location withTagging(ObjectTagging tagging) {
        setTagging(tagging);
        return this;
    }

    /**
     * @return The metadata to store with the restore results in S3.
     */
    public List<MetadataEntry> getUserMetadata() {
        return userMetadata;
    }

    /**
     * Sets the userMetadata
     *
     * @param userMetadata The new userMetadata value.
     */
    public void setUserMetadata(List<MetadataEntry> userMetadata) {
        this.userMetadata = userMetadata;
    }

    /**
     * Sets the metadata to store with the restore results in S3.
     *
     * @param userMetadata The new userMetadata value.
     * @return This object for method chaining.
     */
    public S3Location withUserMetaData(List<MetadataEntry> userMetadata) {
        setUserMetadata(userMetadata);
        return this;
    }

    /**
     * @return The class of storage used to store the restore results.
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * Sets the storageClass
     *
     * @param storageClass The new storageClass value.
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * Sets the class of storage used to store the restore results.
     *
     * @param storageClass The new storageClass value.
     * @return This object for method chaining.
     */
    public S3Location withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * Sets the class of storage used to store the restore results.
     *
     * @param storageClass The new storageClass value.
     * @return This object for method chaining.
     */
    public S3Location withStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass == null ? null : storageClass.toString());
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof S3Location)) {
            return false;
        }

        final S3Location other = (S3Location) obj;

        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && !other.getBucketName().equals(this.getBucketName()))
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && !other.getPrefix().equals(this.getPrefix()))
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && !other.getEncryption().equals(this.getEncryption()))
            return false;
        if (other.getCannedACL() == null ^ this.getCannedACL() == null)
            return false;
        if (other.getCannedACL() != null && !other.getCannedACL().equals(this.getCannedACL()))
            return false;
        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null)
            return false;
        if (other.getAccessControlList() != null && !other.getAccessControlList().equals(this.getAccessControlList()))
            return false;
        if (other.getTagging() == null ^ this.getTagging() == null)
            return false;
        if (other.getTagging() != null && !other.getTagging().equals(this.getTagging()))
            return false;
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null)
            return false;
        if (other.getUserMetadata() != null && !other.getUserMetadata().equals(this.getUserMetadata()))
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && !other.getStorageClass().equals(this.getStorageClass()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getCannedACL() == null) ? 0 : getCannedACL().hashCode());
        hashCode = prime * hashCode + ((getAccessControlList() == null) ? 0 : getAccessControlList().hashCode());
        hashCode = prime * hashCode + (getTagging() != null ? getTagging().hashCode() : 0);
        hashCode = prime * hashCode + (getUserMetadata() != null ? getUserMetadata().hashCode() : 0);
        hashCode = prime * hashCode + (getStorageClass() != null ? getStorageClass().hashCode() : 0);
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getCannedACL() != null)
            sb.append("CannedACL: ").append(getCannedACL()).append(",");
        if (getAccessControlList() != null)
            sb.append("AccessControlList: ").append(getAccessControlList()).append(",");
        if (getTagging() != null)
            sb.append("Tagging: ").append(getTagging()).append(",");
        if (getUserMetadata() != null)
            sb.append("UserMetadata: ").append(getUserMetadata()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public S3Location clone() {
        try {
            return (S3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
