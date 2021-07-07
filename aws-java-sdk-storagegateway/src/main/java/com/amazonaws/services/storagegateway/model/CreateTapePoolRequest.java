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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateTapePool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTapePoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new custom tape pool.
     * </p>
     */
    private String poolName;
    /**
     * <p>
     * The storage class that is associated with the new custom pool. When you use your backup application to eject the
     * tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     * corresponds to the pool.
     * </p>
     */
    private String storageClass;
    /**
     * <p>
     * Tape retention lock can be configured in two modes. When configured in governance mode, accounts with specific
     * IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in
     * compliance mode, the tape retention lock cannot be removed by any user, including the root account.
     * </p>
     */
    private String retentionLockType;
    /**
     * <p>
     * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days).
     * </p>
     */
    private Integer retentionLockTimeInDays;
    /**
     * <p>
     * A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the new custom tape pool.
     * </p>
     * 
     * @param poolName
     *        The name of the new custom tape pool.
     */

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    /**
     * <p>
     * The name of the new custom tape pool.
     * </p>
     * 
     * @return The name of the new custom tape pool.
     */

    public String getPoolName() {
        return this.poolName;
    }

    /**
     * <p>
     * The name of the new custom tape pool.
     * </p>
     * 
     * @param poolName
     *        The name of the new custom tape pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapePoolRequest withPoolName(String poolName) {
        setPoolName(poolName);
        return this;
    }

    /**
     * <p>
     * The storage class that is associated with the new custom pool. When you use your backup application to eject the
     * tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     * corresponds to the pool.
     * </p>
     * 
     * @param storageClass
     *        The storage class that is associated with the new custom pool. When you use your backup application to
     *        eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep
     *        Archive) that corresponds to the pool.
     * @see TapeStorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class that is associated with the new custom pool. When you use your backup application to eject the
     * tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     * corresponds to the pool.
     * </p>
     * 
     * @return The storage class that is associated with the new custom pool. When you use your backup application to
     *         eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep
     *         Archive) that corresponds to the pool.
     * @see TapeStorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The storage class that is associated with the new custom pool. When you use your backup application to eject the
     * tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     * corresponds to the pool.
     * </p>
     * 
     * @param storageClass
     *        The storage class that is associated with the new custom pool. When you use your backup application to
     *        eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep
     *        Archive) that corresponds to the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TapeStorageClass
     */

    public CreateTapePoolRequest withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * The storage class that is associated with the new custom pool. When you use your backup application to eject the
     * tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     * corresponds to the pool.
     * </p>
     * 
     * @param storageClass
     *        The storage class that is associated with the new custom pool. When you use your backup application to
     *        eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep
     *        Archive) that corresponds to the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TapeStorageClass
     */

    public CreateTapePoolRequest withStorageClass(TapeStorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * Tape retention lock can be configured in two modes. When configured in governance mode, accounts with specific
     * IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in
     * compliance mode, the tape retention lock cannot be removed by any user, including the root account.
     * </p>
     * 
     * @param retentionLockType
     *        Tape retention lock can be configured in two modes. When configured in governance mode, accounts with
     *        specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes.
     *        When configured in compliance mode, the tape retention lock cannot be removed by any user, including the
     *        root account.
     * @see RetentionLockType
     */

    public void setRetentionLockType(String retentionLockType) {
        this.retentionLockType = retentionLockType;
    }

    /**
     * <p>
     * Tape retention lock can be configured in two modes. When configured in governance mode, accounts with specific
     * IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in
     * compliance mode, the tape retention lock cannot be removed by any user, including the root account.
     * </p>
     * 
     * @return Tape retention lock can be configured in two modes. When configured in governance mode, accounts with
     *         specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes.
     *         When configured in compliance mode, the tape retention lock cannot be removed by any user, including the
     *         root account.
     * @see RetentionLockType
     */

    public String getRetentionLockType() {
        return this.retentionLockType;
    }

    /**
     * <p>
     * Tape retention lock can be configured in two modes. When configured in governance mode, accounts with specific
     * IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in
     * compliance mode, the tape retention lock cannot be removed by any user, including the root account.
     * </p>
     * 
     * @param retentionLockType
     *        Tape retention lock can be configured in two modes. When configured in governance mode, accounts with
     *        specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes.
     *        When configured in compliance mode, the tape retention lock cannot be removed by any user, including the
     *        root account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionLockType
     */

    public CreateTapePoolRequest withRetentionLockType(String retentionLockType) {
        setRetentionLockType(retentionLockType);
        return this;
    }

    /**
     * <p>
     * Tape retention lock can be configured in two modes. When configured in governance mode, accounts with specific
     * IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in
     * compliance mode, the tape retention lock cannot be removed by any user, including the root account.
     * </p>
     * 
     * @param retentionLockType
     *        Tape retention lock can be configured in two modes. When configured in governance mode, accounts with
     *        specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes.
     *        When configured in compliance mode, the tape retention lock cannot be removed by any user, including the
     *        root account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionLockType
     */

    public CreateTapePoolRequest withRetentionLockType(RetentionLockType retentionLockType) {
        this.retentionLockType = retentionLockType.toString();
        return this;
    }

    /**
     * <p>
     * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days).
     * </p>
     * 
     * @param retentionLockTimeInDays
     *        Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500
     *        days).
     */

    public void setRetentionLockTimeInDays(Integer retentionLockTimeInDays) {
        this.retentionLockTimeInDays = retentionLockTimeInDays;
    }

    /**
     * <p>
     * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days).
     * </p>
     * 
     * @return Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500
     *         days).
     */

    public Integer getRetentionLockTimeInDays() {
        return this.retentionLockTimeInDays;
    }

    /**
     * <p>
     * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days).
     * </p>
     * 
     * @param retentionLockTimeInDays
     *        Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500
     *        days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapePoolRequest withRetentionLockTimeInDays(Integer retentionLockTimeInDays) {
        setRetentionLockTimeInDays(retentionLockTimeInDays);
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @return A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.</p> <note>
     *         <p>
     *         Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and
     *         the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters,
     *         and the maximum length for a tag's value is 256.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapePoolRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapePoolRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPoolName() != null)
            sb.append("PoolName: ").append(getPoolName()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass()).append(",");
        if (getRetentionLockType() != null)
            sb.append("RetentionLockType: ").append(getRetentionLockType()).append(",");
        if (getRetentionLockTimeInDays() != null)
            sb.append("RetentionLockTimeInDays: ").append(getRetentionLockTimeInDays()).append(",");
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

        if (obj instanceof CreateTapePoolRequest == false)
            return false;
        CreateTapePoolRequest other = (CreateTapePoolRequest) obj;
        if (other.getPoolName() == null ^ this.getPoolName() == null)
            return false;
        if (other.getPoolName() != null && other.getPoolName().equals(this.getPoolName()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getRetentionLockType() == null ^ this.getRetentionLockType() == null)
            return false;
        if (other.getRetentionLockType() != null && other.getRetentionLockType().equals(this.getRetentionLockType()) == false)
            return false;
        if (other.getRetentionLockTimeInDays() == null ^ this.getRetentionLockTimeInDays() == null)
            return false;
        if (other.getRetentionLockTimeInDays() != null && other.getRetentionLockTimeInDays().equals(this.getRetentionLockTimeInDays()) == false)
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

        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getRetentionLockType() == null) ? 0 : getRetentionLockType().hashCode());
        hashCode = prime * hashCode + ((getRetentionLockTimeInDays() == null) ? 0 : getRetentionLockTimeInDays().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTapePoolRequest clone() {
        return (CreateTapePoolRequest) super.clone();
    }

}
