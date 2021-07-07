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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a custom tape pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/PoolInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PoolInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom tape pool. Use the <a>ListTapePools</a> operation to return a list
     * of custom tape pools for your account and Region.
     * </p>
     */
    private String poolARN;
    /**
     * <p>
     * The name of the custom tape pool. <code>PoolName</code> can use all ASCII characters, except '/' and '\'.
     * </p>
     */
    private String poolName;
    /**
     * <p>
     * The storage class that is associated with the custom pool. When you use your backup application to eject the
     * tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     * corresponds to the pool.
     * </p>
     */
    private String storageClass;
    /**
     * <p>
     * Tape retention lock type, which can be configured in two modes. When configured in governance mode, accounts with
     * specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When
     * configured in compliance mode, the tape retention lock cannot be removed by any user, including the root account.
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
     * Status of the custom tape pool. Pool can be <code>ACTIVE</code> or <code>DELETED</code>.
     * </p>
     */
    private String poolStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom tape pool. Use the <a>ListTapePools</a> operation to return a list
     * of custom tape pools for your account and Region.
     * </p>
     * 
     * @param poolARN
     *        The Amazon Resource Name (ARN) of the custom tape pool. Use the <a>ListTapePools</a> operation to return a
     *        list of custom tape pools for your account and Region.
     */

    public void setPoolARN(String poolARN) {
        this.poolARN = poolARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom tape pool. Use the <a>ListTapePools</a> operation to return a list
     * of custom tape pools for your account and Region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom tape pool. Use the <a>ListTapePools</a> operation to return
     *         a list of custom tape pools for your account and Region.
     */

    public String getPoolARN() {
        return this.poolARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom tape pool. Use the <a>ListTapePools</a> operation to return a list
     * of custom tape pools for your account and Region.
     * </p>
     * 
     * @param poolARN
     *        The Amazon Resource Name (ARN) of the custom tape pool. Use the <a>ListTapePools</a> operation to return a
     *        list of custom tape pools for your account and Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoolInfo withPoolARN(String poolARN) {
        setPoolARN(poolARN);
        return this;
    }

    /**
     * <p>
     * The name of the custom tape pool. <code>PoolName</code> can use all ASCII characters, except '/' and '\'.
     * </p>
     * 
     * @param poolName
     *        The name of the custom tape pool. <code>PoolName</code> can use all ASCII characters, except '/' and '\'.
     */

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    /**
     * <p>
     * The name of the custom tape pool. <code>PoolName</code> can use all ASCII characters, except '/' and '\'.
     * </p>
     * 
     * @return The name of the custom tape pool. <code>PoolName</code> can use all ASCII characters, except '/' and '\'.
     */

    public String getPoolName() {
        return this.poolName;
    }

    /**
     * <p>
     * The name of the custom tape pool. <code>PoolName</code> can use all ASCII characters, except '/' and '\'.
     * </p>
     * 
     * @param poolName
     *        The name of the custom tape pool. <code>PoolName</code> can use all ASCII characters, except '/' and '\'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PoolInfo withPoolName(String poolName) {
        setPoolName(poolName);
        return this;
    }

    /**
     * <p>
     * The storage class that is associated with the custom pool. When you use your backup application to eject the
     * tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     * corresponds to the pool.
     * </p>
     * 
     * @param storageClass
     *        The storage class that is associated with the custom pool. When you use your backup application to eject
     *        the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive)
     *        that corresponds to the pool.
     * @see TapeStorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class that is associated with the custom pool. When you use your backup application to eject the
     * tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     * corresponds to the pool.
     * </p>
     * 
     * @return The storage class that is associated with the custom pool. When you use your backup application to eject
     *         the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive)
     *         that corresponds to the pool.
     * @see TapeStorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The storage class that is associated with the custom pool. When you use your backup application to eject the
     * tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     * corresponds to the pool.
     * </p>
     * 
     * @param storageClass
     *        The storage class that is associated with the custom pool. When you use your backup application to eject
     *        the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive)
     *        that corresponds to the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TapeStorageClass
     */

    public PoolInfo withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * The storage class that is associated with the custom pool. When you use your backup application to eject the
     * tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     * corresponds to the pool.
     * </p>
     * 
     * @param storageClass
     *        The storage class that is associated with the custom pool. When you use your backup application to eject
     *        the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive)
     *        that corresponds to the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TapeStorageClass
     */

    public PoolInfo withStorageClass(TapeStorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * Tape retention lock type, which can be configured in two modes. When configured in governance mode, accounts with
     * specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When
     * configured in compliance mode, the tape retention lock cannot be removed by any user, including the root account.
     * </p>
     * 
     * @param retentionLockType
     *        Tape retention lock type, which can be configured in two modes. When configured in governance mode,
     *        accounts with specific IAM permissions are authorized to remove the tape retention lock from archived
     *        virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user,
     *        including the root account.
     * @see RetentionLockType
     */

    public void setRetentionLockType(String retentionLockType) {
        this.retentionLockType = retentionLockType;
    }

    /**
     * <p>
     * Tape retention lock type, which can be configured in two modes. When configured in governance mode, accounts with
     * specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When
     * configured in compliance mode, the tape retention lock cannot be removed by any user, including the root account.
     * </p>
     * 
     * @return Tape retention lock type, which can be configured in two modes. When configured in governance mode,
     *         accounts with specific IAM permissions are authorized to remove the tape retention lock from archived
     *         virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user,
     *         including the root account.
     * @see RetentionLockType
     */

    public String getRetentionLockType() {
        return this.retentionLockType;
    }

    /**
     * <p>
     * Tape retention lock type, which can be configured in two modes. When configured in governance mode, accounts with
     * specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When
     * configured in compliance mode, the tape retention lock cannot be removed by any user, including the root account.
     * </p>
     * 
     * @param retentionLockType
     *        Tape retention lock type, which can be configured in two modes. When configured in governance mode,
     *        accounts with specific IAM permissions are authorized to remove the tape retention lock from archived
     *        virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user,
     *        including the root account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionLockType
     */

    public PoolInfo withRetentionLockType(String retentionLockType) {
        setRetentionLockType(retentionLockType);
        return this;
    }

    /**
     * <p>
     * Tape retention lock type, which can be configured in two modes. When configured in governance mode, accounts with
     * specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When
     * configured in compliance mode, the tape retention lock cannot be removed by any user, including the root account.
     * </p>
     * 
     * @param retentionLockType
     *        Tape retention lock type, which can be configured in two modes. When configured in governance mode,
     *        accounts with specific IAM permissions are authorized to remove the tape retention lock from archived
     *        virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user,
     *        including the root account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionLockType
     */

    public PoolInfo withRetentionLockType(RetentionLockType retentionLockType) {
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

    public PoolInfo withRetentionLockTimeInDays(Integer retentionLockTimeInDays) {
        setRetentionLockTimeInDays(retentionLockTimeInDays);
        return this;
    }

    /**
     * <p>
     * Status of the custom tape pool. Pool can be <code>ACTIVE</code> or <code>DELETED</code>.
     * </p>
     * 
     * @param poolStatus
     *        Status of the custom tape pool. Pool can be <code>ACTIVE</code> or <code>DELETED</code>.
     * @see PoolStatus
     */

    public void setPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
    }

    /**
     * <p>
     * Status of the custom tape pool. Pool can be <code>ACTIVE</code> or <code>DELETED</code>.
     * </p>
     * 
     * @return Status of the custom tape pool. Pool can be <code>ACTIVE</code> or <code>DELETED</code>.
     * @see PoolStatus
     */

    public String getPoolStatus() {
        return this.poolStatus;
    }

    /**
     * <p>
     * Status of the custom tape pool. Pool can be <code>ACTIVE</code> or <code>DELETED</code>.
     * </p>
     * 
     * @param poolStatus
     *        Status of the custom tape pool. Pool can be <code>ACTIVE</code> or <code>DELETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PoolStatus
     */

    public PoolInfo withPoolStatus(String poolStatus) {
        setPoolStatus(poolStatus);
        return this;
    }

    /**
     * <p>
     * Status of the custom tape pool. Pool can be <code>ACTIVE</code> or <code>DELETED</code>.
     * </p>
     * 
     * @param poolStatus
     *        Status of the custom tape pool. Pool can be <code>ACTIVE</code> or <code>DELETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PoolStatus
     */

    public PoolInfo withPoolStatus(PoolStatus poolStatus) {
        this.poolStatus = poolStatus.toString();
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
        if (getPoolARN() != null)
            sb.append("PoolARN: ").append(getPoolARN()).append(",");
        if (getPoolName() != null)
            sb.append("PoolName: ").append(getPoolName()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass()).append(",");
        if (getRetentionLockType() != null)
            sb.append("RetentionLockType: ").append(getRetentionLockType()).append(",");
        if (getRetentionLockTimeInDays() != null)
            sb.append("RetentionLockTimeInDays: ").append(getRetentionLockTimeInDays()).append(",");
        if (getPoolStatus() != null)
            sb.append("PoolStatus: ").append(getPoolStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PoolInfo == false)
            return false;
        PoolInfo other = (PoolInfo) obj;
        if (other.getPoolARN() == null ^ this.getPoolARN() == null)
            return false;
        if (other.getPoolARN() != null && other.getPoolARN().equals(this.getPoolARN()) == false)
            return false;
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
        if (other.getPoolStatus() == null ^ this.getPoolStatus() == null)
            return false;
        if (other.getPoolStatus() != null && other.getPoolStatus().equals(this.getPoolStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolARN() == null) ? 0 : getPoolARN().hashCode());
        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getRetentionLockType() == null) ? 0 : getRetentionLockType().hashCode());
        hashCode = prime * hashCode + ((getRetentionLockTimeInDays() == null) ? 0 : getRetentionLockTimeInDays().hashCode());
        hashCode = prime * hashCode + ((getPoolStatus() == null) ? 0 : getPoolStatus().hashCode());
        return hashCode;
    }

    @Override
    public PoolInfo clone() {
        try {
            return (PoolInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.PoolInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
