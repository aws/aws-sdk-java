/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the location in Amazon S3 where the select job results are stored.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket where the job results are stored.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The prefix that is prepended to the results for this request.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * Contains information about the encryption used to store the job results in Amazon S3.
     * </p>
     */
    private Encryption encryption;
    /**
     * <p>
     * The canned access control list (ACL) to apply to the job results.
     * </p>
     */
    private String cannedACL;
    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     */
    private java.util.List<Grant> accessControlList;
    /**
     * <p>
     * The tag-set that is applied to the job results.
     * </p>
     */
    private java.util.Map<String, String> tagging;
    /**
     * <p>
     * A map of metadata to store with the job results in Amazon S3.
     * </p>
     */
    private java.util.Map<String, String> userMetadata;
    /**
     * <p>
     * The storage class used to store the job results.
     * </p>
     */
    private String storageClass;

    /**
     * <p>
     * The name of the Amazon S3 bucket where the job results are stored.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket where the job results are stored.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the job results are stored.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket where the job results are stored.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the job results are stored.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket where the job results are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The prefix that is prepended to the results for this request.
     * </p>
     * 
     * @param prefix
     *        The prefix that is prepended to the results for this request.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix that is prepended to the results for this request.
     * </p>
     * 
     * @return The prefix that is prepended to the results for this request.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The prefix that is prepended to the results for this request.
     * </p>
     * 
     * @param prefix
     *        The prefix that is prepended to the results for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * Contains information about the encryption used to store the job results in Amazon S3.
     * </p>
     * 
     * @param encryption
     *        Contains information about the encryption used to store the job results in Amazon S3.
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * Contains information about the encryption used to store the job results in Amazon S3.
     * </p>
     * 
     * @return Contains information about the encryption used to store the job results in Amazon S3.
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * Contains information about the encryption used to store the job results in Amazon S3.
     * </p>
     * 
     * @param encryption
     *        Contains information about the encryption used to store the job results in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withEncryption(Encryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * <p>
     * The canned access control list (ACL) to apply to the job results.
     * </p>
     * 
     * @param cannedACL
     *        The canned access control list (ACL) to apply to the job results.
     * @see CannedACL
     */

    public void setCannedACL(String cannedACL) {
        this.cannedACL = cannedACL;
    }

    /**
     * <p>
     * The canned access control list (ACL) to apply to the job results.
     * </p>
     * 
     * @return The canned access control list (ACL) to apply to the job results.
     * @see CannedACL
     */

    public String getCannedACL() {
        return this.cannedACL;
    }

    /**
     * <p>
     * The canned access control list (ACL) to apply to the job results.
     * </p>
     * 
     * @param cannedACL
     *        The canned access control list (ACL) to apply to the job results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CannedACL
     */

    public S3Location withCannedACL(String cannedACL) {
        setCannedACL(cannedACL);
        return this;
    }

    /**
     * <p>
     * The canned access control list (ACL) to apply to the job results.
     * </p>
     * 
     * @param cannedACL
     *        The canned access control list (ACL) to apply to the job results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CannedACL
     */

    public S3Location withCannedACL(CannedACL cannedACL) {
        this.cannedACL = cannedACL.toString();
        return this;
    }

    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     * 
     * @return A list of grants that control access to the staged results.
     */

    public java.util.List<Grant> getAccessControlList() {
        return accessControlList;
    }

    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     * 
     * @param accessControlList
     *        A list of grants that control access to the staged results.
     */

    public void setAccessControlList(java.util.Collection<Grant> accessControlList) {
        if (accessControlList == null) {
            this.accessControlList = null;
            return;
        }

        this.accessControlList = new java.util.ArrayList<Grant>(accessControlList);
    }

    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessControlList(java.util.Collection)} or {@link #withAccessControlList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accessControlList
     *        A list of grants that control access to the staged results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withAccessControlList(Grant... accessControlList) {
        if (this.accessControlList == null) {
            setAccessControlList(new java.util.ArrayList<Grant>(accessControlList.length));
        }
        for (Grant ele : accessControlList) {
            this.accessControlList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     * 
     * @param accessControlList
     *        A list of grants that control access to the staged results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withAccessControlList(java.util.Collection<Grant> accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * <p>
     * The tag-set that is applied to the job results.
     * </p>
     * 
     * @return The tag-set that is applied to the job results.
     */

    public java.util.Map<String, String> getTagging() {
        return tagging;
    }

    /**
     * <p>
     * The tag-set that is applied to the job results.
     * </p>
     * 
     * @param tagging
     *        The tag-set that is applied to the job results.
     */

    public void setTagging(java.util.Map<String, String> tagging) {
        this.tagging = tagging;
    }

    /**
     * <p>
     * The tag-set that is applied to the job results.
     * </p>
     * 
     * @param tagging
     *        The tag-set that is applied to the job results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withTagging(java.util.Map<String, String> tagging) {
        setTagging(tagging);
        return this;
    }

    public S3Location addTaggingEntry(String key, String value) {
        if (null == this.tagging) {
            this.tagging = new java.util.HashMap<String, String>();
        }
        if (this.tagging.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tagging.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tagging.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location clearTaggingEntries() {
        this.tagging = null;
        return this;
    }

    /**
     * <p>
     * A map of metadata to store with the job results in Amazon S3.
     * </p>
     * 
     * @return A map of metadata to store with the job results in Amazon S3.
     */

    public java.util.Map<String, String> getUserMetadata() {
        return userMetadata;
    }

    /**
     * <p>
     * A map of metadata to store with the job results in Amazon S3.
     * </p>
     * 
     * @param userMetadata
     *        A map of metadata to store with the job results in Amazon S3.
     */

    public void setUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
    }

    /**
     * <p>
     * A map of metadata to store with the job results in Amazon S3.
     * </p>
     * 
     * @param userMetadata
     *        A map of metadata to store with the job results in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withUserMetadata(java.util.Map<String, String> userMetadata) {
        setUserMetadata(userMetadata);
        return this;
    }

    public S3Location addUserMetadataEntry(String key, String value) {
        if (null == this.userMetadata) {
            this.userMetadata = new java.util.HashMap<String, String>();
        }
        if (this.userMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location clearUserMetadataEntries() {
        this.userMetadata = null;
        return this;
    }

    /**
     * <p>
     * The storage class used to store the job results.
     * </p>
     * 
     * @param storageClass
     *        The storage class used to store the job results.
     * @see StorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class used to store the job results.
     * </p>
     * 
     * @return The storage class used to store the job results.
     * @see StorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The storage class used to store the job results.
     * </p>
     * 
     * @param storageClass
     *        The storage class used to store the job results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public S3Location withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * The storage class used to store the job results.
     * </p>
     * 
     * @param storageClass
     *        The storage class used to store the job results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public S3Location withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Location == false)
            return false;
        S3Location other = (S3Location) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getCannedACL() == null ^ this.getCannedACL() == null)
            return false;
        if (other.getCannedACL() != null && other.getCannedACL().equals(this.getCannedACL()) == false)
            return false;
        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null)
            return false;
        if (other.getAccessControlList() != null && other.getAccessControlList().equals(this.getAccessControlList()) == false)
            return false;
        if (other.getTagging() == null ^ this.getTagging() == null)
            return false;
        if (other.getTagging() != null && other.getTagging().equals(this.getTagging()) == false)
            return false;
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null)
            return false;
        if (other.getUserMetadata() != null && other.getUserMetadata().equals(this.getUserMetadata()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
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
        hashCode = prime * hashCode + ((getTagging() == null) ? 0 : getTagging().hashCode());
        hashCode = prime * hashCode + ((getUserMetadata() == null) ? 0 : getUserMetadata().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public S3Location clone() {
        try {
            return (S3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
